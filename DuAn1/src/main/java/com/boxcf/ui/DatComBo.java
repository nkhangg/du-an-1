/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.MsgBox;
import com.boxcf.store.Store;
import com.box.utils.XDate;
import com.boxcf.components.ComboBoxSuggestion;
import com.boxcf.components.material.PanelBill;
import com.boxcf.dao.BoxDao;
import com.boxcf.dao.SanPhamDao;
import com.boxcf.models.Box;
import com.boxcf.models.ModelItem;
import com.boxcf.models.SanPham;
import java.awt.HeadlessException;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.List;

/**
 *
 * @author HP
 */
public class DatComBo extends javax.swing.JFrame {

    ModelItem combo;
    OrderView orderView = Store.orderView;
    private PanelBill panelBill = Store.globelPanelBill;
    private List<Box> listBox;
    private List<SanPham> listDoUong;
    private List<SanPham> listDoAn;
    private List<ModelItem> listSelect;
    private ModelItem box = new ModelItem();

    public DatComBo() {
        initComponents();
        init();
    }

    public DatComBo(ModelItem combo) throws HeadlessException {
        this.combo = combo;
        combo.setSoLuong(1);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSuggestionUI1 = new com.boxcf.components.ComboSuggestionUI();
        comboSuggestionUI2 = new com.boxcf.components.ComboSuggestionUI();
        gradientPanel1 = new com.boxcf.components.GradientPanel();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        pnlDatBox = new com.boxcf.components.GradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenCombo = new com.boxcf.components.TextField();
        txtGia = new com.boxcf.components.TextField();
        pnlDU = new javax.swing.JPanel();
        cboDoUong1 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoUong3 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoUong5 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoUong2 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoUong4 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoUong6 = new com.boxcf.components.ComboBoxSuggestion();
        cboBox = new com.boxcf.components.ComboBoxSuggestion();
        buttonRound5 = new com.boxcf.components.ButtonRound();
        jLabel5 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cboDoAn1 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoAn3 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoAn5 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoAn2 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoAn4 = new com.boxcf.components.ComboBoxSuggestion();
        cboDoAn6 = new com.boxcf.components.ComboBoxSuggestion();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new com.boxcf.components.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 250, 255));
        setUndecorated(true);

        gradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241)));
        gradientPanel1.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel1.setColor2(new java.awt.Color(102, 102, 102));

        gradientPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241)));
        gradientPanel2.setColor1(new java.awt.Color(255, 255, 255));

        pnlDatBox.setColor1(new java.awt.Color(240, 240, 240));
        pnlDatBox.setColor2(new java.awt.Color(240, 240, 240));
        pnlDatBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Box");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Giá (VND)");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 40));

        txtTenCombo.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        txtTenCombo.setLabelText("");
        pnlDatBox.add(txtTenCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 270, 40));

        txtGia.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        txtGia.setLabelText("");
        pnlDatBox.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 230, 40));

        pnlDU.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đồ uống", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        pnlDU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboDoUong1.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        pnlDU.add(cboDoUong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 28, 300, -1));

        cboDoUong3.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        pnlDU.add(cboDoUong3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 78, 300, -1));

        cboDoUong5.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        pnlDU.add(cboDoUong5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 128, 300, -1));

        cboDoUong2.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        pnlDU.add(cboDoUong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 28, 300, -1));

        cboDoUong4.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        pnlDU.add(cboDoUong4, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 78, 300, -1));

        cboDoUong6.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        pnlDU.add(cboDoUong6, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 128, 300, -1));

        pnlDatBox.add(pnlDU, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 710, 190));

        cboBox.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        cboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboBoxMousePressed(evt);
            }
        });
        cboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxActionPerformed(evt);
            }
        });
        pnlDatBox.add(cboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 270, -1));

        buttonRound5.setBackground(new java.awt.Color(109, 191, 184));
        buttonRound5.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound5.setText("ĐẶT COMBO");
        buttonRound5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonRound5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound5ActionPerformed(evt);
            }
        });
        pnlDatBox.add(buttonRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 120, 50));

        jLabel5.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        jLabel5.setText("Giờ đặt kế tiếp");
        pnlDatBox.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 100, -1));

        lblTime.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        lblTime.setText("12:00:00");
        pnlDatBox.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 210, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đồ ăn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboDoAn1.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        jPanel2.add(cboDoAn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 28, 300, -1));

        cboDoAn3.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        jPanel2.add(cboDoAn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 78, 300, -1));

        cboDoAn5.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        jPanel2.add(cboDoAn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 128, 300, -1));

        cboDoAn2.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        jPanel2.add(cboDoAn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 28, 300, -1));

        cboDoAn4.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        jPanel2.add(cboDoAn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 78, 300, -1));

        cboDoAn6.setFont(new java.awt.Font("UTM Aptima", 0, 15)); // NOI18N
        jPanel2.add(cboDoAn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 128, 300, -1));

        pnlDatBox.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 710, 180));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Combo");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 50, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 82, 110));
        jLabel1.setText("COMBO");

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/exit (1).png"))); // NOI18N
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel1)
                .addGap(341, 341, 341)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlDatBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(pnlDatBox, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRound5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound5ActionPerformed
        if (!validator()) {
            return;
        }
        setBox();
        handleDat(combo);
        handleDat(box);
        ChosseProduct();
        Store.globelPanelBill.render();
        Store.globelPanelBill.repaint();
        Store.globelPanelBill.revalidate();

    }//GEN-LAST:event_buttonRound5ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboBoxActionPerformed

    private void cboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboBoxMousePressed
        setBox();
    }//GEN-LAST:event_cboBoxMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatComBo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatComBo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnClose;
    private com.boxcf.components.ButtonRound buttonRound5;
    private com.boxcf.components.ComboBoxSuggestion cboBox;
    private com.boxcf.components.ComboBoxSuggestion cboDoAn1;
    private com.boxcf.components.ComboBoxSuggestion cboDoAn2;
    private com.boxcf.components.ComboBoxSuggestion cboDoAn3;
    private com.boxcf.components.ComboBoxSuggestion cboDoAn4;
    private com.boxcf.components.ComboBoxSuggestion cboDoAn5;
    private com.boxcf.components.ComboBoxSuggestion cboDoAn6;
    private com.boxcf.components.ComboBoxSuggestion cboDoUong1;
    private com.boxcf.components.ComboBoxSuggestion cboDoUong2;
    private com.boxcf.components.ComboBoxSuggestion cboDoUong3;
    private com.boxcf.components.ComboBoxSuggestion cboDoUong4;
    private com.boxcf.components.ComboBoxSuggestion cboDoUong5;
    private com.boxcf.components.ComboBoxSuggestion cboDoUong6;
    private com.boxcf.components.ComboSuggestionUI comboSuggestionUI1;
    private com.boxcf.components.ComboSuggestionUI comboSuggestionUI2;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlDU;
    private com.boxcf.components.GradientPanel pnlDatBox;
    private com.boxcf.components.TextField txtGia;
    private com.boxcf.components.TextField txtTenCombo;
    // End of variables declaration//GEN-END:variables

    private void init() {
        Store.dcbView = this;
        panelBill.clearList(false);
        setCombo();
        fillBox();
        setStatus();
        checkSL();
        prepareUI();
    }

    private void prepareUI() {
        this.setLocationRelativeTo(null);
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        this.setShape(shape);
    }

    private void setStatus() {
        txtTenCombo.setEditable(false);
        txtGia.setEditable(false);
        cboBox.setVisible(true);
        cboDoAn1.setVisible(false);
        cboDoAn2.setVisible(false);
        cboDoAn3.setVisible(false);
        cboDoAn4.setVisible(false);
        cboDoAn5.setVisible(false);
        cboDoAn6.setVisible(false);
        cboDoUong1.setVisible(false);
        cboDoUong2.setVisible(false);
        cboDoUong3.setVisible(false);
        cboDoUong4.setVisible(false);
        cboDoUong5.setVisible(false);
        cboDoUong6.setVisible(false);
    }

    private void setCombo() {
        txtTenCombo.setText(combo.getTen());
        txtGia.setText(String.valueOf(combo.getGia()));
        lblTime.setText("--:--");

    }

    private void fillBox() {
        cboBox.removeAllItems();
        listBox = BoxDao.getInstance().selecCombo(combo.getLoaiBox().getMaLoaiBox());

        for (Box box : listBox) {
            cboBox.addItem(box);

        }
    }

    private void fillDoUong(ComboBoxSuggestion btn) {
        btn.removeAllItems();
        listDoUong = SanPhamDao.getInstant().selectByTenDanhMuc("Đồ uống");
        for (SanPham sp : listDoUong) {
            btn.addItem(sp);
        }
    }

    private void fillDoAn(ComboBoxSuggestion btn) {
        btn.removeAllItems();
        listDoAn = SanPhamDao.getInstant().selectByTenDanhMuc("Đồ ăn");
        for (SanPham sp : listDoAn) {
            btn.addItem(sp);
        }
    }

    private void checkSL() {
        if (combo.getSLDoUong() >= 1) {
            cboDoUong1.setVisible(true);
            fillDoUong(cboDoUong1);
            if (combo.getSLDoUong() >= 2) {
                cboDoUong2.setVisible(true);
                fillDoUong(cboDoUong2);
            }
            if (combo.getSLDoUong() >= 3) {
                cboDoUong3.setVisible(true);
                fillDoUong(cboDoUong3);
            }
            if (combo.getSLDoUong() >= 4) {
                cboDoUong4.setVisible(true);
                fillDoUong(cboDoUong4);
            }
            if (combo.getSLDoUong() >= 5) {
                cboDoUong5.setVisible(true);
                fillDoUong(cboDoUong5);
            }
            if (combo.getSLDoUong() == 6) {
                cboDoUong6.setVisible(true);
                fillDoUong(cboDoUong6);
            }
        }
        if (combo.getSLDoAn() >= 1) {
            cboDoAn1.setVisible(true);
            fillDoAn(cboDoAn1);
            if (combo.getSLDoAn() >= 2) {
                cboDoAn2.setVisible(true);
                fillDoAn(cboDoAn2);
            }
            if (combo.getSLDoAn() >= 3) {
                cboDoAn3.setVisible(true);
                fillDoAn(cboDoAn3);
            }
            if (combo.getSLDoAn() >= 4) {
                cboDoAn4.setVisible(true);
                fillDoAn(cboDoAn4);
            }
            if (combo.getSLDoAn() >= 5) {
                cboDoAn5.setVisible(true);
                fillDoAn(cboDoAn5);
            }
            if (combo.getSLDoAn() == 6) {
                cboDoAn6.setVisible(true);
                fillDoAn(cboDoAn6);
            }
        }
    }

    private void setBox() {
        Box b = (Box) cboBox.getSelectedItem();

        box.setMaItem(b.getMaBox());
        box.setTen(String.valueOf(cboBox.getSelectedItem()));
        box.setGioBD(XDate.now());
        box.setGioKT(XDate.addHours(XDate.now(), 1));
        box.setLoaiBox(combo.getLoaiBox());
        box.setSoLuong(1);
        box.setGia(0);
        box.setTenKH("");
        box.setMaCB(this.combo.getMaCB());
    }

    private boolean validator() {

        if (cboBox.getSelectedItem() == null) {
            MsgBox.alert(this, "Hiện không có Box trống thích hợp !");
            return false;
        }
        return true;
    }

    private void handleDat(ModelItem item) {

        panelBill.setListCombo(item);
        panelBill.repaint();
        this.dispose();
    }

    private void ChosseProduct() {
        SanPham s = null;

        if (combo.getSLDoUong() >= 1) {
            s = (SanPham) cboDoUong1.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoUong1.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoUong() >= 2) {
            s = (SanPham) cboDoUong2.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoUong2.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoUong() >= 3) {
            s = (SanPham) cboDoUong3.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoUong3.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoUong() >= 4) {
            s = (SanPham) cboDoUong4.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoUong4.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoUong() >= 5) {
            s = (SanPham) cboDoUong5.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoUong5.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoUong() == 6) {
            s = (SanPham) cboDoUong6.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoUong6.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoAn() >= 1) {
            s = (SanPham) cboDoAn1.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoAn1.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoAn() >= 2) {
            s = (SanPham) cboDoAn2.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoAn2.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoAn() >= 3) {
            s = (SanPham) cboDoAn3.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoAn3.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoAn() >= 4) {
            s = (SanPham) cboDoAn4.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoAn4.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoAn() >= 5) {
            s = (SanPham) cboDoAn5.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoAn5.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());

            handleDat(sp1);
        }
        if (combo.getSLDoAn() == 6) {
            s = (SanPham) cboDoAn6.getSelectedItem();
            ModelItem sp1 = new ModelItem(s.getMaSP(), "", 0, String.valueOf(cboDoAn6.getSelectedItem()), 1);
            sp1.setMaCB(this.combo.getMaCB());
            handleDat(sp1);
        }
    }
}
