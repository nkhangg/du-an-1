/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.Formats;
import com.box.utils.MsgBox;
import com.box.utils.XDate;
import com.boxcf.components.ScrollBar;
import com.boxcf.components.material.BoxItem;
import com.boxcf.components.material.ItemBill;
import com.boxcf.components.material.Panigation;
import com.boxcf.dao.BoxDao;
import com.boxcf.dao.PhieuDatBoxDao;
import com.boxcf.dao.HoaDonChiTietDao;
import com.boxcf.dao.HoaDonDao;
import com.boxcf.models.PhieuDatBox;
import com.boxcf.models.HoaDon;
import com.boxcf.models.HoaDonCT;
import com.boxcf.models.ModelItem;
import com.boxcf.store.Store;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class HoaDonView extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapView
     */
    public HoaDonView() {
        initComponents();
        clsoeButton1.initEvent(this);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel2 = new com.boxcf.components.GradientPanel();
        gradientPanel1 = new com.boxcf.components.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPrint = new com.boxcf.components.ButtonRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotalMoney = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblRedundant = new javax.swing.JLabel();
        txtMoney = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        clsoeButton1 = new com.boxcf.components.ClsoeButton();
        lblNameCutomer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        gradientPanel2.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel2.setColor2(new java.awt.Color(102, 102, 102));

        gradientPanel1.setColor1(new java.awt.Color(254, 254, 254));
        gradientPanel1.setColor2(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("UTM BryantLG", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("HÓA ĐƠN THANH TOÁN");

        btnPrint.setBackground(new java.awt.Color(109, 191, 184));
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("IN HÓA ĐƠN");
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Mã HD:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("1");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Khách hàng:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ngày:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("2023/01/01 15:00:00");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Nguyễn Thị Lam Hà");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nhân viên:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Tổng thành tiền");

        lblTotalMoney.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTotalMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalMoney.setText("1.000.000.000");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Khuyến mãi");

        lblDiscount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDiscount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDiscount.setText("1.000.000");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Tổng cộng");

        lblTotal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("1.001.000.000");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Tiền khách trả");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Tiền thừa");

        lblRedundant.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblRedundant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRedundant.setText("0");

        txtMoney.setBackground(new java.awt.Color(2, 154, 216));
        txtMoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMoney.setForeground(new java.awt.Color(51, 51, 51));
        txtMoney.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 150, 150)));
        txtMoney.setOpaque(false);

        tblHoaDon.setFont(new java.awt.Font("UTM BryantLG", 1, 12)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1000", "1", "1000"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sản phẩm", "Đơn giá", "Số lượng (giờ)", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblHoaDon.setGridColor(new java.awt.Color(204, 204, 204));
        tblHoaDon.setRowHeight(24);
        scroll.setViewportView(tblHoaDon);

        clsoeButton1.setBackground(new java.awt.Color(255, 255, 255));

        lblNameCutomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNameCutomer.setForeground(new java.awt.Color(51, 51, 51));
        lblNameCutomer.setText("Phan Huỳnh Tuyết Nhi");
        lblNameCutomer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(150, 150, 150)));
        lblNameCutomer.setOpaque(false);

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(gradientPanel1Layout.createSequentialGroup()
                            .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblTotal))
                                .addGroup(gradientPanel1Layout.createSequentialGroup()
                                    .addGap(265, 265, 265)
                                    .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblRedundant, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDiscount, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTotalMoney, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradientPanel1Layout.createSequentialGroup()
                                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(gradientPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clsoeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradientPanel1Layout.createSequentialGroup()
                                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNameCutomer, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(clsoeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNameCutomer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTotalMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblDiscount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblTotal))
                .addGap(12, 12, 12)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblRedundant))
                .addGap(18, 18, 18)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMoney.setBackground(new Color(0, 0, 0, 0));
        txtMoney.setBackground(new Color(0, 0, 0, 0));

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        handlePrintBill();
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnPrint;
    private com.boxcf.components.ClsoeButton clsoeButton1;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JTextField lblNameCutomer;
    private javax.swing.JLabel lblRedundant;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalMoney;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model;
    private long total = 0;
    private long finalTotal = 0;

    private void init() {
        prepareUI();
        model = (DefaultTableModel) tblHoaDon.getModel();
        renderDataTable();
        showInfo();
    }

    private void prepareUI() {
        scroll.setVerticalScrollBar(new ScrollBar());
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
    }

    private void renderDataTable() {
        model.setRowCount(0);
        for (Component com : Store.globelPanelBill.getComponents()) {
            if (com instanceof ItemBill) {
                ItemBill item = (ItemBill) com;
                ModelItem data = item.getData();
                total += data.getSoLuong() * data.getGia();
                Object[] row = new Object[]{data.getTen(), data.getGia(), data.getSoLuong(), data.getSoLuong() * data.getGia()};
                model.addRow(row);
            }
        }
    }

    private void showInfo() {
        lblTotalMoney.setText(Formats.toCurency(total));
        lblDiscount.setText("10%");
        this.finalTotal = (long) (this.total - (this.total * 0.1));
        lblTotal.setText(Formats.toCurency(this.finalTotal).trim());
        txtMoney.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                try {
                    long money = Long.parseLong(txtMoney.getText());
                    lblRedundant.setText(Formats.toCurency(money - finalTotal));
                } catch (NumberFormatException ex) {
                    lblRedundant.setText(Formats.toCurency(0));
                }
            }

        });
    }

    int maHd;

    private void createBill() {
        //tao hoa don
        HoaDon hd = new HoaDon(XDate.now(), lblNameCutomer.getText(), "NV01", "", finalTotal, "KM02");
        maHd = HoaDonDao.getInstant().inserts(hd);
        
        //tao hoa don chi tiet
        for (ItemBill item : Store.globelPanelBill.getList()) {
            ModelItem data = item.getData();

            //Tao phieu dat box
            if (data.getLoaiBox() != null) {
                PhieuDatBoxDao.getInstant().insertProc(maHd, item.getData(), lblNameCutomer.getText());
                
                //goi ham initTime -- o day co gio bd gio kt
//                BoxItem.box.setGioBD(item.getData().getGioBD());
//                BoxItem.box.setGioKT(item.getData().getGioKT());
            } else {
                //Tao hoa don chi tiet
                HoaDonCT hdct = new HoaDonCT(maHd, Integer.parseInt(data.getMaItem() + ""), data.getSoLuong(), "", (long) (data.getSoLuong() * data.getGia()));
                HoaDonChiTietDao.getInstant().insert(hdct);
            }

        }
        
        MsgBox.alert(Store.orderView, "Thanh toán thành công !");
    }

    private void handlePrintBill() {
        this.dispose();
        createBill();
        Store.globelPanelBill.clearList(false);
        Store.orderView.initBoxData(BoxDao.getInstance().panigation(Panigation.current));
        Store.orderView.getPanelItem().setTimer();
    }
}
