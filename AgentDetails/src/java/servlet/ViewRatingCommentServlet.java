/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import  entities.ViewComment;
import  entities.ViewCommentDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sb.RatingSB;

/**
 *
 * @author MB
 */
public class ViewRatingCommentServlet extends HttpServlet {
    @EJB
    private RatingSB ratingSB;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //int id_parkinglot = Integer.parseInt(request.getParameter("idparking"));
        //int id_usepro = Integer.parseInt(request.getParameter("idusepro"));
        //for test
        HttpSession session = request.getSession();
        int useridsession = -1;
        int userrolesession = -1;
        try {
//             useridsession = Integer.parseInt(session.getAttribute("userid").toString());
//             userrolesession = Integer.parseInt(session.getAttribute("userrole").toString());
            useridsession = Integer.parseInt(request.getParameter("userid"));
            userrolesession = Integer.parseInt(request.getParameter("userrole"));
        } catch (Exception ex) {

        }

        int id_parkinglot = Integer.parseInt(request.getParameter("pid"));
        int id_usepro = Integer.parseInt(request.getParameter("iduserpro"));
        
        HashMap<String, Integer> maprate = new HashMap<String, Integer>();
        maprate = ratingSB.getAllRatingStar(agentId, userId);
        float ratecal = 0;
        int amountclient = 0;
        int onestar = 0;
        int twostar = 0;
        int threestar = 0;
        int fourstar = 0;
        int fivestar = 0;
        for (String i : maprate.keySet()) {
            switch (i) {
                case "1":
                    onestar = maprate.get(i);
                    ratecal = ratecal + onestar * 1;
                    amountclient = amountclient + onestar;
                    break;
                case "2":
                    twostar = maprate.get(i);
                    ratecal = ratecal + twostar * 2;
                    amountclient = amountclient + twostar;
                    break;
                case "3":
                    threestar = maprate.get(i);
                    ratecal = ratecal + threestar * 3;
                    amountclient = amountclient + threestar;
                    break;
                case "4":
                    fourstar = maprate.get(i);
                    ratecal = ratecal + fourstar * 4;
                    amountclient = amountclient + fourstar;
                    break;
                case "5":
                    fivestar = maprate.get(i);
                    ratecal = ratecal + fivestar * 5;
                    amountclient = amountclient + fivestar;
                    break;

            }
        }
        float rateamount = (float) ratecal / amountclient;
        int roundrate = Math.round(rateamount);
        List<ViewCommentDetail> list = ratingSession.getAllCommentRecal(id_parkinglot, id_usepro);
        request.setAttribute("ratecal", rateamount);
        request.setAttribute("onestar", onestar);
        request.setAttribute("twostar", twostar);
        request.setAttribute("threestar", threestar);
        request.setAttribute("fourstar", fourstar);
        request.setAttribute("fivestar", fivestar);
        request.setAttribute("amountclient", amountclient);
        request.setAttribute("list", list);
        request.setAttribute("useridsession", useridsession);
        request.setAttribute("userrolesession", userrolesession);
        request.getRequestDispatcher("RATING/RatingComment.jsp").forward(request, response);
    }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
