/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ConnecDB {
   Connection con;
    String dbname;
    String user;
    String pass;
    public  ConnecDB(String dbname, String user, String pass){
        this.dbname=dbname;
        this.user=user;
        this.pass=pass;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/QLBH","khanh","123456");
        } catch (Exception e) {
        }
    }
     public static Connection getConnection(){
   Connection con = null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/QLBH","khanh","123456");
       } catch (Exception e) {
      e.printStackTrace();
       }
       return con;
   }

public  int Login(String user, String pass){ // tro ve 0 khi login sai, 1 la ad, 2 la khach hang
    try {
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from KHACH_HANG where Username= '"+user+"' and Pass= '"+pass+"' ");
        if(rs.next()){
            if(rs.getString(3).equals("admin"))
                return 1;
            else 
                return 2;
        }else{
            return 0;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }}
   

    public static Account findUser(Connection con, String Username, String Pass) throws SQLException{
        String sql= "select Username, Pass,Vai_tro, Ho_ten, Dia_chi, Email, Sdt from KHACH_HANG"+"where Username=? and Pass=? ";
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setString(1, Username);
        ps.setString(2, Pass);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            String gender= rs.getString("Gender");
            Account acc= new Account();
            acc.setUsername(Username);
            acc.setPass(Pass);
            acc.setVaitro(gender);
            return acc;
            
        }
        return null;
    }
    public static List<Product> queryProduct(Connection con) throws SQLException{
       String sql= "select Ma_sp, Ten_sp, Mo_ta, So_luong, Don_gia, Hinh_anh, Nha_sx, Ma_loai from SAN_PHAM " ;
       PreparedStatement ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       List<Product> list = new ArrayList<Product>();
       while (rs.next()){
           String masp= rs.getString("Ma_sp");
           String tensp= rs.getString("Ten_sp");
           String mota= rs.getString("Mo_ta");
           int soluong= rs.getInt("So_luong");
           float dongia= rs.getFloat("Don_gia");
           String hinhanh= rs.getString("Hinh_anh");
           String nhasx= rs.getString("Nha_sx");
           String maloai= rs.getString("Ma_loai");
           Product pro= new Product();
           pro.setMasp(masp);
           pro.setTensp(tensp);
           pro.setMota(mota);
           pro.setSoluong(soluong);
           pro.setDongia(soluong);
           pro.setHinhanh(hinhanh);
           pro.setNhasx(nhasx);
           pro.setMaloai(maloai);
           list.add(pro);         
       }
       return list;
    }
    public static Product findProduct(Connection con, String masp) throws SQLException{
        String sql= "select Ma_sp, Ten_sp, Mo_ta, So_luong, Don_gia, Hinh_anh, Nha_sx, Ma_loai from SAN_PHAM where Ma_sp=? " ;
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, masp);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            String tensp= rs.getString("Ten_sp");
            String mota= rs.getString("Mo_ta");
            int soluong= rs.getInt("So_luong");
            float dongia= rs.getFloat("Don_gia");
            String hinhanh= rs.getString("Hinh_anh");
            String nhasx= rs.getString("Nha_sx");
            String maloai= rs.getString("Ma_loai");
            Product pro= new Product(masp,tensp,mota,soluong,dongia,hinhanh,nhasx,maloai);
            return pro;
        }
        return null;       
    }
    public static void  updateProduct(Connection con, Product product) throws SQLException{
        String sql= "update SAN_PHAM set Ten_sp, Mo_ta, So_luong, Don_gia, Hinh_anh, Nha_sx, Ma_loai from SAN_PHAM where Ma_sp=? " ;
        PreparedStatement ps = con.prepareStatement(sql);      
        ps.setString(1, product.getTensp() );
        ps.setString(2,  product.getMota());
        ps.setInt(3,  product.getSoluong());
        ps.setFloat(4, (float) product.getDongia());
        ps.setString(5,  product.getHinhanh());
        ps.setString(6,  product.getNhasx());
        ps.setString(7,  product.getNhasx());
        ps.setString(8,  product.getMaloai());
        ps.executeUpdate();
    }
    public static void  insertProduct(Connection con, Product product) throws SQLException{
        String sql= "insert into SAN_PHAM ( Ma_sp, Ten_sp, Mo_ta, So_luong, Don_gia, Hinh_anh, Nha_sx, Ma_loai ) values (?,?,?,?,?,?,?,?" ;
        PreparedStatement ps = con.prepareStatement(sql);      
        ps.setString(1, product.getTensp() );
        ps.setString(2,  product.getMota());
        ps.setInt(3,  product.getSoluong());
        ps.setFloat(4, (float) product.getDongia());
        ps.setString(5,  product.getHinhanh());
        ps.setString(6,  product.getNhasx());
        ps.setString(7,  product.getNhasx());
        ps.setString(8,  product.getMaloai());
        ps.executeUpdate();
    }
    public static void  deleteProduct(Connection con, String code) throws SQLException{
        String sql= "delete SAN_PHAM where Ma_sp=?" ;
        PreparedStatement ps = con.prepareStatement(sql);      
        ps.setString(1, code);
        ps.executeUpdate();
    }
}
