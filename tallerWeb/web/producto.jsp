<%-- 
    Document   : producto
    Created on : 5/05/2016, 04:17:26 PM
    Author     : mateo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creacion de productos</title>
    </head>
    <body>
        
        <h1>Producto</h1>
        <form name="producto" method="post" action="productos" >
            <fieldset>
                <legend>Datos del Producto</legend>
                Nombres:     <input type="text" name="txtNombreProducto" required="*" /><br>
                Codigo:   <input type="text" name="txtCodigo"  required="*"/><br>
                Precio: <input type="number" name ="txtPrecio"  required="*"/><br>
            </fieldset>
            <input type="submit" name="btnGuardar" title="guardar" />
        </form>
    </body>
</html>
