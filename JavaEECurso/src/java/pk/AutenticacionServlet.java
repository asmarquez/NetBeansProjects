/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan
 */
@WebServlet(name = "AutenticacionServlet",
        urlPatterns = {"/AutenticacionServlet"},
        initParams = {
            @WebInitParam(name = "passwordAdministrador",
                    value = "admin")})
public class AutenticacionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String passwordAdministrador;

    @Override
    public void init(ServletConfig config) {
        String ficheroUsuarios
                = config.getInitParameter("ficheroUsuarios");
        ServletContext contexto = config.getServletContext();
        InputStream is
                = contexto.getResourceAsStream(ficheroUsuarios);
        Properties ficheroPropiedades = new Properties();
        try {
            ficheroPropiedades.load(is);
            passwordAdministrador
                    = ficheroPropiedades.getProperty("administradorPassword");
        } catch (Exception ex) {
            Logger.getLogger(AutenticacionServlet.class.getName()).log(
                    Level.SEVERE, "No se pudo cargar el fichero con los password", ex);
        }
    }

    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String elemento = request.getParameter("elemento");
        ServletContext contexto = request.getServletContext();

        if (usuario != null && usuario.equals("admin")
                && password.equals("admin")) {
            request.setAttribute("autenticado", true);
            request.setAttribute("elemento", elemento);
            RequestDispatcher anhadirServlet
                    = contexto.getNamedDispatcher("AnhadirArticuloServlet");
            anhadirServlet.forward(request, response);
        } else {
            RequestDispatcher paginaError
                    = contexto.getRequestDispatcher("/error.html");
            paginaError.forward(request, response);
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
