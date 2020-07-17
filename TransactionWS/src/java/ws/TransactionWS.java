/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import bean.HistoryTranDAO;
import entities.UserAdvDetails;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MB
 */
@WebService(serviceName = "TransactionWS")

public class TransactionWS {

    HistoryTranDAO dao=new HistoryTranDAO();
    @WebMethod(operationName = "viewHistoryTransaction")
    public UserAdvDetails viewHistoryTransaction(@WebParam(name = "id") int id) {
        return dao.getHistoryTransaction(id);
    }

    
    
}
