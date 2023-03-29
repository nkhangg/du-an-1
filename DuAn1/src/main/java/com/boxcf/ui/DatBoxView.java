/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.boxcf.ui;

import com.boxcf.store.Store;
import com.box.utils.XDate;
import com.boxcf.components.material.ItemBill;
import com.boxcf.components.material.PanelBill;
import com.boxcf.dao.DatTruocDao;
import com.boxcf.models.DatTruoc;
import com.boxcf.models.LoaiBox;
import com.boxcf.models.ModelItem;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class DatBoxView extends javax.swing.JFrame {
    
    private ModelItem box;
    private int time;
    private OrderView orderView = Store.orderView;
    private PanelBill panelBill = Store.globelPanelBill;
    
    public DatBoxView() {
        this.box = new ModelItem(1, "Box 1", null, null, new LoaiBox("BX01", "Đơn", 100000, null), 0, 9);
        initComponents();
        init();
    }
    
    public DatBoxView(ModelItem box) throws HeadlessException {
        this.box = box;
        initComponents();
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel1 = new com.boxcf.components.GradientPanel();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatTruoc = new javax.swing.JTable();
        pnlDatBox = new com.boxcf.components.GradientPanel();
        jLabel8 = new javax.swing.JLabel();
        lblGioBd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKhachHang = new com.boxcf.components.TextField();
        txtTenBox = new com.boxcf.components.TextField();
        buttonRound4 = new com.boxcf.components.ButtonRound();
        cboSoGio = new com.boxcf.components.Combobox();
        cboSoGio2 = new com.boxcf.components.Combobox();
        cboSoGio3 = new com.boxcf.components.Combobox();
        jLabel6 = new javax.swing.JLabel();
        checkBoxCustom1 = new com.boxcf.components.CheckBoxCustom();
        txtLoaiBox = new com.boxcf.components.TextField();
        jLabel9 = new javax.swing.JLabel();
        lblGioKT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clsoeButton1 = new com.boxcf.components.ClsoeButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 250, 255));
        setUndecorated(true);

        gradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241)));
        gradientPanel1.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel1.setColor2(new java.awt.Color(102, 102, 102));

        gradientPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241)));
        gradientPanel2.setColor1(new java.awt.Color(255, 255, 255));
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatTruoc.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
        tblDatTruoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Box", "Người đặt", "Giờ đặt", "Số giờ"
            }
        ));
        tblDatTruoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDatTruoc.setGridColor(new java.awt.Color(204, 204, 204));
        tblDatTruoc.setRowHeight(30);
        jScrollPane1.setViewportView(tblDatTruoc);

        gradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 770, 150));

        pnlDatBox.setColor1(new java.awt.Color(240, 240, 240));
        pnlDatBox.setColor2(new java.awt.Color(240, 240, 240));
        pnlDatBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Giờ trả:");
        pnlDatBox.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 269, 54, 30));

        lblGioBd.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblGioBd.setText("11:00:00");
        pnlDatBox.add(lblGioBd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, 50));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Khách hàng:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 90, 33));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Giờ đặt:");
        pnlDatBox.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 54, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Số giờ:");
        pnlDatBox.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Box");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 30));

        txtKhachHang.setLabelText("");
        txtKhachHang.setOpaque(false);
        pnlDatBox.add(txtKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 480, 33));

        txtTenBox.setLabelText("");
        txtTenBox.setOpaque(false);
        pnlDatBox.add(txtTenBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 180, 33));

        buttonRound4.setBackground(new java.awt.Color(109, 191, 184));
        buttonRound4.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound4.setText("ĐẶT BOX");
        buttonRound4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonRound4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound4ActionPerformed(evt);
            }
        });
        pnlDatBox.add(buttonRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 120, 50));

        cboSoGio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cboSoGio.setLabeText("");
        cboSoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSoGioActionPerformed(evt);
            }
        });
        pnlDatBox.add(cboSoGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 35));

        cboSoGio2.setForeground(new java.awt.Color(51, 51, 51));
        cboSoGio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cboSoGio2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        cboSoGio2.setLabeText("");
        pnlDatBox.add(cboSoGio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 90, 40));

        cboSoGio3.setForeground(new java.awt.Color(51, 51, 51));
        cboSoGio3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));
        cboSoGio3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        cboSoGio3.setLabeText("");
        pnlDatBox.add(cboSoGio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 90, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(":");
        pnlDatBox.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 30, 40));

        checkBoxCustom1.setText("Đặt trước");
        pnlDatBox.add(checkBoxCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 30));

        txtLoaiBox.setLabelText("");
        txtLoaiBox.setOpaque(false);
        pnlDatBox.add(txtLoaiBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 180, 33));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Loại:");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 30));

        lblGioKT.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblGioKT.setText("12:00:00");
        pnlDatBox.add(lblGioKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, 50));

        gradientPanel2.add(pnlDatBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 690, 380));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 82, 110));
        jLabel1.setText("ĐẶT BOX");
        gradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("LỊCH ĐẶT TRƯỚC");
        gradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 130, 40));

        clsoeButton1.setBackground(new java.awt.Color(255, 255, 255));
        clsoeButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        gradientPanel2.add(clsoeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 40, 40));

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
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

    private void cboSoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSoGioActionPerformed
        if (cboSoGio.getSelectedItem() == null) {
            return;
        }
        
        int soGio = Integer.parseInt(cboSoGio.getSelectedItem().toString());
        Date ngayBD = XDate.getHour(lblGioBd.getText());
        setGioKT(ngayBD, soGio);
    }//GEN-LAST:event_cboSoGioActionPerformed

    private void buttonRound4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound4ActionPerformed
        handleCreateBillItem();
    }//GEN-LAST:event_buttonRound4ActionPerformed

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
            java.util.logging.Logger.getLogger(DatBoxView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatBoxView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatBoxView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatBoxView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatBoxView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound buttonRound4;
    private com.boxcf.components.Combobox cboSoGio;
    private com.boxcf.components.Combobox cboSoGio2;
    private com.boxcf.components.Combobox cboSoGio3;
    private com.boxcf.components.CheckBoxCustom checkBoxCustom1;
    private com.boxcf.components.ClsoeButton clsoeButton1;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGioBd;
    private javax.swing.JLabel lblGioKT;
    private com.boxcf.components.GradientPanel pnlDatBox;
    private javax.swing.JTable tblDatTruoc;
    private com.boxcf.components.TextField txtKhachHang;
    private com.boxcf.components.TextField txtLoaiBox;
    private com.boxcf.components.TextField txtTenBox;
    // End of variables declaration//GEN-END:variables

    private void init() {
        clsoeButton1.initEvent(this);
        prepareUI();
        setBox(box);
        renderHour();
    }
    
    private void prepareUI() {
        this.setLocationRelativeTo(null);
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        this.setShape(shape);
    }
    
    private void setBox(ModelItem box) {
        txtLoaiBox.setText(box.getLoaiBox().getTenLoaiBox());
        txtTenBox.setText(box.getTen());
        lblGioBd.setText(XDate.toString(new Date(), "HH:mm:ss"));
        
        box.setGioBD(new Date());
        
    }
    
    private ModelItem getBoxBooked() {
        
        return new ModelItem(box.getMaItem(), box.getTen(), box.getGioBD(), box.getGioKT(), box.getLoaiBox(), time <= 0 ? 1 : time, box.getLoaiBox().getGiaLoai());
    }
    
    private void setGioKT(Date gioBD, int soGio) {
        
        Date gioKT = XDate.addHours(gioBD, soGio);
        
        lblGioKT.setText(XDate.toString(gioKT, "HH:mm:ss"));
        this.box.setGioKT(gioKT);
        time = soGio;
    }

    // xử lí hiển thị bill item
    private void handleCreateBillItem() {
        ModelItem data = getBoxBooked();
        if (data.getGioKT() == null) {
            return;
        }
        
        for (Component component : panelBill.getComponents()) {
            ItemBill itemBill = (ItemBill) component;
            if (itemBill.getData().getMaItem() == data.getMaItem()) {
                itemBill.setData(data);
                orderView.handleTotal();
                this.dispose();
                return;
            }
            
        }
        
        panelBill.setList(data);
        panelBill.repaint();
        this.dispose();
        
    }

    // xử lí viêc khi tồn tại một billitem trùng với box thì sẽ lấy thông tin trên bill đó xuống
    private void handleResetData() {
        // so luong la gio do :))
        for (Component component : panelBill.getComponents()) {
            ItemBill itemBill = (ItemBill) component;
            if (itemBill.getData().getMaItem() == this.box.getMaItem()) {
                this.cboSoGio.setSelectedItem(itemBill.getData().getSoLuong() + "");
                return;
            }
            
        }
    }
    
    private void renderHour() {
        // sua thu
        List<DatTruoc> list = DatTruocDao.getInstant().selectAllWithIdBoxActive(Integer.parseInt(box.getMaItem() + ""));
        Date ngayBD = XDate.getHour(lblGioBd.getText());
        
        if (list.isEmpty()) {
            cboSoGio.removeAllItems();
            for (int i = 1; i <= XDate.fitHourWithTime(ngayBD); i++) {
                cboSoGio.addItem(i);
            }
            return;
        }
        
        DatTruoc dt = list.get(0);
        
        long second = dt.getGioBD().getTime() - ngayBD.getTime();
        
        long hour = (second / 60 / 60 / 1000);
        if (second > 6000000) {
            cboSoGio.removeAllItems();
            for (int i = 1; i <= hour; i++) {
                cboSoGio.addItem(i);
            }
        }
        
    }
}
