/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.components.material;

import com.box.utils.XDate;
import com.boxcf.constands.BoxState;
import com.boxcf.constands.Messages;
import com.boxcf.models.ModelItem;
import com.boxcf.models.Time;
import com.boxcf.store.Store;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BoxItem extends javax.swing.JPanel {

    private BoxState selected;
    private ModelItem box;

    public BoxItem() {
        initComponents();
        setOpaque(false);
        init();
    }

    public BoxState getSelected() {
        return selected;
    }

    public void setSelected(BoxState selected) {
        this.selected = selected;
        lblTime.setText(box.getSoLuong() + "");
        repaint();
    }

    public void setSelected(ModelItem data, BoxState selected) {
        this.selected = selected;
        data.setTrangThai(selected);
        this.box = data;
        lblTime.setText(box.getSoLuong() + "");
        repaint();
    }

    public ModelItem getData() {
        return box;
    }

    public void setData(ModelItem box) {
        this.box = box;
        lblTenBox.setText(box.getTen());
        lblLoai.setText(box.getLoaiBox().getTenLoaiBox());
        lblTime.setText(box.getSoLuong() + "");
        lblGia.setText(box.getLoaiBox().getGiaLoai() + " / 1h");

        this.box.setTrangThai(box.getTrangThai());
        this.repaint();
    }

    public void clearSelected() {
        this.setSelected(BoxState.inactive);
        this.box.setGioKT(null);
        this.box.setTrangThai(BoxState.inactive);
        this.box.setSoLuong(0);
        lblTime.setText("0");
        this.repaint();
        this.revalidate();
    }

    private void init() {
        hoverButton();
    }

    public void setActive(ModelItem box, BoxState state) {
        box.setTrangThai(state);
        this.box = box;
        this.setSelected(state);
        this.lblTime.setText(Messages.waitting);
        repaint();
    }

    @Override
    public String toString() {
        return "BoxItem{" + "selected=" + selected + ", box=" + box + '}';
    }

    @Override
//    #29c2aa
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (selected != null && (selected.equals(BoxState.reserved) || selected.equals(BoxState.waiting))) {
            g2.setColor(new Color(251, 210, 105));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        } else if (selected != null && selected.equals(BoxState.isActive)) {
            g2.setColor(new Color(117, 186, 117));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        } else {
            g2.setColor(new Color(109, 191, 184));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTenBox = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblLoai = new javax.swing.JLabel();
        btnDatTruoc = new com.boxcf.components.ButtonRound();
        lblGia = new javax.swing.JLabel();
        lblGia2 = new javax.swing.JLabel();
        lblGia3 = new javax.swing.JLabel();
        lblGia4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(109, 191, 184));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(230, 280));
        setPreferredSize(new java.awt.Dimension(230, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenBox.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblTenBox.setForeground(new java.awt.Color(255, 255, 255));
        lblTenBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTenBox.setText("Box 1");
        add(lblTenBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, 90, -1));

        lblTime.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 51, 51));
        lblTime.setText("01:30");
        add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, 30));

        lblLoai.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lblLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblLoai.setText("Đơn");
        add(lblLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 40, 30));

        btnDatTruoc.setBackground(new java.awt.Color(255, 255, 255));
        btnDatTruoc.setForeground(new java.awt.Color(0, 51, 51));
        btnDatTruoc.setText("Đặt trước");
        btnDatTruoc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        add(btnDatTruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, 30));

        lblGia.setBackground(new java.awt.Color(255, 255, 255));
        lblGia.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblGia.setForeground(new java.awt.Color(0, 51, 51));
        lblGia.setText("20.000 / 1h");
        add(lblGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, -1, 30));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnDatTruoc;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGia2;
    private javax.swing.JLabel lblGia3;
    private javax.swing.JLabel lblGia4;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblTenBox;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables

    private void hoverButton() {
        btnDatTruoc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnDatTruoc.setBackground(new Color(255, 150, 0));
                btnDatTruoc.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDatTruoc.setBackground(new Color(255, 255, 255));
                btnDatTruoc.setForeground(Color.BLACK);
            }

        });
    }

    public void setLblTime(Time time) {
        lblTime.setText(time.getHour() + "h" + time.getMuntite());
    }

    public void timer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                setSelected(BoxState.isActive);
                System.out.println(box);

                if (box.getGioKT() == null || box.getGioKT().equals("")) {
                    return;
                }
                Time t = XDate.getCurTime(XDate.toString(box.getGioKT(), "MM/dd/yyyy HH:mm:ss"));

                if (t == null) {
                    return;
                }

                if (t.getMuntite() < 0 && t.getHour() < 0) {
                    clearSelected();
                    JOptionPane.showMessageDialog(Store.orderView, "Box " + getData().getTen() + " da het thoi gian");
                    timer.cancel();
                    return;
                }

                setLblTime(t);

            }

        };
        timer.scheduleAtFixedRate(task, 0, 1000);

    }
}
