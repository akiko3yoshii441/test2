<%-- 
    Document   : loop_while
    Created on : 2017/12/21, 12:52:50
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
    //1000を2で割り続け、100より小さくなったらループを抜ける処理vv
    

    
    // ループ回数を表示する
    int key = 1000;
    while(key > 100) {
    key = key/2;
    }
    out.print("出力された値は"+key + "です。100以下になりました。");
    
    %>
    
 

     
    </body>
</html>
