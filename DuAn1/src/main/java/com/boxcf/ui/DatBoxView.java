package com.boxcf.ui;

import com.box.utils.Auth;
import com.box.utils.Formats;
import com.box.utils.MsgBox;
import com.box.utils.Validator;
import com.boxcf.store.Store;
import com.box.utils.XDate;
import com.boxcf.components.material.ItemBill;
import com.boxcf.components.material.PanelBill;
import com.boxcf.components.material.Panigation;
import com.boxcf.constands.BoxState;
import com.boxcf.dao.BoxDao;
import com.boxcf.dao.DatTruocDao;
import com.boxcf.dao.HoaDonDao;
import com.boxcf.dao.PhieuDatBoxDao;
import com.boxcf.models.DatTruoc;
import com.boxcf.models.HoaDon;
import com.boxcf.models.ModelCboFitTime;
import com.boxcf.models.ModelItem;
import com.boxcf.models.PhieuDatBox;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class DatBoxView extends javax.swing.JFrame {

    private ModelItem box;
    private int time;
    private OrderView orderView = Store.orderView;
    private PanelBill panelBill = Store.globelPanelBill;
    PhieuDatBox pdb = null;

    public static boolean isBooked;

    public DatBoxView() {
//        this.box = new ModelItem(1, "Box 1", null, null, new LoaiBox("BX01", "Đơn", 100000, null), 0, 9);
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
        txtTraTruoc = new com.boxcf.components.TextField();
        btnDatBox = new com.boxcf.components.ButtonRound();
        cboSoGio = new com.boxcf.components.Combobox();
        cboHour = new com.boxcf.components.Combobox();
        checkBoxCustom1 = new com.boxcf.components.CheckBoxCustom();
        jLabel9 = new javax.swing.JLabel();
        lblGioKT = new javax.swing.JLabel();
        btnHuyBox = new com.boxcf.components.ButtonRound();
        txtLoaiBox = new com.boxcf.components.TextField();
        jLabel10 = new javax.swing.JLabel();
        txtTenBox = new com.boxcf.components.TextField();
        btnDatTruoc = new com.boxcf.components.ButtonRound();
        btnNhanBox = new com.boxcf.components.ButtonRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new com.boxcf.components.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 250, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        gradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241)));
        gradientPanel1.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel1.setColor2(new java.awt.Color(102, 102, 102));

        gradientPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241)));
        gradientPanel2.setColor1(new java.awt.Color(255, 255, 255));
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatTruoc.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
        tblDatTruoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Box", "Người đặt", "Giờ đặt", "Giờ trả", "Số giờ", "Trả trước"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatTruoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDatTruoc.setGridColor(new java.awt.Color(204, 204, 204));
        tblDatTruoc.setRowHeight(30);
        tblDatTruoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDatTruocMousePressed(evt);
            }
        });
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

        txtTraTruoc.setLabelText("");
        txtTraTruoc.setOpaque(false);
        pnlDatBox.add(txtTraTruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 180, 33));

        btnDatBox.setBackground(new java.awt.Color(109, 191, 184));
        btnDatBox.setForeground(new java.awt.Color(255, 255, 255));
        btnDatBox.setText("ĐẶT BOX");
        btnDatBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDatBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatBoxActionPerformed(evt);
            }
        });
        pnlDatBox.add(btnDatBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 120, 50));

        cboSoGio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cboSoGio.setLabeText("");
        cboSoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSoGioActionPerformed(evt);
            }
        });
        pnlDatBox.add(cboSoGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 35));

        cboHour.setForeground(new java.awt.Color(51, 51, 51));
        cboHour.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        cboHour.setLabeText("");
        cboHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHourActionPerformed(evt);
            }
        });
        pnlDatBox.add(cboHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 180, 40));

        checkBoxCustom1.setText("Đặt trước");
        checkBoxCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCustom1ActionPerformed(evt);
            }
        });
        pnlDatBox.add(checkBoxCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Trả trước");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 30));

        lblGioKT.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblGioKT.setText("12:00:00");
        pnlDatBox.add(lblGioKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, 50));

        btnHuyBox.setBackground(new java.awt.Color(109, 191, 184));
        btnHuyBox.setForeground(new java.awt.Color(255, 255, 255));
        btnHuyBox.setText("HỦY BOX");
        btnHuyBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHuyBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoxActionPerformed(evt);
            }
        });
        pnlDatBox.add(btnHuyBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 120, 50));

        txtLoaiBox.setLabelText("");
        txtLoaiBox.setOpaque(false);
        pnlDatBox.add(txtLoaiBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 180, 33));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Loại:");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDatBox.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 30));

        txtTenBox.setLabelText("");
        txtTenBox.setOpaque(false);
        pnlDatBox.add(txtTenBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 180, 33));

        btnDatTruoc.setBackground(new java.awt.Color(109, 191, 184));
        btnDatTruoc.setForeground(new java.awt.Color(255, 255, 255));
        btnDatTruoc.setText("ĐẶT TRƯỚC");
        btnDatTruoc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDatTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatTruocActionPerformed(evt);
            }
        });
        pnlDatBox.add(btnDatTruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 120, 50));

        btnNhanBox.setBackground(new java.awt.Color(109, 191, 184));
        btnNhanBox.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanBox.setText("NHẬN BOX");
        btnNhanBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNhanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanBoxActionPerformed(evt);
            }
        });
        pnlDatBox.add(btnNhanBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 120, 50));

        gradientPanel2.add(pnlDatBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 690, 380));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 82, 110));
        jLabel1.setText("ĐẶT BOX");
        gradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("LỊCH ĐẶT TRƯỚC");
        gradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 130, 40));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/exit (1).png"))); // NOI18N
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        gradientPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 50));

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
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

    private void btnDatBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatBoxActionPerformed
        handleDatBox();
    }//GEN-LAST:event_btnDatBoxActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Store.dbView = null;
    }//GEN-LAST:event_formWindowClosed

    private void btnHuyBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoxActionPerformed
        this.cancelBox();
    }//GEN-LAST:event_btnHuyBoxActionPerformed

    private void checkBoxCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCustom1ActionPerformed
        isBooked = !isBooked;
        setState(isBooked);
    }//GEN-LAST:event_checkBoxCustom1ActionPerformed

    private void cboHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHourActionPerformed
        setGioBD();
        renderTimeNumber();
    }//GEN-LAST:event_cboHourActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.exit();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDatTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatTruocActionPerformed
        handeDatTruoc();
    }//GEN-LAST:event_btnDatTruocActionPerformed

    private void btnNhanBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanBoxActionPerformed
        handleNhanBox();
    }//GEN-LAST:event_btnNhanBoxActionPerformed

    private void tblDatTruocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatTruocMousePressed
        handleShow(evt);
    }//GEN-LAST:event_tblDatTruocMousePressed

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
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatBoxView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnClose;
    private com.boxcf.components.ButtonRound btnDatBox;
    private com.boxcf.components.ButtonRound btnDatTruoc;
    private com.boxcf.components.ButtonRound btnHuyBox;
    private com.boxcf.components.ButtonRound btnNhanBox;
    private com.boxcf.components.Combobox cboHour;
    private com.boxcf.components.Combobox cboSoGio;
    private com.boxcf.components.CheckBoxCustom checkBoxCustom1;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private com.boxcf.components.TextField txtTraTruoc;
    // End of variables declaration//GEN-END:variables

    private void init() {
        Store.dbView = this;
        prepareUI();
        setBox();
        setMode();

        renderHour();
        renderTimeNumber();

//        renderDataTable();
        fillTable();
    }

    private void prepareUI() {
        this.setLocationRelativeTo(null);
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        this.setShape(shape);
    }

    private void setBox() {
        txtTenBox.setText(box.getTen());
        txtLoaiBox.setText(box.getLoaiBox().getTenLoaiBox());
        lblGioBd.setText(XDate.toString(new Date(), "HH:mm:ss"));

        box.setGioBD(new Date());
    }

    private ModelItem getBoxBooked() {
        return new ModelItem(box.getMaItem(), box.getTen(), box.getGioBD(), box.getGioKT(), box.getLoaiBox(), time <= 0 ? 1 : time, box.getLoaiBox().getGiaLoai(), box.getTenKH());
    }

    private void setGioKT(Date gioBD, int soGio) {
        Date gioKT = XDate.addHours(gioBD, soGio);

        lblGioKT.setText(XDate.toString(gioKT, "HH:mm:ss"));
        this.box.setGioKT(gioKT);
        time = soGio;
    }

    // xử lí hiển thị bill item
    private void handleDatBox() {
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

    public void renderHour() {
        PhieuDatBoxDao dPd = PhieuDatBoxDao.getInstant();

        PhieuDatBox activeBox = dPd.getActive(this.box.getMaItem().toString());
        List<PhieuDatBox> listBookedBox = dPd.getBookedListProc(this.box.getMaItem().toString());
        List<ModelCboFitTime> listCbo = new ArrayList<>();

        if (activeBox == null && listBookedBox.isEmpty()) {
            int i = 0;
            while (true) {
                Date gioTh = XDate.addHours(XDate.now(), i);

                if (XDate.beforeTimeClose(gioTh)) {
                    break;
                }
                listCbo.add(new ModelCboFitTime(gioTh, XDate.fitHourWithTime(gioTh)));
                i++;
            }

            cboHour.removeAllItems();
            for (ModelCboFitTime model : listCbo) {
                String hour = XDate.toString(model.getTime(), "HH");
                cboHour.addItem(model);
            }
            return;
        }

        if (activeBox == null && !listBookedBox.isEmpty()) {

            Date dateFirst = listBookedBox.get(0).getGioBD();
            int j = 0;
            while (true) {
                Date gioTh = XDate.addHours(XDate.now(), j);

                if (gioTh.after(dateFirst)) {
                    break;
                }

                long second = dateFirst.getTime() - gioTh.getTime();
                if (second >= 6000000) {
                    listCbo.add(new ModelCboFitTime(gioTh, XDate.fitHourWithTime(gioTh, dateFirst) - 1));
                }
                j++;
            }

            for (int i = 0; i < listBookedBox.size(); i++) {
                long second = 0;
                if (i < listBookedBox.size() - 1) {
                    second = listBookedBox.get(i + 1).getGioBD().getTime() - listBookedBox.get(i).getGioKT().getTime();

                }
                long hour = (second / 60 / 60 / 1000);
                if (second >= 6000000) {
                    ModelCboFitTime mcbb = new ModelCboFitTime(XDate.addMinus(new Date(listBookedBox.get(i).getGioKT().getTime()), Store.breaks), (int) hour <= 1 ? 1 : (int) hour);
                    listCbo.add(mcbb);
                }

            }

            PhieuDatBox dt = listBookedBox.get(listBookedBox.size() - 1);
            ModelCboFitTime mcbb = new ModelCboFitTime(XDate.addMinus(new Date(dt.getGioKT().getTime()), Store.breaks), XDate.fitHourWithTime(dt.getGioKT()));

            if (!XDate.beforeTimeClose(mcbb.getTime())) {
                listCbo.add(mcbb);
                int i = 1;
                while (true) {
                    Date date = XDate.addHours(new Date(mcbb.getTime().getTime()), i);
                    ModelCboFitTime mddt = new ModelCboFitTime(date, XDate.fitHourWithTime(date));
                    if (XDate.beforeTimeClose(mddt.getTime())) {
                        break;
                    }
                    listCbo.add(mddt);
                    i++;
                }
            }

            cboHour.removeAllItems();
            for (ModelCboFitTime model : listCbo) {
                String hour = XDate.toString(model.getTime(), "HH");
                cboHour.addItem(model);
            }
            return;
        }

//        if (activeBox != null && listBookedBox.isEmpty()) {
//            System.out.println("in here...");
//        }
    }

    private void renderTimeNumber() {
        cboSoGio.removeAllItems();
        if (cboHour.getSelectedItem() instanceof ModelCboFitTime) {
            ModelCboFitTime md = (ModelCboFitTime) cboHour.getSelectedItem();
            for (int i = 1; i <= md.getLimit(); i++) {
                cboSoGio.addItem(i);
            }
        }
    }

    public void renderDataTable() {
        DefaultTableModel tbl = (DefaultTableModel) tblDatTruoc.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (DatTruoc sp : DatTruocDao.getInstant().selectAllWithIdBox(Integer.parseInt(box.getMaItem() + ""))) {
            Object row[] = {i, this.box.getTen(), sp.getTenKH(), sp.getGioBD(), XDate.getHour(sp.getGioBD(), sp.getGioKT())};
            tbl.addRow(row);
            i++;
        }
    }

    private void cancelBox() {
        if (this.box.getTrangThai() == BoxState.active && pdb == null) {
            if (!MsgBox.confirm(this, "Bạn có chắt muốn hủy ?")) {
                return;
            }
            pdb = PhieuDatBoxDao.getInstant().getUsing(this.box.getMaItem().toString());

            PhieuDatBoxDao.getInstant().cancelBoxWhenActive(pdb);

            MsgBox.alert(this, "Hủy thành công !");
            //fill lai box
            Store.orderView.initBoxData(BoxDao.getInstance().panigation(Panigation.current));
            this.dispose();
            return;
        }

        if (pdb == null) {
            MsgBox.alert(this, "Không tìm thấy dữ liệu phù hợp !");
            return;
        }

        if (!MsgBox.confirm(this, "Bạn có chắt muốn hủy ?")) {
            return;
        }

        PhieuDatBoxDao.getInstant().cancelBox(pdb);

        MsgBox.alert(this, "Hủy thành công !");
        //fill lai box
        Store.orderView.initBoxData(BoxDao.getInstance().panigation(Panigation.current));
        this.dispose();
    }

    //dat truoc
    private void setState(boolean isBooked) {
        cboHour.setEnabled(isBooked);
        lblGioBd.setText(XDate.toString(XDate.now(), "HH:mm:ss"));
        btnDatBox.setEnabled(!isBooked);
        btnDatBox.setBackground(!isBooked ? Color.decode("#6DBFB8") : Color.decode("#e6ddce"));
    }

    private void setGioBD() {
        //neu la dat truoc --> set gioBD theo combo box

        renderTimeNumber();
        if (cboHour.getSelectedItem() == null) {
            return;
        }

        if (cboHour.getSelectedItem() instanceof ModelCboFitTime) {
            ModelCboFitTime model = (ModelCboFitTime) cboHour.getSelectedItem();

            Date current = new Date();
            Date gioBD = new Date(model.getTime().getTime());

            lblGioBd.setText(XDate.toString(gioBD, "HH:mm:ss"));
            box.setGioBD(gioBD);
        }

    }

    List<PhieuDatBox> listBox;

    private void handeDatTruoc() {
        if (!validator()) {
            return;
        }
        ModelItem data = getForm();

        //kiem tra giobd gio kt co hop le
        long gioBD = box.getGioBD().getTime();
        long gioKT = box.getGioKT().getTime();

        //lay ra danh sach box dang use va dat truoc
        List<PhieuDatBox> list = PhieuDatBoxDao.getInstant().getListActive(data.getMaItem().toString());
        PhieuDatBox nextBooked = PhieuDatBoxDao.getInstant().getNextBooked(box.getMaItem().toString());
        PhieuDatBox usingBox = PhieuDatBoxDao.getInstant().getUsing(box.getMaItem().toString());

        createBill(data);
        fillTable();
        MsgBox.alert(this, "Đặt trước thành công!");
        renderHour();
        orderView.initBoxData(BoxDao.getInstance().panigation(Panigation.current));
        //hien gio dat truoc ke tiep + tinh time de nhan box + huy box

        //phai goi lai ham setdata or initbox
//        new Timer().setTime2();
//        exit();
    }

    private void createBill(ModelItem data) {
        //tao hoa don
        data.setTrangThai(BoxState.booked);
        HoaDon hd = new HoaDon(XDate.now(), data.getTenKH(), Auth.user.getMaNV(), "", data.getTraTruoc(), null);
        int maHd = HoaDonDao.getInstant().inserts(hd);

        //Tao phieu dat box
        PhieuDatBoxDao.getInstant().insertProc(maHd, data, data.getTenKH());
    }

    private void fillTable() {
        DefaultTableModel tblModel = (DefaultTableModel) tblDatTruoc.getModel();
        tblModel.setRowCount(0);
        listBox = PhieuDatBoxDao.getInstant().getBookedListProc(box.getMaItem().toString());

        int i = 1;
        for (PhieuDatBox item : listBox) {
            Object[] row = {i, BoxDao.getInstance().selectById(item.getMaBox()).getTenBox(), item.getTenKH(), XDate.toString(item.getGioBD(), "HH:mm:ss"), XDate.toString(item.getGioKT(), "HH:mm:ss"), item.getSoGio(), Formats.toCurency(item.getTraTruoc())};
            tblModel.addRow(row);
            ++i;
        }
    }

    private void exit() {
        this.dispose();
    }

    private void setMode() {
        if (PhieuDatBoxDao.getInstant().isActive(box.getMaItem().toString()) != null) {
            isBooked = true;
            setState(isBooked);
        } else {
            isBooked = false;
            setState(isBooked);
        }
    }

    private ModelItem getForm() {
        ModelItem data = getBoxBooked();
        data.setTenKH(txtKhachHang.getText());
        data.setTraTruoc(Integer.parseInt(txtTraTruoc.getText()));
        data.setGhiChu("Chưa thanh toán");

        return data;
    }

    private void handleNhanBox() {
        PhieuDatBox data = PhieuDatBoxDao.getInstant().getNextBooked(box.getMaItem().toString());
        System.out.println("data: " + data);
        if (data == null) {
            return;
        }

        if (data.getGioBD().after(XDate.now())) {
            MsgBox.alert(this, "Chưa tới thời gian đặt trước !");
            return;
        }

        PhieuDatBoxDao.getInstant().updateActive(data);

//        //thong bao nhan box thanh cong + chay time con lai
        MsgBox.alert(this, "Nhận box thành công!");
        this.dispose();
        orderView.initBoxData(BoxDao.getInstance().panigation(Panigation.current));
    }

    private boolean validator() {
        boolean flag = true;
        String mess = "";

        if (Validator.isEmpty(txtKhachHang)) {
            mess += "Bạn chưa có tên khách hàng ! \n";
            flag = false;
        }

        if (Validator.isEmpty(txtTraTruoc)) {
            mess += "Chưa nhận được tiền cọc ! \n";
            flag = false;
        } else {
            if (!Validator.isInt(txtTraTruoc.getText())) {
                mess += "Tiền cọc không hợp lệ ! \n";
                flag = false;
            } else {
                if (Integer.parseInt(txtTraTruoc.getText()) <= 0) {
                    mess += "Tiền cọc không hợp lệ ! \n";
                    flag = false;
                }
            }
        }

        if (!flag) {
            MsgBox.alert(this, mess);
        }
        return flag;
    }

    private void handleShow(MouseEvent evt) {
        if (evt.getClickCount() != 2) {
            return;
        }
        int index = tblDatTruoc.getSelectedRow();

        String nameCutomer = (String) tblDatTruoc.getValueAt(index, 2);
        String timeStart = (String) tblDatTruoc.getValueAt(index, 3);
        String timeEnd = (String) tblDatTruoc.getValueAt(index, 4);
        int timeCount = (int) tblDatTruoc.getValueAt(index, 5);

        for (PhieuDatBox pd : listBox) {
            if (pd.getTenKH().equals(nameCutomer)
                    && pd.getSoGio() == timeCount
                    && XDate.toString(pd.getGioBD(), "HH:mm:ss").equalsIgnoreCase(timeStart)
                    && XDate.toString(pd.getGioKT(), "HH:mm:ss").equalsIgnoreCase(timeEnd)) {
                pdb = pd;
                break;
            }
        }

        if (pdb != null) {
            txtKhachHang.setText(pdb.getTenKH());
            txtTraTruoc.setText(pdb.getTraTruoc() + "");
        }
    }
}
