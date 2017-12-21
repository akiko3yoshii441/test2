<%-- 
    Document   : loop_for3
    Created on : 2017/12/21, 11:01:43
    Author     : yoshiiakiko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       int total = 0;
       for (int i = 1; i <= 100; i++) {
       total = total + i;
       }

       out.print(total);
       %>
    </body>
</html>
