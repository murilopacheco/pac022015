<%-- 
    Document   : index
    Created on : 26/11/2015, 12:46:44
    Author     : Danillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                margin: 5px;
            }
            
            form{
                background-color: green;
                height: 100px;
                width: 300px;
            }
            
            form div{
                margin: 5px;
            }
        </style>
    </head>
    <body>
        <div>
            <%
                if(session.getAttribute("usuario")==null){
            %>
            <form action="autenticacao" method="post">
                <div><input type="text" name="edtUsuario" placeholder="Informe usuário"></div>
                <div><input type="password" name="edtSenha" placeholder="Informe senha"></div>
                <div>
                    <input type="reset" value="Cancelar"/> &nbsp; <input type="submit" value="Confirmar"/>
                </div>
            </form>
            <%
                } else {
            %>
            
            <a href="pacotesAtribuidos.jsp">Pacotes atribuídos</a>
            
            <%
                }
            %>
        </div>
    </body>
</html>
