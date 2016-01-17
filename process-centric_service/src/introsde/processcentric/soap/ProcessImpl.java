package introsde.processcentric.soap;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import introsde.beemindergoals.soap.Goal;
import introsde.beemindergoals.soap.Goals;
import introsde.beemindergoals.soap.GoalsService;
import introsde.healthmanagement.soap.Measure;
import introsde.healthmanagement.soap.People;
import introsde.healthmanagement.soap.PeopleService;
import introsde.healthmanagement.soap.Person;
import introsde.healthmanagement.soap.Person.CurrentHealth;

import javax.jws.WebService;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.Holder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

@WebService(endpointInterface = "introsde.processcentric.soap.Process",
	serviceName="VirtualLifeCoach")
public class ProcessImpl implements Process {
	
	// get an instance of the PeopleService service
	PeopleService service = new PeopleService();
    People people = service.getPeopleImplPort();
    
 	GoalsService goalservice = new GoalsService();
    Goals goals = goalservice.getGoalsImplPort();

	@Override
	public Person readPerson(Long id, String email) {
			Person p = people.readPerson(id);
			if(p.getEmail().equals(email)) {
				printPerson(p);
				return p;
			}
			return null;
	}
	
	public String register(String email, String firstname, String lastname, String birthdate, Long weight, Long height, Long bloodpressure) {
		Person p = new Person();
		p.setEmail(email);
		p.setFirstname(firstname);
		p.setLastname(lastname);
		p.setBirthdate(birthdate);
		p.setCurrentHealth(new Person.CurrentHealth());
		Long createdPersonId = null;
		
		Measure weight_measure = new Measure();
		weight_measure.setMeasureType("weight");
		weight_measure.setMeasureValue(weight);
		weight_measure.setMeasureValueType("float");
		
		Measure height_measure = new Measure();
		height_measure.setMeasureType("height");
		height_measure.setMeasureValue(height);
		height_measure.setMeasureValueType("float");
		
		Measure blood_measure = new Measure();
		blood_measure.setMeasureType("bloodPressure");
		blood_measure.setMeasureValue(bloodpressure);
		blood_measure.setMeasureValueType("float");
    	
    	p.getCurrentHealth().getMeasure().add(weight_measure);
    	p.getCurrentHealth().getMeasure().add(height_measure);
    	p.getCurrentHealth().getMeasure().add(blood_measure);

    	Holder<Person> p_holder = new Holder<Person>(p);
		people.createPerson(p_holder);
		
		p = null;
        for(Person temp : people.readPersonList()) {
        	if(temp.getLastname().equals(lastname) 
        			&& temp.getFirstname().equals(firstname) 
        			&& temp.getBirthdate().equals(birthdate) 
        			&& temp.getEmail().equals(email) ) p = temp;
        }
        if(p != null) {
        	createdPersonId = p.getPersonId();
        }
		
		send_http_request("POST", "http://localhost:6913/mandrill-email/message/welcome/"+createdPersonId, "text/xml", "<email>" + email + "</email>");
		
		return createdPersonId.toString();
	}
	
	@Override
	public List<Goal> getGoals(Long id, String email) {
		Person p = people.readPerson(id);
		if (p.getAccessToken() != "") {
			List<Goal> gl = goals.getGoals(p.getAccessToken());
			return gl;
		}
		return null;
	}
	
	@Override
	public String createGoal(Long id, String email, String type, Long goalval, Long goaldate) {
		Person p = people.readPerson(id);
		if (p.getAccessToken() != "") {
			for(Goal g : getGoals(id, email)) {
				if(g.getSlug().equals(type.toLowerCase())) return "ERROR: exists already";
			}
			for(Measure m : p.getCurrentHealth().getMeasure()) {
				System.out.println(m.getMeasureType());
				if(m.getMeasureType().equals(type)) {
					if(m.getMeasureValue() > goalval) goals.createGoal(p.getAccessToken(), type, type+"goal", "fatloser", goaldate.toString(), "null", goalval.toString(), ""+m.getMeasureValue());
					else if(m.getMeasureValue() < goalval) goals.createGoal(p.getAccessToken(), type, type+"goal", "gainer", goaldate.toString(), "null", goalval.toString(), ""+m.getMeasureValue());
					else if(m.getMeasureValue() == goalval) return "ERROR: goal achieved";
					
					SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
					Date date = null;
					try {
						date = sdf.parse(m.getDateRegistered());
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long timeInMillisSinceEpoch = date.getTime(); 
					long timeInSecondsSinceEpoch = timeInMillisSinceEpoch / (1000);
					goals.createDatapoint(p.getAccessToken(), type, timeInSecondsSinceEpoch, (long) m.getMeasureValue());
					return "OK";
				}
			}
		}
		return "ERROR: activation required";
	}
	
	@Override
	public String addMeasure(Long id, String email, String type, Long value) {
		Person p = people.readPerson(id);
    	people.savePersonMeasurement(type, value, "float", id);
    	if(p.getAccessToken() != "") {
    		for(Goal g : getGoals(id, email)) {
    			System.out.println(g.getSlug());
				if(g.getSlug().equals(type.toLowerCase())) {
					float old = -1;
					for(Measure m : p.getCurrentHealth().getMeasure()) {
						if(m.getMeasureType().equals(type)) old = m.getMeasureValue();
					}
					goals.createDatapoint(p.getAccessToken(), type, System.currentTimeMillis() / 1000L, value);
					if(old != -1) {
						Document xml_response = send_http_request("GET", "http://localhost:6912/motivational-phrases/phrase/random", "text/xml", "");
						String quote = xml_response.getElementsByTagName("text").item(0).getTextContent();
						if(g.getGoalType().equals("fatloser") && old <= value) return "Good job, honey! Do it, do it harder!: " + quote;
						else if(g.getGoalType().equals("fatloser") && old > value) return "Keep it up!";
						else if(g.getGoalType().equals("gainer") && old <= value) return "Great job!";
						else if(g.getGoalType().equals("gainer") && old > value) return "Do it better! This will motivate you, hommy: " + quote;
					}
					return "ERROR";
				}
			}
    	}
    	return "OK: not on goal";
	}

	// print the Person p in an organized manner
	public static void printPerson(Person p) {
    	System.out.println("	========================================");
    	System.out.println("	personId = " + p.getPersonId());
    	System.out.println("	firstname = " + p.getFirstname());
    	System.out.println("	lastname = " + p.getLastname());
    	System.out.println("	birthdate = " + p.getBirthdate());
    	if(p.getCurrentHealth()!= null) {
    		System.out.println("	currentHealth: ");
	    	for(Measure m : p.getCurrentHealth().getMeasure()) {
	    		ProcessImpl.printMeasure(m);
	    	}
    	}
    }
	
	// print the Measure m in an organized manner
	public static void printMeasure(Measure m) {
		System.out.println("		======== ");
		System.out.println("		mid = " + m.getMid());
		System.out.println("		dateRegistered = " + m.getDateRegistered());
		System.out.println("		measureType = " + m.getMeasureType());
		System.out.println("		measureValue = " + m.getMeasureValue());
		System.out.println("		measureValueType = " + m.getMeasureValueType());
	}
	
	private static Document send_http_request(String request_type,  String url, String content_type, String content) {
		String message = "error";
		URL obj;
		InputStream is = null;
		Document d = null;
		try {
			obj = new URL(url);

			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod(request_type);
			con.setRequestProperty("User-Agent", "Mozilla/5.0 ( compatible ) ");
			if(request_type.equals("POST")) {
				con.setDoOutput(true);
				con.setRequestProperty("Content-Type", content_type);
	
				String str = content;
				byte[] outputInBytes = str.getBytes("UTF-8");
				OutputStream os = con.getOutputStream();
				os.write(outputInBytes);
				os.close();
			}
			con.connect();
			
			try {
				is = con.getInputStream();
			} catch (Exception e) {
				is = con.getErrorStream();
			}
			
			if(is!= null) d = parseXML(is);
			int responseCode = -1;
			try {
				responseCode = con.getResponseCode();
			} catch (IOException ex1) {
				// check if it's eof, if yes retrieve code again
				if (-1 != ex1.getMessage().indexOf("EOF")) {
					try {
						responseCode = con.getResponseCode();
					} catch (IOException ex2) {
						System.out.println(ex2.getMessage());
						// handle exception
					}
				} else {
					System.out.println(ex1.getMessage());
					// handle exception
				}
			}
			message = con.getResponseMessage();

			System.out.println("=> Result: " + message);
			System.out.println("=> HTTP Status: " + responseCode);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.err.println(e1.getCause());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	
	private static Document parseXML(InputStream stream) throws Exception {
		DocumentBuilderFactory objDocumentBuilderFactory = null;
		DocumentBuilder objDocumentBuilder = null;
		Document doc = null;
		try {
			objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			doc = (Document) objDocumentBuilder.parse(stream);
		} catch (Exception ex) {
			//throw ex;
		}
		return doc;
	}
	
	public static String getCurrentTimeStamp() {
		Date now = new Date();
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdfDate.format(now);
        return strDate;
    }
}
