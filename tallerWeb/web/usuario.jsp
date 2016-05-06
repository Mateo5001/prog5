<%-- 
    Document   : usuario
    Created on : 5/05/2016, 03:54:08 PM
    Author     : mateo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <h1>Usuario</h1>
        <form name="usuario" method="post" action="usuarios" >
            <fieldset>
                <legend>Datos Basicos</legend>
            Nombres:     <input type="text" name="txtNombres" /><br>
            Apellidos   <input type="text" name="txtApellidos" /><br>
            Identificacion: <input type="text" name ="txtIdentificacion" /><br>
            Telefono: <input type="text" name ="txtTelefono" /><br>
            </fieldset>
            <fieldset>
                <legend>Ingreso de usuario</legend>
                user name: <input type="text" name="txtUserName"/><br>
                Password: <input type="password" name ="txtPassword"/><br>
                confirm password : <input type="password" name="txtconfirPass"/><br>
            </fieldset>    
            <input type="submit" name="btnGuardar" title="guardar" />
        </form>
    </body>
</html>
