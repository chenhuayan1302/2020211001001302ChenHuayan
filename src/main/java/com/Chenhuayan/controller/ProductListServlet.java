package com.Chenhuayan.controller;

import com.Chenhuayan.dao.ProductDao;
import com.Chenhuayan.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductListServlet",value = "/admin/productList")
public class ProductListServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init()  {
        con = (Connection) getServletContext().getAttribute("con");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ProductDao productDao = new ProductDao();
            List<Product> productList= productDao.findAll(con);
            request.setAttribute("productList",productList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String path="/WEB-INF/views/admin/productList.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }
}
