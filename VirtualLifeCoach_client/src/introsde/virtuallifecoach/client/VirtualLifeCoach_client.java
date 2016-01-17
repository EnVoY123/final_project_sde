package introsde.virtuallifecoach.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import introsde.beemindergoals.soap.Goal;
import introsde.healthmanagement.soap.Measure;
import introsde.healthmanagement.soap.Person;
import introsde.processcentric.soap.Process;
import introsde.processcentric.soap.VirtualLifeCoach;

public class VirtualLifeCoach_client {
	private static VirtualLifeCoach service = new VirtualLifeCoach();
	private static Process process = service.getProcessImplPort();
	
	public static void main(String[] args) throws Exception {
		
	    
	    Scanner scanner = new Scanner(System.in);
        String input;
        
        do {
            
        	System.out.print("**************");
            System.out.println("\n ********* What are you want yo do: *********\n"
            	+ "**************"	
                + "1) Register. \n"
                + "2) Login. \n"
                + "3) Quit. \n"
                + "**************");
            
            input = scanner.next();

            switch (input) {
                case "1":
                	register();
                    break;
                case "2":
                	login();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("\""+ input +"\"not valid command. Please, choose the right option");
                    break;
            }
            
        } while(!input.equals("2"));
	}
	
	private static void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Required info: ");
		System.out.println("Your email: ");
        String input = scanner.next();
        String email = input;
        System.out.println("Firstname: ");
        input = scanner.next();
        String firstname = input;
        System.out.println("Lastname: ");
        input = scanner.next();
        String lastname = input;
        System.out.println("Birthdate (yyyy-MM-dd): ");
        input = scanner.next();
        String birthdate = input+" 00:00:00";
        System.out.println("Weight: ");
        input = scanner.next();
        String weight = input;
        System.out.println("Height: ");
        input = scanner.next();
        String height = input;
        System.out.println("Blood pressure: ");
        input = scanner.next();
        String bloodpressure = input;
        
        String user_id = process.register(email, firstname, lastname, birthdate, Long.valueOf(weight), Long.valueOf(height), Long.valueOf(bloodpressure));
        if(user_id != null) {
        	System.out.println("***** All done! Check your email for verification! ******");
        }
	}
	
	private static void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("For sign in enter your credentials: ");
		System.out.println("Email: ");
        String input = scanner.next();
        String email = input;
        System.out.println("Password: ");
        input = scanner.next();
        String password = input;
        
        Person p = process.readPerson(Long.valueOf(password), email);
        if(p != null) {
        	loggedIn(email, Long.valueOf(password));
        } else {
        	System.out.println("Login failed");
        }
	}
	
	private static void loggedIn(String email, Long id) {
		Scanner scanner = new Scanner(System.in);
        String input;
        
        do {
            
        	System.out.print("********************************");
            System.out.println("\n****** Your Menu ******\n"
            	+"********************************"
                + "1) Profile. \n"
                + "2) Goals. \n"
                + "3) Create goal. \n"
                + "4) Add measure. \n"
                + "5) Go back. \n"
                + "**************" );
            
            input = scanner.next();

            switch (input) {
                case "1":
                	Person p = process.readPerson(id, email);
                	printPerson(p);
                    break;
                case "2":
                	List<Goal> gl = process.getGoals(id, email);
                	for(Goal g : gl) {
                		printGoal(g);
                	}
                    break;
                case "3":
                	createGoal(id, email);
                    break;
                case "4":
                	addMeasure(id, email);
                    break;
                case "5":
                    break;
                default:
                    System.out.println("\""+ input +"\" is not a valid command");
                    break;
            }
            
        } while(!input.equals("4"));
	}
	
	public static void createGoal(Long id, String email) {
		Scanner scanner = new Scanner(System.in);
        String input = null;
		System.out.println("Provide the following information: ");
		System.out.println("Goal type (weight or bloodPressure): ");
        input = scanner.next();
        String type = input;
        System.out.println("Goal objective: ");
        input = scanner.next();
        String goalval = input;
        System.out.println("Goal date (yyyy-MM-dd): ");
        input = scanner.next();
        String goaldate_temp = input;
        Long goalDate = Long.parseLong(goaldate_temp.replaceAll("[^0-9]", ""));
        
        //Long goaldate = currentDate.getTime() / 1000;
        System.out.println("***************");
        
    	String result = process.createGoal(id, email, type, Long.parseLong(goalval), goalDate);
    	if(result.equals("ERROR: goal achieved")) System.out.println("You are creating a goal that you already achieved!");
    	else if(result.equals("ERROR: activation required")) System.out.println("It seems your account has not been activated yet! Check your email!");
    	else if(result.equals("OK")) System.out.println("Goal created successfully!");
	}
	
	public static void addMeasure(Long id, String email) {
		Scanner scanner = new Scanner(System.in);
        String input = null;
		System.out.println("Provide the following information: ");
		System.out.println("Measure type (weight or bloodPressure): ");
        input = scanner.next();
        String type = input;
        System.out.println("Measure value: ");
        input = scanner.next();
        String value = input;
        
    	String result = process.addMeasure(id, email, type, Long.parseLong(value));
    	if(result.equals("OK: not on goal")) System.out.println("Your measure has been added but you have no goal active for that kind of measure!");
    	else if(result.equals("ERROR")) System.out.println("Something went terribly wrong!");
    	else if(result.equals("Great job! keep it up!")) System.out.println("You done it! Congrulations!!!");
    	else System.out.println(result);
	}
	
	// print the Person p in an organized manner
	public static void printPerson(Person p) {
		System.out.println("	========================================");
		System.out.println("	Name: " + p.getFirstname());
		System.out.println("	Lastname: " + p.getLastname());
		System.out.println("	Birthdate: " + p.getBirthdate());
		if (p.getCurrentHealth() != null) {
			System.out.println(" Your current health profile - ");
			for (Measure m : p.getCurrentHealth().getMeasure()) {
				printMeasure(m);
			}
		}
	}

	// print the Measure m in an organized manner
	public static void printMeasure(Measure m) {
		System.out.println("		======== ");
		System.out.println("		Measure date: " + m.getDateRegistered());
		System.out.println("		Measure type: " + m.getMeasureType());
		System.out.println("		Measure value: " + m.getMeasureValue());
	}
	
	public static void printGoal(Goal g) {
		System.out.println("	========================================");
		System.out.println("	Title: " + g.getTitle());
		String _goalDate = g.getGoaldate().toString();
		
		System.out.println("	Final date: " + _goalDate.substring(0,4)+"-"+_goalDate.substring(4, 6)+"-"+_goalDate.substring(6, 8));
		System.out.println("	View graph: " + g.getGraphUrl());
	}
}
