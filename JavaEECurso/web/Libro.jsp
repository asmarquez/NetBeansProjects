
<%@ page import= "pk.*" %>
<%@ page import= "java.util.List" %>
<jsp:useBean id="firmante" class="pk.Usuario" scope="session"/>
<jsp:useBean id="libro" class="pk.LibroDeFirmas" scope="application"/>
<html>
    <head>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <% if (firmante.getNombre() != null) { %>
        <h1> Hola <jsp:getProperty name="firmante" property="nombre" />!</h1>
        <% } else { %>
        <h1> Hola!</h1>
        <% } %>

        <img style="width: 358px;" alt="a"
             src="gatitosalvado.jpg">

        <p>Esta es toda la gente que ha salvado al gatito: </p>
        <ul>
            <% for (Usuario firma : libro.getFirmantes()) {
                    out.print("<li>" + firma.getNombre() + " (" + firma.getEmail() + ")</li>");
                }
                session.invalidate();
            %>
        </ul>
        <a href="/JavaEECurso/Peticion.jsp">Volver al formulario</a>
        
    </body>
</html>