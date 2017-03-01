/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "SanphamServlet", urlPatterns = {"/SanphamServlet"})
public class SanphamServlet extends HttpServlet {
Connection con;
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
       try {    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLBH","khanh","123456");
            String sql= "insert into SAN_PHAM  values (?,?,?,?,?,?,?,?)" ;
            PreparedStatement ps = con.prepareStatement(sql);  
    
        String masp = request.getParameter("masp");
        String tensp = request.getParameter("tensp");        
        String mota = request.getParameter("mota");
        Integer soluong = request.getIntHeader("soluong");
        String dongia = request.getParameter("dongia");
        String hinhanh = request.getParameter("hinhanh");
        String nhasx = request.getParameter("nhasx");
        String maloai = request.getParameter("maloai");
        
        ps.setString(1, masp);
        ps.setString(2, tensp);
        ps.setString(3, mota);
        ps.setInt(4, soluong);
        ps.setString(5, dongia);
        ps.setString(6, hinhanh);
        ps.setString(7, nhasx);
        ps.setString(8, maloai);
        ps.executeUpdate();
       
        } catch (Exception e) {
        e.printStackTrace();
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
