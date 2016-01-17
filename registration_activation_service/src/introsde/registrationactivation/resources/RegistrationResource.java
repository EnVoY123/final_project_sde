package introsde.registrationactivation.resources;

import introsde.healthmanagement.soap.People;
import introsde.healthmanagement.soap.PeopleService;
import introsde.healthmanagement.soap.Person;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.Holder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xml.sax.SAXException;

@Path("/register")
public class RegistrationResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	PeopleService service = new PeopleService();
    People people = service.getPeopleImplPort();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sendRegistrationConfirmation(@QueryParam("access_token") String accesstoken, @QueryParam("username") String username) {
		System.out.println(" " + accesstoken + " " + username);
		
		if(accesstoken != null) {
			Person p = people.readPersonList().get(people.readPersonList().size()-1);
			p.setAccessToken(accesstoken);
			Holder<Person> p_holder = new Holder<Person>(p);
			people.updatePerson(p_holder);
			return "Registration completed successfully!";
		}
		return "ERROR: missing parameters";
	}

}
