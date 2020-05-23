package app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;

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
                lg.setluongcoban(rs.getLong(3));
                lg.setsongaylam(rs.getInt(4));
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
    
    public void updateLuong(Luong lg){
        try {
            String sql = "UPDATE LUONG set tongluong=" + Long.toString(lg.gettongluong()) + ", ghichu='" + lg.getghichu() + "' where MALUONG='" + lg.getmaluong() + "'";
            System.out.println(sql);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            int rs = pre.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}