/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import entities.AdvertPagelist;
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
 * @author LENOVO
 */
public class AdvertPagelistDAO implements IAdverPagelist{
    
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    private int noOfRecords;

    public Connection setCon() throws ClassNotFoundException, SQLException {
        String str = "jdbc:sqlserver://localhost:1433;database=RealtorsPortalSystem";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(str, "sa", "123");
        return con;
    }

    @Override
    public List<AdvertPagelist> viewAllEmployees(int offset, int noOfRecords1) {
        
        
        
        
                 
        List<AdvertPagelist> list = new ArrayList<>();
        
       
        try {
            setCon();
            String query = "select * from Advertisement where ModeId=2 and UserId=1 order by AdvId DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY ";
            
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, offset);
            pstmt.setInt(2, noOfRecords1);
          
            rs = pstmt.executeQuery();
            while (rs.next()) {
                AdvertPagelist s = new AdvertPagelist();
                s.setHeader(rs.getString("Header"));
                s.setAdvId(rs.getInt("AdvId"));
                s.setSellAcount(rs.getString("SellAcount"));
                s.setAgentAcount(rs.getString("AgentAcount"));
                s.setPhotothumbnail(rs.getString("Photothumbnail"));
         
                s.setContent(rs.getString("Content"));
                

                list.add(s);
            }
            String query2="SELECT COUNT (*) from Advertisement where ModeId=2 and UserId=1";
            pstmt = con.prepareStatement(query2);
            rs=pstmt.executeQuery();
            if(rs.next())
              this.noOfRecords= rs.getInt(1);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdvertPagelistDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public int getNoOfRecords() {
           return noOfRecords;
    }
    
}
