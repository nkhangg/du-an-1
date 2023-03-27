/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.UI;
import com.boxcf.store.Store;
import java.awt.Color;

/**
 *
 * @author HP
 */
public class SanPhamView extends javax.swing.JPanel {

    public SanPhamView() {
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
        btnAdd = new com.boxcf.components.ButtonRound();
        buttonRound1 = new com.boxcf.components.ButtonRound();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        buttonRound2 = new com.boxcf.components.ButtonRound();
        gradientPanel1 = new com.boxcf.components.GradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combobox1 = new com.boxcf.components.Combobox();
        combobox2 = new com.boxcf.components.Combobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien1 = new javax.swing.JTable();
        lblMaNV2 = new javax.swing.JLabel();
        txtMaNV1 = new javax.swing.JTextField();
        buttonRound5 = new com.boxcf.components.ButtonRound();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        jLabel4 = new javax.swing.JLabel();
        combobox3 = new com.boxcf.components.Combobox();
        btnAdd2 = new com.boxcf.components.ButtonRound();
        buttonRound6 = new com.boxcf.components.ButtonRound();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhanVien2 = new javax.swing.JTable();
        lblMaNV3 = new javax.swing.JLabel();
        txtMaNV2 = new javax.swing.JTextField();
        buttonRound8 = new com.boxcf.components.ButtonRound();
        gradientPanel3 = new com.boxcf.components.GradientPanel();
        textField1 = new com.boxcf.components.TextField();
        lblMaNV1 = new javax.swing.JLabel();
        lblMaNV4 = new javax.swing.JLabel();
        textField2 = new com.boxcf.components.TextField();
        btnAdd3 = new com.boxcf.components.ButtonRound();
        buttonRound7 = new com.boxcf.components.ButtonRound();
        btnAdd4 = new com.boxcf.components.ButtonRound();
        buttonRound9 = new com.boxcf.components.ButtonRound();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("UTM Aptima", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 90, 1000, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(2, 172, 171));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("THÊM");
        btnAdd.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 96, 40));

        buttonRound1.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound1.setText("XÓA");
        buttonRound1.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 96, 40));

        lblMaNV.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV.setText("Sản phẩm");
        jPanel1.add(lblMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 44, 86, -1));

        txtMaNV.setBackground(new java.awt.Color(0, 153, 153));
        txtMaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(51, 51, 51));
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtMaNV.setOpaque(false);
        jPanel1.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 520, 32));

        buttonRound2.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound2.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound2.setText("Tìm kiếm");
        buttonRound2.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        jPanel1.add(buttonRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 31, -1, -1));

        gradientPanel1.setColor1(new java.awt.Color(240, 240, 240));
        gradientPanel1.setColor2(new java.awt.Color(240, 240, 240));

        jLabel2.setText("Danh mục");

        jLabel3.setText("Loại");

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel1.add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 720, 70));

        tblNhanVien.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Giá", "Loại SP", "Mô tả"
            }
        ));
        tblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNhanVien.setGridColor(new java.awt.Color(204, 204, 204));
        tblNhanVien.setRowHeight(30);
        jScrollPane1.setViewportView(tblNhanVien);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 930, 310));

        jTabbedPane1.addTab("SẢN PHẨM", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNhanVien1.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
        tblNhanVien1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã loại", "Tên loại", "Giá"
            }
        ));
        tblNhanVien1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNhanVien1.setGridColor(new java.awt.Color(204, 204, 204));
        tblNhanVien1.setRowHeight(30);
        jScrollPane2.setViewportView(tblNhanVien1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 880, 326));

        lblMaNV2.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV2.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV2.setText("Loại sản phẩm");
        jPanel2.add(lblMaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 44, 110, -1));

        txtMaNV1.setBackground(new java.awt.Color(0, 153, 153));
        txtMaNV1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaNV1.setForeground(new java.awt.Color(51, 51, 51));
        txtMaNV1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtMaNV1.setOpaque(false);
        jPanel2.add(txtMaNV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 520, 32));

        buttonRound5.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound5.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound5.setText("Tìm kiếm");
        buttonRound5.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        jPanel2.add(buttonRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 31, -1, -1));

        gradientPanel2.setColor1(new java.awt.Color(240, 240, 240));
        gradientPanel2.setColor2(new java.awt.Color(240, 240, 240));

        jLabel4.setText("Danh mục");

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 330, 60));

        btnAdd2.setBackground(new java.awt.Color(2, 172, 171));
        btnAdd2.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd2.setText("THÊM");
        btnAdd2.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 96, 40));

        buttonRound6.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound6.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound6.setText("XÓA");
        buttonRound6.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound6ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 96, 40));

        jTabbedPane1.addTab("LOẠI SP", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNhanVien2.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
        tblNhanVien2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã loại", "Tên loại", "Giá"
            }
        ));
        tblNhanVien2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNhanVien2.setGridColor(new java.awt.Color(204, 204, 204));
        tblNhanVien2.setRowHeight(30);
        jScrollPane3.setViewportView(tblNhanVien2);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 640, 370));

        lblMaNV3.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV3.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV3.setText("Danh mục");
        jPanel3.add(lblMaNV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 44, 80, -1));

        txtMaNV2.setBackground(new java.awt.Color(0, 153, 153));
        txtMaNV2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaNV2.setForeground(new java.awt.Color(51, 51, 51));
        txtMaNV2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtMaNV2.setOpaque(false);
        jPanel3.add(txtMaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 520, 32));

        buttonRound8.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound8.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound8.setText("Tìm kiếm");
        buttonRound8.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        jPanel3.add(buttonRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 31, -1, -1));

        gradientPanel3.setColor1(new java.awt.Color(240, 240, 240));
        gradientPanel3.setColor2(new java.awt.Color(240, 240, 240));

        textField1.setLabelText("");
        textField1.setOpaque(false);

        lblMaNV1.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV1.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV1.setText("Mã DM");

        lblMaNV4.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV4.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV4.setText("Tên DM");

        textField2.setLabelText("");
        textField2.setOpaque(false);

        btnAdd3.setBackground(new java.awt.Color(2, 172, 171));
        btnAdd3.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd3.setText("THÊM");
        btnAdd3.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        buttonRound7.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound7.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound7.setText("SỬA");
        buttonRound7.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound7ActionPerformed(evt);
            }
        });

        btnAdd4.setBackground(new java.awt.Color(2, 172, 171));
        btnAdd4.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd4.setText("MỚI");
        btnAdd4.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd4ActionPerformed(evt);
            }
        });

        buttonRound9.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound9.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound9.setText("XÓA");
        buttonRound9.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel3Layout = new javax.swing.GroupLayout(gradientPanel3);
        gradientPanel3.setLayout(gradientPanel3Layout);
        gradientPanel3Layout.setHorizontalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMaNV4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRound7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRound9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        gradientPanel3Layout.setVerticalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblMaNV1)
                .addGap(0, 0, 0)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMaNV4)
                .addGap(0, 0, 0)
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRound9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel3.add(gradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 370));

        jTabbedPane1.addTab("DANH MỤC SP", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 102, 1010, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.openThemSP();
    }//GEN-LAST:event_btnAddActionPerformed

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void buttonRound6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound6ActionPerformed

    private void buttonRound7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound7ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd4ActionPerformed

    private void buttonRound9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRound9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnAdd;
    private com.boxcf.components.ButtonRound btnAdd2;
    private com.boxcf.components.ButtonRound btnAdd3;
    private com.boxcf.components.ButtonRound btnAdd4;
    private com.boxcf.components.ButtonRound buttonRound1;
    private com.boxcf.components.ButtonRound buttonRound2;
    private com.boxcf.components.ButtonRound buttonRound5;
    private com.boxcf.components.ButtonRound buttonRound6;
    private com.boxcf.components.ButtonRound buttonRound7;
    private com.boxcf.components.ButtonRound buttonRound8;
    private com.boxcf.components.ButtonRound buttonRound9;
    private com.boxcf.components.Combobox combobox1;
    private com.boxcf.components.Combobox combobox2;
    private com.boxcf.components.Combobox combobox3;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private com.boxcf.components.GradientPanel gradientPanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNV1;
    private javax.swing.JLabel lblMaNV2;
    private javax.swing.JLabel lblMaNV3;
    private javax.swing.JLabel lblMaNV4;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblNhanVien1;
    private javax.swing.JTable tblNhanVien2;
    private com.boxcf.components.TextField textField1;
    private com.boxcf.components.TextField textField2;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaNV1;
    private javax.swing.JTextField txtMaNV2;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.prepareUI();
    }

    private void prepareUI() {
        UI.changeTransBG(new Color(0, 0, 0, 0), txtMaNV);
    }

    private void openThemSP() {
        ThongTinSP sp = new ThongTinSP();
        sp.setVisible(true);
    }
}
