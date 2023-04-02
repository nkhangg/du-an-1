/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.components.material;

import com.boxcf.dao.BoxDao2;
import com.boxcf.dao.SanPhamDao;
import com.boxcf.store.Store;
import com.boxcf.ui.OrderView;

public class Panigation extends javax.swing.JPanel {

    public static Integer total;
    Integer pageProduct = SanPhamDao.getInstant().getPageNumber();
    
//    private Integer totalProduct = SanPhamDao.getInstant().getPageNumber();
//    private Integer totalBox = BoxDao2.getInstant().getPageNumber();
    public static Integer currentPro = 1;
    public static Integer currentBox = 1;
    public static Integer current = 1;

    public Panigation() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLast = new com.boxcf.components.ButtonRound();
        btnFirst = new com.boxcf.components.ButtonRound();
        btnPre = new com.boxcf.components.ButtonRound();
        btnNext = new com.boxcf.components.ButtonRound();
        lblPageNumber = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnLast.setText(">|");
        btnLast.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnFirst.setText("|<");
        btnFirst.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnPre.setText("<<");
        btnPre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnNext.setText(">>");
        btnNext.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        lblPageNumber.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnFirst;
    private com.boxcf.components.ButtonRound btnLast;
    private com.boxcf.components.ButtonRound btnNext;
    private com.boxcf.components.ButtonRound btnPre;
    public static javax.swing.JLabel lblPageNumber;
    // End of variables declaration//GEN-END:variables

    private void init() {

        if (OrderView.mode.equals("product")) {
            total = SanPhamDao.getInstant().getPageNumber();
        }else {
            total = BoxDao2.getInstant().getPageNumber();
        }
        setPage();
    }

    public void controlPage(String opt) {

        switch (opt) {
            case "|<":
                current = 1;
                break;
            case ">|":
                current = total;
                break;
            case "<<":
                if (current == 1) {
//                    Utilities.showMess("Ban da o trang dau tien");
                } else {
                    current--;
                }
                break;
            case ">>":
                if (current == total) {
//                    Utilities.showMess("Ban da o trang cuoi cung");
                } else {
                    current++;
                }
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void setPage() {
        lblPageNumber.setText(current + " / " + total);
    }
}
