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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {
    
    NhanVienView nvView = new NhanVienView();
    SanPhamView spView = new SanPhamView();
    
    public Main() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel4 = new com.boxcf.components.GradientPanel();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        lblMenu3 = new javax.swing.JLabel();
        lblMenu4 = new javax.swing.JLabel();
        lblMenu5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imageAvatar1 = new com.boxcf.components.ImageAvatar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel4.setColor1(new java.awt.Color(27, 51, 61));
        gradientPanel4.setColor2(new java.awt.Color(27, 51, 61));
        gradientPanel4.setPreferredSize(new java.awt.Dimension(1200, 750));

        gradientPanel2.setColor1(new java.awt.Color(229, 201, 151));
        gradientPanel2.setColor2(new java.awt.Color(229, 201, 151));
        gradientPanel2.setOpaque(true);
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu3.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu3.setFont(new java.awt.Font("UTM BryantLG", 1, 18)); // NOI18N
        lblMenu3.setForeground(new java.awt.Color(51, 51, 51));
        lblMenu3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenu3.setText("Nhân viên");
        lblMenu3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 36, 1, 1));
        lblMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu3.setIconTextGap(12);
        lblMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu3MouseClicked(evt);
            }
        });
        gradientPanel2.add(lblMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 50));

        lblMenu4.setFont(new java.awt.Font("UTM BryantLG", 1, 18)); // NOI18N
        lblMenu4.setForeground(new java.awt.Color(51, 51, 51));
        lblMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu4.setText("Sản phẩm");
        lblMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu4MouseClicked(evt);
            }
        });
        gradientPanel2.add(lblMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 50));

        lblMenu5.setFont(new java.awt.Font("UTM BryantLG", 1, 18)); // NOI18N
        lblMenu5.setForeground(new java.awt.Color(51, 51, 51));
        lblMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu5.setText("Bán hàng");
        lblMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu5MouseClicked(evt);
            }
        });
        gradientPanel2.add(lblMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 206, 146));
        jLabel2.setText("BOX COFFEE");

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
            .addGap(0, 981, Short.MAX_VALUE)
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel4Layout.createSequentialGroup()
                        .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(pnlContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        getContentPane().add(gradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1200, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenu5MouseClicked

    private void lblMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu4MouseClicked
        // TODO add your handling code here:
        hidden(nvView);
        active(spView);
    }//GEN-LAST:event_lblMenu4MouseClicked

    private void lblMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu3MouseClicked
        this.openNhanVienView();
    }//GEN-LAST:event_lblMenu3MouseClicked

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
            if (cpn instanceof JLabel) {
                cpn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        ((JLabel) cpn).setOpaque(true);
                        cpn.setBackground(Color.decode("#aa8761"));
                        cpn.setForeground(Color.WHITE);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        ((JLabel) cpn).setOpaque(false);
                        cpn.setBackground(Color.decode("#29C2AA"));
                        cpn.setForeground(Color.decode("#333333"));
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
    }

    private void init() {
        this.prepareUI();
        System.out.println(pnlContent.getWidth() + " " + pnlContent.getHeight());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.GradientPanel gradientPanel2;
    private com.boxcf.components.GradientPanel gradientPanel4;
    private com.boxcf.components.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMenu3;
    private javax.swing.JLabel lblMenu4;
    private javax.swing.JLabel lblMenu5;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables

    private void activeUI(JFrame jframe) {
        jframe.setVisible(true);
    }

    private void openNhanVienView() {
        nvView.setSize(this.getWidth(), this.getWidth());
        nvView.setVisible(true);
    }

    private void hidden(JPanel jpanel) {
        jpanel.setVisible(false);
    }

    private void active(JPanel jpanel) {
        pnlContent.add(jpanel);
        jpanel.setSize(this.getWidth(), this.getHeight());
        jpanel.setVisible(true);
    }
}
