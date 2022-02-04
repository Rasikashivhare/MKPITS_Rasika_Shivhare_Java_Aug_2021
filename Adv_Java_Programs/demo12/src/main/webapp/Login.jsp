<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    if(request.getParameter("submit")!=null) {
        String name = request.getParameter("uname");
        String name = request.getParameter("upass");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc.mysql://localhost/demo1", "root", "ras");
        PreparedStatement pstmt = con.prepareStatement("select * from jsprec where username=? and password=?");
        pstmt.setString(1, name);
        pstmt.setString(2, pass);
        if (rs.next()) {
            response.sendRedirect("Success.jsp");

        } else {
            response.sendRedirect("Error.jsp");
        }
    }
    %>

    }
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form method="post" action="#">
    <lable>Username</lable>
    <input type="text"> name="uname"><br>
    <lable>Password</lable>
    <input type="Password" name="upass"><br>
    <input type="Submit" name="submit">
    <a href="Register.jsp">Create Account</a>
</form>
</body>
</html>