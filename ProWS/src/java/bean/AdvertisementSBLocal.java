/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import entities.*;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface AdvertisementSBLocal {
    

    
    List<Advertisement> checktinhethan(String seller,String agent);
   
    boolean updateRead2(String seller,String agent,int idNotice);
   
    boolean updateDeleteSt(String seller,String agent,int idNotice);
    
     boolean addToFollow(Follow f);
     
}
