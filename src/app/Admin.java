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

public class Admin extends JFrame { 
    private static final long serialVersionUID = 1L;
    JButton khenbtn, phatbtn, logoutbtn;
    JPanel mainpnl;

    public Admin() { 
        setTitle("Admin"); 
    }

    public void doShow() {
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        GUI();
        setResizable(false);
        setVisible(true);
        addEvents();
    }

    public void GUI() {
        //Tạo nút Khen
        khenbtn = new JButton("Khen");
        khenbtn.setBounds(450, 50, 100, 30); 
        add(khenbtn);
        
        //Tạo nút Phạt
        phatbtn = new JButton("Phạt");
        phatbtn.setBounds(450, 150, 100, 30);
        add(phatbtn);
        
        //Tạo nút Logout
        logoutbtn = new JButton("Đăng xuất");
        logoutbtn.setBounds(450, 250, 100, 30);
        add(logoutbtn);
       
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

                int result = JOptionPane.showConfirmDialog(null, myPanel,
                         "Khen Thưởng", JOptionPane.OK_CANCEL_OPTION);
                
                if (result == JOptionPane.OK_OPTION) {
                   System.out.println("Tiền thưởng: " + tienthuongField.getText());
                   System.out.println("Ghi chú: " + ghichuField.getText());
                                   
                   LuongService ls = new LuongService(); 
                   ArrayList<Luong> dsl = ls.getLuong(); 
                   for (Luong lg: dsl){ 
                        lg.settongluong(lg.gettongluong() + Long.parseLong(tienthuongField.getText()) );
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

                int result = JOptionPane.showConfirmDialog(null, myPanel, 
                         "Phạt", JOptionPane.OK_CANCEL_OPTION);
                
                if (result == JOptionPane.OK_OPTION) { 
                   System.out.println("Tiền phạt: " + tienphatField.getText());
                   System.out.println("Ghi chú: " + ghichuField.getText());
                 
                   LuongService ls = new LuongService();
                   ArrayList<Luong> dsl = ls.getLuong();
                   for (Luong lg: dsl){
                        lg.settongluong(lg.gettongluong() - Long.parseLong(tienphatField.getText()) ); 
                        lg.setghichu(ghichuField.getText());
                        ls.updateLuong(lg);
                   }
                }
                
            }
        });
    }
}