package app.Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                nv.setNgayVaoLam(rs.getString(4));
                nv.setChucVu(rs.getString(5));
                nv.setMaPhong(rs.getString(6));
                dsnv.add(nv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsnv;
    }
    
    public NhanVien getFirstNV(String manv) {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        try {
            String sql = "select * from nhanvien where `manv`=?";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, manv);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                // can luu vao 1 danh sach nxb
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setGioiTinh(rs.getString(3));
                nv.setNgayVaoLam(rs.getString(4));
                nv.setChucVu(rs.getString(5));
                nv.setMaPhong(rs.getString(6));
                return nv;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public boolean createNV(NhanVien nv){
        try {
            String sql = "INSERT INTO `NHANVIEN` (`MANV`, `TENNV`, `GIOITINH`, `NGAYVAOLAM`, `tenchucvu`, `MAPHONG`) VALUES ('"+nv.getMaNV() + "', '"+nv.getTenNV() + "', '"+nv.getGioiTinh() + "', '"+nv.getNgayVaoLam() + "', '"+nv.getChucVu() + "', '"+nv.getMaPhong() + "') ";
            System.out.println(sql);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            int rs = pre.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
     }

    public boolean removeNV(String manv){
        try {
            String sql = "DELETE FROM NHANVIEN WHERE `manv`=?";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, manv);
            int rs = pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean updateNV(NhanVien nv){
        try {
            String sql = "UPDATE `NHANVIEN` SET `TENNV`=?, `GIOITINH`=?, `NGAYVAOLAM`=?, `TENCHUCVU`=?, `MAPHONG`=? WHERE `MANV`=?";
            System.out.println(sql);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, nv.getTenNV());
            pre.setString(2, nv.getGioiTinh());
            pre.setString(3, nv.getNgayVaoLam());
            pre.setString(4, nv.getChucVu());
            pre.setString(5, nv.getMaPhong());
            pre.setString(6, nv.getMaNV());
            int rs = pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
     }
}