package app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;

public class LuongUnionNhanVienService {
    public ArrayList<LuongUnionNhanVien> getlgUnv() {
        ArrayList<LuongUnionNhanVien> dslgUnv = new ArrayList<LuongUnionNhanVien>();
        try {
            String sql = "select nhanvien.manv, tennv, luongcoban, songaylam, phucap, tongluong, ghichu from nhanvien inner join luong on nhanvien.manv=luong.manv";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                // can luu vao 1 danh sach nxb
                LuongUnionNhanVien lgUnv = new LuongUnionNhanVien();
                lgUnv.setMaNV(rs.getString(1));
                lgUnv.setTenNV(rs.getString(2));
                lgUnv.setluongcoban(rs.getInt(3));
                lgUnv.setsongaylam(rs.getInt(4));
                lgUnv.setphucap(rs.getInt(5));
                lgUnv.settongluong(rs.getInt(6));
                lgUnv.setghichu(rs.getString(7));

                dslgUnv.add(lgUnv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dslgUnv;
    }
}