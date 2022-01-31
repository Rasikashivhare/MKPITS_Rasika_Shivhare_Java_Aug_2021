package com.example.demo7;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
      int a=4;
        // Hello
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");
        //global way or application way
        ServletContext sc=getServletContext();
        sc.setAttribute("num1",a);

     //   request.setAttribute("num1",a);     //local type1
        RequestDispatcher rd = request.getRequestDispatcher("Servlet2.java");
        try {
            rd.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}


      //  try
        //{
        //if (name.equals("rasi"))
        //{
          //  RequestDispatcher rd = request.getRequestDispatcher("suc.html");
            //rd.forward(request, response);
        //} else {
          //  RequestDispatcher rd = request.getRequestDispatcher("err.html");
            //rd.include (request, response);
        //}
    //}

      //  catch (Exception e)
        //{
          //  out.println(e);
        //}

