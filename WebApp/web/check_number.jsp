<%-- 
    Document   : check_number
    Created on : Mar 8, 2022, 9:43:37 AM
    Author     : CodieBruh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculated Result</title>
    </head>
    <body>
        <%
//        number
            int num = Integer.parseInt(request.getParameter("number"));
            if(num%2==0){
                out.print(num +" is Even");
            }else{
                out.print(num +" is Odd");
            }
        %>
    </body>
</html>
