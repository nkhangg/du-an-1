/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.UI;
import com.box.utils.XDate;
import com.boxcf.components.ScrollBar;
import com.boxcf.dao.HoaDonDao;
import com.boxcf.dao.ThongKeDao;
import com.boxcf.models.HoaDon;
import com.boxcf.models.LichSu;
import java.awt.Color;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class LichSuBanHangView extends javax.swing.JFrame {

    private ThongKeDao dTk = ThongKeDao.getInstant();

    public LichSuBanHangView(java.awt.Frame parent, boolean modal) {
        initComponents();
        init();
    }

    public LichSuBanHangView() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel1 = new com.boxcf.components.GradientPanel();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        clsoeButton1 = new com.boxcf.components.ClsoeButton();
        jLabel1 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        lblMaNV = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        tblTableData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        gradientPanel1.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel1.setColor2(new java.awt.Color(102, 102, 102));

        gradientPanel2.setColor1(new java.awt.Color(245, 250, 255));
        gradientPanel2.setColor2(new java.awt.Color(245, 250, 255));

        clsoeButton1.setBackground(new java.awt.Color(245, 250, 255));
        clsoeButton1.setDoubleBuffered(false);
        clsoeButton1.setFocusCycleRoot(true);
        clsoeButton1.setRequestFocusEnabled(false);
        clsoeButton1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("UTM Aptima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 48, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lịch Sử Bán Hàng");

        txtFind.setBackground(new java.awt.Color(0, 153, 153));
        txtFind.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFind.setForeground(new java.awt.Color(51, 51, 51));
        txtFind.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtFind.setOpaque(false);
        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindKeyReleased(evt);
            }
        });

        lblMaNV.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV.setText("Tìm Kiếm");

        tblTableData.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        tblTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hóa Đơn", "Ngày Tạo", "Tên Khách Hàng", "Tên Nhân Viên", "Tổng Tiền", "Khuyến Mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTableData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblTableData.setGridColor(new java.awt.Color(204, 204, 204));
        tblTableData.setRowHeight(30);
        tblTableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableDataMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblTableDataMousePressed(evt);
            }
        });
        scroll.setViewportView(tblTableData);

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(clsoeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clsoeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblMaNV))
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblTableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableDataMouseClicked

    }//GEN-LAST:event_tblTableDataMouseClicked

    private void tblTableDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableDataMousePressed
        handleShowDetail(evt);
    }//GEN-LAST:event_tblTableDataMousePressed

    private void txtFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyReleased
        handleFind();
    }//GEN-LAST:event_txtFindKeyReleased

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
            java.util.logging.Logger.getLogger(LichSuBanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichSuBanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichSuBanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichSuBanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LichSuBanHangView dialog = new LichSuBanHangView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ClsoeButton clsoeButton1;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblTableData;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables

    private void init() {
        clsoeButton1.initEvent(this);
        prepareUI();
        renderDataTable(dTk.history(""));

    }

    private void prepareUI() {
        scroll.setVerticalScrollBar(new ScrollBar());
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        this.setShape(shape);
        UI.changeTransBG(new Color(0, 0, 0, 0), txtFind);
    }

    private void renderDataTable(List<LichSu> list) {
        DefaultTableModel modelTable = (DefaultTableModel) tblTableData.getModel();

        modelTable.setRowCount(0);
        int i = 1;
        for (LichSu ls : list) {
            Object row[] = {i, ls.getMaHD(),
                XDate.toString(ls.getNgayTao(), "dd/MM/yyyy"),
                ls.getTenKH(),
                ls.getTenNV(),
                ls.getTONGTIEN(),
                ls.getMaKM()};
            modelTable.addRow(row);
            i++;
        }

    }

    private void handleFind() {
        String keyword = txtFind.getText();

        if (keyword == null || keyword.equals("")) {
            renderDataTable(dTk.history(""));
            return;
        }
        renderDataTable(dTk.history(keyword));
    }

    private void handleShowDetail(MouseEvent evt) {
        if (evt.getClickCount() != 2) {
            return;
        }

        int id = (int) tblTableData.getValueAt(tblTableData.getSelectedRow(), 1);
        HoaDon hd = HoaDonDao.getInstant().selectById(id);
        String nameStaff = (String) tblTableData.getValueAt(tblTableData.getSelectedRow(), 4);

        LichSu ls = new LichSu(hd, nameStaff);
        LichSuChiTiet hds = new LichSuChiTiet(this);
        hds.addInfo(ls);
        hds.setVisible(true);
    }

}
