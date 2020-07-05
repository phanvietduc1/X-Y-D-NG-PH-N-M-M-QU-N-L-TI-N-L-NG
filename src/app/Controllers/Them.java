
package app.Controllers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import app.Models.*;
import app.Views.*;

public class Them extends javax.swing.JFrame {

    private Admin parent; 
    public Them() {
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
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        maluong = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm nhân viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Mã nhân viên");

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

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit-validated-icon.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Mã lương");

        btnThoat.setBackground(new java.awt.Color(255, 204, 255));
        btnThoat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 0, 0));
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
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(songaylam)
                                    .addComponent(maphong, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chucvu, javax.swing.GroupLayout.Alignment.LEADING, 0, 151, Short.MAX_VALUE)
                                    .addComponent(ngayvaolam)
                                    .addComponent(maluong))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(gioitinh, javax.swing.GroupLayout.Alignment.LEADING, 0, 151, Short.MAX_VALUE)
                                .addComponent(tennhanvien, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(manhanvien, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ngayvaolam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maphong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songaylam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maluong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (manhanvien.getText().isEmpty() || tennhanvien.getText().isEmpty() || gioitinh.getSelectedItem().toString().isEmpty() || ngayvaolam.getText().isEmpty() || chucvu.getSelectedItem().toString().isEmpty() || maphong.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn cần điền đầy đủ thông tin!");
            return;
        }
        
        // Lấy dữ liệu trong các textfield, combo,... rồi dùng nó để tạo đối tượng NhanVien mới
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
        
        NhanVienService nvs = new NhanVienService(); // Service xử lý nhân viên 
        if (nvs.createNV(nv)){ // truyền đối tượng nhân viên vào service để xử lý tạo mới (thêm đối tượng nhân viên vào DB), nếu tạo mới thành công thì hàm createNV trả về giá trị true, lúc này ta sẽ xử lý tiếp Lương của đối tượng nhân viên đó
            LuongService ls = new LuongService(); // Service xử lý Lương
            Luong lg = new Luong(); // Lấy dữ liệu từ các đối tượng trong frame để tạo đối tượng Luong mói cho nhân viên
            lg.setmaluong(maluong.getText());
            lg.setmanv(manhanvien.getText());
            lg.setphucap(0);
            lg.setsongaylam(Integer.parseInt(songaylam.getText()));
            switch(nv.getChucVu()) { // tùy vào chức vụ của nhân viên mà hệ số lương khác nhau
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
            
            
            PhongService ps = new PhongService(); // Service xử lý đối tượng Phòng
            long tienphong = ps.getTienPhong(nv.getMaPhong()); // lấy tiền phòng của nhân viên
            
            ChucVuService cvs = new ChucVuService(); // Service xử lý đối tượng Chức vụ
            long tienchucvu = cvs.getTienChucVu(nv.getChucVu());  // lấy tiền chức vụ của nhân viên
            
            long tongluong = (long) ((tienphong + tienchucvu) * lg.getheso() + lg.getphucap()); // dựa trên các tiền lấy ở trên để tính tổng lương
            lg.settongluong(tongluong); // sau đó gán cho đối lượng lương
            
            if (ls.createLuong(lg)) { // thêm đối tượng lg vào database bằng lương service (ls). Nếu thêm thành công thì giá trị trả về là true.
                this.parent.loadData();
                JOptionPane.showMessageDialog(null, "Đã thêm nhân viên mới!"); 
            } else {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên không thành công!");
            };
            
        } else {
            JOptionPane.showMessageDialog(null, "Thêm nhân viên không thành công!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.parent.loadData();
    }//GEN-LAST:event_formWindowClosed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        Admin adminn = new Admin();
        adminn.doShow();
        Them.this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    public void doShow(Admin parent) {
        this.parent = parent;
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> chucvu;
    private javax.swing.JComboBox<String> gioitinh;
    private javax.swing.JButton jButton1;
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
