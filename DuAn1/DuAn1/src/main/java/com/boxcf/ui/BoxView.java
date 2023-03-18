/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.UI;
import java.awt.Color;


public class BoxView extends javax.swing.JPanel {

    public BoxView() {
        initComponents();
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        buttonRound1 = new com.boxcf.components.ButtonRound();
        buttonRound2 = new com.boxcf.components.ButtonRound();
        btnAdd = new com.boxcf.components.ButtonRound();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtMaNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblMaNV1 = new javax.swing.JLabel();
        txtMaNV1 = new javax.swing.JTextField();
        buttonRound3 = new com.boxcf.components.ButtonRound();
        buttonRound4 = new com.boxcf.components.ButtonRound();
        btnAdd1 = new com.boxcf.components.ButtonRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("UTM Aptima", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("QUẢN LÝ BOX");

        buttonRound1.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound1.setText("XÓA");
        buttonRound1.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });

        buttonRound2.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound2.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound2.setText("Tìm kiếm");
        buttonRound2.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(2, 172, 171));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("THÊM BOX");
        btnAdd.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtMaNV.setBackground(new java.awt.Color(0, 153, 153));
        txtMaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(51, 51, 51));
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtMaNV.setOpaque(false);

        jLabel2.setText("Loại box");

        lblMaNV.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV.setText("Box");

        tblNhanVien.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Box", "Tên Box ", "Tình trạng", "Loại box"
            }
        ));
        tblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNhanVien.setGridColor(new java.awt.Color(204, 204, 204));
        tblNhanVien.setRowHeight(30);
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(135, 135, 135)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(56, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaNV))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(478, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(134, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
        );

        jTabbedPane1.addTab("Box", jPanel1);

        lblMaNV1.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV1.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV1.setText("Loại box");

        txtMaNV1.setBackground(new java.awt.Color(0, 153, 153));
        txtMaNV1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaNV1.setForeground(new java.awt.Color(51, 51, 51));
        txtMaNV1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtMaNV1.setOpaque(false);

        buttonRound3.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound3.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound3.setText("Tìm kiếm");
        buttonRound3.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N

        buttonRound4.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound4.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound4.setText("XÓA");
        buttonRound4.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound4ActionPerformed(evt);
            }
        });

        btnAdd1.setBackground(new java.awt.Color(2, 172, 171));
        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setText("THÊM BOX");
        btnAdd1.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        tblNhanVien1.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
        tblNhanVien1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã loại box", "Tên loại box", "Giá", "Mô tả"
            }
        ));
        tblNhanVien1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNhanVien1.setGridColor(new java.awt.Color(204, 204, 204));
        tblNhanVien1.setRowHeight(30);
        jScrollPane2.setViewportView(tblNhanVien1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(buttonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaNV1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Loại box", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jTabbedPane1))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void buttonRound4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound4ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnAdd;
    private com.boxcf.components.ButtonRound btnAdd1;
    private com.boxcf.components.ButtonRound buttonRound1;
    private com.boxcf.components.ButtonRound buttonRound2;
    private com.boxcf.components.ButtonRound buttonRound3;
    private com.boxcf.components.ButtonRound buttonRound4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNV1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblNhanVien1;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaNV1;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.prepareUI();
    }

    private void prepareUI() {
        UI.changeTransBG(new Color(0, 0, 0, 0), txtMaNV);
    }
   
}
