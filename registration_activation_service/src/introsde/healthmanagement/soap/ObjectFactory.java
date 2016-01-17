
package introsde.healthmanagement.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.healthmanagement.soap package. 
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

    private final static QName _UpdatePerson_QNAME = new QName("http://soap.healthmanagement.introsde/", "updatePerson");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonResponse");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://soap.healthmanagement.introsde/", "updatePersonMeasure");
    private final static QName _ReadPersonMeasurementResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonMeasurementResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://soap.healthmanagement.introsde/", "deletePerson");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "readMeasureTypesResponse");
    private final static QName _People_QNAME = new QName("http://soap.healthmanagement.introsde/", "People");
    private final static QName _ReadPersonMeasureByDatesResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonMeasureByDatesResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonListResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "deletePersonResponse");
    private final static QName _ReadPersonListByMeasurementResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonListByMeasurementResponse");
    private final static QName _SavePersonMeasurementResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "savePersonMeasurementResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonList");
    private final static QName _ReadPersonMeasureByDates_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonMeasureByDates");
    private final static QName _ParseException_QNAME = new QName("http://soap.healthmanagement.introsde/", "ParseException");
    private final static QName _SavePersonMeasurement_QNAME = new QName("http://soap.healthmanagement.introsde/", "savePersonMeasurement");
    private final static QName _Measure_QNAME = new QName("http://soap.healthmanagement.introsde/", "measure");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://soap.healthmanagement.introsde/", "readMeasureTypes");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonHistory");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "createPersonResponse");
    private final static QName _ReadPersonListByMeasurement_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonListByMeasurement");
    private final static QName _CreatePerson_QNAME = new QName("http://soap.healthmanagement.introsde/", "createPerson");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "updatePersonMeasureResponse");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonHistoryResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.healthmanagement.introsde/", "updatePersonResponse");
    private final static QName _ReadPersonMeasurement_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPersonMeasurement");
    private final static QName _ReadPerson_QNAME = new QName("http://soap.healthmanagement.introsde/", "readPerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.healthmanagement.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link SavePersonMeasurement }
     * 
     */
    public SavePersonMeasurement createSavePersonMeasurement() {
        return new SavePersonMeasurement();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureByDates }
     * 
     */
    public ReadPersonMeasureByDates createReadPersonMeasureByDates() {
        return new ReadPersonMeasureByDates();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link ReadPersonMeasurement }
     * 
     */
    public ReadPersonMeasurement createReadPersonMeasurement() {
        return new ReadPersonMeasurement();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadPersonListByMeasurement }
     * 
     */
    public ReadPersonListByMeasurement createReadPersonListByMeasurement() {
        return new ReadPersonListByMeasurement();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link ReadPersonMeasurementResponse }
     * 
     */
    public ReadPersonMeasurementResponse createReadPersonMeasurementResponse() {
        return new ReadPersonMeasurementResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link SavePersonMeasurementResponse }
     * 
     */
    public SavePersonMeasurementResponse createSavePersonMeasurementResponse() {
        return new SavePersonMeasurementResponse();
    }

    /**
     * Create an instance of {@link ReadPersonListByMeasurementResponse }
     * 
     */
    public ReadPersonListByMeasurementResponse createReadPersonListByMeasurementResponse() {
        return new ReadPersonListByMeasurementResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureByDatesResponse }
     * 
     */
    public ReadPersonMeasureByDatesResponse createReadPersonMeasureByDatesResponse() {
        return new ReadPersonMeasureByDatesResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link Person.CurrentHealth }
     * 
     */
    public Person.CurrentHealth createPersonCurrentHealth() {
        return new Person.CurrentHealth();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonMeasurementResponse")
    public JAXBElement<ReadPersonMeasurementResponse> createReadPersonMeasurementResponse(ReadPersonMeasurementResponse value) {
        return new JAXBElement<ReadPersonMeasurementResponse>(_ReadPersonMeasurementResponse_QNAME, ReadPersonMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "People")
    public JAXBElement<Person> createPeople(Person value) {
        return new JAXBElement<Person>(_People_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureByDatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonMeasureByDatesResponse")
    public JAXBElement<ReadPersonMeasureByDatesResponse> createReadPersonMeasureByDatesResponse(ReadPersonMeasureByDatesResponse value) {
        return new JAXBElement<ReadPersonMeasureByDatesResponse>(_ReadPersonMeasureByDatesResponse_QNAME, ReadPersonMeasureByDatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListByMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonListByMeasurementResponse")
    public JAXBElement<ReadPersonListByMeasurementResponse> createReadPersonListByMeasurementResponse(ReadPersonListByMeasurementResponse value) {
        return new JAXBElement<ReadPersonListByMeasurementResponse>(_ReadPersonListByMeasurementResponse_QNAME, ReadPersonListByMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "savePersonMeasurementResponse")
    public JAXBElement<SavePersonMeasurementResponse> createSavePersonMeasurementResponse(SavePersonMeasurementResponse value) {
        return new JAXBElement<SavePersonMeasurementResponse>(_SavePersonMeasurementResponse_QNAME, SavePersonMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureByDates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonMeasureByDates")
    public JAXBElement<ReadPersonMeasureByDates> createReadPersonMeasureByDates(ReadPersonMeasureByDates value) {
        return new JAXBElement<ReadPersonMeasureByDates>(_ReadPersonMeasureByDates_QNAME, ReadPersonMeasureByDates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "savePersonMeasurement")
    public JAXBElement<SavePersonMeasurement> createSavePersonMeasurement(SavePersonMeasurement value) {
        return new JAXBElement<SavePersonMeasurement>(_SavePersonMeasurement_QNAME, SavePersonMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Measure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "measure")
    public JAXBElement<Measure> createMeasure(Measure value) {
        return new JAXBElement<Measure>(_Measure_QNAME, Measure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListByMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonListByMeasurement")
    public JAXBElement<ReadPersonListByMeasurement> createReadPersonListByMeasurement(ReadPersonListByMeasurement value) {
        return new JAXBElement<ReadPersonListByMeasurement>(_ReadPersonListByMeasurement_QNAME, ReadPersonListByMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPersonMeasurement")
    public JAXBElement<ReadPersonMeasurement> createReadPersonMeasurement(ReadPersonMeasurement value) {
        return new JAXBElement<ReadPersonMeasurement>(_ReadPersonMeasurement_QNAME, ReadPersonMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.healthmanagement.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

}
