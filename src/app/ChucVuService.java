/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class ChucVuService {
    public long getTienChucVu(String tenchucvu){
        try {
            String sql = "SELECT `tienchucvu` FROM `CHUCVU` WHERE `tenchucvu`='" + tenchucvu + "'";
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
