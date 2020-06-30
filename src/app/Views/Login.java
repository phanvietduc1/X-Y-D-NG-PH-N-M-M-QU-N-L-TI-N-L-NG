package app.Views;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Connection;



public class Login extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField tfUser;
    JPasswordField tfPass;
    JButton bttLogin, bttExit, bttInfo;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Login() {
        setTitle("Phần mềm quản lý lương");
    }

    public void doShow() {
        setSize(630, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildGUI();
        setResizable(true);
        setVisible(true);
        addEvents();
        Ketnoi();
    }

    public void Ketnoi() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/qltl", "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void buildGUI() {

        setBackground(Color.gray);

        JPanel pnlWest = new JPanel();
        ImageIcon myImage = new ImageIcon("./src/image/1.jpg");
        pnlWest.add(new JLabel(myImage));

        add(pnlWest, BorderLayout.WEST);

        JPanel pnlCenter = new JPanel();
        pnlCenter.setLayout(new BorderLayout());

        JPanel pnSouthCenter = new JPanel();
        pnSouthCenter.add(bttLogin = new JButton("Login"));
        pnSouthCenter.add(bttExit = new JButton("Exit"));
        bttInfo = new JButton("i");
        pnSouthCenter.add(bttInfo);

        pnlCenter.add(pnSouthCenter, BorderLayout.SOUTH);

        JPanel pnNorthCenter = new JPanel();
        JLabel lbl1 = new JLabel("Login");
        Font ft1 = new Font("arial", Font.BOLD, 55);
        lbl1.setFont(ft1);
        lbl1.setForeground(Color.GRAY);
        pnNorthCenter.add(lbl1);
        pnlCenter.add(pnNorthCenter, BorderLayout.NORTH);

        Box b0 = Box.createVerticalBox();
        Box b1 = Box.createHorizontalBox();
        Box b2 = Box.createHorizontalBox();

        JLabel lblUser, lblPass;
        b1.add(lblUser = new JLabel("User name: "));
        lblUser.setFont(new Font("Arial", Font.PLAIN, 15));
        tfUser = new JTextField(20);
        b1.add(tfUser);
        b2.add(lblPass = new JLabel("Password: "));
        lblPass.setFont(new Font("Arial", Font.PLAIN, 15));
        tfPass = new JPasswordField(20);
        b2.add(tfPass);
        lblPass.setPreferredSize(lblUser.getPreferredSize());
        tfUser.setPreferredSize(tfPass.getPreferredSize());

        b0.add(Box.createVerticalStrut(25));
        b0.add(b1);
        b0.add(Box.createVerticalStrut(10));
        b0.add(b2);
        b0.add(Box.createVerticalStrut(45));
        pnlCenter.add(b0, BorderLayout.CENTER);

        add(pnlCenter, BorderLayout.CENTER);
    }

    public void addEvents() {
        bttLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Admin admin0 = new Admin();
                            admin0.doShow();
                            Login.this.dispose();

                            // new User("Phần mềm quản lý lương");
                            // Login.this.dispose();

                // try {
                //     String sql = "select * from account where username=? and password=?";
                //     getMD5(new String(tfPass.getText()));
                //     // tạo đối tượng thực thi câu lệnh select
                //     ps = conn.prepareStatement(sql);
                //     ps.setString(1, tfUser.getText());
                //     ps.setString(2, tfPass.getText());

                //     // thực thi câu lệnh select
                //     rs = ps.executeQuery();

                //     // nếu đăng nhập thành công
                //     if (rs.next()) {
                //         if (tfUser.getText().equals("admin")) {
                //             JOptionPane.showMessageDialog(null, "Chào mừng Admin");
                //             Admin admin0 = new Admin();
                //             admin0.doShow();
                //             Login.this.dispose();
                //         }
                //         if (tfUser.getText().equals("user")) {
                //             JOptionPane.showMessageDialog(null, "Chào mừng User");
                //             new User("Phần mềm quản lý lương");
                //             Login.this.dispose();
                //         }
                //     } else {
                //         JOptionPane.showConfirmDialog(rootPane, "User Name or Password not Matched", "Login Error", 1);
                //     }
                // } catch (Exception ex) {
                //     ex.printStackTrace();
                // } finally {
                //     // try {
                //     // // đóng kết nối
                //     // if (conn != null) {
                //     // conn.close();
                //     // }
                //     // if (rs != null) {
                //     // rs.close();
                //     // }
                //     // if (ps != null) {
                //     // ps.close();
                //     // }
                //     // } catch (Exception ex2) {
                //     // ex2.printStackTrace();
                //     // }
                // }
            }
        });
        bttInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "-	Nguyễn Thu Huyền\n" + "-	Phan Viết Đức\n" + "-	Lê Chí Hải",
                        "Thông tin nhóm", JOptionPane.INFORMATION_MESSAGE);
            };
        });
        bttExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Login.this.dispose();
            }
        });
    }

    public String getMD5(String md5) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF | 0x100))).substring(1, 3);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // private class RoundedBorder implements Border {

    // private int radius;

    // RoundedBorder(int radius) {
    // this.radius = radius;
    // }

    // public Insets getBorderInsets(Component c) {
    // return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    // }

    // public boolean isBorderOpaque() {
    // return true;
    // }

    // public void paintBorder(Component c, Graphics g, int x, int y, int width, int
    // height) {
    // g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    // }
    // }
}