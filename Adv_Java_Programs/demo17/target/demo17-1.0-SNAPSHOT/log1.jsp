<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>"

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
welcome to login page

<m:set var="num1" value="33" ></m:set>
<m:out value ="${num1}"></m:out>

<m:if test="${num1>33}">
    <h1> my number is greater</h1>
</m:if>

<m:forEach var="i" begin="1" end="10">
  <h1>jstl loop</h1>
</m:forEach>

</body>
</html>