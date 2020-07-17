/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entities.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB
 */
public class ProductDAO implements IProduct {

    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;

    public Connection setCon() throws ClassNotFoundException, SQLException {
        String str = "jdbc:sqlserver://localhost:1433;database=aptech";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(str, "sa", "123");
        return con;
    }

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        try {
            setCon();
            String query = "SELECT * FROM Product";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getDouble(3));

                list.add(p);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Product findOne(String id) {
        Product p = new Product();
        try {
            setCon();
            String query = "SELECT * FROM Product where Id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                p.setId(rs.getString(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getDouble(3));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public List<Product> findByName(String id) {
        List<Product> list = new ArrayList<>();
        try {
            setCon();
            String query = "SELECT * FROM Product where Id like ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, "%" + id + "%");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getDouble(3));

                list.add(p);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

}
