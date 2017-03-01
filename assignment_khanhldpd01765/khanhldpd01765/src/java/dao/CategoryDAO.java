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
import Model.Catalogue;






/**
 *
 * @author hoanghuynh
 */
public class CategoryDAO {


public ArrayList<Catalogue> getListCatalogues() {
        Connection con = ConnecDB.getConnection();
        String sql = "SELECT * FROM LOAI_SP";
        ArrayList<Catalogue> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Catalogue catalogue = new Catalogue();
                catalogue.setMaloai(rs.getString("Ma_loai"));
                catalogue.setTenloai(rs.getString("Loai_sp"));
                list.add(catalogue);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
     CategoryDAO dao = new CategoryDAO();
        for (Catalogue ds : dao.getListCatalogues()) {
            System.out.println(ds.getTenloai()+ " - " + ds.getMaloai());
        }
    }
}
