
package app.Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChucVuService {
    public ArrayList<ChucVu> getChucVu() {
        ArrayList<ChucVu> dscv = new ArrayList<ChucVu>();
        try {
            String sql = "select * from chucvu";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                // can luu vao 1 danh sach nxb
                ChucVu cv = new ChucVu();
                cv.settenchucvu(rs.getString(1));
                cv.settienchucvu(rs.getLong(2));
                dscv.add(cv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dscv;
    }
    public long getTienChucVu(String tenchucvu){
        try {
            String sql = "SELECT * FROM `CHUCVU` WHERE `tenchucvu`='" + tenchucvu + "'";
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
