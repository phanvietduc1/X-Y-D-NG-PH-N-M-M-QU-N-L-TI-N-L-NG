package app.Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LuongService {
    public ArrayList<Luong> getLuong() {
        ArrayList<Luong> dslg = new ArrayList<Luong>();
        try {
            String sql = "select * from luong";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                // can luu vao 1 danh sach nxb
                Luong lg = new Luong();
                lg.setmaluong(rs.getString(1));
                lg.setmanv(rs.getString(2));
                lg.setsongaylam(rs.getInt(3));
                lg.setheso(rs.getDouble(4));
                lg.setphucap(rs.getLong(5));
                lg.settongluong(rs.getLong(6));
                lg.setghichu(rs.getString(7));
                dslg.add(lg);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dslg;
    }

    public Luong getFirstLuong(String manv) {
        ArrayList<Luong> dslg = new ArrayList<Luong>();
        try {
            String sql = "select * from luong where `manv`=?";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, manv);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                // can luu vao 1 danh sach nxb
                Luong lg = new Luong();
                lg.setmaluong(rs.getString(1));
                lg.setmanv(rs.getString(2));
                // lg.setluongcoban(rs.getLong(3));
                lg.setsongaylam(rs.getInt(3));
                lg.setphucap(rs.getLong(4));
                lg.settongluong(rs.getLong(5));
                lg.setghichu(rs.getString(6));
                return lg;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateLuong(Luong lg) {
        try {
            String sql = "UPDATE LUONG set tongluong=" + Long.toString(lg.gettongluong()) + ", ghichu='"
                    + lg.getghichu() + "' where MALUONG='" + lg.getmaluong() + "'";
            System.out.println(sql);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            int rs = pre.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean createLuong(Luong lg) {
        try {
            String sql = "INSERT INTO `LUONG` (`MALUONG`, `MANV`, `SONGAYLAM`, `HESO`, `PHUCAP`, `TONGLUONG`, `GHICHU`) VALUES (?, ?, ?, ?, ?, ?, ?) ";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, lg.getmaluong());
            pre.setString(2, lg.getmanv());
            pre.setInt(3, lg.getsongaylam());
            pre.setDouble(4, lg.getheso());
            pre.setLong(5, lg.getphucap());
            pre.setLong(6, lg.gettongluong());
            pre.setString(7, lg.getghichu());
            System.out.println(pre);
            int rs = pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean removeLuong(String manv) {
        try {
            String sql = "DELETE FROM LUONG WHERE `manv`=?";
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

    public boolean updateAllLuong(Luong lg) {
        try {
            String sql = "UPDATE `LUONG` SET `SONGAYLAM`=?, `HESO`=?, `PHUCAP`=?, `TONGLUONG`=?, `GHICHU` =? WHERE `MANV`=?";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1, lg.getsongaylam());
            pre.setDouble(2, lg.getheso());
            pre.setLong(3, lg.getphucap());
            pre.setLong(4, lg.gettongluong());
            pre.setString(5, lg.getghichu());
            pre.setString(6, lg.getmanv());
            System.out.println(pre);
            int rs = pre.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}