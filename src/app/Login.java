package app;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
// import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Connection;
// import javax.swing.border.Border;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class Login extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField tfUser;
    JPasswordField tfPass;
    JButton bttLogin, bttExit, bttInfo;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // bttInfo.setBorder(new RoundedBorder(10));

    public Login() {
        setTitle("Phan mem quan ly luong");
    }

    public void doShow() {
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildGUI();
        setResizable(false);
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
        bttInfo=new JButton("i"); 
        bttInfo.setBounds(440, 330, 40, 30);
        // bttInfo.setSize(45, 45);
        add(bttInfo);

        JPanel pnlNorth = new JPanel();
        pnlNorth.setBorder(BorderFactory.createLineBorder(Color.RED));

        JLabel labelLogon;
        pnlNorth.add(labelLogon = new JLabel("Login"));
        labelLogon.setFont(new Font("Arial", Font.BOLD, 30));
        labelLogon.setForeground(Color.red);
        add(pnlNorth, BorderLayout.NORTH);

        JPanel pnlWest = new JPanel();
        pnlWest.setBorder(BorderFactory.createLineBorder(Color.red));
        ImageIcon myImage = new ImageIcon("./src/image/download.jpg");
        pnlWest.add(new JLabel(myImage));

        add(pnlWest, BorderLayout.CENTER);

        JPanel pnlSouth = new JPanel();
        pnlSouth.setBorder(BorderFactory.createLineBorder(Color.RED));
        pnlSouth.add(bttLogin = new JButton("Login"));
        // pnlSouth.add(bttExit = new JButton("Exit"));

        add(pnlSouth, BorderLayout.SOUTH);

        JPanel pnlCenter = new JPanel();
        pnlCenter.setBorder(BorderFactory.createLineBorder(Color.red));

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
        tfPass.setPreferredSize(tfUser.getPreferredSize());

        b0.add(Box.createVerticalStrut(50));
        b0.add(b1);
        b0.add(Box.createVerticalStrut(10));
        b0.add(b2);
        pnlCenter.add(b0);

        add(pnlCenter, BorderLayout.EAST);
    }

    public void addEvents() {
        bttLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sql = "select * from account where username=? and password=?";
                    getMD5(new String(tfPass.getPassword()));
                    // tạo đối tượng thực thi câu lệnh select
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, tfUser.getText());
                    ps.setString(2, tfPass.getText());

                    // thực thi câu lệnh select
                    rs = ps.executeQuery();

                    // nếu đăng nhập thành công
                    if (rs.next()) {
                        if (tfUser.getText().equals("admin")) {
                            JOptionPane.showMessageDialog(null, "Login Successfully. admin");
                            Admin admin0 = new Admin();
                            admin0.doShow();
                            Login.this.dispose();
                        }
                        if (tfUser.getText().equals("user")) {
                            JOptionPane.showMessageDialog(null, "Login Successfully");
                            User user0 = new User();
                            user0.doShow();
                            Login.this.dispose();
                        }
                    } else {
                        JOptionPane.showConfirmDialog(rootPane, "User Name or Password not Matched", "Login Error", 1);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    // try {
                    // // đóng kết nối
                    // if (conn != null) {
                    // conn.close();
                    // }
                    // if (rs != null) {
                    // rs.close();
                    // }
                    // if (ps != null) {
                    // ps.close();
                    // }
                    // } catch (Exception ex2) {
                    // ex2.printStackTrace();
                    // }
                }
            }
        });
        bttInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "-	Nguyễn Thu Huyền\n" + "-	Phan Viết Đức\n" + "-	Lê Chí Hải",
                        "Thông tin nhóm", JOptionPane.INFORMATION_MESSAGE);
            };
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