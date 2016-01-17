package introsde.processcentric.soap;

import java.util.List;

import introsde.beemindergoals.soap.Goal;
import introsde.healthmanagement.soap.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) 
public interface Process {
	@WebMethod(operationName="readPerson")
    @WebResult(name="person") 
    public Person readPerson(@WebParam(name="personId") Long id,
    		@WebParam(name="email") String email);
	
	@WebMethod(operationName="register")
    @WebResult(name="response") 
	public String register(@WebParam(name="email")String email,
			@WebParam(name="firstname") String firstname,
			@WebParam(name="lastname") String lastname,
			@WebParam(name="birthdate") String birthdate,
			@WebParam(name="weight") Long weight,
			@WebParam(name="height") Long height,
			@WebParam(name="bloodpressure") Long bloodpressure);

	@WebMethod(operationName="getGoals")
    @WebResult(name="goal") 
	public List<Goal> getGoals(@WebParam(name="personId") Long id, @WebParam(name="email") String email);

	@WebMethod(operationName="createGoal")
    @WebResult(name="response") 
	public String createGoal(@WebParam(name="personId") Long id,
			@WebParam(name="email") String email, 
			@WebParam(name="type") String type, 
			@WebParam(name="goalval") Long goalval, 
			@WebParam(name="goaldate") Long goaldate);

	@WebMethod(operationName="addMeasure")
    @WebResult(name="response") 
	public String addMeasure(@WebParam(name="personId") Long id,
			@WebParam(name="email") String email, 
			@WebParam(name="type") String type, 
			@WebParam(name="value") Long value);
}