package app.Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("serial")
public class User extends JFrame {

    private JPanel contentPane;
    private JTextField textField_maluong;
    private JTextField textField_songaylam;
    private JTextField textField_heso;
    private JTextField textField_phucap;
    private JTextField textField_tongluong;
    private JTextField textField_manv;
    private JTextField textField_tennv;
    private JTextField textField_gioitinh;
    private JTextField textField_ngayvaolam;
    private JTextField textField_chucvu;
    private JTextField textField_maphong;
    private Connection conn;
    private ResultSet rs;

    public User(String title) {

        super(title);

        addComponents();
        Display();
        addConnection();
        addConnection1();
    }

    /**
     * Launch the application.
     * 
     * @param <User>
     */

    /**
     * Create the frame.
     * 
     * @param string
     */

    private Connection getConnection() throws SQLException, ClassNotFoundException {

        String JDBC_DRIVER = "com.mysql.jdbc.Driver";

        String DB_URL = "jdbc:mysql://localhost/qltl";

        Class.forName(JDBC_DRIVER);

        conn = DriverManager.getConnection(DB_URL, "root", "");

        return conn;
    }

    private void Display() {

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void addComponents() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 490, 396);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(0, 0, 490, 224);
        contentPane.add(tabbedPane);

        JPanel panel_tabthongtin = new JPanel();
        tabbedPane.addTab("Thông tin", null, panel_tabthongtin, null);
        panel_tabthongtin.setLayout(null);

        JPanel panel_chenanh = new JPanel();
        panel_chenanh.setBounds(10, 21, 123, 135);
        panel_tabthongtin.add(panel_chenanh);
        panel_chenanh.setLayout(null);

        JLabel label_chenanh = new JLabel("");
        label_chenanh.setBounds(0, 0, 123, 135);
        panel_chenanh.add(label_chenanh);
        ImageIcon icon = new ImageIcon("./src/image/yasuo.jpg");
        label_chenanh.setIcon(icon);

        JPanel panel_manv = new JPanel();
        panel_manv.setBounds(281, 0, 175, 21);
        panel_tabthongtin.add(panel_manv);
        panel_manv.setLayout(null);

        textField_manv = new JTextField();
        textField_manv.setBounds(0, 0, 175, 21);
        panel_manv.add(textField_manv);
        textField_manv.setColumns(10);

        JPanel panel_tennv = new JPanel();
        panel_tennv.setBounds(281, 28, 175, 32);
        panel_tabthongtin.add(panel_tennv);
        panel_tennv.setLayout(null);

        textField_tennv = new JTextField();
        textField_tennv.setBounds(0, 0, 175, 32);
        panel_tennv.add(textField_tennv);
        textField_tennv.setColumns(0);

        JPanel panel_gioitinh = new JPanel();
        panel_gioitinh.setBounds(281, 70, 175, 22);
        panel_tabthongtin.add(panel_gioitinh);
        panel_gioitinh.setLayout(null);

        textField_gioitinh = new JTextField();
        textField_gioitinh.setBounds(0, 0, 175, 22);
        panel_gioitinh.add(textField_gioitinh);
        textField_gioitinh.setColumns(10);

        JPanel panel_ngayvaolam = new JPanel();
        panel_ngayvaolam.setBounds(281, 102, 175, 22);
        panel_tabthongtin.add(panel_ngayvaolam);
        panel_ngayvaolam.setLayout(null);

        textField_ngayvaolam = new JTextField();
        textField_ngayvaolam.setBounds(0, 0, 175, 22);
        panel_ngayvaolam.add(textField_ngayvaolam);
        textField_ngayvaolam.setColumns(10);

        JPanel panel_chucvu = new JPanel();
        panel_chucvu.setBounds(281, 134, 175, 22);
        panel_tabthongtin.add(panel_chucvu);
        panel_chucvu.setLayout(null);

        textField_chucvu = new JTextField();
        textField_chucvu.setBounds(0, 0, 175, 22);
        panel_chucvu.add(textField_chucvu);
        textField_chucvu.setColumns(10);

        JPanel panel_maphong = new JPanel();
        panel_maphong.setBounds(281, 166, 175, 21);
        panel_tabthongtin.add(panel_maphong);
        panel_maphong.setLayout(null);

        textField_maphong = new JTextField();
        textField_maphong.setBounds(0, 0, 175, 19);
        panel_maphong.add(textField_maphong);
        textField_maphong.setColumns(10);

        JPanel panel_manv1 = new JPanel();
        panel_manv1.setBounds(158, 0, 77, 28);
        panel_tabthongtin.add(panel_manv1);
        panel_manv1.setLayout(null);

        JLabel label_manv1 = new JLabel("Mã nhân viên");
        label_manv1.setBounds(0, 0, 77, 28);
        panel_manv1.add(label_manv1);

        JPanel panel_tennv1 = new JPanel();
        panel_tennv1.setBounds(158, 38, 77, 22);
        panel_tabthongtin.add(panel_tennv1);
        panel_tennv1.setLayout(null);

        JLabel label_tennv1 = new JLabel("Tên nhân viên");
        label_tennv1.setBounds(0, 0, 77, 22);
        panel_tennv1.add(label_tennv1);

        JPanel panel_gioitinh1 = new JPanel();
        panel_gioitinh1.setBounds(158, 70, 77, 21);
        panel_tabthongtin.add(panel_gioitinh1);
        panel_gioitinh1.setLayout(null);

        JLabel label_gioitinh1 = new JLabel("Giới tính");
        label_gioitinh1.setBounds(0, 0, 77, 21);
        panel_gioitinh1.add(label_gioitinh1);

        JPanel panel_ngayvaolam1 = new JPanel();
        panel_ngayvaolam1.setBounds(143, 102, 123, 22);
        panel_tabthongtin.add(panel_ngayvaolam1);
        panel_ngayvaolam1.setLayout(null);

        JLabel label_ngayvaolam1 = new JLabel("Ngày vào làm");
        label_ngayvaolam1.setBounds(0, 0, 123, 22);
        panel_ngayvaolam1.add(label_ngayvaolam1);

        JPanel panel_chucvu1 = new JPanel();
        panel_chucvu1.setBounds(158, 134, 92, 21);
        panel_tabthongtin.add(panel_chucvu1);
        panel_chucvu1.setLayout(null);

        JLabel label_chucvu1 = new JLabel("Chức vụ");
        label_chucvu1.setBounds(0, 0, 92, 21);
        panel_chucvu1.add(label_chucvu1);

        JPanel panel_maphong1 = new JPanel();
        panel_maphong1.setBounds(150, 166, 116, 21);
        panel_tabthongtin.add(panel_maphong1);
        panel_maphong1.setLayout(null);

        JLabel label_maphong1 = new JLabel("Mã phòng");
        label_maphong1.setBounds(0, 0, 116, 21);
        panel_maphong1.add(label_maphong1);

        JPanel panel_tabluong = new JPanel();
        tabbedPane.addTab("Lương", null, panel_tabluong, null);
        panel_tabluong.setLayout(null);

        JPanel panel_maluong = new JPanel();
        panel_maluong.setBounds(181, 10, 210, 28);
        panel_tabluong.add(panel_maluong);
        panel_maluong.setLayout(null);

        textField_maluong = new JTextField();
        textField_maluong.setBounds(0, 0, 210, 28);
        panel_maluong.add(textField_maluong);
        textField_maluong.setColumns(10);

        JPanel panel_songaylam = new JPanel();
        panel_songaylam.setBounds(181, 48, 210, 23);
        panel_tabluong.add(panel_songaylam);
        panel_songaylam.setLayout(null);

        textField_songaylam = new JTextField();
        textField_songaylam.setBounds(0, 0, 210, 23);
        panel_songaylam.add(textField_songaylam);
        textField_songaylam.setColumns(10);

        JPanel panel_heso = new JPanel();
        panel_heso.setBounds(181, 81, 210, 23);
        panel_tabluong.add(panel_heso);
        panel_heso.setLayout(null);

        textField_heso = new JTextField();
        textField_heso.setBounds(0, 0, 210, 23);
        panel_heso.add(textField_heso);
        textField_heso.setColumns(10);

        JPanel panel_phucap = new JPanel();
        panel_phucap.setBounds(181, 114, 210, 28);
        panel_tabluong.add(panel_phucap);
        panel_phucap.setLayout(null);

        textField_phucap = new JTextField();
        textField_phucap.setBounds(0, 0, 210, 28);
        panel_phucap.add(textField_phucap);
        textField_phucap.setColumns(10);

        JPanel panel_tongluong = new JPanel();
        panel_tongluong.setBounds(181, 152, 210, 28);
        panel_tabluong.add(panel_tongluong);
        panel_tongluong.setLayout(null);

        textField_tongluong = new JTextField();
        textField_tongluong.setBounds(0, 0, 210, 28);
        panel_tongluong.add(textField_tongluong);
        textField_tongluong.setColumns(10);

        JPanel panel_maluong1 = new JPanel();
        panel_maluong1.setBounds(23, 10, 146, 28);
        panel_tabluong.add(panel_maluong1);
        panel_maluong1.setLayout(null);

        JLabel label_maluong1 = new JLabel("Mã lương");
        label_maluong1.setBounds(0, 0, 146, 28);
        panel_maluong1.add(label_maluong1);

        JPanel panel_songaylam1 = new JPanel();
        panel_songaylam1.setBounds(23, 48, 146, 23);
        panel_tabluong.add(panel_songaylam1);
        panel_songaylam1.setLayout(null);

        JLabel label_songaylam1 = new JLabel("Số ngày làm");
        label_songaylam1.setBounds(0, 0, 146, 23);
        panel_songaylam1.add(label_songaylam1);

        JPanel panel_heso1 = new JPanel();
        panel_heso1.setBounds(23, 81, 146, 23);
        panel_tabluong.add(panel_heso1);
        panel_heso1.setLayout(null);

        JLabel label_heso1 = new JLabel("Hệ số");
        label_heso1.setBounds(0, 0, 146, 23);
        panel_heso1.add(label_heso1);

        JPanel panel_phucap1 = new JPanel();
        panel_phucap1.setBounds(23, 114, 146, 28);
        panel_tabluong.add(panel_phucap1);
        panel_phucap1.setLayout(null);

        JLabel label_phucap1 = new JLabel("Phụ cấp");
        label_phucap1.setBounds(0, 0, 146, 28);
        panel_phucap1.add(label_phucap1);

        JPanel panel_tongluong1 = new JPanel();
        panel_tongluong1.setBounds(23, 152, 146, 28);
        panel_tabluong.add(panel_tongluong1);
        panel_tongluong1.setLayout(null);

        JLabel label_tongluong1 = new JLabel("Tổng lương");
        label_tongluong1.setBounds(0, 0, 146, 28);
        panel_tongluong1.add(label_tongluong1);

        JPanel panel_tabthongbao = new JPanel();
        tabbedPane.addTab("Thông báo", null, panel_tabthongbao, null);
        panel_tabthongbao.setLayout(null);

    }

    private void addConnection() {
        try {
            conn = getConnection();

            String sql = "SELECT * FROM nhanvien Where MANV = 'NV01'";

            Statement st = conn.createStatement();

            rs = st.executeQuery(sql);

            String MANV = null;
            String TENNV = null;
            String GIOITINH = null;
            String NGAYVAOLAM = null;
            String tenchucvu = null;
            String MAPHONG = null;

            while (rs.next()) {
                MANV = rs.getString(1);
                TENNV = rs.getString(2);
                GIOITINH = rs.getString(3);
                NGAYVAOLAM = rs.getString(4);
                tenchucvu = rs.getString(5);
                MAPHONG = rs.getString(6);
            }

            textField_manv.setText(MANV);
            textField_tennv.setText(TENNV);
            textField_gioitinh.setText(GIOITINH);
            textField_ngayvaolam.setText(NGAYVAOLAM);
            textField_chucvu.setText(tenchucvu);
            textField_maphong.setText(MAPHONG);

            rs.close();
            conn.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    private void addConnection1() {
        try {
            conn = getConnection();
            String sql = "SELECT * FROM luong Where MALUONG = 'L01'";
            Statement st = conn.createStatement();

            rs = st.executeQuery(sql);

            String MALUONG = null;
            String SONGAYLAM = null;
            String HESO = null;
            String PHUCAP = null;
            String TONGLUONG = null;

            while (rs.next()) {
                MALUONG = rs.getString(1);
                SONGAYLAM = rs.getString(3);
                HESO = rs.getString(4);
                PHUCAP = rs.getString(5);
                TONGLUONG = rs.getString(6);

            }

            textField_maluong.setText(MALUONG);
            textField_songaylam.setText(SONGAYLAM);
            textField_heso.setText(HESO);
            textField_phucap.setText(PHUCAP);
            textField_tongluong.setText(TONGLUONG);

            rs.close();
            conn.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }
}