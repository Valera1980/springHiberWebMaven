<%-- 
    Document   : editbook
    Created on : Jul 2, 2015, 7:47:12 PM
    Author     : valera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>edit book</title>
    </head>
    <body>
        <div align="center">
            <h1 style="background-color: lightgreen; color: darkgreen">edit
               book page</h1>
        </div>
        <div align="center">
            <table  cellspacing="0" cellpadding="6" border="1" widht="60%">
                <tr>
                    <td colspan="8"
                        style="background-color: lightblue; color: darkgreen; font-size: 16pt"
                        align="center">book Information</td>
                </tr>
                <tr>
                    <td><form:form method="POST" action="editbook">
                            <table widht="100%">
                                
                                <tr style="visibility: hidden">
                                    <td><form:label path="id" name="id">id</form:label></td>
                                    <td align="left" width="70%"><form:input path="id" value="${book.id}" /></td>
                                </tr>
                                <tr>
                                    <td><form:label path="author" name="author">author</form:label></td>
                                    <td align="left" width="70%"><form:input path="author" value="${book.author}" /></td>
                                </tr>
                                <tr>
                                    <td><form:label path="name" name="name">name</form:label></td>
                                    <td align="left"><form:input path="name" value="${book.name}" /></td>
                                </tr>


                                <tr>
                                    <td colspan="2"><input type="submit" value="ok" /></td>
                                </tr>
                            </table>
                        </form:form></td>
                </tr>
            </table>
        </div>
    </body>
    </body>
</html>
