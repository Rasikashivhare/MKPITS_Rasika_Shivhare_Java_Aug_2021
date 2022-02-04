<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/4/2022
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>"

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
     String num1= request.getParameter("num1")
%>

<m:forEach  begin="1" end="10" var="i" step="1">

<m:set var="num1" value="${10-i+1}"  scope="page"></m:set>
<m:out value ="${num1}"></m:out>

</m:forEach>

</body>
</html>
