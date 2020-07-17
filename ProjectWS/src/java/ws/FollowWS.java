/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;


import bean.FollowSBLocal;

import entities.Follow;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MB
 */
@WebService(serviceName = "FollowWS")
public class FollowWS {
    @EJB
    private FollowSBLocal followSB;
   
    
   
    

    @WebMethod(operationName = "showAll")
    public List<Follow> showAll() {
        
        return followSB.findAll();
    }
     @WebMethod(operationName = "followNew")
    public boolean followNew(@WebParam(name = "userId") Integer userId,@WebParam(name = "seLLId") Integer seLLId,@WebParam(name = "modeId") Integer modeId, 
            @WebParam(name = "cateId") Integer cateId,@WebParam(name = "header") String header,@WebParam(name = "content") String content,@WebParam(name = "price") double price,
            @WebParam(name = "address") String address,@WebParam(name = "street") String street,@WebParam(name = "userdistrictId") String district,@WebParam(name = "ward") String ward, 
            @WebParam(name = "cityProvince") String cityProvince,@WebParam(name = "area") double area,@WebParam(name = "photohumbnail") String photothumbnail,
            @WebParam(name = "dataUp") Date dateUp,@WebParam(name = "expDate") Date expDate,@WebParam(name = "agentId") Integer agentId,@WebParam(name = "agentAcount") String agentAcount,
            @WebParam(name = "sellAcount") String sellAcount,@WebParam(name = "approved") boolean approved,@WebParam(name = "paid") boolean paid,@WebParam(name = "bedroom") int bedroom) {
        return followSB.Follow(userId, seLLId, modeId, cateId, header, content, price, address, street, district, ward, cityProvince, area, photothumbnail,
                dateUp, expDate, agentId, agentAcount, sellAcount, approved, paid, bedroom);
    } 
    
}
