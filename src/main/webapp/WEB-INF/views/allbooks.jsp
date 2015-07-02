<%-- 
    Document   : allbooks
    Created on : Jun 28, 2015, 3:42:46 PM
    Author     : valera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>book list</title>
    </head>
    <body>
        <div align="center">
            <h1 style="background-color: lightgreen; color: darkgreen">books
                List
            </h1>

            <table align="centre" cellspacing="0" cellpadding="6" border="1">
                <tr align="right"><a href="${pageContext.request.contextPath}/books/addbook">
                add book
                </a>
                    
                </tr>
                <tr bgcolor="grey" style="color: white">
                    <th>No</th>
                    <th>author</th>
                    <th>name</th>
                    <th>delete</th>
                    <th>edit</th>
                </tr>
                <c:forEach var="onebook" items="${books}" varStatus="status"> 
                    <tr bgcolor="lightyellow">
                        <td><b>${status.index + 1}</b></td>
                        <td>${onebook.author}</td>
                        <td>${onebook.name}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/books/deletebook/${onebook.id}">
                                delete
                            </a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/books/edit/${onebook.id}">
                                edit
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
