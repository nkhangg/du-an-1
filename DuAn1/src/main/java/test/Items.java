/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package test;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author PC
 */
public class Items extends javax.swing.JPanel {

    private boolean selected;
    private ModelItem data;

    public Items() {
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

    public void setSoLuong(int soLuong) {
        this.data.setSoLuong(soLuong);
        this.soLuong.setSoLuong(soLuong);
    }

    public ModelItem getData() {
        return data;
    }

    public void setData(ModelItem data) {
        this.data = data;
        lblGia.setText(data.getGia() + "");
        lblTen.setText(data.getTen());
        picHinh.setImage(data.getHing());

    }

    public void clearSelected() {
        this.data.setSoLuong(0);
        soLuong.setSoLuong(0);
        this.setSelected(false);
        repaint();
        revalidate();
    }

    private void init() {
        soLuong.setEvenDecrease(new EventIncrease() {
            @Override
            public void itemClick(Component com, int quantity) {
                data.setSoLuong(quantity);
                if (quantity <= 1) {
                    setSelected(false);
                }
            }

        });

        soLuong.setEvenIncrease(new EventIncrease() {
            @Override
            public void itemClick(Component com, int quantity) {
                data.setSoLuong(quantity);
                if (quantity >= 0) {
                    setSelected(true);
                }
            }

        });
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(242, 242, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if (selected) {
            g2.setColor(new Color(94, 156, 255));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picHinh = new test.PictureBox();
        lblTen = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        soLuong = new test.Spiner();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(230, 280));
        setPreferredSize(new java.awt.Dimension(230, 280));

        picHinh.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/sp6.jpg"))); // NOI18N

        javax.swing.GroupLayout picHinhLayout = new javax.swing.GroupLayout(picHinh);
        picHinh.setLayout(picHinhLayout);
        picHinhLayout.setHorizontalGroup(
            picHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        picHinhLayout.setVerticalGroup(
            picHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        lblTen.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTen.setText("Kem dừa");

        lblGia.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        lblGia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGia.setText("30k");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(picHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(picHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblTen)
                .addGap(0, 0, 0)
                .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblTen;
    private test.PictureBox picHinh;
    private test.Spiner soLuong;
    // End of variables declaration//GEN-END:variables
}
