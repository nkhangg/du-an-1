
package com.boxcf.ui;

import com.box.utils.JdbcHelper;
import com.boxcf.dao.SanPhamDao;
import com.boxcf.models.SanPham;
import com.boxcf.store.Store;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class SanPhamAn extends javax.swing.JFrame {

    String maSP;
    support sp = new support();
    SanPhamView spView = Store.spView;

    /**
     * Creates new form SanPhamAn1
     */
    public SanPhamAn() {
        initComponents();
        init();
    }

    void init() {
        setLocationRelativeTo(null);
        fillToTable();
        updateShowButton();
    }

    void fillToTable() {
        DefaultTableModel tbl = (DefaultTableModel) tblSanPham.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (SanPham sp1 : sp.selectAll()) {
            Object[] o = {i, sp1.getMaSP(), sp1.getTenSP()};
            tbl.addRow(o);
            i++;
        }
    }

    void updateShowButton() {
        btnThemSP.setEnabled(tblSanPham.getSelectedRow() != -1);
    }

    void activeSP() {
        sp.active(maSP);
        fillToTable();
        spView.fillToTableSanPham();
        JOptionPane.showMessageDialog(this, "Bỏ ẩn thành công!");
        updateShowButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel3 = new com.boxcf.components.GradientPanel();
        gradientPanel4 = new com.boxcf.components.GradientPanel();
        title = new javax.swing.JLabel();
        btnClose1 = new com.boxcf.components.ButtonRound();
        scroll = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnThemSP = new com.boxcf.components.ButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        gradientPanel3.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel3.setColor2(new java.awt.Color(102, 102, 102));
        gradientPanel3.setPreferredSize(new java.awt.Dimension(800, 400));

        gradientPanel4.setColor1(new java.awt.Color(245, 250, 255));
        gradientPanel4.setColor2(new java.awt.Color(245, 250, 255));
        gradientPanel4.setPreferredSize(new java.awt.Dimension(800, 408));

        title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        title.setForeground(new java.awt.Color(40, 48, 84));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SẢN PHẨM ĐÃ ẨN");

        btnClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/boxcf/images/icon/exit (1).png"))); // NOI18N
        btnClose1.setFocusPainted(false);
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        scroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblSanPham.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblSanPham.setGridColor(new java.awt.Color(204, 204, 204));
        tblSanPham.setRowHeight(30);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSanPhamMousePressed(evt);
            }
        });
        tblSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSanPhamKeyPressed(evt);
            }
        });
        scroll.setViewportView(tblSanPham);

        btnThemSP.setBackground(new java.awt.Color(2, 172, 171));
        btnThemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSP.setText("BÁN LẠI");
        btnThemSP.setFocusable(false);
        btnThemSP.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel4Layout = new javax.swing.GroupLayout(gradientPanel4);
        gradientPanel4.setLayout(gradientPanel4Layout);
        gradientPanel4Layout.setHorizontalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel4Layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        gradientPanel4Layout.setVerticalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel4Layout.createSequentialGroup()
                .addGroup(gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(title))
                    .addGroup(gradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gradientPanel3Layout = new javax.swing.GroupLayout(gradientPanel3);
        gradientPanel3.setLayout(gradientPanel3Layout);
        gradientPanel3Layout.setHorizontalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        gradientPanel3Layout.setVerticalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(gradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(gradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(gradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void tblSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMousePressed
        updateShowButton();
        int index = tblSanPham.rowAtPoint(evt.getPoint());
        maSP = (String) tblSanPham.getValueAt(index, 1);
        updateShowButton();
    }//GEN-LAST:event_tblSanPhamMousePressed

    private void tblSanPhamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSanPhamKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSanPhamKeyPressed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        activeSP();
    }//GEN-LAST:event_btnThemSPActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnClose1;
    private com.boxcf.components.ButtonRound btnThemSP;
    private com.boxcf.components.GradientPanel gradientPanel3;
    private com.boxcf.components.GradientPanel gradientPanel4;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
class support {

    public List<SanPham> selectAll() {
        List<SanPham> list = new ArrayList<>();
        String sql = "select * from SanPham where TrangThai = 0";

        try {
            ResultSet responce = JdbcHelper.query(sql);

            while (responce.next()) {
                list.add(new SanPhamDao().createObjecet(responce));
            }

            responce.getStatement().getConnection().close();

        } catch (Exception e) {
            System.out.println(e);
            throw new Error("The Error in selectAll SanPham !");
        }
        return list;
    }

    public void active(String id) {
        String sql = "update SanPham set TrangThai =1 where MaSP = ?";

        try {
            int responce = JdbcHelper.update(sql, id);

            if (responce == 0) {
                throw new Error("The Error in delete SanPham !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete SanPham !");
        }

    }
}
