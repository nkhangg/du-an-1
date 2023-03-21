/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.components.material;

import test.*;
import com.boxcf.components.Spiner;
import com.boxcf.models.BoxModelItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class BoxItem extends javax.swing.JPanel {

    private boolean selected;
    private BoxModelItem box;

    public BoxItem() {
        initComponents();
        setOpaque(false);
        init();
    }

    public boolean isSelected() {
        return selected;
    }


    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

//    public void setSoLuong(int soLuong) {
////        this.box.setSoLuong(soLuong);
//        this.soLuong.setSoLuong(soLuong);
//    }

    public BoxModelItem getData() {
        return box;
    }

    public void setData(BoxModelItem box) {
        this.box = box;
        lblTenBox.setText(box.getTenBox());
//        lblTrangThai.setText(box.getTrangThai()+ "");
        lblGia.setText(box.getLoaiBox().getTenLoaiBox());
        lblGia.setText(box.getLoaiBox().getGiaLoai() + "");
    }

//    public void clearSelected() {
////        this.box.setSoLuong(0);
//        soLuong.setSoLuong(0);
//        this.setSelected(false);
//        repaint();
//        revalidate();
//    }

    private void init() {
//        soLuong.setEvenDecrease(new EventIncrease() {
//            @Override
//            public void itemClick(Component com, int quantity) {
//                box.setSoLuong(quantity);
//                if (quantity <= 1) {
//                    setSelected(false);
//                }
//            }
//
//        });
//
//        soLuong.setEvenIncrease(new EventIncrease() {
//            @Override
//            public void itemClick(Component com, int quantity) {
//                box.setSoLuong(quantity);
//                if (quantity >= 0) {
//                    setSelected(true);
//                }
//            }
//
//        });
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.decode("#6dbfb8"));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        System.out.println(getWidth() + " " + getHeight());
        if (selected) {
                g2.setColor(Color.decode("#29c2aa"));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTenBox = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        lblLoaiBox1 = new javax.swing.JLabel();
        buttonRound1 = new com.boxcf.components.ButtonRound();
        lblGia1 = new javax.swing.JLabel();
        lblGia2 = new javax.swing.JLabel();
        lblGia3 = new javax.swing.JLabel();
        lblGia4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(109, 191, 184));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(230, 280));
        setPreferredSize(new java.awt.Dimension(230, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenBox.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblTenBox.setForeground(new java.awt.Color(255, 255, 255));
        lblTenBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTenBox.setText("Box 1");
        add(lblTenBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, 90, -1));

        lblGia.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblGia.setForeground(new java.awt.Color(0, 51, 51));
        lblGia.setText("01:30");
        add(lblGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, 30));

        lblLoaiBox1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblLoaiBox1.setForeground(new java.awt.Color(255, 255, 255));
        lblLoaiBox1.setText("Đơn");
        add(lblLoaiBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 40, 30));

        buttonRound1.setBackground(new java.awt.Color(255, 255, 255));
        buttonRound1.setForeground(new java.awt.Color(0, 51, 51));
        buttonRound1.setText("Đặt trước");
        buttonRound1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        add(buttonRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, 30));

        lblGia1.setBackground(new java.awt.Color(255, 255, 255));
        lblGia1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblGia1.setForeground(new java.awt.Color(0, 51, 51));
        lblGia1.setText("20.000 / 1h");
        add(lblGia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, -1, 30));

        lblGia2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblGia2.setForeground(new java.awt.Color(0, 51, 51));
        lblGia2.setText("Còn lại");
        add(lblGia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        lblGia3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblGia3.setForeground(new java.awt.Color(0, 51, 51));
        lblGia3.setText("Đặt trước");
        add(lblGia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 40));

        lblGia4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblGia4.setForeground(new java.awt.Color(0, 51, 51));
        lblGia4.setText("10:40");
        add(lblGia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 70, 80, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound buttonRound1;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGia1;
    private javax.swing.JLabel lblGia2;
    private javax.swing.JLabel lblGia3;
    private javax.swing.JLabel lblGia4;
    private javax.swing.JLabel lblLoaiBox1;
    private javax.swing.JLabel lblTenBox;
    // End of variables declaration//GEN-END:variables
}
