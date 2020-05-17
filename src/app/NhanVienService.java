package app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;

public class NhanVienService {
    public ArrayList<NhanVien> getNV() {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        try {
            String sql = "select * from nhanvien";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                // can luu vao 1 danh sach nxb
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setGioiTinh(rs.getString(3));
                nv.setChucVu(rs.getString(4));
                nv.setMaPhong(rs.getString(5));
                dsnv.add(nv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsnv;
    }
}