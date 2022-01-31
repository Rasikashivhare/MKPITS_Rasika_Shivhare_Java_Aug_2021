package com.example.demo5;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("uname");
        String pass = request.getParameter("upass");

        // Hello

        PrintWriter out = response.getWriter();
        out.println(name);
        out.println(pass);
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","ras");

            Statement stmt=con.createStatement();
            String qr=("select uname,upassword from login where uname='"+name+"' and upassword='"+pass+"'");
            ResultSet rs= stmt.executeQuery(qr);
            while(rs.next()){
                if(rs.getString("uname").equals(name)&& rs.getString("upassword").equals(pass)) {
                    out.print("success");
                }
                else{
                            out.print("error");
                    }
                    }

        }catch (Exception e){
            out.println(e);
        }

    }

}