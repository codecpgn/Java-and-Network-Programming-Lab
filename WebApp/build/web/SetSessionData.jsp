<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Set</title>
    </head>
    <body>
        <h1>Session Set</h1><br>
        <%
          String session_data = request.getParameter("session_text");
          session.setAttribute("session_set_data", session_data);
          out.print("<a href='getSessionData.jsp' >Show session set data</a>");
        %>
    </body>
</html>
