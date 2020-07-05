
package app.Controllers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import app.Views.*;
import app.Models.*;

/**
 *
 * @author Administrator
 */
public class Sua extends javax.swing.JFrame {

    private Admin parent;
    public Sua() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manhanvien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tennhanvien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ngayvaolam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        chucvu = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        maphong = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        songaylam = new javax.swing.JTextField();
        gioitinh = new javax.swing.JComboBox<>();
        Suabtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        maluong = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sửa nhân viên");
        setBackground(new java.awt.Color(255, 0, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Mã nhân viên");

        manhanvien.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Tên nhân viên");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Giới tính");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Ngày vào làm");

        ngayvaolam.setToolTipText("yy/mm/dd");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Chức vụ");

        chucvu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRUONGPHONG", "PHOPHONG", "NHANVIEN", "KETOAN", "GIAMDOC", "PHOGIAMDOC", "THUKY" }));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Mã phòng");

        maphong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        maphong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P01", "P02", "P03", "P04", "P05" }));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Số ngày làm");

        gioitinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAM", "NU" }));

        Suabtn.setBackground(new java.awt.Color(255, 204, 255));
        Suabtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Suabtn.setForeground(new java.awt.Color(255, 0, 0));
        Suabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Apps-system-software-update-icon.png"))); // NOI18N
        Suabtn.setText("Sửa");
        Suabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuabtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Mã lương");

        maluong.setEditable(false);

        btnThoat.setBackground(new java.awt.Color(255, 204, 255));
        btnThoat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 51, 51));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Close-2-icon.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tennhanvien)
                                        .addComponent(gioitinh, 0, 162, Short.MAX_VALUE)
                                        .addComponent(ngayvaolam, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(maluong)
                                        .addComponent(songaylam, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(maphong, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chucvu, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Suabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tennhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ngayvaolam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Suabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maphong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(songaylam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuabtnActionPerformed

        // Nhắc nhở người dùng không bỏ trống ô nào
        if (manhanvien.getText().isEmpty() || tennhanvien.getText().isEmpty() || gioitinh.getSelectedItem().toString().isEmpty() || ngayvaolam.getText().isEmpty() || chucvu.getSelectedItem().toString().isEmpty() || maphong.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn cần điền đầy đủ thông tin!");
            return;
        }
        
        NhanVien nv = new NhanVien();
        nv.setMaNV(manhanvien.getText());
        nv.setTenNV(tennhanvien.getText());
        nv.setGioiTinh(gioitinh.getSelectedItem().toString());
        nv.setNgayVaoLam(ngayvaolam.getText());
        nv.setChucVu(chucvu.getSelectedItem().toString());
        nv.setMaPhong(maphong.getSelectedItem().toString());
        
        int ngaylam = Integer.parseInt(songaylam.getText());
        if (ngaylam < 0 || ngaylam > 31){
            JOptionPane.showMessageDialog(null, "Số ngày làm chỉ được từ 0 - 31"); 
            return;
        }
        
        NhanVienService nvs = new NhanVienService();
        if (nvs.updateNV(nv)){
            LuongService ls = new LuongService();
            Luong lg = new Luong();
            lg.setmaluong(maluong.getText());
            lg.setmanv(manhanvien.getText());
            lg.setphucap(0);
            lg.setsongaylam(Integer.parseInt(songaylam.getText()));
            switch(nv.getChucVu()) {
                case "TRUONGPHONG":
                  lg.setheso(3.66);
                  break;
                case "PHOPHONG":
                  lg.setheso(3.33);
                  break;
                case "KETOAN":
                    lg.setheso(3.00);
                    break;
                case "NHANVIEN":
                    lg.setheso(2.67);
                case "GIAMDOC":
                    lg.setheso(5.53);
                case "PHOGIAMDOC":
                    lg.setheso(4.32);    
                case "THUKY":
                    lg.setheso(3.66);
                    break;
              }
            
            PhongService ps = new PhongService();
            long tienphong = ps.getTienPhong(nv.getMaPhong());
            
            ChucVuService cvs = new ChucVuService();
            long tienchucvu = cvs.getTienChucVu(nv.getChucVu());
            
            long tongluong = (long) ((tienphong + tienchucvu) * lg.getheso() + lg.getphucap());
            lg.settongluong(tongluong);
            
            if (ls.updateAllLuong(lg)) {
                this.parent.loadData();
                JOptionPane.showMessageDialog(null, "Đã sửa thành công!"); 
            } else {
                JOptionPane.showMessageDialog(null, "Sửa không thành công!");
            };
            
        } else {
            JOptionPane.showMessageDialog(null, "Sửa không thành công!");
        }
    }//GEN-LAST:event_SuabtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.parent.loadData();
    }//GEN-LAST:event_formWindowClosed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        Admin adminn = new Admin();
        adminn.doShow();
        Sua.this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    public void doShow(Admin parent, String manv) {
        this.parent = parent;
        setVisible(true);
        
        LuongService ls = new LuongService();
        Luong lg = ls.getFirstLuong(manv);
        
        NhanVienService nvs = new NhanVienService();
        NhanVien nv = nvs.getFirstNV(manv);
        
        maluong.setText(lg.getmaluong());
        manhanvien.setText(nv.getMaNV());
        maphong.setSelectedItem(nv.getMaPhong());
        ngayvaolam.setText(nv.getNgayVaoLam());
        System.out.println(Integer.toString(lg.getsongaylam()));
        songaylam.setText(Integer.toString(lg.getsongaylam()));
        tennhanvien.setText(nv.getTenNV());
        chucvu.setSelectedItem(nv.getChucVu());
        gioitinh.setSelectedItem(nv.getGioiTinh());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Suabtn;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> chucvu;
    private javax.swing.JComboBox<String> gioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField maluong;
    private javax.swing.JTextField manhanvien;
    private javax.swing.JComboBox<String> maphong;
    private javax.swing.JTextField ngayvaolam;
    private javax.swing.JTextField songaylam;
    private javax.swing.JTextField tennhanvien;
    // End of variables declaration//GEN-END:variables
}
