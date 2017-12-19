<%-- 
    Document   : sisokuenzan
    Created on : 2017/12/18, 16:36:21
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
            final int BASE = 800;
            int num=5;
            
            int tasu = BASE + num;
            out.println(tasu);
            
            int kakeru = BASE * num;
            out.println(kakeru);
            
            int waru = BASE / num;
            out.println(waru);
            
            int hiku = BASE - num;
            out.println(hiku);
        %>
            
            
       </body>
</html>
