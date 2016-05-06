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
import Entity.Pedidos;
import Entity.Pedidodetalle;
import Entity.Productos;
import Entity.Usuarios;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author mateo
 */
public class PedidosController extends HttpServlet {

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
        
        String hdfProduc=request.getParameter("hdfProductos");
        String [] somelist= hdfProduc.split(",");
        
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("tallerWebPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Usuarios usu =em.find( Usuarios.class,(Integer.parseInt(request.getParameter("ddlChef"))));
        Pedidos ped = new Pedidos();
        ped.setMesa(request.getParameter("txtMesa"));
        ped.setIdChef(usu);
        ped.setValorTotal(Long.parseLong(request.getParameter("txtPrecio")));
        
        
        em.persist(ped);
        em.getTransaction().commit();
        
        Collection<Pedidodetalle> pedidodetalleCollection = new ArrayList<Pedidodetalle>();
        for (int i = 0; i < somelist.length; i++) {
            Pedidodetalle e= new Pedidodetalle();
            e.setIdPedido(ped);
            Productos pr =em.find( Productos.class,(Integer.parseInt(somelist[i])));
            e.setIdProducto(pr);
            pedidodetalleCollection.add(e);
            
            
        em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
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
