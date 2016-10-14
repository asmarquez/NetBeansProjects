<jsp:useBean id="firmante" class="pk.Usuario" scope="session"/>
<jsp:useBean id="libro" class="pk.LibroDeFirmas" scope="application"/>
<html>
    <head>
    </head>
    <body>
        <% libro.anhadirFirmante(firmante);%>
        <jsp:forward page="/Libro.jsp" />
    </body>
</html>