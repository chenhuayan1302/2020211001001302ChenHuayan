package com.Chenhuayan.dao;

import com.Chenhuayan.model.Product;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements  IProductDao{
    @Override
    public int save(Product product, Connection con) throws SQLException {
        int n = 0;
        String sql = "insert into product(productName,productDescription,picture,price,categoryID) values(?,?,?,?,?)";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setString(1, product.getProductName());
        pt.setString(2, product.getProductDescription());
        if(product.getPicture()!=null) {
            //for sql server
            pt.setBinaryStream(3, product.getPicture());
            //for mysql
            //   pt.setBlob(3, product.getPicture());
        }
        pt.setDouble(4, product.getPrice());
        pt.setInt(5, product.getCategoryID());
        n = pt.executeUpdate();
        if (n > 0) {
            return n;
        }
        return 0;
    }//end save

    @Override
    public int delete(Integer productId, Connection con) {
        return 0;
    }

    @Override
    public int update(Product instance, Connection con) {
        return 0;
    }

    @Override
    public Product findById(Integer productId, Connection con)throws SQLException {
        String queryString = "select * from product where productID = ?";
        PreparedStatement pt = con.prepareStatement(queryString);
        pt.setInt(1, productId);
        ResultSet rs = pt.executeQuery();
        Product product = null;
        if (rs.next()) {
            product = new Product();
            product.setProductID(rs.getInt("productID"));
            product.setProductName(rs.getString("productName"));
            product.setPrice(rs.getDouble("price"));
            product.setProductDescription(rs.getString("productDescription"));
            product.setCategoryID(rs.getInt("categoryID"));
        }
        return product;
    }
    @Override
    public List<Product> findByCategoryId(int categoryId, Connection con) {
        List<Product> list = new ArrayList<Product>();
        try {
            String sql = "select * from product where categoryID = ?";
            PreparedStatement pt = con.prepareStatement(sql);
            pt.setInt(1, categoryId);
            ResultSet rs = pt.executeQuery();
            while (rs.next()){
                Product product = new Product();
                product.setProductID(rs.getInt("productID"));
                product.setProductName(rs.getString("productName"));
                product.setPicture(rs.getBlob("picture").getBinaryStream());
                product.setPrice(rs.getDouble("price"));
                product.setProductDescription(rs.getString("productDescription"));
                product.setCategoryID(rs.getInt("categoryID"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Product> findByPrice(double minPrice, double maxPrice, Connection con) throws SQLException {
        return null;
    }

    @Override
    public List<Product> findAll(Connection con) throws SQLException {
        List<Product> list = new ArrayList<Product>();
        String queryString = "select * from product";
        PreparedStatement pt = con.prepareStatement(queryString);
        ResultSet rs = pt.executeQuery();
        while (rs.next()){
            Product product = new Product();
            product.setProductID(rs.getInt("productID"));
            product.setProductName(rs.getString("productName"));
            product.setProductDescription(rs.getString("productDescription"));
            product.setPrice(rs.getDouble("price"));
            product.setCategoryID(rs.getInt("categoryID"));
            list.add(product);
        }
        System.out.println("successful");
        return list;

    }

    @Override
    public List<Product> findByProductName(String productName, Connection con) throws SQLException {
        return null;
    }

    @Override
    public List<Product> getPicture(Integer productId, Connection con) throws SQLException {
        return null;
    }
    public byte[] getPictureById(Integer productId,Connection con) throws SQLException {
        byte[] imgByte=null;
        String sql="select picture from Product where ProductId=?";
        PreparedStatement pt=con.prepareStatement(sql);
        pt.setInt(1,productId);
        ResultSet rs=pt.executeQuery();
        while(rs.next()){
            Blob blob=rs.getBlob("picture");
            imgByte=blob.getBytes(1,(int)blob.length());
        }
        return imgByte;
    }

}
