/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DAO.RatingDAO;
import entities.Rating;
import entities.RatingSub;
import entities.ViewComment;
import entities.ViewCommentDetails;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;


/**
 *
 * @author mamno
 */
@Stateless
public class RatingSB {

    RatingDAO dao = new RatingDAO();

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public int AddRating(Rating r) throws ClassNotFoundException, SQLException {
        return dao.createRating(r);
    }

    public boolean AddRatingComment(RatingSub rc) throws ClassNotFoundException, SQLException {
        return dao.createRatingComment(rc);
    }

    public HashMap<String, Integer> getAllRatingStar(int advId, int userId) throws ClassNotFoundException {
        HashMap<String, Integer> map = null;
        try {
            map = dao.getAllRatingStar(advId, userId);
        } catch (SQLException ex) {
            Logger.getLogger(RatingSB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }

    public List<ViewComment> getAllComment() throws ClassNotFoundException {
        List<ViewComment> list = null;
        try {
            list = dao.getAllComment();
        } catch (SQLException ex) {
            Logger.getLogger(RatingSB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<ViewCommentDetails> getAllCommentRecal(int rateId,int advId) throws ClassNotFoundException{
       List<ViewCommentDetails> list =null;
        try {
            

            list=dao.getAllCommentRecal(rateId,advId);
           
        } catch (SQLException ex) {
            Logger.getLogger(RatingSB.class.getName()).log(Level.SEVERE, null, ex);
        }
         return list;
    }
}
