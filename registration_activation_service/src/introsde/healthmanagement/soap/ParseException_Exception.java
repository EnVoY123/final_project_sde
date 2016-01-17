
package introsde.healthmanagement.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ParseException", targetNamespace = "http://soap.healthmanagement.introsde/")
public class ParseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ParseException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ParseException_Exception(String message, ParseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ParseException_Exception(String message, ParseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: introsde.healthmanagement.soap.ParseException
     */
    public ParseException getFaultInfo() {
        return faultInfo;
    }

}
