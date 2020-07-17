/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import entities.UserAdvDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB
 */
public class HistoryTranDAO {
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    public UserAdvDetails getHistoryTransaction(int id){
        UserAdvDetails s = new UserAdvDetails();
        try {
            con = new ConnectDAO().setCon();
             
        
           
            String query = "SELECT * FROM UserAdvDetails WHERE OrderId=?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                s.setAdvId(rs.getInt(1));
                s.setAdvTitle(rs.getString(2));
                s.setUserId(rs.getInt(3));
                s.setSeLLId(rs.getInt(4));
                s.setSeLLAccount(rs.getString(5));
                s.setAgentId(rs.getInt(6));
                s.setAgentAccount(rs.getString(7));
                s.setSubTotal(rs.getDouble(8));
                s.setDateUp(rs.getDate(9));
                s.setExpDate(rs.getDate(10));
                s.setOnemonth(rs.getDouble(11));
                s.setThreemonths(rs.getDouble(12));
                s.setSixmonths(rs.getDouble(13));
                
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HistoryTranDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
  
        return s;
    }
    
    
}
