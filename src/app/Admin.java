package app;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.ImageIcon;

public class Admin extends JFrame {
    private static final long serialVersionUID = 1L;
    JButton khenbtn, phatbtn, logoutbtn, thembtn, suabtn, xoabtn;
    JPanel mainpnl;
    JTable tb;
    DefaultTableModel dtm; // ddowj
    GridLayout grid = new GridLayout(0, 1);

    public Admin() {
        setTitle("Admin");
    }

    public void doShow() {
        setSize(1000, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        GUI();
        setResizable(false);
        setVisible(true);
        addEvents();
    }

    public void loadData() {
        ArrayList<LuongUnionNhanVien> dslgUnv;
        LuongUnionNhanVienService lgUnvService = new LuongUnionNhanVienService();
        dslgUnv = lgUnvService.getlgUnv();
        dtm.setRowCount(0);

        for (LuongUnionNhanVien lgUnv : dslgUnv) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(lgUnv.getMaNV());
            vec.add(lgUnv.getTenNV());
            vec.add(lgUnv.getluongcoban());
            vec.add(lgUnv.getsongaylam());
            vec.add(lgUnv.getphucap());
            vec.add(lgUnv.gettongluong());
            vec.add(lgUnv.getghichu());

            dtm.addRow(vec);
        }
    }

    public void GUI() {
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();

        Border centerBorder = BorderFactory.createLineBorder(Color.blue);
        TitledBorder titleCenterBorder = new TitledBorder(centerBorder, "Danh sach nhan vien");
        p1.setBorder(titleCenterBorder);

        dtm = new DefaultTableModel();
        tb = new JTable(dtm);
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sc.setPreferredSize(new Dimension(700, 400));

        dtm.addColumn("MANV");
        dtm.addColumn("TENNV");
        dtm.addColumn("LUONGCB");
        dtm.addColumn("SONGAYLAM");
        dtm.addColumn("PHUCAP");
        dtm.addColumn("TONGLUONG");
        dtm.addColumn("GHICHU");

        loadData();
        sc.setPreferredSize(new Dimension(770, 400));

        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.getColumnModel().getColumn(0).setPreferredWidth(40);
        tb.getColumnModel().getColumn(1).setPreferredWidth(120);
        tb.getColumnModel().getColumn(2).setPreferredWidth(100);
        tb.getColumnModel().getColumn(3).setPreferredWidth(90);
        tb.getColumnModel().getColumn(4).setPreferredWidth(100);
        tb.getColumnModel().getColumn(5).setPreferredWidth(120);
        tb.getColumnModel().getColumn(6).setPreferredWidth(270);

        p1.add(sc);

        add(p1, BorderLayout.WEST);
        // p1.setPreferredSize(new Dimension(800, 400));

        JPanel p2 = new JPanel();
        TitledBorder titleCenterBorder2 = new TitledBorder(centerBorder, "Chuc nang");
        p2.setBorder(titleCenterBorder2);
        p2.setLayout(grid);

        thembtn = new JButton("Thêm");
        p2.add(thembtn);

        ImageIcon imageIcon = new ImageIcon("./src/image/add.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        thembtn.setIcon(imageIcon);

        p2.add(Box.createHorizontalStrut(15));
        suabtn = new JButton("Sửa");
        p2.add(suabtn);

        ImageIcon imageIcon2 = new ImageIcon("./src/image/fix.png"); // load the image to a imageIcon
        Image image2 = imageIcon2.getImage();
        Image newimg2 = image2.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon2 = new ImageIcon(newimg2);
        suabtn.setIcon(imageIcon2);

        p2.add(Box.createHorizontalStrut(15));
        xoabtn = new JButton("Xóa");
        p2.add(xoabtn);

        ImageIcon imageIcon3 = new ImageIcon("./src/image/del.png"); // load the image to a imageIcon
        Image image3 = imageIcon3.getImage();
        Image newimg3 = image3.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon3 = new ImageIcon(newimg3);
        xoabtn.setIcon(imageIcon3);

        p2.add(Box.createHorizontalStrut(15));
        khenbtn = new JButton("Khen");
        p2.add(khenbtn);
        p2.add(Box.createHorizontalStrut(15));
        // Tạo nút Phạt
        phatbtn = new JButton("Phạt");
        // phatbtn.setBounds(450, 150, 100, 30);
        p2.add(phatbtn);
        p2.add(Box.createHorizontalStrut(15));
        // Tạo nút Logout
        logoutbtn = new JButton("Đăng xuất");
        // logoutbtn.setBounds(450, 250, 100, 30);
        p2.add(logoutbtn);
        p2.add(Box.createHorizontalStrut(15));

        add(p2, BorderLayout.CENTER);

    }
    
    public void createThem(){
        Them them = new Them();
        them.doShow(this);
    }

    public void addEvents() {
        logoutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login0 = new Login();
                login0.doShow();
                Admin.this.dispose();
            };
        });

        khenbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int srow = tb.getSelectedRow();
                if (srow < 0) {
                    JOptionPane.showMessageDialog(null, "Bạn cần phải chọn nhân viên trước!");
                    return;
                }
                String smanv = (String) tb.getValueAt(tb.getSelectedRow(), 0);
                JTextField tienthuongField = new JTextField();
                JTextField ghichuField = new JTextField();

                GridLayout grid = new GridLayout(0, 1);

                JPanel myPanel = new JPanel();

                myPanel.setLayout(grid);
                myPanel.add(new JLabel("Tiền thưởng"));
                myPanel.add(tienthuongField);
                myPanel.add(Box.createHorizontalStrut(15));
                myPanel.add(new JLabel("Ghi chú"));
                myPanel.add(ghichuField);

                int result = JOptionPane.showConfirmDialog(null, myPanel, "Khen Thưởng", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    System.out.println("Tiền thưởng: " + tienthuongField.getText());
                    System.out.println("Ghi chú: " + ghichuField.getText());

                    LuongService ls = new LuongService();
                    ArrayList<Luong> dsl = ls.getLuong();
                    for (Luong lg : dsl) {
                        if (!lg.getmanv().equals(smanv)) {
                            continue;
                        }
                        lg.settongluong(lg.gettongluong() + Long.parseLong(tienthuongField.getText()));
                        lg.setghichu(lg.getghichu() + ", " + ghichuField.getText());
                        ls.updateLuong(lg);
                    }
                    loadData();
                }
            }
        });

        phatbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int srow = tb.getSelectedRow();
                if (srow < 0) {
                    JOptionPane.showMessageDialog(null, "Bạn cần phải chọn nhân viên trước!");
                    return;
                }
                String smanv = (String) tb.getValueAt(tb.getSelectedRow(), 0);
                JTextField tienphatField = new JTextField();
                JTextField ghichuField = new JTextField();

                GridLayout grid = new GridLayout(0, 1);

                JPanel myPanel = new JPanel();
                myPanel.setLayout(grid);
                myPanel.add(new JLabel("Tiền phạt"));
                myPanel.add(tienphatField);
                myPanel.add(Box.createHorizontalStrut(15));
                myPanel.add(new JLabel("Ghi chú"));
                myPanel.add(ghichuField);

                int result = JOptionPane.showConfirmDialog(null, myPanel, "Phạt", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    System.out.println("Tiền phạt: " + tienphatField.getText());
                    System.out.println("Ghi chú: " + ghichuField.getText());

                    LuongService ls = new LuongService();
                    ArrayList<Luong> dsl = ls.getLuong();
                    for (Luong lg : dsl) {
                        if (!lg.getmanv().equals(smanv)) {
                            continue;
                        }
                        lg.settongluong(lg.gettongluong() - Long.parseLong(tienphatField.getText()));
                        lg.setghichu(lg.getghichu() + ", " + ghichuField.getText());
                        ls.updateLuong(lg);
                    }
                    loadData();
                }
            }
        });
        
        //thêm
        thembtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createThem();
            };
        });
    }
}