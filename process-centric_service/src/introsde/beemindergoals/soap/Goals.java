
package introsde.beemindergoals.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Goals", targetNamespace = "http://soap.beemindergoals.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Goals {


    /**
     * 
     * @param timestamp
     * @param accessToken
     * @param value
     * @param slug
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "createDatapoint", targetNamespace = "http://soap.beemindergoals.introsde/", className = "introsde.beemindergoals.soap.CreateDatapoint")
    @ResponseWrapper(localName = "createDatapointResponse", targetNamespace = "http://soap.beemindergoals.introsde/", className = "introsde.beemindergoals.soap.CreateDatapointResponse")
    @Action(input = "http://soap.beemindergoals.introsde/Goals/createDatapointRequest", output = "http://soap.beemindergoals.introsde/Goals/createDatapointResponse")
    public String createDatapoint(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "slug", targetNamespace = "")
        String slug,
        @WebParam(name = "timestamp", targetNamespace = "")
        Long timestamp,
        @WebParam(name = "value", targetNamespace = "")
        Long value);

    /**
     * 
     * @param title
     * @param rate
     * @param accessToken
     * @param initval
     * @param goalval
     * @param goalType
     * @param slug
     * @param goaldate
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://soap.beemindergoals.introsde/", className = "introsde.beemindergoals.soap.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://soap.beemindergoals.introsde/", className = "introsde.beemindergoals.soap.CreateGoalResponse")
    @Action(input = "http://soap.beemindergoals.introsde/Goals/createGoalRequest", output = "http://soap.beemindergoals.introsde/Goals/createGoalResponse")
    public String createGoal(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "slug", targetNamespace = "")
        String slug,
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "goal_type", targetNamespace = "")
        String goalType,
        @WebParam(name = "goaldate", targetNamespace = "")
        String goaldate,
        @WebParam(name = "rate", targetNamespace = "")
        String rate,
        @WebParam(name = "goalval", targetNamespace = "")
        String goalval,
        @WebParam(name = "initval", targetNamespace = "")
        String initval);

    /**
     * 
     * @param accessToken
     * @return
     *     returns java.util.List<introsde.beemindergoals.soap.Goal>
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "http://soap.beemindergoals.introsde/")
    @RequestWrapper(localName = "getGoals", targetNamespace = "http://soap.beemindergoals.introsde/", className = "introsde.beemindergoals.soap.GetGoals")
    @ResponseWrapper(localName = "getGoalsResponse", targetNamespace = "http://soap.beemindergoals.introsde/", className = "introsde.beemindergoals.soap.GetGoalsResponse")
    @Action(input = "http://soap.beemindergoals.introsde/Goals/getGoalsRequest", output = "http://soap.beemindergoals.introsde/Goals/getGoalsResponse")
    public List<Goal> getGoals(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken);

}
