package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collection;
import javax.persistence.Query;
import Entity.Usuarios;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

public final class pedido_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pedido</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>pedido</h1>\n");
      out.write("        <form name=\"producto\" method=\"post\" action=\"productos\" >\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Datos del Producto</legend>\n");
      out.write("                Nombres:     <input type=\"text\" name=\"txtNombreProducto\" required=\"*\" /><br>\n");
      out.write("                Cheff:   <select name=\"ddlChef\"  required=\"*\">\n");
      out.write("                            ");
 EntityManagerFactory emf =Persistence.createEntityManagerFactory("tallerWebPU");
                                    EntityManager em = emf.createEntityManager();
                                    try {
                                            Query query = em.createQuery("SELECT * FROM cocina.usuarios ");
                                            Collection<Usuarios> users=   (Collection<Usuarios>)query.getResultList();
                                            Usuarios userActual= users.iterator().next();
                                            
      out.write("<option value=\"");
 userActual.getIdusuarios(); 
      out.write('"');
      out.write('>');
  userActual.getNombre();
      out.write("</option>\n");
      out.write("                                            \n");
      out.write("                                            ");

                                    } catch (Exception e) {
                                    }   
                            
      out.write(" \n");
      out.write("                </select><br>\n");
      out.write("                Precio: <input type=\"number\" name =\"txtPrecio\"  required=\"*\"/><br>\n");
      out.write("            </fieldset>\n");
      out.write("            <input type=\"submit\" name=\"btnGuardar\" title=\"guardar\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
