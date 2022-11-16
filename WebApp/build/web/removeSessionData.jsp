<%-- 
    Document   : removeSessionData
    Created on : Mar 8, 2022, 10:36:26 AM
    Author     : CodieBruh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Removed Session</title>
    </head>
    <body>
        <h1>Session Removed</h1><br>
        <%
            session.removeAttribute("session_set_data");
            out.print("<a href='Question9.html' >Set Another Session</a>");

        %>
    </body>
</html>
