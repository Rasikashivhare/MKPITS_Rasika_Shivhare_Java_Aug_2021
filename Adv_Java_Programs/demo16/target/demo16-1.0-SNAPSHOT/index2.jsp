<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/3/2022
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP-Hello world</title>

</head>
<body>
<div class="cont">

<form action="log1.jsp" method="get">

  name <input type="text" name="uname"><br><br>
   pass <input type="password" name="upass"><br><br>
    <input type="hidden" values="1234" name="id">
    <input type="submit">---%>
</form>
    <%
        int a=2;
        request.setAttribute("num1",a);
    %>
    <a href=" log1.jsp"> click here</a>
</div>

</body>
</html>
