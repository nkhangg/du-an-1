/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.boxcf.ui;

import com.box.utils.XDate;
import com.boxcf.dao.ThongKeDao;
import com.boxcf.models.ModelStatistical;
import com.boxcf.store.Store;
import com.raven.chart.Chart;
import com.raven.chart.ModelChart;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class ChonKhoanThoiGianView extends javax.swing.JDialog {

    private ModelStatistical data;
    private Chart chart = Store.chart;
    private ThongKeDao dTk = ThongKeDao.getInstant();
    private final String dt = "Doanh Thu";
    private final String spbc = "Sản Phẩm Bán Chạy";
    private final String dsnv = "Doanh Số Nhân Viên";
    private final String lshd = "Lịch Sử Hoạt Động";

    public ChonKhoanThoiGianView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    public ChonKhoanThoiGianView(ModelStatistical data) {
        super(Store.globelMain, true);
        this.data = data;
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

        gradientPanel1 = new com.boxcf.components.GradientPanel();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dcTimeStart = new com.toedter.calendar.JDateChooser();
        dcTimeEnd = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnComfirm = new com.boxcf.components.ButtonRound();
        lblMess = new javax.swing.JLabel();
        clsoeButton1 = new com.boxcf.components.ClsoeButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);

        gradientPanel1.setColor1(new java.awt.Color(102, 102, 102));
        gradientPanel1.setColor2(new java.awt.Color(102, 102, 102));

        gradientPanel2.setColor1(new java.awt.Color(245, 250, 255));
        gradientPanel2.setColor2(new java.awt.Color(245, 250, 255));

        jLabel1.setFont(new java.awt.Font("UTM Aptima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 48, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chọn Khoản Thời Gian");

        dcTimeStart.setPreferredSize(new java.awt.Dimension(82, 30));
        dcTimeStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dcTimeStartMousePressed(evt);
            }
        });
        dcTimeStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dcTimeStartKeyReleased(evt);
            }
        });

        dcTimeEnd.setPreferredSize(new java.awt.Dimension(82, 30));

        jLabel2.setFont(new java.awt.Font("UTM Aptima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thời gian bắt đầu");

        jLabel3.setFont(new java.awt.Font("UTM Aptima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thời gian Kết Thúc");

        jLabel4.setFont(new java.awt.Font("UTM Aptima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Và");

        btnComfirm.setBackground(new java.awt.Color(2, 172, 171));
        btnComfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnComfirm.setText("Xác Nhận");
        btnComfirm.setFont(new java.awt.Font("UTM Aptima", 1, 16)); // NOI18N
        btnComfirm.setRequestFocusEnabled(false);
        btnComfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComfirmActionPerformed(evt);
            }
        });

        lblMess.setFont(new java.awt.Font("UTM Aptima", 1, 12)); // NOI18N
        lblMess.setForeground(new java.awt.Color(204, 0, 0));

        clsoeButton1.setBackground(new java.awt.Color(245, 250, 255));
        clsoeButton1.setDoubleBuffered(false);
        clsoeButton1.setFocusCycleRoot(true);
        clsoeButton1.setRequestFocusEnabled(false);
        clsoeButton1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel2Layout.createSequentialGroup()
                        .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(dcTimeStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcTimeEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(clsoeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel2Layout.createSequentialGroup()
                        .addComponent(lblMess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(clsoeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dcTimeStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcTimeEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMess, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    private void dcTimeStartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcTimeStartKeyReleased
    }//GEN-LAST:event_dcTimeStartKeyReleased

    private void dcTimeStartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcTimeStartMousePressed
    }//GEN-LAST:event_dcTimeStartMousePressed

    private void btnComfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComfirmActionPerformed
        handleSetDataChart();
    }//GEN-LAST:event_btnComfirmActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChonKhoanThoiGianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChonKhoanThoiGianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChonKhoanThoiGianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChonKhoanThoiGianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChonKhoanThoiGianView dialog = new ChonKhoanThoiGianView(new javax.swing.JFrame(), true);
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
    private com.boxcf.components.ButtonRound btnComfirm;
    private com.boxcf.components.ClsoeButton clsoeButton1;
    private com.toedter.calendar.JDateChooser dcTimeEnd;
    private com.toedter.calendar.JDateChooser dcTimeStart;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMess;
    // End of variables declaration//GEN-END:variables

    private void init() {
        clsoeButton1.initEvent(this);
        prepareUI();
    }

    private void prepareUI() {
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);
        this.setShape(shape);
    }

    private void exit() {
        this.dispose();
    }

    private boolean validator() {
        Date timeStart = dcTimeStart.getDate();
        Date timeEnd = dcTimeEnd.getDate();

        if (timeStart == null || timeEnd == null) {
            lblMess.setText("Bạn chưa chọn thời gian");
            return false;
        }

        if (timeEnd.before(timeStart)) {
            lblMess.setText("Thời gian kết thúc phải lớn hơn thời gian bất đầu");
            return false;
        }

        lblMess.setText("");
        return true;
    }

    private void handleSetDataChart() {
        if (!validator()) {
            return;
        }
        List<ModelStatistical> list = null;
        if (data.getCategory().equalsIgnoreCase(dt)) {
            Date dateStart = XDate.toDate("2023/02/2", "yyyy/MM/dd");
            Date dateEnd = XDate.toDate("2023/04/3", "yyyy/MM/dd");
            list = dTk.revenue(data.getType(), dateStart, dateEnd);

        } else if (data.getCategory().equalsIgnoreCase(spbc)) {

            list = dTk.product(data.getTime(), data.getType());

        } else if (data.getCategory().equalsIgnoreCase(dsnv)) {

            list = dTk.staff(data.getTime(), data.getType());
        } else {
            chart.clear();
        }

        if (list == null) {
            return;
        }

        for (ModelStatistical md : list) {
            chart.addData(new ModelChart(md.getTitle().length() > 8 ? md.getTitle().substring(0, 10) + "..." : md.getTitle(), new double[]{md.getNum()}));
        }

        chart.start();
    }
}
