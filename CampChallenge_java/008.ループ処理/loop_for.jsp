<%-- 
    Document   : loop_for
    Created on : 2017/12/20, 10:49:23
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
    //for文を利用して、8を20回掛ける処理を実現してください。（8の20乗）
    
    long num = 1;
    for(int i=1; i<20; i++){
    num *= 8;
    out.println(num);
    }

    %>
     
    </body>
</html>
