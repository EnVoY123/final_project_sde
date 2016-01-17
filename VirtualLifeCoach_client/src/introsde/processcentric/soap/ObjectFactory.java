
package introsde.processcentric.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.processcentric.soap package. 
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

    private final static QName _CreateGoal_QNAME = new QName("http://soap.processcentric.introsde/", "createGoal");
    private final static QName _GetGoalsResponse_QNAME = new QName("http://soap.processcentric.introsde/", "getGoalsResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://soap.processcentric.introsde/", "registerResponse");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://soap.processcentric.introsde/", "createGoalResponse");
    private final static QName _Register_QNAME = new QName("http://soap.processcentric.introsde/", "register");
    private final static QName _GetGoals_QNAME = new QName("http://soap.processcentric.introsde/", "getGoals");
    private final static QName _ReadPerson_QNAME = new QName("http://soap.processcentric.introsde/", "readPerson");
    private final static QName _AddMeasureResponse_QNAME = new QName("http://soap.processcentric.introsde/", "addMeasureResponse");
    private final static QName _AddMeasure_QNAME = new QName("http://soap.processcentric.introsde/", "addMeasure");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://soap.processcentric.introsde/", "readPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.processcentric.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link GetGoals }
     * 
     */
    public GetGoals createGetGoals() {
        return new GetGoals();
    }

    /**
     * Create an instance of {@link AddMeasureResponse }
     * 
     */
    public AddMeasureResponse createAddMeasureResponse() {
        return new AddMeasureResponse();
    }

    /**
     * Create an instance of {@link AddMeasure }
     * 
     */
    public AddMeasure createAddMeasure() {
        return new AddMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "getGoalsResponse")
    public JAXBElement<GetGoalsResponse> createGetGoalsResponse(GetGoalsResponse value) {
        return new JAXBElement<GetGoalsResponse>(_GetGoalsResponse_QNAME, GetGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "getGoals")
    public JAXBElement<GetGoals> createGetGoals(GetGoals value) {
        return new JAXBElement<GetGoals>(_GetGoals_QNAME, GetGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "addMeasureResponse")
    public JAXBElement<AddMeasureResponse> createAddMeasureResponse(AddMeasureResponse value) {
        return new JAXBElement<AddMeasureResponse>(_AddMeasureResponse_QNAME, AddMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "addMeasure")
    public JAXBElement<AddMeasure> createAddMeasure(AddMeasure value) {
        return new JAXBElement<AddMeasure>(_AddMeasure_QNAME, AddMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.processcentric.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

}
