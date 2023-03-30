/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.UI;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class ThongTinSP extends javax.swing.JFrame {

    /**
     * Creates new form ThemNV2
     */
    public ThongTinSP() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        gradientPanel1 = new com.boxcf.components.GradientPanel();
        pnlNhanVien = new com.boxcf.components.GradientPanel();
        lblMaNV = new javax.swing.JLabel();
        lblMaNV1 = new javax.swing.JLabel();
        lblMaNV2 = new javax.swing.JLabel();
        lblMaNV3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonRound1 = new com.boxcf.components.ButtonRound();
        buttonRound2 = new com.boxcf.components.ButtonRound();
        buttonRound3 = new com.boxcf.components.ButtonRound();
        buttonRound4 = new com.boxcf.components.ButtonRound();
        buttonRound5 = new com.boxcf.components.ButtonRound();
        buttonRound6 = new com.boxcf.components.ButtonRound();
        textField1 = new com.boxcf.components.TextField();
        textField3 = new com.boxcf.components.TextField();
        textField4 = new com.boxcf.components.TextField();
        btnClose = new com.boxcf.components.ButtonRound();
        lblMaNV9 = new javax.swing.JLabel();
        combobox2 = new com.boxcf.components.Combobox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        gradientPanel1.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel1.setColor2(new java.awt.Color(102, 102, 102));

        pnlNhanVien.setBackground(new java.awt.Color(102, 102, 102));
        pnlNhanVien.setColor1(new java.awt.Color(245, 250, 255));
        pnlNhanVien.setColor2(new java.awt.Color(245, 250, 255));
        pnlNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaNV.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV.setText("Mã SP");
        pnlNhanVien.add(lblMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, -1));

        lblMaNV1.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV1.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV1.setText("Tên SP");
        pnlNhanVien.add(lblMaNV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 50, -1));

        lblMaNV2.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV2.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV2.setText("Giá (VNĐ)");
        pnlNhanVien.add(lblMaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 70, -1));

        lblMaNV3.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV3.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV3.setText("Mô tả");
        pnlNhanVien.add(lblMaNV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 50, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(2);
        jScrollPane1.setViewportView(jTextArea1);

        pnlNhanVien.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 570, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 48, 84));
        jLabel1.setText("THÔNG TIN SẢN PHẨM");
        pnlNhanVien.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        buttonRound1.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound1.setText("LƯU");
        buttonRound1.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        buttonRound2.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound2.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound2.setText("CẬP NHẬT");
        buttonRound2.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound2ActionPerformed(evt);
            }
        });

        buttonRound3.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound3.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound3.setText("|<");
        buttonRound3.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound3ActionPerformed(evt);
            }
        });

        buttonRound4.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound4.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound4.setText("<<");
        buttonRound4.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound4ActionPerformed(evt);
            }
        });

        buttonRound5.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound5.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound5.setText(">>");
        buttonRound5.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound5ActionPerformed(evt);
            }
        });

        buttonRound6.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound6.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound6.setText(">|");
        buttonRound6.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlNhanVien.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 540, -1));

        textField1.setLabelText("");
        textField1.setOpaque(false);
        pnlNhanVien.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 568, 38));

        textField3.setLabelText("");
        textField3.setOpaque(false);
        pnlNhanVien.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 568, 38));

        textField4.setLabelText("");
        textField4.setOpaque(false);
        pnlNhanVien.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 280, 38));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/exit (1).png"))); // NOI18N
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlNhanVien.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 50, 50));

        lblMaNV9.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV9.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV9.setText("Loại SP");
        pnlNhanVien.add(lblMaNV9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 77, -1));
        pnlNhanVien.add(combobox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 230, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlNhanVien.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 150, 150));

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addComponent(pnlNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void buttonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound2ActionPerformed

    private void buttonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound3ActionPerformed

    private void buttonRound4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound4ActionPerformed

    private void buttonRound5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound5ActionPerformed

    private void buttonRound6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound6ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.exit();
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
            java.util.logging.Logger.getLogger(ThongTinSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnClose;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.boxcf.components.ButtonRound buttonRound1;
    private com.boxcf.components.ButtonRound buttonRound2;
    private com.boxcf.components.ButtonRound buttonRound3;
    private com.boxcf.components.ButtonRound buttonRound4;
    private com.boxcf.components.ButtonRound buttonRound5;
    private com.boxcf.components.ButtonRound buttonRound6;
    private com.boxcf.components.Combobox combobox2;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNV1;
    private javax.swing.JLabel lblMaNV2;
    private javax.swing.JLabel lblMaNV3;
    private javax.swing.JLabel lblMaNV9;
    private com.boxcf.components.GradientPanel pnlNhanVien;
    private com.boxcf.components.TextField textField1;
    private com.boxcf.components.TextField textField3;
    private com.boxcf.components.TextField textField4;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.prepareUI();
    }

    private void prepareUI() {
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        this.setShape(shape);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        UI.changeTransBG(new Color(0, 0, 0, 0), txtMaNV, txtTenNV, txtSDT, txtMatKhau);

    }

    private void exit() {
        this.dispose();
    }

}
