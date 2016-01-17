
package introsde.processcentric.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VirtualLifeCoach", targetNamespace = "http://soap.processcentric.introsde/", wsdlLocation = "http://localhost:6910/soap/VirtualLifeCoach?wsdl")
public class VirtualLifeCoach
    extends Service
{

    private final static URL VIRTUALLIFECOACH_WSDL_LOCATION;
    private final static WebServiceException VIRTUALLIFECOACH_EXCEPTION;
    private final static QName VIRTUALLIFECOACH_QNAME = new QName("http://soap.processcentric.introsde/", "VirtualLifeCoach");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6910/soap/VirtualLifeCoach?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VIRTUALLIFECOACH_WSDL_LOCATION = url;
        VIRTUALLIFECOACH_EXCEPTION = e;
    }

    public VirtualLifeCoach() {
        super(__getWsdlLocation(), VIRTUALLIFECOACH_QNAME);
    }

    public VirtualLifeCoach(WebServiceFeature... features) {
        super(__getWsdlLocation(), VIRTUALLIFECOACH_QNAME, features);
    }

    public VirtualLifeCoach(URL wsdlLocation) {
        super(wsdlLocation, VIRTUALLIFECOACH_QNAME);
    }

    public VirtualLifeCoach(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VIRTUALLIFECOACH_QNAME, features);
    }

    public VirtualLifeCoach(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VirtualLifeCoach(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Process
     */
    @WebEndpoint(name = "ProcessImplPort")
    public Process getProcessImplPort() {
        return super.getPort(new QName("http://soap.processcentric.introsde/", "ProcessImplPort"), Process.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Process
     */
    @WebEndpoint(name = "ProcessImplPort")
    public Process getProcessImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.processcentric.introsde/", "ProcessImplPort"), Process.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VIRTUALLIFECOACH_EXCEPTION!= null) {
            throw VIRTUALLIFECOACH_EXCEPTION;
        }
        return VIRTUALLIFECOACH_WSDL_LOCATION;
    }

}