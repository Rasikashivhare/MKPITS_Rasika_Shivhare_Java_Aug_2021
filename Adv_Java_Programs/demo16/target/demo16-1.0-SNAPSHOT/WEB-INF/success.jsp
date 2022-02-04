<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/3/2022
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
success page
<%
String num1=(String)session.getAttribute("num1");
out.println(num1);

%>
</body>
</html>
