/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package test;

import com.boxcf.models.Box;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class BoxItem extends javax.swing.JPanel {

    private boolean selected;
    private Box box;

    public BoxItem() {
        initComponents();
        setOpaque(false);
        init();
    }

    public boolean isSelected() {
        return selected;
    }

    public Spiner getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Spiner soLuong) {
        this.soLuong = soLuong;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

//    public void setSoLuong(int soLuong) {
////        this.box.setSoLuong(soLuong);
//        this.soLuong.setSoLuong(soLuong);
//    }

    public Box getData() {
        return box;
    }

    public void setData(Box box) {
        this.box = box;
        lblMaBox.setText(box.getMaBox()+ "");
        lblLoaiBox.setText(box.getMaBox() + "");
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
        g2.setColor(Color.decode("#3282b3"));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
//        System.out.println(getWidth() + " " + getHeight());
        if (selected) {
//            g2.setColor(Color.decode("#283054"));
////            g2.setColor(new Color(94, 156, 255));
//            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
System.out.println("click");
                g2.setColor(Color.decode("#29c2aa"));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMaBox = new javax.swing.JLabel();
        soLuong = new test.Spiner();
        lblLoaiBox = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();

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

        lblMaBox.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMaBox.setForeground(new java.awt.Color(255, 255, 255));
        lblMaBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaBox.setText("Mã box");
        add(lblMaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 206, -1));

        soLuong.setForeground(new java.awt.Color(255, 255, 255));
        add(soLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblLoaiBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLoaiBox.setForeground(new java.awt.Color(255, 255, 255));
        lblLoaiBox.setText("Loại box");
        add(lblLoaiBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangThai.setText("Trạng thái");
        add(lblTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        lblGio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblGio.setForeground(new java.awt.Color(255, 255, 255));
        lblGio.setText("Giờ");
        add(lblGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblLoaiBox;
    private javax.swing.JLabel lblMaBox;
    private javax.swing.JLabel lblTrangThai;
    private test.Spiner soLuong;
    // End of variables declaration//GEN-END:variables
}
