 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entities.Rating;
import entities.RatingSub;
import entities.ViewComment;
import entities.ViewCommentChild;
import entities.ViewCommentDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB
 */
public class RatingDAO {
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    Statement tl;
    private Object ex;
    
    public int createRating(Rating r) throws ClassNotFoundException, SQLException {
        int status = 0;
        int idauto = 0;
        con = new ConnecDAO().setCon();
        String sql = "INSERT INTO Rating (Rating,AdvId,UserId ) VALUES(?,?,?)";
        try {
            pstmt = con.prepareStatement(sql, tl.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, r.getRating());
            pstmt.setInt(2, r.getAdvId());
            pstmt.setInt(3, r.getUserId());
            status = pstmt.executeUpdate();
            rs = pstmt.getGeneratedKeys();
            rs.next();
            idauto = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(RatingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (status == 1) {
            return idauto;

        } else {
            return -1;
        }

    }
    public boolean createRatingComment(RatingSub rc) throws ClassNotFoundException, SQLException {
        int status = 0;
        con = new ConnecDAO().setCon();
        String sql = "INSERT INTO RatingSub (RateId,Content,UserId) VALUES(?,?,?)";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, rc.getRateId());
            pstmt.setString(2, rc.getContent());
            pstmt.setInt(3, rc.getUserId());
            status = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RatingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (status == 1) {
            return true;
        } else {
            return false;
        }
    }
    public HashMap<String, Integer> getAllRatingStar(int advId, int userId) throws SQLException, ClassNotFoundException {
        con = new ConnecDAO().setCon();
        HashMap<String, Integer> ratemap = new HashMap<String, Integer>();
        String sql = "select Rating, COUNT (RateId) as amountofrate from Rating where  AdvId=? and UserId=? ";
                 
               
        pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, advId);
        pstmt.setInt(2, userId);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            ratemap.put(String.valueOf(rs.getInt(1)), rs.getInt(2));

        }
        return ratemap;

    }

    
        
    public List<ViewComment> getAllComment() throws SQLException, ClassNotFoundException {
        List<ViewComment> list = new ArrayList<ViewComment>();
        con = new ConnecDAO().setCon();
        String sql = "select * from RatingSub";
                
        pstmt = con.prepareStatement(sql);
        
        rs = pstmt.executeQuery();
        while (rs.next()) {
            ViewComment v = new ViewComment();
            v.setUsedId(rs.getInt(1));
            v.setContent(rs.getString(2));
            v.setRating(rs.getInt(3));
            list.add(v);
        }
        return list;
    }
    public List<ViewComment> getCommentGroupByIdRate(int rateId) throws SQLException, ClassNotFoundException {
        List<ViewComment> list = new ArrayList<ViewComment>();
        con = new ConnecDAO().setCon();
        String sql = "select * from RatingSub where RateId=?";
               
        pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, rateId);
        
        rs = pstmt.executeQuery();
        while (rs.next()) {
            ViewComment v = new ViewComment();
            v.setUsedId(rs.getInt(1));
            v.setContent(rs.getString(2));
            v.setRating(rs.getInt(3));
            list.add(v);
           
        }
        return list;
    }
    
     public List<ViewCommentDetails> getAllCommentRecal(int rateId,int advId) throws SQLException, ClassNotFoundException {
        List<ViewComment> list = getAllComment();
        List<ViewComment> list1 = getCommentGroupByIdRate(rateId);
        List<ViewCommentDetails> listcal = new ArrayList<>();
        for (ViewComment viewComment : list1) {
            ViewCommentDetails vcd = new ViewCommentDetails();
            
            vcd.setAdvId(viewComment.getAdvId());
            vcd.setRateId(viewComment.getRateId());
            vcd.setUsedId(viewComment.getUsedId());

            vcd.setRating(viewComment.getRating());
            List<ViewCommentChild> listchild = new ArrayList<>();
            //List<ViewComment> list = getCommentByIdRate(id_parkinglot, id_usepro, viewComment.getId_rating());
            for (ViewComment vc : list) {
                if (vc.getRateId()== viewComment.getRateId()) {
                    ViewCommentChild vcc = new ViewCommentChild();
                    vcc.setRatingSub(vc.getRatesubId());
                    vcc.setUserId(vc.getUsedId());
                    vcc.setContent(vc.getContent());
                    vcc.setRatingsubDate(vc.getRatingsubDate());
                    listchild.add(vcc);
                }
            }
            vcd.setViewCommentChild(listchild);
            listcal.add(vcd);
        }
        return listcal;
    }
     
      public long checkratingYet(int advId) throws ClassNotFoundException, SQLException {
        con = new ConnecDAO().setCon();
        long id = 0;
        String sql = "select count(RateId) AS numrating from rating where advId =?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, advId);
            rs = pstmt.executeQuery();
            rs.next();
            id = rs.getInt("numrating");

            return id;
        } catch (SQLException ex) {
            ex.getMessage();
            return id = 0;
        }
    }
}

