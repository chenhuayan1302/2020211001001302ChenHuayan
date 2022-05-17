package com.Chenhuayan.controller;

import com.Chenhuayan.dao.ProductDao;
import com.Chenhuayan.model.Category;
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

@WebServlet(name = "ShopServlet",value = "/shop")
public class ShopServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init()  {
        con = (Connection) getServletContext().getAttribute("con");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Category category = new Category();
        List<Category> categoryList = category.findAllCategory(con);
        request.setAttribute("categoryList",categoryList);
        ProductDao productDao = new ProductDao();
        List<Product> productList = null;
        try {
            if (request.getParameter("categoryID")== null) {
                productList = productDao.findAll(con);
            } else {
                int categoryID = Integer.parseInt(request.getParameter("categoryID"));
                productList = productDao.findByCategoryId(categoryID,con);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("productList",productList);
        String path = "/WEB-INF/views/shop.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
