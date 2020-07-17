
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _ViewHistoryTransactionResponse_QNAME = new QName("http://ws/", "viewHistoryTransactionResponse");
    private final static QName _ViewHistoryTransaction_QNAME = new QName("http://ws/", "viewHistoryTransaction");
    private final static QName _UserAdvDetails_QNAME = new QName("http://ws/", "userAdvDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewHistoryTransactionResponse }
     * 
     */
    public ViewHistoryTransactionResponse createViewHistoryTransactionResponse() {
        return new ViewHistoryTransactionResponse();
    }

    /**
     * Create an instance of {@link ViewHistoryTransaction }
     * 
     */
    public ViewHistoryTransaction createViewHistoryTransaction() {
        return new ViewHistoryTransaction();
    }

    /**
     * Create an instance of {@link UserAdvDetails }
     * 
     */
    public UserAdvDetails createUserAdvDetails() {
        return new UserAdvDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewHistoryTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "viewHistoryTransactionResponse")
    public JAXBElement<ViewHistoryTransactionResponse> createViewHistoryTransactionResponse(ViewHistoryTransactionResponse value) {
        return new JAXBElement<ViewHistoryTransactionResponse>(_ViewHistoryTransactionResponse_QNAME, ViewHistoryTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewHistoryTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "viewHistoryTransaction")
    public JAXBElement<ViewHistoryTransaction> createViewHistoryTransaction(ViewHistoryTransaction value) {
        return new JAXBElement<ViewHistoryTransaction>(_ViewHistoryTransaction_QNAME, ViewHistoryTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAdvDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "userAdvDetails")
    public JAXBElement<UserAdvDetails> createUserAdvDetails(UserAdvDetails value) {
        return new JAXBElement<UserAdvDetails>(_UserAdvDetails_QNAME, UserAdvDetails.class, null, value);
    }

}
