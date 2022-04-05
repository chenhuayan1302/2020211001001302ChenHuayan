package com.Chenhuayan.week5.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet (name = "LoginServlet",urlPatterns = {"/login"},
        initParams = {
                @WebInitParam(name="url",value="jdbc:sqlserver://localhost:1433;DatabaseName =userdb;encrypt=false"),
                @WebInitParam(name="driver",value="com.microsoft.sqlserver.jdbc.SQLServerDriver"),
                @WebInitParam(name="username",value="sa"),
                @WebInitParam(name="password",value="18370015206"),
        })
public class LoginServlet extends HttpServlet {
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public void init() throws ServletException {
        super.init();
        /*ServletConfig config = getServletConfig();
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
        }*/
        con=(Connection)getServletContext().getAttribute("con");//name of attibute
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String sql = "select * from usertable where username = ? and password=?;";
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            PrintWriter out = response.getWriter();
            if (resultSet.next()){
               //out.println("Login Success!!!Welcome!");
                request.setAttribute("username",resultSet.getString("username"));
                request.setAttribute("password",resultSet.getString("password"));
                request.setAttribute("email",resultSet.getString("email"));
                request.setAttribute("gender",resultSet.getString("gender"));
                request.setAttribute("Birthdays",resultSet.getString("Birthdays"));
                request.getRequestDispatcher("userInfo.jsp").forward(request,response);;
                return;
            }
            else{
                //out.println("Login Failed!");
                request.setAttribute("message","Username or Password Error!!!");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        {
            try {
                preparedStatement.close();
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
