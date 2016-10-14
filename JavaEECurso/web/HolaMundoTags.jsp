<%-- 
    Document   : HolaMundoTags
    Created on : 30-sep-2016, 12:28:45
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>



    <%@ taglib uri="LibreriaTags" prefix="mistags" %>

    <h1>Hello World!</h1>

    <mistags:holamundo texto= "Hola!" repeticiones= "10">Este texto a veces se muestra y a veces no</mistags:holamundo>
        <p>Esto es un parrafo normal</p>
    <mistags:holamundo texto= "Adios!"/>

</html>
