/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.boxcf.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {
    
    NhanVienView nvView = new NhanVienView();
    SanPhamView spView = new SanPhamView();
    BoxView boxView = new BoxView();
    
    public Main() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel4 = new com.boxcf.components.GradientPanel();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        btnSanPham = new com.boxcf.components.ButtonRound();
        btnOrder = new com.boxcf.components.ButtonRound();
        btnBox = new com.boxcf.components.ButtonRound();
        buttonRound4 = new com.boxcf.components.ButtonRound();
        buttonRound5 = new com.boxcf.components.ButtonRound();
        btnNhanVien = new com.boxcf.components.ButtonRound();
        buttonRound8 = new com.boxcf.components.ButtonRound();
        buttonRound9 = new com.boxcf.components.ButtonRound();
        buttonRound10 = new com.boxcf.components.ButtonRound();
        jLabel2 = new javax.swing.JLabel();
        imageAvatar1 = new com.boxcf.components.ImageAvatar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel4.setColor1(new java.awt.Color(109, 191, 184));
        gradientPanel4.setColor2(new java.awt.Color(109, 191, 184));
        gradientPanel4.setPreferredSize(new java.awt.Dimension(1200, 750));

        gradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        gradientPanel2.setColor1(new java.awt.Color(109, 191, 184));
        gradientPanel2.setColor2(new java.awt.Color(109, 191, 184));
        gradientPanel2.setOpaque(true);
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/iftar.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setFocusPainted(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        gradientPanel2.add(btnSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 90, 70));

        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/coffee-menu (1).png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.setFocusPainted(false);
        btnOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        gradientPanel2.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 70));

        btnBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/cardboard.png"))); // NOI18N
        btnBox.setText("Box");
        btnBox.setFocusPainted(false);
        btnBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoxActionPerformed(evt);
            }
        });
        gradientPanel2.add(btnBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 70));

        buttonRound4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/combo.png"))); // NOI18N
        buttonRound4.setText("Combo");
        buttonRound4.setFocusPainted(false);
        buttonRound4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRound4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gradientPanel2.add(buttonRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 90, 70));

        buttonRound5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/price-tag.png"))); // NOI18N
        buttonRound5.setText("Khuyến mãi");
        buttonRound5.setFocusPainted(false);
        buttonRound5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRound5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gradientPanel2.add(buttonRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 70));

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/barista.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setFocusPainted(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        gradientPanel2.add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, 70));

        buttonRound8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/back.png"))); // NOI18N
        buttonRound8.setText("Đăng xuất");
        buttonRound8.setFocusPainted(false);
        buttonRound8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonRound8.setIconTextGap(12);
        gradientPanel2.add(buttonRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 190, 40));

        buttonRound9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/growth.png"))); // NOI18N
        buttonRound9.setText("Thống kê");
        buttonRound9.setFocusPainted(false);
        buttonRound9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRound9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gradientPanel2.add(buttonRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 70));

        buttonRound10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/growth.png"))); // NOI18N
        buttonRound10.setText("Thống kê");
        buttonRound10.setFocusPainted(false);
        buttonRound10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRound10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gradientPanel2.add(buttonRound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 70));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOX COFFEE");

        imageAvatar1.setForeground(new java.awt.Color(51, 51, 51));
        imageAvatar1.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar1.setGradientColor2(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("UTM Caviar", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã NV");

        jLabel5.setFont(new java.awt.Font("UTM Caviar", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chức vụ");

        pnlContent.setBackground(new java.awt.Color(241, 248, 248));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gradientPanel4Layout = new javax.swing.GroupLayout(gradientPanel4);
        gradientPanel4.setLayout(gradientPanel4Layout);
        gradientPanel4Layout.setHorizontalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel4Layout.createSequentialGroup()
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addGap(0, 901, Short.MAX_VALUE)
                        .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        gradientPanel4Layout.setVerticalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel4Layout.createSequentialGroup()
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(gradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1300, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        this.hidden(spView, boxView);
        this.active(nvView);
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        this.hidden(boxView, nvView);
        this.active(spView);
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoxActionPerformed
        this.hidden(spView, nvView);
        this.active(boxView);
    }//GEN-LAST:event_btnBoxActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        this.openOrder();
    }//GEN-LAST:event_btnOrderActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Main().setVisible(true);
            }
        });
    }

    
    //hover
    public void hover() {
        Component[] cpns = gradientPanel2.getComponents();
        for (Component cpn : cpns) {
            if (cpn instanceof JButton) {
                cpn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        ((JButton) cpn).setOpaque(true);
                        cpn.setBackground(Color.decode("#9ce2c6"));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        ((JButton) cpn).setOpaque(false);
                        cpn.setBackground(Color.decode("#F0F0F0"));
                    }
                });
            }
        }
    }

    private void prepareUI() {
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        this.setShape(shape);
        pnlContent.add(nvView);
        this.hover();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        this.prepareUI();
        System.out.println(pnlContent.getWidth() + " " + pnlContent.getHeight());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnBox;
    private com.boxcf.components.ButtonRound btnNhanVien;
    private com.boxcf.components.ButtonRound btnOrder;
    private com.boxcf.components.ButtonRound btnSanPham;
    private com.boxcf.components.ButtonRound buttonRound10;
    private com.boxcf.components.ButtonRound buttonRound4;
    private com.boxcf.components.ButtonRound buttonRound5;
    private com.boxcf.components.ButtonRound buttonRound8;
    private com.boxcf.components.ButtonRound buttonRound9;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private com.boxcf.components.GradientPanel gradientPanel4;
    private com.boxcf.components.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables

    private void activeUI(JFrame jframe) {
        jframe.setVisible(true);
    }


    private void hidden(JPanel... jpanel) {
        for (JPanel pnl : jpanel) {
            pnl.setVisible(false);
        }
    }

    private void active(JPanel jpanel) {
        pnlContent.add(jpanel);
        jpanel.setSize(getWidth(), getHeight());
        jpanel.setVisible(true);
    }

    private void openOrder() {
        OrderView orderView = new OrderView();
        orderView.setVisible(true);
    }
}
