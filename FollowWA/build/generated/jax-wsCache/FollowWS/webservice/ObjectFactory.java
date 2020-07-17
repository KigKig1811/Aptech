
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _ShowAll_QNAME = new QName("http://webservice/", "showAll");
    private final static QName _FollowNew_QNAME = new QName("http://webservice/", "followNew");
    private final static QName _ShowAllResponse_QNAME = new QName("http://webservice/", "showAllResponse");
    private final static QName _Follow_QNAME = new QName("http://webservice/", "follow");
    private final static QName _FollowNewResponse_QNAME = new QName("http://webservice/", "followNewResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowAll }
     * 
     */
    public ShowAll createShowAll() {
        return new ShowAll();
    }

    /**
     * Create an instance of {@link FollowNew }
     * 
     */
    public FollowNew createFollowNew() {
        return new FollowNew();
    }

    /**
     * Create an instance of {@link Follow }
     * 
     */
    public Follow createFollow() {
        return new Follow();
    }

    /**
     * Create an instance of {@link FollowNewResponse }
     * 
     */
    public FollowNewResponse createFollowNewResponse() {
        return new FollowNewResponse();
    }

    /**
     * Create an instance of {@link ShowAllResponse }
     * 
     */
    public ShowAllResponse createShowAllResponse() {
        return new ShowAllResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "showAll")
    public JAXBElement<ShowAll> createShowAll(ShowAll value) {
        return new JAXBElement<ShowAll>(_ShowAll_QNAME, ShowAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "followNew")
    public JAXBElement<FollowNew> createFollowNew(FollowNew value) {
        return new JAXBElement<FollowNew>(_FollowNew_QNAME, FollowNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "showAllResponse")
    public JAXBElement<ShowAllResponse> createShowAllResponse(ShowAllResponse value) {
        return new JAXBElement<ShowAllResponse>(_ShowAllResponse_QNAME, ShowAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Follow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "follow")
    public JAXBElement<Follow> createFollow(Follow value) {
        return new JAXBElement<Follow>(_Follow_QNAME, Follow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowNewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "followNewResponse")
    public JAXBElement<FollowNewResponse> createFollowNewResponse(FollowNewResponse value) {
        return new JAXBElement<FollowNewResponse>(_FollowNewResponse_QNAME, FollowNewResponse.class, null, value);
    }

}
