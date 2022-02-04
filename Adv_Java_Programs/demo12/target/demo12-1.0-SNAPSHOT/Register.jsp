<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/2/2022
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getParameter("submit")!=null) {
        String Name = request.getParameter("uname");
        String Password = request.getParameter("upass");
        String City = request.getParameter("city");
        String Address = request.getParameter("address");


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc.mysql://localhost/login", "root", "ras");
        PreparedStatement pstmt = con.prepareStatement("insert into jsprec values(?,?,?,?)");
        pstmt.setString(1, Name);
        pstmt.setString(2, Password);
        pstmt.setString(3, City);
        pstmt.setString(4, Address);
        pstmt.executeUpdate();
        %>
<script>
alert("Record Inserted......");
</script>

        if (rs.next()) {
            response.sendRedirect("Success.jsp");

        } else {
            response.sendRedirect("Error.jsp");
        }
    }
%>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<form method="post" action="#">
    <lable>Username</lable>
    <input type="text"> name="uname"><br>
    <lable>Password</lable>
    <input type="Password" name="upass"><br>
    <lable>City</lable>
    <input type="text"> name="city"><br>
    <lable>Address</lable>
    <input type="text" name="address"><br>
    <input type="Submit" name="submit">
    <a href="Login.jsp">Go Back</a>
</form>
</body>
</html>
