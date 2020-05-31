package app.Views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.Controllers.*;
import app.Models.*;

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
        pntab1.setLayout(new BorderLayout());
        tab.add("Danh sách nhân viên", pntab1);

        DefaultTableModel dtm = new DefaultTableModel();
        JTable tb = new JTable(dtm);
        ArrayList<LuongUnionNhanVien> dslgUnv;
        JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        dtm.addColumn("MANV");
        dtm.addColumn("TENNV");
        dtm.addColumn("LUONGCB");
        dtm.addColumn("SONGAYLAM");
        dtm.addColumn("PHUCAP");
        dtm.addColumn("TONGLUONG");
        // dtm.addColumn("GHICHU");

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
            // vec.add(lgUnv.getghichu());

            dtm.addRow(vec);
        }
        sc.setPreferredSize(new Dimension(600, 400));

        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.getColumnModel().getColumn(0).setPreferredWidth(50);
        tb.getColumnModel().getColumn(1).setPreferredWidth(120);
        tb.getColumnModel().getColumn(2).setPreferredWidth(80);
        tb.getColumnModel().getColumn(3).setPreferredWidth(80);
        tb.getColumnModel().getColumn(4).setPreferredWidth(80);
        tb.getColumnModel().getColumn(5).setPreferredWidth(140);

        pntab1.add(sc, BorderLayout.CENTER);

        JPanel pntab2 = new JPanel();
        tab.add("Thông báo", pntab2);

        DefaultTableModel dtm2 = new DefaultTableModel();
        JTable tb2 = new JTable(dtm2);
        ArrayList<LuongUnionNhanVien> dslgUnv2;
        JScrollPane sc2 = new JScrollPane(tb2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        dtm2.addColumn("THONGBAO");

        // LuongUnionNhanVienService lgUnvService = new LuongUnionNhanVienService();
        dslgUnv2 = lgUnvService.getlgUnv();
        dtm2.setRowCount(0);

        for (LuongUnionNhanVien lgUnv : dslgUnv2) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(lgUnv.getghichu());

            dtm2.addRow(vec);
        }
        pntab2.add(sc2);
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