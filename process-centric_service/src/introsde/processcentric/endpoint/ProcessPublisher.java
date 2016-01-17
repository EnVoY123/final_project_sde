package introsde.processcentric.endpoint;

import javax.xml.ws.Endpoint;

import introsde.processcentric.soap.ProcessImpl;

public class ProcessPublisher {
	public static String SERVER_URL = "http://localhost";
	public static String PORT = "6910";
	public static String BASE_URL = "/soap/VirtualLifeCoach";
	
	public static String getEndpointURL() {
		return SERVER_URL+":"+PORT+BASE_URL;
	}
 
	public static void main(String[] args) {
		String endpointUrl = getEndpointURL();
		System.out.println("Starting VirtualLifeCoach Service...");
		System.out.println("--> Published at = "+endpointUrl);
		Endpoint.publish(endpointUrl, new ProcessImpl());
    }
}

