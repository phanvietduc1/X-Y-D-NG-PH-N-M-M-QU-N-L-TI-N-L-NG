package app.Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;

public class PhongService {
    public ArrayList<Phong> getPhong(){
        ArrayList<Phong> dsp = new ArrayList<Phong>();
        try {
            String sql = "select * from phong";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                // can luu vao 1 danh sach nxb
                Phong p = new Phong();
                p.setMaPhong(rs.getString(1));
                p.setTen(rs.getString(2));
                p.setTienPhong(rs.getLong(3));
                dsp.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsp;
    }
    
    public long getTienPhong(String maphong){
        try {
            String sql = "SELECT `tienphong` FROM `PHONG` WHERE `maphong`='" + maphong + "'";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            rs.next();
            return Long.parseLong(rs.getString(1));
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}