<%-- 
    Document   : redirect_allbooks
    Created on : Jul 2, 2015, 3:49:11 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>redirect page</title>
    </head>
    <body>
        <%
        String redirectURL = "/SpringWebHiberMaven/books";
        response.sendRedirect(redirectURL);
        %>
    </body>
</html>
