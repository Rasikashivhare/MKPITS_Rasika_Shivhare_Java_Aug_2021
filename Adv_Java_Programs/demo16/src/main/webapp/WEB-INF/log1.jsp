<%@ page import="static java.lang.Class.forName" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/3/2022
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page errorPage="error.jsp" %>

<html>
<head>
    <title>JSP-Hello World</title>
</head>
<body>
welcome to login page
<%
    //response.sendRedirect("https://getbootstrap.com");

    String num1 = ("num1");

    out.println(num1);
%>
<a href="success.jsp">click here</a>
</body>
</html>
