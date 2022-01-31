package com.example.demo7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2.java", value = "/Servlet2.java")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("serv 2");
        out.println(request.getParameter("uname"));
       // out.println(request.getAttribute("num1"));   //local type1 ans

        ServletContext sc=getServletContext();
       out.println(sc.getAttribute("num1"));

    }
}

