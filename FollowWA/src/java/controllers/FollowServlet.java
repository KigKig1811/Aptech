/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import webservice.FollowWS_Service;

/**
 *
 * @author MB
 */
public class FollowServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/FollowWS/FollowWS.wsdl")
    private FollowWS_Service service;

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

    private boolean followNew(java.lang.Integer userId, java.lang.Integer seLLId, java.lang.Integer modeId, java.lang.Integer cateId, java.lang.String header, java.lang.String content, double price, java.lang.String address, java.lang.String street, java.lang.String userdistrictId, java.lang.String ward, java.lang.String cityProvince, double area, java.lang.String photohumbnail, javax.xml.datatype.XMLGregorianCalendar dataUp, javax.xml.datatype.XMLGregorianCalendar expDate, java.lang.Integer agentId, java.lang.String agentAcount, java.lang.String sellAcount, boolean approved, boolean paid, int bedroom) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.FollowWS port = service.getFollowWSPort();
        return port.followNew(userId, seLLId, modeId, cateId, header, content, price, address, street, userdistrictId, ward, cityProvince, area, photohumbnail, dataUp, expDate, agentId, agentAcount, sellAcount, approved, paid, bedroom);
    }

}
