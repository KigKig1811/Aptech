/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.util.List;
import javax.ejb.Local;
import entities.*;
import java.util.Date;

/**
 *
 * @author MB
 */
@Local
public interface FollowSBLocal {
     List<Follow> findAll();
     boolean Follow( Integer userId, Integer seLLId, Integer modeId, Integer cateId, String header, String content, double price, String address, String street, String district, String ward, String cityProvince, double area, String photothumbnail, Date dateUp, Date expDate, Integer agentId, String agentAcount, String sellAcount, boolean approved, boolean paid, int bedroom) ;  
    
}
