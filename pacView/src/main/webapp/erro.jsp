<%-- 
    Document   : erro
    Created on : 26/11/2015, 13:45:52
    Author     : Danillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Erro</h1>
        <%=session.getAttribute("errorMessage") %>
        <p/>
        <a href="index.jsp">Página principal</a>
    </body>
</html>
