<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/4/2022
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP-Hello World</title>

</head>
<body>
<jsp:useBean id="user" class="com.example.demo20.UseBean"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>

<jsp:getProperty name="user" property="uname"/>

</body>
</html>
