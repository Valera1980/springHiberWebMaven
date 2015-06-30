<%-- 
    Document   : addbook
    Created on : Jun 29, 2015, 6:43:42 PM
    Author     : valera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <div align="center">
            <h1 style="background-color: lightgreen; color: darkgreen">Add
                New Employee Page</h1>
        </div>
        <div align="center">
            <table  cellspacing="0" cellpadding="6" border="1" widht="60%">
                <tr>
                    <td colspan="8"
                        style="background-color: lightblue; color: darkgreen; font-size: 16pt"
                        align="center">book Information</td>
                </tr>
                <tr>
                    <td><form:form method="POST" action="updatebook" id="formm">
                            <table widht="100%">
                                <tr>
                                    <td><form:label path="author">author</form:label></td>
                                    <td align="left" width="70%"><form:input path="author" /></td>
                                </tr>
                                <tr>
                                    <td><form:label path="name">name</form:label></td>
                                    <td align="left"><form:input path="name" /></td>
                                </tr>


                                <tr>
                                    <td colspan="2"><input type="submit" id="sub" onclick="subDis()" value="ok" /></td>
                                </tr>
                            </table>
                        </form:form></td>
                </tr>
            </table>
        </div>
    </body>
    <script type="text/javascript" language="javascript">
        function subDis(){
            document.getElementById("sub").disabled = true;
            //alert("click");
        }        
    </script>
</html>
