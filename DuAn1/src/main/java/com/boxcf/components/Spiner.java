/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import com.boxcf.events.interfaces.EventIncrease;

/**
 *
 * @author PC
 */
public class Spiner extends javax.swing.JPanel {

    private int soLuong;

    public void setEvenDecrease(EventIncrease event) {
        // add sự kiện giảm số lượng
        this.btnDecrease.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    event.itemClick(btnIncrease, soLuong);
                }
            }

        });
    }

    public void setEvenIncrease(EventIncrease event) {
        // add sự kiện tăng số lượng
        this.btnIncrease.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    event.itemClick(btnIncrease, soLuong);
                }
            }

        });
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
        lblSoluong.setText(soLuong + "");
        repaint();
        revalidate();
    }

    public Spiner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncrease = new javax.swing.JLabel();
        btnDecrease = new javax.swing.JLabel();
        lblSoluong = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(206, 30));
        setMinimumSize(new java.awt.Dimension(206, 30));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(206, 30));

        btnIncrease.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncrease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/icons8_Plus_20px_1.png"))); // NOI18N
        btnIncrease.setMaximumSize(new java.awt.Dimension(50, 30));
        btnIncrease.setMinimumSize(new java.awt.Dimension(50, 30));
        btnIncrease.setPreferredSize(new java.awt.Dimension(50, 30));
        btnIncrease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncreaseMouseClicked(evt);
            }
        });

        btnDecrease.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecrease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/icons8_minus_20px_1.png"))); // NOI18N
        btnDecrease.setMaximumSize(new java.awt.Dimension(50, 30));
        btnDecrease.setMinimumSize(new java.awt.Dimension(50, 30));
        btnDecrease.setPreferredSize(new java.awt.Dimension(50, 30));
        btnDecrease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecreaseMouseClicked(evt);
            }
        });

        lblSoluong.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSoluong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoluong.setText("0");
        lblSoluong.setMaximumSize(new java.awt.Dimension(50, 30));
        lblSoluong.setMinimumSize(new java.awt.Dimension(50, 30));
        lblSoluong.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnDecrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDecrease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblSoluong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncreaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncreaseMouseClicked
        increase();
    }//GEN-LAST:event_btnIncreaseMouseClicked

    private void btnDecreaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecreaseMouseClicked
        decrease();
    }//GEN-LAST:event_btnDecreaseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDecrease;
    private javax.swing.JLabel btnIncrease;
    private javax.swing.JLabel lblSoluong;
    // End of variables declaration//GEN-END:variables

    public int getQuantyti() {
        return Integer.parseInt(lblSoluong.getText());
    }

    public void increase() {
        lblSoluong.setText((getQuantyti() + 1) + "");
        setSoLuong(getQuantyti());
    }

    public void decrease() {
        if (getQuantyti() < 1) {
            return;
        }

        lblSoluong.setText((getQuantyti() - 1) + "");
        setSoLuong(getQuantyti());

    }

}
