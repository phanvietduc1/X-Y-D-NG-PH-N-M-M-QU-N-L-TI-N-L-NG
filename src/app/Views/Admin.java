package app.Views;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.ImageIcon;

import app.Models.*;
import app.Controllers.*;

public class Admin extends JFrame {
    private static final long serialVersionUID = 1L;
    JButton khenbtn, phatbtn, logoutbtn, thembtn, suabtn, xoabtn;
    JPanel mainpnl;
    JTable tb1, tb2, tb3, tb4;
    DefaultTableModel dtm1, dtm2, dtm3, dtm4;
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
        ArrayList<Luong> dslg;
        LuongService lgService = new LuongService();
        dslg = lgService.getLuong();
        dtm2.setRowCount(0);

        for (Luong lg : dslg) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(lg.getmaluong());
            vec.add(lg.getmanv());
            vec.add(lg.getsongaylam());
            vec.add(lg.getheso());
            vec.add(lg.getphucap());
            vec.add(lg.gettongluong());
            vec.add(lg.getghichu());

            dtm2.addRow(vec);
        }

        ArrayList<NhanVien> dsnv;
        NhanVienService nvService = new NhanVienService();
        dsnv = nvService.getNV();
        dtm1.setRowCount(0);

        for (NhanVien nv : dsnv) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(nv.getMaNV());
            vec.add(nv.getTenNV());
            vec.add(nv.getGioiTinh());
            vec.add(nv.getNgayVaoLam());
            vec.add(nv.getChucVu());
            vec.add(nv.getMaPhong());

            dtm1.addRow(vec);
        }

        ArrayList<Phong> dsp;
        PhongService pService = new PhongService();
        dsp = pService.getPhong();
        dtm4.setRowCount(0);

        for (Phong p : dsp) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(p.getmaphong());
            vec.add(p.getten());
            vec.add(p.getTienPhong());

            dtm4.addRow(vec);
        }

        ArrayList<ChucVu> dscv;
        ChucVuService cvService = new ChucVuService();
        dscv = cvService.getChucVu();
        dtm3.setRowCount(0);

        for (ChucVu cv : dscv) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(cv.gettenchucvu());
            vec.add(cv.gettienchucvu());

            dtm3.addRow(vec);
        }
    }

    public void GUI() {
        setLayout(new BorderLayout());
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        // panel 1
        Border centerBorder = BorderFactory.createLineBorder(Color.blue);

        // tab1
        JTabbedPane tab = new JTabbedPane();
        add(tab, BorderLayout.WEST);
        JPanel pntab1 = new JPanel();
        pntab1.setLayout(new BorderLayout());
        tab.add("Quản lý nhân viên", pntab1);

        dtm1 = new DefaultTableModel();
        tb1 = new JTable(dtm1);
        JScrollPane sc1 = new JScrollPane(tb1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        dtm1.addColumn("Mã nhân viên");
        dtm1.addColumn("Tên nhân viên");
        dtm1.addColumn("Giới tính");
        dtm1.addColumn("Ngày vào làm");
        dtm1.addColumn("Tên chức vụ");
        dtm1.addColumn("Mã phòng");

        sc1.setPreferredSize(new Dimension(770, 400));

        tb1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb1.getColumnModel().getColumn(0).setPreferredWidth(90);
        tb1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tb1.getColumnModel().getColumn(1).setPreferredWidth(150);
        tb1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tb1.getColumnModel().getColumn(2).setPreferredWidth(100);
        tb1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tb1.getColumnModel().getColumn(3).setPreferredWidth(120);
        tb1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tb1.getColumnModel().getColumn(4).setPreferredWidth(150);
        tb1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tb1.getColumnModel().getColumn(5).setPreferredWidth(130);
        tb1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        

        pntab1.add(sc1);

        // tab2
        JPanel pntab2 = new JPanel();
        pntab2.setLayout(new BorderLayout());
        tab.add("Quản lý lương", pntab2);

        dtm2 = new DefaultTableModel();
        tb2 = new JTable(dtm2);
        JScrollPane sc2 = new JScrollPane(tb2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        dtm2.addColumn("Mã lương");
        dtm2.addColumn("Mã nhân viên");
        dtm2.addColumn("Số ngày làm");
        dtm2.addColumn("Hệ số");
        dtm2.addColumn("Phụ cấp");
        dtm2.addColumn("Tổng lương");
        dtm2.addColumn("Ghi chú");

        sc2.setPreferredSize(new Dimension(770, 400));

        tb2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb2.getColumnModel().getColumn(0).setPreferredWidth(90);
        tb2.getColumnModel().getColumn(1).setPreferredWidth(100);
        tb2.getColumnModel().getColumn(2).setPreferredWidth(100);
        tb2.getColumnModel().getColumn(3).setPreferredWidth(90);
        tb2.getColumnModel().getColumn(4).setPreferredWidth(100);
        tb2.getColumnModel().getColumn(5).setPreferredWidth(120);
        tb2.getColumnModel().getColumn(6).setPreferredWidth(140);
        tb2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tb2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tb2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tb2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tb2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tb2.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tb2.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);

        pntab2.add(sc2);

        // tab3
        JPanel pntab3 = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0, 5, 0, 5);
        tab.add("Quản lý chức vụ và phòng", new JScrollPane(pntab3));

        // bang chuc vu
        dtm3 = new DefaultTableModel();
        tb3 = new JTable(dtm3);
        JScrollPane sc3 = new JScrollPane(tb3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        dtm3.addColumn("Tên chức vụ");
        dtm3.addColumn("Tiền chức vụ");

        sc3.setPreferredSize(new Dimension(350, 400));

        tb3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb3.getColumnModel().getColumn(0).setPreferredWidth(180);
        tb3.getColumnModel().getColumn(1).setPreferredWidth(150);
        tb3.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tb3.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        pntab3.add(sc3, c);

        // bang phong
        dtm4 = new DefaultTableModel();
        tb4 = new JTable(dtm4);
        JScrollPane sc4 = new JScrollPane(tb4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sc4.setPreferredSize(new Dimension(700, 400));

        dtm4.addColumn("Mã phòng");
        dtm4.addColumn("Tên phòng");
        dtm4.addColumn("Tiền theo phòng");

        sc4.setPreferredSize(new Dimension(380, 400));

        tb4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb4.getColumnModel().getColumn(0).setPreferredWidth(120);
        tb4.getColumnModel().getColumn(1).setPreferredWidth(120);
        tb4.getColumnModel().getColumn(2).setPreferredWidth(120);
        tb4.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tb4.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tb4.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        

        pntab3.add(sc4, c);

        loadData();

        // p1.setPreferredSize(new Dimension(800, 400));

        JPanel p2 = new JPanel();
        TitledBorder titleCenterBorder2 = new TitledBorder(centerBorder, "Chức năng");
        p2.setBorder(titleCenterBorder2);
        p2.setLayout(grid);
        
        // Tạo nút thêm
        thembtn = new JButton("Thêm nhân viên");
        p2.add(thembtn);

        ImageIcon imageIcon = new ImageIcon("./src/image/add-1-icon.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        thembtn.setIcon(imageIcon);

        // Tạo nút sửa
        p2.add(Box.createHorizontalStrut(15));
        suabtn = new JButton("Sửa nhân viên");
        p2.add(suabtn);

        ImageIcon imageIcon2 = new ImageIcon("./src/image/edit-icon.png"); // load the image to a imageIcon
        Image image2 = imageIcon2.getImage();
        Image newimg2 = image2.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon2 = new ImageIcon(newimg2);
        suabtn.setIcon(imageIcon2);

        // Tạo nút xóa
        p2.add(Box.createHorizontalStrut(15));
        xoabtn = new JButton("Xóa nhân viên");
        p2.add(xoabtn);

        ImageIcon imageIcon3 = new ImageIcon("./src/image/green-cross-icon.png"); // load the image to a imageIcon
        Image image3 = imageIcon3.getImage();
        Image newimg3 = image3.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon3 = new ImageIcon(newimg3);
        xoabtn.setIcon(imageIcon3);

        // Tạo nút thưởng
        p2.add(Box.createHorizontalStrut(15));
        khenbtn = new JButton("Thưởng nhân viên");
        p2.add(khenbtn);
        ImageIcon imageIcon4 = new ImageIcon("./src/image/medal-award-bronze-icon.png"); // load the image to a imageIcon
        Image image4 = imageIcon4.getImage();
        Image newimg4 = image4.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon4 = new ImageIcon(newimg4);
        khenbtn.setIcon(imageIcon4);
        p2.add(Box.createHorizontalStrut(15));
        
        // Tạo nút Phạt 
        phatbtn = new JButton("Phạt nhân viên");
        p2.add(phatbtn);
        ImageIcon imageIcon5 = new ImageIcon("./src/image/punish-icon.jpg"); // load the image to a imageIcon
        Image image5 = imageIcon5.getImage();
        Image newimg5 = image5.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon5 = new ImageIcon(newimg5);
        phatbtn.setIcon(imageIcon5);
        p2.add(Box.createHorizontalStrut(15));
        
        // Tạo nút Logout 
        logoutbtn = new JButton("Đăng xuất");
        p2.add(logoutbtn);
        ImageIcon imageIcon6 = new ImageIcon("./src/image/Logout-icon.png"); // load the image to a imageIcon
        Image image6 = imageIcon6.getImage();
        Image newimg6 = image6.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        imageIcon6 = new ImageIcon(newimg6);
        logoutbtn.setIcon(imageIcon6);
        p2.add(Box.createHorizontalStrut(15));

        add(p2, BorderLayout.CENTER);

    }

    public void createThem() {
        Them them = new Them();
        them.doShow(this);
    }

    public void createSua() {
        int srow = tb1.getSelectedRow();
        if (srow < 0) {
            JOptionPane.showMessageDialog(null, "Bạn cần phải chọn nhân viên trước!");
            return;
        }
        String smanv = (String) tb1.getValueAt(tb1.getSelectedRow(), 0);

        Sua sua = new Sua();
        sua.doShow(this, smanv);
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
                int srow = tb1.getSelectedRow();
                if (srow < 0) {
                    JOptionPane.showMessageDialog(null, "Bạn cần phải chọn nhân viên trước!");
                    return;
                }
                String smanv = (String) tb1.getValueAt(tb1.getSelectedRow(), 0);
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
                        lg.setphucap(lg.getphucap() +  Long.parseLong(tienthuongField.getText()));
                        ls.updateLuong(lg);
                    }
                    loadData();
                }
            }
        });

        phatbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int srow = tb1.getSelectedRow();
                if (srow < 0) {
                    JOptionPane.showMessageDialog(null, "Bạn cần phải chọn nhân viên trước!");
                    return;
                }
                String smanv = (String) tb1.getValueAt(tb1.getSelectedRow(), 0);
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
                        lg.setphucap(lg.getphucap() -  Long.parseLong(tienphatField.getText()));
                        ls.updateLuong(lg);
                    }
                    loadData();
                }
            }
        });

        // thêm
        
        thembtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createThem();
            };
        });

        suabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createSua();
            };
        });

        xoabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int srow = tb1.getSelectedRow();
                if (srow < 0) {
                    JOptionPane.showMessageDialog(null, "Bạn cần phải chọn nhân viên trước!");
                    return;
                }
                String smanv = (String) tb1.getValueAt(tb1.getSelectedRow(), 0);

                NhanVienService nvs = new NhanVienService();
                LuongService ls = new LuongService();
                if (ls.removeLuong(smanv) && nvs.removeNV(smanv)) {
                    loadData();
                    JOptionPane.showMessageDialog(null, "Đã xóa thành công!");
                } else {
                    loadData();
                    JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi!");
                }
            }
        });
    }
}