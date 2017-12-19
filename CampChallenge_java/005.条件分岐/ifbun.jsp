<%-- 
    Document   : ifbun
    Created on : 2017/12/18, 17:23:28
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
            
             int num = 3;
             if (num==1){
                out.print("1です");
                } else if (num==2){
                out.print("プログラミングキャンプ！");
                } else {
                out.print("その他です！");
                }
            %>
    </body>
</html>
