
package myws_soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NoUserWithSuchIDException", targetNamespace = "http://SlavkoProgrammingWorld.com")
public class NoUserWithSuchIDException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.slavkoprogrammingworld.NoUserWithSuchIDException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NoUserWithSuchIDException(String message, com.slavkoprogrammingworld.NoUserWithSuchIDException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NoUserWithSuchIDException(String message, com.slavkoprogrammingworld.NoUserWithSuchIDException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.slavkoprogrammingworld.NoUserWithSuchIDException
     */
    public com.slavkoprogrammingworld.NoUserWithSuchIDException getFaultInfo() {
        return faultInfo;
    }

}