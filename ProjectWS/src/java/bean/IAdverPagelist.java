/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import entities.AdvertPagelist;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface IAdverPagelist {
    
    public List<AdvertPagelist> viewAllEmployees(
                int offset, 
                int noOfRecords);
    
     public int getNoOfRecords();
    
}
