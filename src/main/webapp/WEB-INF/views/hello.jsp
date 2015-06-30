<%-- 
    Document   : hello
    Created on : Jun 28, 2015, 3:11:58 PM
    Author     : valera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>hello</title>
    </head>
    <body>
        <h1 style="color: green; text-align: center;">${name}</h1>
        <table align="center" cellspacing="10">
            <tr style="color: blue; font-style: italic; font-size: 14pt">
                <td align="left">Click Here</td>
                <td align="right" bgcolor="lightgreen">
                    <a href="http://localhost:8080/SpringWebHiberMaven/books">List
                        of books</a></td>
            </tr>
        </table>

        <table align="center" border="1" cellspacing="0" cellpadding="10">
            <tr>
                <td rowspan="2" style="color: red; text-align: center;">
                    Exception Handling
                </td>
                <td><a href="http://localhost:8080/SpringWebHiberMaven/books/testIOException">Click here to test IO
                        Exception</a>
                </td>
            </tr>
            <tr>
                <td><a href="http://localhost:8080/SpringWebHiberMaven/books/testGenericException">Click here totest Generic Exception</a>
                </td>
            </tr>
        </table>

        <h1 style="color: green; text-align: center;">Chapter 7: Spring
            MVC - internationalization
        </h1>
        <table align="center" border="1">
            <tr>
                <td><b style="color: brown">Language</b></td>
                <td><a href="?lang=en">English</a>|</td>
                <td><a href="?lang=ru">Русский</a></td>
            </tr>
        </table>
        <h2 style="color: orange; text-align: center;">
            <spring:message code="book.author" text="default text" />
            : ${author}
            
        </h2>
        <h2 style="color: orange; text-align: center;">
            <spring:message code="book.name" text="default text" />
            : ${name}
        </h2>
    </body>
</html>
