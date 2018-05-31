/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import demo.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author NAM TRUONG
 */
public class ProductModel {
    
      public boolean submit(Product product) {
        try {
            String sqlString = "insert into product (name, image, price) value (?,?,?)";
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sqlString);
            ps.setString(1, product.getName());
            ps.setString(2, product.getImage());
            ps.setString(3, product.getPrice());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
      public Product table(String name) {
        String sql = "select * from product where name = ?";
        try {
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name1 = rs.getString("name");
                String image = rs.getString("image");
                String price = rs.getString("price");
                Product product = new Product(name, image, price);
                return product;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
