<%-- 
    Document   : getSessionData
    Created on : Mar 8, 2022, 10:32:44 AM
    Author     : CodieBruh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Session data</title>
    </head>
    <body>
        <h1>The Session data</h1><br>
        
        <%
            String data_of_session = (String)session.getAttribute("session_set_data");
            out.print("The Session Data : "+ data_of_session+"<br>");
            out.print("<a href='removeSessionData.jsp' >Delete the session</a>");
        %>
    </body>
</html>
