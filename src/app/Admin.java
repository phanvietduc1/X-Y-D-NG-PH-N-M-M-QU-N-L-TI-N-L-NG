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

    public Admin() {
        setTitle("Admin");
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
        
    }

    public void addEvents() {
        
    }
}