package app;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
// import java.awt.event.*;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
import java.util.Vector;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame {
    private static final long serialVersionUID = 1L;

    JTabbedPane tab;
    JButton bttOut;

    public User() {
        setTitle("User");
    }

    public void doShow() {
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GUI();
        setResizable(false);
        setVisible(true);
        addEvents();
    }

    public void GUI() {
        bttOut = new JButton("Logout");
        bttOut.setBounds(510, 2, 75, 20);
        // bttInfo.setSize(45, 45);
        add(bttOut);

        Container con = getContentPane();
        tab = new JTabbedPane();
        con.add(tab);
        JPanel pntab1 = new JPanel();
        tab.add("Danh sách nhân viên", pntab1);
        JPanel pntab2 = new JPanel();
        tab.add("Thông báo", pntab2);

        DefaultTableModel dtm = new DefaultTableModel();
        JTable tb = new JTable(dtm);
        ArrayList<NhanVien> dsnv;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        dtm.addColumn("Mã nhân viên");
        dtm.addColumn("Tên nhân viên");
        dtm.addColumn("Giới tính");
        dtm.addColumn("Chức vụ");
        dtm.addColumn("Mã phòng");
        // dtm.addColumn("Tiền lương");
        // dtm.addColumn("Ghi chú");

        NhanVienService nvService = new NhanVienService();
        dsnv = nvService.getNV();
        dtm.setRowCount(0);

        for (NhanVien nv : dsnv) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(nv.getMaNV());
            vec.add(nv.getTenNV());
            vec.add(nv.getGioiTinh());
            vec.add(nv.getChucVu());
            vec.add(nv.getMaPhong());
            dtm.addRow(vec);
        }
        pntab1.add(sc);
    }

    public void addEvents() {
        bttOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login0 = new Login();
                login0.doShow();
                User.this.dispose();
            };
        });
    }
}