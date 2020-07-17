/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import entities.UserAdvDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    

    public Connection setCon() throws ClassNotFoundException, SQLException {
        String str = "jdbc:sqlserver://localhost:1433;database=RealtorsPortalSystem";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(str, "sa", "123");
        return con;
    }
    public UserAdvDetails getHistoryTransaction(int id){
        UserAdvDetails s = new UserAdvDetails();
        try {
            setCon();
             
        
           
            String query = "SELECT * FROM UserAdvDetails WHERE UsedId=?";
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
    public List<UserAdvDetails> GetAll() {
        List<UserAdvDetails> list = new ArrayList<>();
        try {
            setCon();
            String query = "SELECT * FROM UserAdvDetails";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                UserAdvDetails s = new UserAdvDetails();
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
               

                list.add(s);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(HistoryTranDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
}
