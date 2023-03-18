/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.components.material;

import com.boxcf.models.ModelItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import com.boxcf.events.interfaces.EventIncrease;
import com.boxcf.components.Spiner;
import com.boxcf.events.StoreEvents;
import com.boxcf.store.Store;

/**
 *
 * @author PC
 */
public class ProductItem extends javax.swing.JPanel {

    private boolean selected;
    private ModelItem data;

    public ProductItem() {
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
        PanelBill panelbill = Store.globelPanelBill;

        soLuong.setEvenDecrease(new EventIncrease() {
            @Override
            public void itemClick(Component com, int quantity) {
                data.setSoLuong(quantity);
                if (quantity <= 1) {
                    setSelected(false);
                    panelbill.removeItem(data);
                }

                for (ItemBill itemBill : panelbill.getList()) {
                    if (itemBill.getData().getMaItem() == data.getMaItem()) {
                        ModelItem oldData = itemBill.getData();

                        // bảo lưu dữ kiệu củ và thảy đỏi số lượng phù hợp
                        // do quantyti bị chậm hơn 1 số nên - 1
                        itemBill.setData(
                                new ModelItem(
                                        oldData.getMaItem(),
                                        oldData.getHing(),
                                        oldData.getGia(),
                                        oldData.getTen(),
                                        quantity - 1));
                        panelbill.render();
                        panelbill.repaint();
                        panelbill.revalidate();
                        return;
                    }
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
                for (ItemBill itemBill : panelbill.getList()) {
                    if (itemBill.getData().getMaItem() == data.getMaItem()) {
                        ModelItem oldData = itemBill.getData();

                        // bảo lưu dữ kiệu củ và thảy đỏi số lượng phù hợp
                        // do quantyti bị chậm hơn 1 số nên + 1
                        itemBill.setData(
                                new ModelItem(
                                        oldData.getMaItem(),
                                        oldData.getHing(),
                                        oldData.getGia(),
                                        oldData.getTen(),
                                        quantity + 1));
                        panelbill.render();
                        panelbill.repaint();
                        panelbill.revalidate();
                        return;
                    }
                }

                data.setSoLuong(quantity + 1);
                panelbill.setList(data);
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

        lblTen = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        soLuong = new com.boxcf.components.Spiner();
        picHinh = new com.boxcf.components.PictureBox();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(230, 280));
        setPreferredSize(new java.awt.Dimension(230, 280));

        lblTen.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTen.setText("Kem dừa");

        lblGia.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblGia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGia.setText("30k");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(picHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(picHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTen)
                .addGap(0, 0, 0)
                .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblTen;
    private com.boxcf.components.PictureBox picHinh;
    private com.boxcf.components.Spiner soLuong;
    // End of variables declaration//GEN-END:variables
}
