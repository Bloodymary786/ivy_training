
package https.www_ivy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "calservice", targetNamespace = "https://www.ivy.global/", wsdlLocation = "http://localhost:8091/calapp/ws?wsdl")
public class Calservice
    extends Service
{

    private final static URL CALSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALSERVICE_EXCEPTION;
    private final static QName CALSERVICE_QNAME = new QName("https://www.ivy.global/", "calservice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8091/calapp/ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALSERVICE_WSDL_LOCATION = url;
        CALSERVICE_EXCEPTION = e;
    }

    public Calservice() {
        super(__getWsdlLocation(), CALSERVICE_QNAME);
    }

    public Calservice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns Calapp
     */
    @WebEndpoint(name = "mycalport")
    public Calapp getMycalport() {
        return super.getPort(new QName("https://www.ivy.global/", "mycalport"), Calapp.class);
    }

    private static URL __getWsdlLocation() {
        if (CALSERVICE_EXCEPTION!= null) {
            throw CALSERVICE_EXCEPTION;
        }
        return CALSERVICE_WSDL_LOCATION;
    }

}
