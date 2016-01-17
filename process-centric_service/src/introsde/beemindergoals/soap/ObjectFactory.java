
package introsde.beemindergoals.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.beemindergoals.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateDatapoint_QNAME = new QName("http://soap.beemindergoals.introsde/", "createDatapoint");
    private final static QName _CreateDatapointResponse_QNAME = new QName("http://soap.beemindergoals.introsde/", "createDatapointResponse");
    private final static QName _GetGoals_QNAME = new QName("http://soap.beemindergoals.introsde/", "getGoals");
    private final static QName _Goal_QNAME = new QName("http://soap.beemindergoals.introsde/", "goal");
    private final static QName _CreateGoal_QNAME = new QName("http://soap.beemindergoals.introsde/", "createGoal");
    private final static QName _GetGoalsResponse_QNAME = new QName("http://soap.beemindergoals.introsde/", "getGoalsResponse");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://soap.beemindergoals.introsde/", "createGoalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.beemindergoals.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateDatapointResponse }
     * 
     */
    public CreateDatapointResponse createCreateDatapointResponse() {
        return new CreateDatapointResponse();
    }

    /**
     * Create an instance of {@link CreateDatapoint }
     * 
     */
    public CreateDatapoint createCreateDatapoint() {
        return new CreateDatapoint();
    }

    /**
     * Create an instance of {@link GetGoals }
     * 
     */
    public GetGoals createGetGoals() {
        return new GetGoals();
    }

    /**
     * Create an instance of {@link GetGoalsResponse }
     * 
     */
    public GetGoalsResponse createGetGoalsResponse() {
        return new GetGoalsResponse();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDatapoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.beemindergoals.introsde/", name = "createDatapoint")
    public JAXBElement<CreateDatapoint> createCreateDatapoint(CreateDatapoint value) {
        return new JAXBElement<CreateDatapoint>(_CreateDatapoint_QNAME, CreateDatapoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDatapointResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.beemindergoals.introsde/", name = "createDatapointResponse")
    public JAXBElement<CreateDatapointResponse> createCreateDatapointResponse(CreateDatapointResponse value) {
        return new JAXBElement<CreateDatapointResponse>(_CreateDatapointResponse_QNAME, CreateDatapointResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.beemindergoals.introsde/", name = "getGoals")
    public JAXBElement<GetGoals> createGetGoals(GetGoals value) {
        return new JAXBElement<GetGoals>(_GetGoals_QNAME, GetGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Goal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.beemindergoals.introsde/", name = "goal")
    public JAXBElement<Goal> createGoal(Goal value) {
        return new JAXBElement<Goal>(_Goal_QNAME, Goal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.beemindergoals.introsde/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.beemindergoals.introsde/", name = "getGoalsResponse")
    public JAXBElement<GetGoalsResponse> createGetGoalsResponse(GetGoalsResponse value) {
        return new JAXBElement<GetGoalsResponse>(_GetGoalsResponse_QNAME, GetGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.beemindergoals.introsde/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

}
