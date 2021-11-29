
package https.www_ivy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_ivy package. 
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

    private final static QName _AddMethodResponse_QNAME = new QName("https://www.ivy.global/", "addMethodResponse");
    private final static QName _AddMethod_QNAME = new QName("https://www.ivy.global/", "addMethod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_ivy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMethodResponse }
     * 
     */
    public AddMethodResponse createAddMethodResponse() {
        return new AddMethodResponse();
    }

    /**
     * Create an instance of {@link AddMethod }
     * 
     */
    public AddMethod createAddMethod() {
        return new AddMethod();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.ivy.global/", name = "addMethodResponse")
    public JAXBElement<AddMethodResponse> createAddMethodResponse(AddMethodResponse value) {
        return new JAXBElement<AddMethodResponse>(_AddMethodResponse_QNAME, AddMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.ivy.global/", name = "addMethod")
    public JAXBElement<AddMethod> createAddMethod(AddMethod value) {
        return new JAXBElement<AddMethod>(_AddMethod_QNAME, AddMethod.class, null, value);
    }

}
