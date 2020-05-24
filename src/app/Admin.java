package app;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame {
    private static final long serialVersionUID = 1L;
    JButton khenbtn, phatbtn, logoutbtn;
    JPanel mainpnl;

    public Admin() {
        setTitle("Admin");
    }

    public void doShow() {
        setSize(580, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        GUI();
        setResizable(false);
        setVisible(true);
        addEvents();
    }

    public void GUI() {
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();

        DefaultTableModel dtm = new DefaultTableModel();
        JTable tb = new JTable(dtm);
        ArrayList<LuongUnionNhanVien> dslgUnv;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        dtm.addColumn("MANV");
        dtm.addColumn("TENNV");
        dtm.addColumn("LUONGCB");
        dtm.addColumn("SONGAYLAM");
        dtm.addColumn("PHUCAP");
        dtm.addColumn("TONGLUONG");
        dtm.addColumn("GHICHU");

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
       
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.getColumnModel().getColumn(0).setPreferredWidth(40);
        tb.getColumnModel().getColumn(1).setPreferredWidth(120);
        tb.getColumnModel().getColumn(2).setPreferredWidth(100);
        tb.getColumnModel().getColumn(3).setPreferredWidth(90);
        tb.getColumnModel().getColumn(4).setPreferredWidth(90);
        tb.getColumnModel().getColumn(6).setPreferredWidth(120);

        p1.add(sc);
        add(p1, BorderLayout.WEST);

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());

        Box b0 = Box.createVerticalBox();
        Box b1 = Box.createHorizontalBox();
        Box b2 = Box.createHorizontalBox();
        Box b3 = Box.createHorizontalBox();
        // Tạo nút Khen
        khenbtn = new JButton("Khen");
        // khenbtn.setBounds(450, 50, 100, 30);
        b1.add(khenbtn);

        // Tạo nút Phạt
        phatbtn = new JButton("Phạt");
        // phatbtn.setBounds(450, 150, 100, 30);
        b2.add(phatbtn);

        // Tạo nút Logout
        logoutbtn = new JButton("Đăng xuất");
        // logoutbtn.setBounds(450, 250, 100, 30);
        b3.add(logoutbtn);

        b0.add(Box.createVerticalStrut(150)); // khoảng cách bên trên
        b0.add(b1);
        b0.add(Box.createVerticalStrut(40));
        b0.add(b2);
        b0.add(Box.createVerticalStrut(40));
        b0.add(b3);
        p2.add(b0, BorderLayout.CENTER);

        add(p2, BorderLayout.EAST);

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
                        lg.settongluong(lg.gettongluong() + Long.parseLong(tienthuongField.getText()));
                        lg.setghichu(ghichuField.getText());
                        ls.updateLuong(lg);
                    }
                }

            }
        });
        phatbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                        lg.settongluong(lg.gettongluong() - Long.parseLong(tienphatField.getText()));
                        lg.setghichu(ghichuField.getText());
                        ls.updateLuong(lg);
                    }
                }

            }
        });
    }
}