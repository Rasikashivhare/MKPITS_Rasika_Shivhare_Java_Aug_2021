package com.example.demo4;

import java.io.*;
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

        // Hello
        PrintWriter out = response.getWriter();
        String name=request.getParameter("name");
        String pass=request.getParameter("pname");
        String gender=request.getParameter("gender");
        String city=request.getParameter("city");
        String disc=request.getParameter("disc");
        String course[]=request.getParameterValues("cb");

        out.println("<table >");
        out.println("<tr>");
        out.println("<td>name:</td>");
        out.println("<td>"+name+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Password:</td>");
        out.println("<td>"+pass+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Gender:</td>");
        out.println("<td>"+gender+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Course:</td>");
        for(String s:course){
            out.println("<td>"+s+"</td>");
        }
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>City:</td>");
        out.println("<td>"+city+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Discription:</td>");
        out.println("<td>"+disc+"</td>");
        out.println("</tr>");
        out.println("</table>");
    }

    public void destroy() {
    }
}