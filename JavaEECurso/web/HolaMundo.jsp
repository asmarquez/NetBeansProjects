<%-- 
    Document   : HolaMundo
    Created on : 27-sep-2016, 15:52:55
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <title>JSP Page</title>
    </head>
    <body>

        <%! int ultimo = 100000;%>
        <h1>Hello World NIGAS!!</h1>
        <p>Este es un parrafo de muestra!!! Niggas!</p>
        <p class="error">PONTE ONCE COMPRESHOR</p>
        <p>
            JAVA Suma: 4+6 + <%=ultimo%> = <%= ultimo + 4 + 6%> 
        </p>
        <br>
        <h2>LA FECHA ES: <%= new java.util.Date()%></h2>

        <% for (int i = 0; i <= 2; i++) {%>
        <ul>
            <li>
                Mostrando numero de lista: <%= i%>   
            </li>
        </ul>
        <% } %>
        
        
        
        <table id="t01">
            <caption>Tabla Magica</caption>
            <tr>
                <th>Nombre</th>
                <th>Numero Magico</th>
            </tr>

            <% for (int i = 0; i <= 10; i++) {%>
            <tr>
                <td><%=i%></th>
                <td><%=i%></th>
            </tr>


            <% }%>
            
            
            
                
        </table>
        
        
    </body>
</html>
