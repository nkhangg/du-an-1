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
        g2.setColor(Color.decode("#12A5BC"));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        if (selected) {
//            g2.setColor(Color.decode("#283054"));
////            g2.setColor(new Color(94, 156, 255));
//            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
                System.out.println("click");
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

        setBackground(new java.awt.Color(16, 108, 130));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(230, 280));
        setPreferredSize(new java.awt.Dimension(230, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenBox.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTenBox.setForeground(new java.awt.Color(255, 255, 255));
        lblTenBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTenBox.setText("Mã box");
        add(lblTenBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 110, -1));

        lblGia.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGia.setText("Giá");
        add(lblGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblLoaiBox1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLoaiBox1.setForeground(new java.awt.Color(255, 255, 255));
        lblLoaiBox1.setText("Loại box");
        add(lblLoaiBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblLoaiBox1;
    private javax.swing.JLabel lblTenBox;
    // End of variables declaration//GEN-END:variables
}
