
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FollowWS", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FollowWS {


    /**
     * 
     * @param area
     * @param agentId
     * @param address
     * @param cityProvince
     * @param agentAcount
     * @param ward
     * @param photohumbnail
     * @param userId
     * @param content
     * @param expDate
     * @param bedroom
     * @param sellAcount
     * @param approved
     * @param dataUp
     * @param modeId
     * @param userdistrictId
     * @param cateId
     * @param price
     * @param street
     * @param paid
     * @param header
     * @param seLLId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "followNew", targetNamespace = "http://webservice/", className = "webservice.FollowNew")
    @ResponseWrapper(localName = "followNewResponse", targetNamespace = "http://webservice/", className = "webservice.FollowNewResponse")
    @Action(input = "http://webservice/FollowWS/followNewRequest", output = "http://webservice/FollowWS/followNewResponse")
    public boolean followNew(
        @WebParam(name = "userId", targetNamespace = "")
        Integer userId,
        @WebParam(name = "seLLId", targetNamespace = "")
        Integer seLLId,
        @WebParam(name = "modeId", targetNamespace = "")
        Integer modeId,
        @WebParam(name = "cateId", targetNamespace = "")
        Integer cateId,
        @WebParam(name = "header", targetNamespace = "")
        String header,
        @WebParam(name = "content", targetNamespace = "")
        String content,
        @WebParam(name = "price", targetNamespace = "")
        double price,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "street", targetNamespace = "")
        String street,
        @WebParam(name = "userdistrictId", targetNamespace = "")
        String userdistrictId,
        @WebParam(name = "ward", targetNamespace = "")
        String ward,
        @WebParam(name = "cityProvince", targetNamespace = "")
        String cityProvince,
        @WebParam(name = "area", targetNamespace = "")
        double area,
        @WebParam(name = "photohumbnail", targetNamespace = "")
        String photohumbnail,
        @WebParam(name = "dataUp", targetNamespace = "")
        XMLGregorianCalendar dataUp,
        @WebParam(name = "expDate", targetNamespace = "")
        XMLGregorianCalendar expDate,
        @WebParam(name = "agentId", targetNamespace = "")
        Integer agentId,
        @WebParam(name = "agentAcount", targetNamespace = "")
        String agentAcount,
        @WebParam(name = "sellAcount", targetNamespace = "")
        String sellAcount,
        @WebParam(name = "approved", targetNamespace = "")
        boolean approved,
        @WebParam(name = "paid", targetNamespace = "")
        boolean paid,
        @WebParam(name = "bedroom", targetNamespace = "")
        int bedroom);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.Follow>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showAll", targetNamespace = "http://webservice/", className = "webservice.ShowAll")
    @ResponseWrapper(localName = "showAllResponse", targetNamespace = "http://webservice/", className = "webservice.ShowAllResponse")
    @Action(input = "http://webservice/FollowWS/showAllRequest", output = "http://webservice/FollowWS/showAllResponse")
    public List<Follow> showAll();

}
