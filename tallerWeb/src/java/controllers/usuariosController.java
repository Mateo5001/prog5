/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Entity.Usuarios;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mateo
 */
public class usuariosController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static List<Usuarios> usuarios(){
    EntityManagerFactory emf =Persistence.createEntityManagerFactory("tallerWebPU");
                                EntityManager em = emf.createEntityManager();
                                List<Usuarios> users=  (List<Usuarios> )em.createNamedQuery("Usuarios.findAll").getResultList();
                                Usuarios usuario =  users.listIterator().next();
                                usuario.getIdusuarios();
                                return  users;
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Usuarios user = new Usuarios();
        
        user.setNombre(request.getParameter("txtNombres"));
        user.setApellidos(request.getParameter("txtApellidos"));
        user.setIdentificacion(request.getParameter("txtIdentificacion"));
        user.setTelefono(request.getParameter("txtTelefono"));
        user.setLogin(request.getParameter("txtUserName"));
        user.setPassword(request.getParameter("txtPassword"));
        
            
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("tallerWebPU");
        EntityManager em = emf.createEntityManager();
        try {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        } catch (Exception e) {
        
        
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
    protected  void hola(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        request.getRequestDispatcher("usuario.jsp").forward(request, response);
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
