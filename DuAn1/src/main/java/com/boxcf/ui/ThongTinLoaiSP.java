/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.UI;
import com.boxcf.dao.DanhMucDao;
import com.boxcf.dao.LoaiSPDao;
import com.boxcf.models.DanhMuc;
import com.boxcf.models.LoaiSP;
import com.boxcf.models.SanPham;
import com.boxcf.store.Store;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ThongTinLoaiSP extends javax.swing.JFrame {

    LoaiSPDao lspDAO = new LoaiSPDao();
    DanhMucDao dmDAO = new DanhMucDao();

    Color cNormal = new Color(2, 172, 171);
    SanPhamView spview = Store.spView;
    
    List<LoaiSP> list;

    int index = 0;
    String ID = null;

    /**
     * Creates new form ThongTinLoaiSP
     */
    public ThongTinLoaiSP(String ID) {
        this.ID = ID;
        initComponents();
        init();
    }

    void init() {
        setLocationRelativeTo(null);
        UI.changeTransBG(new Color(0, 0, 0, 0), txtMaLSP, txtTenLSP);
        fillComboBox();
        getViTri();
        editw();
    }

    void fillComboBox() {
        for (DanhMuc dm : dmDAO.selectAll()) {
            cboDanhMuc.addItem(dm.getTenDM());
        }
    }

    void getViTri() {
        list = lspDAO.selectAll();
        if (ID == null) {
            return;
        }

        for (LoaiSP lsp : list) {
            if (lsp.getMaLoai().equals(ID)) {
                index = list.indexOf(lsp);
                break;
            }
        }
    }

    void setStatus() {
        boolean edit = this.index >= 0;
        boolean first = this.index > 0;
        boolean last = this.index < list.size() - 1;
        txtMaLSP.setEditable(!edit);
        btnCapNhat.setEnabled(edit);
        btnCapNhat.setBackground(edit ? new Color(2, 172, 171) : Color.BLACK);
        btnThem.setEnabled(!edit);
        btnThem.setBackground(!edit ? new Color(2, 172, 171) : Color.BLACK);
        btnFirst.setEnabled(edit && first);
        btnFirst.setBackground(edit && first ? new Color(2, 172, 171) : Color.BLACK);
        btnPre.setEnabled(edit && first);
        btnPre.setBackground(edit && first ? new Color(2, 172, 171) : Color.BLACK);
        btnLast.setEnabled(edit && last);
        btnLast.setBackground(edit && last ? new Color(2, 172, 171) : Color.BLACK);
        btnNext.setEnabled(edit && last);
        btnNext.setBackground(edit && last ? new Color(2, 172, 171) : Color.BLACK);
    }

    void editw() {
        try {
            if (ID == null) {
                clear();
                return;
            }
            LoaiSP lsp = list.get(index);
            setModel(lsp);
            setStatus();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void setModel(LoaiSP lsp) {

        DanhMuc dm = dmDAO.selectById(lsp.getMaDM());

        txtMaLSP.setText("" + lsp.getMaLoai());
        txtTenLSP.setText("" + lsp.getTenLoai());

        cboDanhMuc.setSelectedItem(dm.getTenDM());

    }

    LoaiSP getModel() {
        LoaiSP lsp = new LoaiSP();
        DanhMuc dm = dmDAO.selectByName((String) cboDanhMuc.getSelectedItem());
        lsp.setMaLoai(txtMaLSP.getText());
        lsp.setTenLoai(txtTenLSP.getText());
        lsp.setMaDM(dm.getMaDM());
        return lsp;
    }

    void insert() {

        if (!validateForm()) {
            return;
        }
        if (!checkTrungID()) {
            JOptionPane.showMessageDialog(this, "Mã loại sản phẩm đã tồn tại!");
            return;
        }

        try {
            lspDAO.insert(getModel());
            spview.fillToTableLoaiSP();
            spview.fillCBBLoaiSP();
            clear();
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void update() {
        if(!validateForm()){
            return;
        }
        try {
            lspDAO.update(getModel());
            spview.fillToTableLoaiSP();
            spview.fillCBBLoaiSP();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void first() {
        index = 0;
        editw();
    }

    void prev() {
        index--;
        editw();
    }

    void next() {
        index++;
        editw();
    }

    void last() {
        index = list.size() - 1;
        editw();
    }

    void clear() {
        txtMaLSP.setText("");
        txtTenLSP.setText("");
        cboDanhMuc.setSelectedIndex(0);
        index = -1;
        setStatus();
    }

    boolean validateForm() {
        StringBuilder sb = new StringBuilder();
        sb.append(txtMaLSP.getText().isEmpty() ? "Mã loại sản phẩm không thể trống!" : "");
        sb.append(txtTenLSP.getText().isEmpty() ? "\nTên loại sản phẩm không thể trống!" : "");
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return false;
        }
        return true;
    }

    boolean checkTrungID() {
        String maLoaiSP = txtMaLSP.getText();
        for (LoaiSP lsp : list) {
            if (maLoaiSP.equals(lsp.getMaLoai())) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel2 = new com.boxcf.components.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new com.boxcf.components.ButtonRound();
        btnCapNhat = new com.boxcf.components.ButtonRound();
        btnFirst = new com.boxcf.components.ButtonRound();
        btnPre = new com.boxcf.components.ButtonRound();
        btnNext = new com.boxcf.components.ButtonRound();
        btnLast = new com.boxcf.components.ButtonRound();
        btnReset = new com.boxcf.components.ButtonRound();
        lblMaNV8 = new javax.swing.JLabel();
        cboDanhMuc = new com.boxcf.components.Combobox();
        lblMaNV = new javax.swing.JLabel();
        txtMaLSP = new com.boxcf.components.TextField();
        lblMaNV2 = new javax.swing.JLabel();
        txtTenLSP = new com.boxcf.components.TextField();
        btnClose = new com.boxcf.components.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        gradientPanel2.setBackground(new java.awt.Color(204, 204, 204));
        gradientPanel2.setColor1(new java.awt.Color(245, 250, 255));
        gradientPanel2.setColor2(new java.awt.Color(245, 250, 255));
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 48, 84));
        jLabel1.setText("THÔNG TIN LOẠI SẢN PHẨM");
        gradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        btnThem.setBackground(new java.awt.Color(2, 172, 171));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("THÊM");
        btnThem.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(2, 172, 171));
        btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setText("CẬP NHẬT");
        btnCapNhat.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(2, 172, 171));
        btnFirst.setForeground(new java.awt.Color(255, 255, 255));
        btnFirst.setText("|<");
        btnFirst.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPre.setBackground(new java.awt.Color(2, 172, 171));
        btnPre.setForeground(new java.awt.Color(255, 255, 255));
        btnPre.setText("<<");
        btnPre.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(2, 172, 171));
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText(">>");
        btnNext.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(2, 172, 171));
        btnLast.setForeground(new java.awt.Color(255, 255, 255));
        btnLast.setText(">|");
        btnLast.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(2, 172, 171));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gradientPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 583, 700, 80));

        lblMaNV8.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV8.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV8.setText("Danh mục");
        gradientPanel2.add(lblMaNV8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 77, -1));
        gradientPanel2.add(cboDanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 760, -1));

        lblMaNV.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV.setText("Mã loại sản phẩm");
        gradientPanel2.add(lblMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, -1));

        txtMaLSP.setLabelText("");
        gradientPanel2.add(txtMaLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 760, 38));

        lblMaNV2.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV2.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV2.setText("Tên loại sản phẩm");
        gradientPanel2.add(lblMaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, -1));

        txtTenLSP.setLabelText("");
        gradientPanel2.add(txtTenLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 760, 38));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/exit (1).png"))); // NOI18N
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        gradientPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
      
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThongTinLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinLoaiSP("SP001").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnCapNhat;
    private com.boxcf.components.ButtonRound btnClose;
    private com.boxcf.components.ButtonRound btnFirst;
    private com.boxcf.components.ButtonRound btnLast;
    private com.boxcf.components.ButtonRound btnNext;
    private com.boxcf.components.ButtonRound btnPre;
    private com.boxcf.components.ButtonRound btnReset;
    private com.boxcf.components.ButtonRound btnThem;
    private com.boxcf.components.Combobox cboDanhMuc;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNV2;
    private javax.swing.JLabel lblMaNV8;
    private com.boxcf.components.TextField txtMaLSP;
    private com.boxcf.components.TextField txtTenLSP;
    // End of variables declaration//GEN-END:variables
}
