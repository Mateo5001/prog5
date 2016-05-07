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
        <script src="js/funcions.js" type="text/javascript"></script>
        <div style="float: left;align-items: flex-start">
        <h1>Usuario</h1>
        <form id="formusu" name="usuario" method="post" action="usuarios" >
            <fieldset>
                <legend>Datos Basicos</legend>
                    <div style="float:left;width: 35%;clear: both">
                        Nombres:    
                    </div>  
                    <div style="float:left;width: 35%">
                        <input type="text" name="txtNombres" /><br>
                    </div>
                    <div style="float:left;width: 35%;clear: both">
                        Apellidos  
                    </div>
                    <div style="float:left;width: 35%">
                        <input type="text" name="txtApellidos" /><br>
                    </div>
                    <div style="float:left;width: 35%;clear: both">
                        Identificacion:
                    </div>
                    <div style="float:left;width: 35%">
                        <input type="text" name ="txtIdentificacion" /><br>
                    </div>
                    <div style="float:left;width: 35%;clear: both">
                         Telefono: 
                    </div>
                    <div style="float:left;width: 35%">
                        <input type="text" name ="txtTelefono" /><br>
                    </div>
            
             
            </fieldset>
            <fieldset>
                <legend>Ingreso de usuario</legend>
                
                <div style="float:left;width: 35%;clear: both">
                    user name: 
                </div>
                <div style="float:left;width: 35%">
                    <input type="text" name="txtUserName"/><br>
                </div>
                <div style="float:left;width: 35%;clear: both">
                    Password: 
                </div>
                <div style="float:left;width: 35%">
                    <input type="password" name ="txtPassword"/><br>
                </div>
                
                <div style="float:left;width: 35%;clear: both">
                    confirm: 
                </div>
                <div style="float:left;width: 35%">
                    <input type="password" name="txtconfirPass"/><br>
                </div>
            </fieldset>    
            <input type="button" name="btnGuardar" value="Guardar" onclick="sub('formusu')" />
        </form>
        </div>
    </body>
</html>
