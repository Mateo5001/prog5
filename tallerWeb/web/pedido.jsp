

<%@page import="java.util.ListIterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="javax.persistence.EntityManager,javax.persistence.EntityManagerFactory,javax.persistence.Persistence,controllers.usuariosController,Entity.Usuarios,Entity.Productos,java.util.List"  %>
<%
                                EntityManagerFactory emf =Persistence.createEntityManagerFactory("tallerWebPU");
                                EntityManager em = emf.createEntityManager();
                                List<Usuarios> users=  (List<Usuarios> )em.createNamedQuery("Usuarios.findAll").getResultList();
                                ListIterator<Usuarios> l = users.listIterator();
                               
%>

<!DOCTYPE html>
<html>
    <head>
        <script src="js/funcions.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedido</title>
    </head>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <body>
        <div>
        <h1>pedido</h1>
        <script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script type="text/javascript" >
            $(document).ready(function(){
            $('#btnAgregar' ).click(function() {
                                            
                                            $('#divProductos').append($('#ddlProductos option:selected').text()).append('<br>');
                                            $('#hdfProductos').val(($('#hdfProductos').val())+','+($('#ddlProductos').val()));
                                          });
            });
            
            
        </script>
        <form id="pedido" name="pedido" method="post" action="Pedidos" >
            <fieldset>
                <legend>Datos del Producto</legend>
                <div>
                    mesa:     
                </div>
                <div>
                    <input type="text" name="txtMesa" required="*" /><br>
                </div>
                <div>
                    percio Total:     
                </div>
                <div>
                    <input type="number" name="txtPrecio" required="*" /><br>
                </div>
                <div>
                    Cheff:   
                </div>
                <div>
                    <select name="ddlChef">
                    <% while (l.hasNext()){
                                Usuarios usuario =  l.next();
                    %>
                                            <option value="<% out.print(usuario.getIdusuarios()); %>"><%  out.print(usuario.getNombre());%></option>
                    <% } %>            
                    </select><br>
                </div>
                
                
                <fieldset>
                    <legend>Datos Productos</legend>
                    <%        
                               EntityManagerFactory emfPro =Persistence.createEntityManagerFactory("tallerWebPU");
                                EntityManager emP = emfPro.createEntityManager();
                                List<Productos> pros=  (List<Productos> )emP.createNamedQuery("Productos.findAll").getResultList();
                                ListIterator<Productos> p = pros.listIterator();
                               
                    %>
                <div>
                    Producto: 
                </div> 
                <div>
                    <select name="ddlProductos" id="ddlProductos">
                    <% while (p.hasNext()){
                                Productos pro =  p.next();
                    %>
                                            <option value="<% out.print(pro.getIdproductos()); %>"><%  out.print(pro.getNombreProducto());%></option>
                    <% } %>            
                    </select>
                </div> 
                    <div>
                        
                            <input type="button" name="btnAgregar" id="btnAgregar" value="agregarProducto" /><br>
                    </div>
                            <input type="hidden" name="hdfProductos" id="hdfProductos" value="0"/><br><br>
                            <div id="divProductos">
                            </div>
                            
                            
                </fieldset>
                            
                
            </fieldset>
            <input type="submit" name="btnGuardar" title="guardar" />
        </form>
        </div>
    </body>
</html>
