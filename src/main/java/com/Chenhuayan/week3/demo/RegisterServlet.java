package com.Chenhuayan.week3.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet (name = "RegisterServlet",urlPatterns = {"/register"},
        initParams = {
                @WebInitParam(name="url",value="jdbc:sqlserver://localhost:1433;DatabaseName =userdb;encrypt=false"),
                @WebInitParam(name="driver",value="com.microsoft.sqlserver.jdbc.SQLServerDriver"),
                @WebInitParam(name="username",value="sa"),
                @WebInitParam(name="password",value="18370015206"),
        })
public class RegisterServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {
        super.init();
        ServletConfig config = getServletConfig();
        String url = config.getInitParameter("url");
        String driver = config.getInitParameter("driver");
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection -->" + con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender= request.getParameter("sex");
        String Birthdays = request.getParameter("Birthdays");


       /* PrintWriter writer = response.getWriter();
        writer.println("<br>username: "+username);
        writer.println("<br>password: "+password);
        writer.println("<br>email: "+email);
        writer.println("<br>gender: "+gender);
        writer.println("<br>Birthdays: "+Birthdays);
        writer.close();*/
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql1 = "insert into usertable(username,password,email,gender,Birthdays) values(?,?,?,?,?)";
        String sql2 = "select * from usertable";
        PrintWriter writer = response.getWriter();
        try {
            ps=con.prepareStatement(sql1);
            ps.setString(1,username);
            ps.setString(2,password);
            ps.setString(3,email);
            ps.setString(4,gender);
            ps.setString(5,Birthdays);
            ps.executeUpdate();
            ps = con.prepareStatement(sql2);
            ps.executeQuery();
            rs=ps.executeQuery();
            writer.println("<table border=1> <tr> <th>username</th> <th>password</th> <th>email</th>" +
                    "<th>gender</th> <th>Birthdays</th> </tr>" );
            while (rs.next()){
                writer.println(" <th>"+rs.getString("username")+"</th> ");
                writer.println(" <th>"+rs.getString("password")+"</th> ");
                writer.println(" <th>"+rs.getString("email")+"</th> ");
                writer.println(" <th>"+rs.getString("gender")+"</th> ");
                writer.println(" <th>"+rs.getString("Birthdays")+"</th></tr>");
            }
            writer.println("</table>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
