/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import bean.AdvertPagelistDAO;
import bean.AdvertisementSBLocal;
import entities.AdvertPagelist;
import entities.Advertisement;
import entities.Follow;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MB
 */
@WebService(serviceName = "AdvertisementWS")
 @Stateless()
public class AdvertisementWS {
   
    @EJB
    private AdvertisementSBLocal advertisementSB;
    

    /**
     * This is a sample web service operation
     */
    AdvertPagelistDAO dao = new AdvertPagelistDAO();

   
    @WebMethod(operationName = "viewAdvBuySeller")
    public List<AdvertPagelist> viewAdvBuySeller(@WebParam(name = "offset") int offset, @WebParam(name = "noOfRecords1") int noOfRecords1) {
        return dao.viewAllEmployees(offset, noOfRecords1);
    }

    @WebMethod(operationName = "getnoOfRecords")
    public int getnoOfRecords() {
        return dao.getNoOfRecords();
    }

  
    @WebMethod(operationName = "updateRead2")
    public boolean updateRead2(@WebParam(name = "seller") String seller,@WebParam(name = "agent") String agent, @WebParam(name = "idNotice") int idNotice) {
        return advertisementSB.updateRead2(seller, agent, idNotice);
    }
  
    
    @WebMethod(operationName = "updateDeleteStt2")
    public boolean updateDeleteStt2(@WebParam(name = "seller") String seller,@WebParam(name = "agent") String agent, @WebParam(name = "idNotice") int idNotice) {
        return advertisementSB.updateDeleteSt(seller, agent, idNotice);
    }
    
    @WebMethod(operationName = "checktinhethan")
    public List<Advertisement> checktinhethan(@WebParam(name = "seller") String seller,@WebParam(name = "agent") String agent) {
        return advertisementSB.checktinhethan(seller, agent);
    }
   
    @WebMethod(operationName = "addToFollow")
    public boolean addToFollow(@WebParam(name = "f") Follow f) {
        return advertisementSB.addToFollow(f);
    }
}
