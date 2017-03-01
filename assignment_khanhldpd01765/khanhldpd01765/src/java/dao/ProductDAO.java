/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.ConnecDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.Product;

/**
 *
 * @author hoanghuynh
 */
public class ProductDAO {

    public ArrayList<Product> getListProductByCategory(String Ma_loai) throws SQLException {
        Connection connection = ConnecDB.getConnection();
        String sql = "SELECT * FROM SAN_PHAM WHERE Ma_loai = '" + Ma_loai + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setMasp(rs.getString("Ma_sp"));
            product.setTensp(rs.getString("Ten_sp"));
            product.setMota(rs.getString("Mo_ta"));
            product.setSoluong(rs.getInt("So_luong"));
            product.setDongia(rs.getInt("Don_gia"));
            product.setHinhanh(rs.getString("Hinh_anh"));
            product.setNhasx(rs.getString("Nha_sx"));
            product.setMaloai(rs.getString("Ma_loai"));
            list.add(product);
        }
        return list;
    }
   

    public static void main(String[] args) throws SQLException {
        ProductDAO dao = new ProductDAO();
        for (Product p : dao.getListProductByCategory("sp009")) {
            System.out.println(p.getMaloai()+ "---" + p.getTensp());
        }
    }
}
