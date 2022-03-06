package com.Chenhuayan.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//now its just a java class
//extend HttpServlet
public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //when client request method is GET - here - inside doGet()
        final PrintWriter writer = response.getWriter();
        writer.println("name:Chenhuayan");
        writer.println("id:2020211001001302");
        writer.println("date and time:Sun Mar 6 19:12:00 CST 2021");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        //when client request method is GET - here - inside doGet()

    }
}
