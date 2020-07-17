/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

import bean.AgentDetailsDAO;
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

    AgentDetailsDAO dao = new AgentDetailsDAO();

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public int AddRating(Rating r) throws ClassNotFoundException, SQLException {
        return dao.createRating(r);
    }

    public boolean AddRatingComment(RatingSub rc) throws ClassNotFoundException, SQLException {
        return dao.createRatingComment(rc);
    }

    public HashMap<String, Integer> getAllRatingStar(int agentId, int userId) throws ClassNotFoundException {
        HashMap<String, Integer> map = null;
        try {
            map = dao.getAllRatingStar(agentId, userId);
        } catch (SQLException ex) {
            Logger.getLogger(AgentDetailsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }

    public List<ViewComment> getAllComment() throws ClassNotFoundException {
        List<ViewComment> list = null;
        try {
            list = dao.getAllComment();
        } catch (SQLException ex) {
            Logger.getLogger(AgentDetailsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<ViewCommentDetails> getAllCommentRecal(int agentId, int userId) throws ClassNotFoundException{
       List<ViewCommentDetails> list =null;
        try {
            
            list=dao.getAllCommentRecal(agentId, userId);
           
        } catch (SQLException ex) {
            Logger.getLogger(AgentDetailsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return list;
    }
}
