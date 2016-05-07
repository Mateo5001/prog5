<%-- 
    Document   : contex
    Created on : 6/05/2016, 06:30:54 PM
    Author     : mateo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <head>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <script src="js/funcions.js" type="text/javascript"></script>
        <script src="js/npm.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>bievenido</h1>
        <fieldset>
            <legend>Menu Principal</legend>
            <form id="uno" method="post" action="direccionar" >
                <input type="hidden"  name="hdfUsuer" value="1"/>
                <input type="button" value="Registro de usuarios" onclick="sub('uno')" name="btnOpcion1" />
            </form>
            <form id="dos" method="post" action="direccionar" >
                <input type="hidden" name="hdfProductos" value="1"/>
                <input type="button" value="Registro de productos" onclick="sub('dos')" name="btnOpcion2" />
            </form>
            <form id="tres" method="post" action="direccionar" >
                <input type="hidden" name="hdfPedidos" value="1"/>
                <input type="button" value="gestionar Pedido" onclick="sub('tres')" name="btnOpcion3" />
            </form>
            <form id="cuatro" method="post" action="direccionar" >
                <input type="button" value="Salir" onclick="close()" name="btnSalir" />
            </form>
            
            
            
        </fieldset>
    </body>
</html>
