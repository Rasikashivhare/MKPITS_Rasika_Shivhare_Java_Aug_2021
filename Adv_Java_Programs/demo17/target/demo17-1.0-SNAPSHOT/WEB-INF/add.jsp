<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/4/2022
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>"

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
welcome to login page
<%
    String number1 =request.getParameter("num1");
    String number2= request.getParameter("num2");
%>

<m:set var="number1"  ></m:set>
<m:set var="number2" ></m:set>


<m:out value =" ${n1+n2}"></m:out>


</body>
</html>
