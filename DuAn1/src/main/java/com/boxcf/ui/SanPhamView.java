package com.boxcf.ui;

import com.box.utils.Auth;
import com.box.utils.JdbcHelper;
import com.box.utils.UI;
import com.boxcf.components.ScrollBar;
import com.boxcf.dao.ComboCTDao;
import com.boxcf.dao.DanhMucDao;
import com.boxcf.dao.HoaDonChiTietDao;
import com.boxcf.dao.LoaiSPDao;
import com.boxcf.dao.SanPhamDao;
import com.boxcf.models.ComboCT;
import com.boxcf.models.DanhMuc;
import com.boxcf.models.HoaDon;
import com.boxcf.models.HoaDonCT;
import com.boxcf.models.LoaiSP;
import com.boxcf.models.SanPham;
import com.boxcf.store.Store;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class SanPhamView extends javax.swing.JPanel {

    SanPhamDao spDAO = new SanPhamDao();
    LoaiSPDao lspDAO = new LoaiSPDao();
    DanhMucDao dmDAO = new DanhMucDao();

    suport sp = new suport();

    public int pageNumber = 1;

    public String maSP;
    public String maLoai;
    public String maDanhMuc = null;

    public SanPhamView() {
        initComponents();
        init();
    }

    boolean getClick(JTable table) {
        if (table.getSelectedRow() == -1) {
            return false;
        }
        return true;
    }

    private void init() {
        this.prepareUI();
        Store.spView = this;

        fillCBBDM();
        fillCBBLoaiSP();
        fillToTableSanPham();
        fillToTableDanhMuc();
        fillToTableLoaiSP();

        UI.accept(btnThemDM, btnThemLSP, btnThemSP, btnXoaDM, btnXoaLSP, btnXoaSP);

    }

    private void prepareUI() {
        scroll.setVerticalScrollBar(new ScrollBar());
        UI.changeTransBG(new Color(0, 0, 0, 0), txtTimSP, txtTimLoaiSP, txtTimDM);
    }
    int i = 1;

    private void renderDataTable(List<SanPham> list) {
        DefaultTableModel tbl = (DefaultTableModel) tblSanPham.getModel();
        tbl.setRowCount(0);
        int i = ((pageNumber * 8) - 8) + 1;
        for (SanPham sp : list) {
            Object row[] = {i, sp.getMaSP(), sp.getTenSP(), sp.getGia(), lspDAO.selectById(sp.getMaLoai()).getTenLoai(), sp.getMoTa()};
            tbl.addRow(row);
            i++;
        }
    }

    void fillCBBLoaiSP() {
        cboLoaiSP.removeAllItems();
        cboLoaiSP.addItem("All");
        for (LoaiSP lsp : sp.getLSPFromDM(cboDanhMuc1.getSelectedItem().toString() == "All" ? "" : cboDanhMuc1.getSelectedItem().toString())) {
            cboLoaiSP.addItem(lsp.getTenLoai());
        }
    }

    void fillCBBDM() {
        cboDanhMuc1.removeAllItems();
        cboDanhMuc2.removeAllItems();
        cboDanhMuc1.addItem("All");
        cboDanhMuc2.addItem("All");
        for (DanhMuc dm : dmDAO.selectAll()) {
            cboDanhMuc1.addItem(dm.getTenDM().toString());
            cboDanhMuc2.addItem(dm.getTenDM().toString());

        }

    }

    public void fillToTableSanPham() {
        renderDataTable(sp.panigation(pageNumber, txtTimSP.getText(), 4, cboLoaiSP.getSelectedItem().toString() == "All" ? "" : cboLoaiSP.getSelectedItem().toString(), cboDanhMuc1.getSelectedItem().toString() == "All" ? "" : cboDanhMuc1.getSelectedItem().toString(), cboSort.getSelectedItem().toString()));
//        for (SanPham sp : spDAO.selectAll()) {
//            Object row[] = {sp.getMaSP(), sp.getTenSP(), sp.getGia(), sp.getMaLoai(), sp.getMoTa()};
//            tbl.addRow(row);
//        }
        setStatusSP();
    }

    public void timSP() {
        fillToTableSanPham();

    }

    void filterLoaiSP() {
        fillToTableSanPham();
    }

    void filterDM() {
        if (cboDanhMuc1.getItemCount() > 1) {
            fillToTableSanPham();
        }
    }

    void fillToTableLoaiSP() {
        DefaultTableModel tbl = (DefaultTableModel) tblLoaiSP.getModel();
        tbl.setRowCount(0);
        String keyWord = txtTimLoaiSP.getText();
        int i = 1;
        for (LoaiSP lsp : lspDAO.selectAll()) {
            Object row[] = {i, lsp.getMaLoai(), lsp.getTenLoai(), dmDAO.selectById(lsp.getMaDM()).getTenDM()};
            tbl.addRow(row);
            i++;
        }
    }

    void fillToTableDanhMuc() {
        DefaultTableModel tbl = (DefaultTableModel) tblDanhMuc.getModel();
        tbl.setRowCount(0);
        String keyWord = txtTimDM.getText();
        int i = 1;
        for (DanhMuc dm : dmDAO.selectAll()) {
            Object row[] = {i, dm.getMaDM(), dm.getTenDM()};
            tbl.addRow(row);
            i++;
        }
    }

    void openTTSP() {
        new ThongTinSP().setVisible(true);
    }

    private void openEditTTSP() {
        SanPham sp = spDAO.selectById(maSP);
        if (sp == null) {
            return;
        }
        ThongTinSP ttsp = new ThongTinSP();
        ttsp.setModel(sp);
        ttsp.setVisible(true);

    }

    void openTTLSP() {
        new ThongTinLoaiSP(maLoai).setVisible(true);
    }

    void openTTDM() {
        new ThongTinDM(maDanhMuc).setVisible(true);
    }

    void xoaSP() {
        if (!getClick(tblSanPham)) {
            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm!");
            return;
        }
        if (!kiemTraLienKetSP()) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm " + maSP + " còn đang hoạt động!\n Không thể xóa!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa sản phẩm " + maSP + " ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == 1) {
            return;
        }

        spDAO.delete(maSP);
        JOptionPane.showMessageDialog(this, "Xóa thành công!");
        fillToTableSanPham();
    }

    void xoaDM() {
        if (!getClick(tblDanhMuc)) {
            JOptionPane.showMessageDialog(this, "Chưa chọn danh mục!");
            return;
        }
        if (!kiemTraLienKetDM()) {
            JOptionPane.showMessageDialog(this, "Mã danh mục " + maDanhMuc + " có liên kết dữ liệu!\n Không thể xóa!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa danh mục " + maDanhMuc + " ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == 1) {
            return;
        }

        dmDAO.delete(maDanhMuc);
        JOptionPane.showMessageDialog(this, "Xóa thành công!");
        fillToTableDanhMuc();
    }

    void xoaLoaiSP() {
        if (!getClick(tblLoaiSP)) {
            JOptionPane.showMessageDialog(this, "Chưa chọn loại sản phẩm!");
            return;
        }
        if (!kiemTraLienKetLSP()) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm " + maLoai + " có liên kết dữ liệu!\n Không thể xóa!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa loại sản phẩm " + maLoai + " ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            lspDAO.delete(maLoai);
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            fillToTableLoaiSP();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi liên kết dữ liệu!");
        }
    }

    boolean kiemTraLienKetSP() {
        HoaDonChiTietDao hdctDAO = new HoaDonChiTietDao();
        ComboCTDao cbctDAO = new ComboCTDao();
        for (HoaDonCT hdct : hdctDAO.selectAll()) {
            if (maSP.equals(hdct.getMaSP())) {
                return false;
            }
        }

        return true;
    }

    boolean kiemTraLienKetDM() {
        for (LoaiSP lsp : lspDAO.selectAll()) {
            if (maDanhMuc.equals(lsp.getMaDM())) {
                return false;
            }
        }
        return true;
    }

    boolean kiemTraLienKetLSP() {
        for (SanPham sp : spDAO.selectAll()) {
            if (maLoai.equals(sp.getMaLoai())) {
                return false;
            }
        }
        return true;
    }

    void updateDelButton() {
        btnXoaSP.setEnabled(getClick(tblSanPham));
        btnXoaLSP.setEnabled(getClick(tblLoaiSP));
        btnXoaDM.setEnabled(getClick(tblDanhMuc));
    }

    void filterDMLSP() {
        suport sp = new suport();
        DefaultTableModel tbl = (DefaultTableModel) tblLoaiSP.getModel();
        tbl.setRowCount(0);
        String keyWord = cboDanhMuc2.getSelectedItem().toString();
        int i = 1;
        for (LoaiSP lsp : sp.selectDMLSP(keyWord)) {
            Object row[] = {i, lsp.getMaLoai(), lsp.getTenLoai(), dmDAO.selectById(lsp.getMaDM()).getTenDM()};
            tbl.addRow(row);
            i++;
        }
    }

    void setStatusSP() {
        boolean first = pageNumber > 1;
        boolean last = pageNumber < sp.getPageNumber();
        btnPre.setEnabled(first);
        btnNext.setEnabled(last);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnThemSP = new com.boxcf.components.ButtonRound();
        btnXoaSP = new com.boxcf.components.ButtonRound();
        lblMaNV = new javax.swing.JLabel();
        txtTimSP = new javax.swing.JTextField();
        gradientPanel1 = new com.boxcf.components.GradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboDanhMuc1 = new com.boxcf.components.Combobox();
        cboLoaiSP = new com.boxcf.components.Combobox();
        scroll = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnNext = new com.boxcf.components.ButtonRound();
        btnPre = new com.boxcf.components.ButtonRound();
        btnTimLoaiSP1 = new com.boxcf.components.ButtonRound();
        cboSort = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLoaiSP = new javax.swing.JTable();
        lblMaNV2 = new javax.swing.JLabel();
        txtTimLoaiSP = new javax.swing.JTextField();
        btnTimLoaiSP = new com.boxcf.components.ButtonRound();
        gradientPanel2 = new com.boxcf.components.GradientPanel();
        jLabel4 = new javax.swing.JLabel();
        cboDanhMuc2 = new com.boxcf.components.Combobox();
        btnXoaLSP = new com.boxcf.components.ButtonRound();
        btnThemLSP = new com.boxcf.components.ButtonRound();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhMuc = new javax.swing.JTable();
        lblMaNV3 = new javax.swing.JLabel();
        txtTimDM = new javax.swing.JTextField();
        btnTimDM = new com.boxcf.components.ButtonRound();
        btnXoaDM = new com.boxcf.components.ButtonRound();
        btnThemDM = new com.boxcf.components.ButtonRound();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("UTM Aptima", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 90, 1000, 10));

        jTabbedPane1.setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThemSP.setBackground(new java.awt.Color(2, 172, 171));
        btnThemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSP.setText("THÊM");
        btnThemSP.setFocusable(false);
        btnThemSP.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });
        jPanel1.add(btnThemSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 96, 40));

        btnXoaSP.setBackground(new java.awt.Color(2, 172, 171));
        btnXoaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSP.setText("XÓA");
        btnXoaSP.setFocusable(false);
        btnXoaSP.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 96, 40));

        lblMaNV.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV.setText("Sản phẩm");
        jPanel1.add(lblMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 44, 86, -1));

        txtTimSP.setBackground(new java.awt.Color(255, 255, 255,0));
        txtTimSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimSP.setForeground(new java.awt.Color(51, 51, 51));
        txtTimSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtTimSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimSPActionPerformed(evt);
            }
        });
        txtTimSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimSPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimSPKeyTyped(evt);
            }
        });
        jPanel1.add(txtTimSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 590, 32));

        gradientPanel1.setColor1(new java.awt.Color(240, 240, 240));
        gradientPanel1.setColor2(new java.awt.Color(240, 240, 240));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Danh mục");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Loại");

        cboDanhMuc1.setFocusable(false);
        cboDanhMuc1.setFont(new java.awt.Font("UTM Aptima", 1, 14)); // NOI18N
        cboDanhMuc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDanhMuc1ActionPerformed(evt);
            }
        });

        cboLoaiSP.setFocusable(false);
        cboLoaiSP.setFont(new java.awt.Font("UTM Aptima", 1, 14)); // NOI18N
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(cboDanhMuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDanhMuc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel1.add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 720, 70));

        scroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblSanPham.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Giá", "Loại SP", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 980, 300));

        btnNext.setBackground(new java.awt.Color(2, 172, 171));
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText(">>");
        btnNext.setFocusable(false);
        btnNext.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 96, 40));

        btnPre.setBackground(new java.awt.Color(2, 172, 171));
        btnPre.setForeground(new java.awt.Color(255, 255, 255));
        btnPre.setText("<<");
        btnPre.setFocusable(false);
        btnPre.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });
        jPanel1.add(btnPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 96, 40));

        btnTimLoaiSP1.setBackground(new java.awt.Color(2, 172, 171));
        btnTimLoaiSP1.setForeground(new java.awt.Color(255, 255, 255));
        btnTimLoaiSP1.setText("Tìm kiếm");
        btnTimLoaiSP1.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnTimLoaiSP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimLoaiSP1MouseClicked(evt);
            }
        });
        btnTimLoaiSP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimLoaiSP1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTimLoaiSP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        cboSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));
        cboSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSortActionPerformed(evt);
            }
        });
        jPanel1.add(cboSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, -1, -1));

        jTabbedPane1.addTab("SẢN PHẨM", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLoaiSP.setFont(new java.awt.Font("UTM BryantLG", 0, 14)); // NOI18N
        tblLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã loại", "Tên loại", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblLoaiSP.setGridColor(new java.awt.Color(204, 204, 204));
        tblLoaiSP.setRowHeight(30);
        tblLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLoaiSPMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblLoaiSP);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 970, 300));

        lblMaNV2.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMaNV2.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV2.setText("Loại sản phẩm");
        jPanel2.add(lblMaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 44, 110, -1));

        txtTimLoaiSP.setBackground(new java.awt.Color(0, 153, 153,0));
        txtTimLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimLoaiSP.setForeground(new java.awt.Color(51, 51, 51));
        txtTimLoaiSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        txtTimLoaiSP.setFocusable(false);
        jPanel2.add(txtTimLoaiSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 520, 32));

        btnTimLoaiSP.setBackground(new java.awt.Color(2, 172, 171));
        btnTimLoaiSP.setForeground(new java.awt.Color(255, 255, 255));
        btnTimLoaiSP.setText("Tìm kiếm");
        btnTimLoaiSP.setFocusable(false);
        btnTimLoaiSP.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnTimLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimLoaiSPMouseClicked(evt);
            }
        });
        btnTimLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimLoaiSPActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimLoaiSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 31, -1, -1));

        gradientPanel2.setColor1(new java.awt.Color(240, 240, 240));
        gradientPanel2.setColor2(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Danh mục");

        cboDanhMuc2.setFocusable(false);
        cboDanhMuc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDanhMuc2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboDanhMuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDanhMuc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel2.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 350, 80));

        btnXoaLSP.setBackground(new java.awt.Color(2, 172, 171));
        btnXoaLSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLSP.setText("XÓA");
        btnXoaLSP.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnXoaLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLSPActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoaLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 96, 40));

        btnThemLSP.setBackground(new java.awt.Color(2, 172, 171));
        btnThemLSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemLSP.setText("THÊM");
        btnThemLSP.setFocusable(false);
        btnThemLSP.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnThemLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLSPActionPerformed(evt);
            }
        });
        jPanel2.add(btnThemLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 96, 40));

        jTabbedPane1.addTab("LOẠI SP", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDanhMuc.setFont(new java.awt.Font("UTM BryantLG", 0, 14)); // NOI18N
        tblDanhMuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã DM", "Tên DM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhMuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDanhMuc.setGridColor(new java.awt.Color(204, 204, 204));
        tblDanhMuc.setRowHeight(30);
        tblDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhMucMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblDanhMuc);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 970, 340));

        lblMaNV3.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMaNV3.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV3.setText("Danh mục");
        jPanel3.add(lblMaNV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 44, 80, -1));

        txtTimDM.setBackground(new java.awt.Color(0, 153, 153,0));
        txtTimDM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimDM.setForeground(new java.awt.Color(51, 51, 51));
        txtTimDM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        jPanel3.add(txtTimDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 520, 32));

        btnTimDM.setBackground(new java.awt.Color(2, 172, 171));
        btnTimDM.setForeground(new java.awt.Color(255, 255, 255));
        btnTimDM.setText("Tìm kiếm");
        btnTimDM.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnTimDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimDMMouseClicked(evt);
            }
        });
        btnTimDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimDMActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 31, -1, -1));

        btnXoaDM.setBackground(new java.awt.Color(2, 172, 171));
        btnXoaDM.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaDM.setText("XÓA");
        btnXoaDM.setFocusable(false);
        btnXoaDM.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnXoaDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDMActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoaDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 96, 40));

        btnThemDM.setBackground(new java.awt.Color(2, 172, 171));
        btnThemDM.setForeground(new java.awt.Color(255, 255, 255));
        btnThemDM.setText("THÊM");
        btnThemDM.setFocusable(false);
        btnThemDM.setFont(new java.awt.Font("UTM BryantLG", 1, 16)); // NOI18N
        btnThemDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDMActionPerformed(evt);
            }
        });
        jPanel3.add(btnThemDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 96, 40));

        jTabbedPane1.addTab("DANH MỤC SP", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 102, 1010, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        if (!Auth.accept(this)) {
            return;
        }
        maSP = null;
        openTTSP();
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        if (!Auth.accept(this)) {
            return;
        }
        xoaSP();
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnXoaDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDMActionPerformed
        if (!Auth.accept(this)) {
            return;
        }
        xoaDM();
    }//GEN-LAST:event_btnXoaDMActionPerformed

    private void btnXoaLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLSPActionPerformed
        if (!Auth.accept(this)) {
            return;
        }
        xoaLoaiSP();
    }//GEN-LAST:event_btnXoaLSPActionPerformed

    private void btnThemLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLSPActionPerformed
        if (!Auth.accept(this)) {
            return;
        }
        maLoai = null;
        openTTLSP();
    }//GEN-LAST:event_btnThemLSPActionPerformed

    private void tblSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMousePressed

        updateDelButton();
        int index = tblSanPham.rowAtPoint(evt.getPoint());
        maSP = (String) tblSanPham.getValueAt(index, 1);
        if (evt.getClickCount() == 2) {
            if (!Auth.accept(this)) {
                return;
            }
            openEditTTSP();
        }
    }//GEN-LAST:event_tblSanPhamMousePressed

    private void tblLoaiSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSPMousePressed

        updateDelButton();
        int index = tblLoaiSP.rowAtPoint(evt.getPoint());
        maLoai = (String) tblLoaiSP.getValueAt(index, 1);
        if (evt.getClickCount() == 2) {
            if (!Auth.accept(this)) {
                return;
            }
            openTTLSP();
        }
    }//GEN-LAST:event_tblLoaiSPMousePressed

    private void tblDanhMucMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhMucMousePressed
        // TODO add your handling code here:
        updateDelButton();
        int index = tblDanhMuc.rowAtPoint(evt.getPoint());
        maDanhMuc = (String) tblDanhMuc.getValueAt(index, 1);
        if (evt.getClickCount() == 2) {
            if (!Auth.accept(this)) {
                return;
            }
            openTTDM();
        }
    }//GEN-LAST:event_tblDanhMucMousePressed

    private void btnTimLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimLoaiSPMouseClicked
        fillToTableLoaiSP();
    }//GEN-LAST:event_btnTimLoaiSPMouseClicked

    private void btnTimDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimDMMouseClicked
        fillToTableLoaiSP();
    }//GEN-LAST:event_btnTimDMMouseClicked

    private void cboDanhMuc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDanhMuc1ActionPerformed
        if (cboDanhMuc1.getItemCount() > 1) {
            fillCBBLoaiSP();
            filterDM();
        }
    }//GEN-LAST:event_cboDanhMuc1ActionPerformed

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        if (cboLoaiSP.getItemCount() > 1) {
            filterDM();
        }
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void btnTimLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimLoaiSPActionPerformed
        fillToTableLoaiSP();
    }//GEN-LAST:event_btnTimLoaiSPActionPerformed

    private void btnTimDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDMActionPerformed
        fillToTableDanhMuc();
    }//GEN-LAST:event_btnTimDMActionPerformed

    private void tblSanPhamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSanPhamKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tblSanPhamKeyPressed

    private void btnThemDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDMActionPerformed
        if (!Auth.accept(this)) {
            return;
        }
        maDanhMuc = null;
        openTTDM();
    }//GEN-LAST:event_btnThemDMActionPerformed

    private void cboDanhMuc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDanhMuc2ActionPerformed
        // TODO add your handling code here:
        if (cboDanhMuc2.getItemCount() > 1) {
            filterDMLSP();
        }
    }//GEN-LAST:event_cboDanhMuc2ActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        // TODO add your handling code here:    
        if (pageNumber == 1) {
            return;
        }
        pageNumber--;
        fillToTableSanPham();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:

        if (pageNumber >= sp.getPageNumber()) {
            return;
        }
        pageNumber++;
        fillToTableSanPham();
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtTimSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSPActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimSPActionPerformed

    private void txtTimSPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimSPKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimSPKeyTyped

    private void txtTimSPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimSPKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimSPKeyPressed

    private void btnTimLoaiSP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimLoaiSP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimLoaiSP1MouseClicked

    private void btnTimLoaiSP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimLoaiSP1ActionPerformed
        // TODO add your handling code here:
        cboLoaiSP.setSelectedIndex(0);
        cboDanhMuc1.setSelectedIndex(0);
        fillToTableSanPham();
    }//GEN-LAST:event_btnTimLoaiSP1ActionPerformed

    private void cboSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSortActionPerformed
        // TODO add your handling code here:
        fillToTableSanPham();
    }//GEN-LAST:event_cboSortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnNext;
    private com.boxcf.components.ButtonRound btnPre;
    private com.boxcf.components.ButtonRound btnThemDM;
    private com.boxcf.components.ButtonRound btnThemLSP;
    private com.boxcf.components.ButtonRound btnThemSP;
    private com.boxcf.components.ButtonRound btnTimDM;
    private com.boxcf.components.ButtonRound btnTimLoaiSP;
    private com.boxcf.components.ButtonRound btnTimLoaiSP1;
    private com.boxcf.components.ButtonRound btnXoaDM;
    private com.boxcf.components.ButtonRound btnXoaLSP;
    private com.boxcf.components.ButtonRound btnXoaSP;
    private com.boxcf.components.Combobox cboDanhMuc1;
    private com.boxcf.components.Combobox cboDanhMuc2;
    private com.boxcf.components.Combobox cboLoaiSP;
    private javax.swing.JComboBox<String> cboSort;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNV2;
    private javax.swing.JLabel lblMaNV3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblDanhMuc;
    private javax.swing.JTable tblLoaiSP;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTimDM;
    private javax.swing.JTextField txtTimLoaiSP;
    private javax.swing.JTextField txtTimSP;
    // End of variables declaration//GEN-END:variables

}

class suport {

    public static int quantity = 1;

    public List<LoaiSP> selectDMLSP(String keyWord) {
        String sql = "select * from LoaiSP lsp inner join DanhMuc dm on lsp.MaDM=dm.MaDM where TenDM=?;";
        return new LoaiSPDao().selectBySql(sql, keyWord);
    }

    public List<SanPham> panigation(Integer pageCurrent, String keyWord, int type, String TenLoai, String TenDM, String sort) {
        String sql = "";
        sort = sort.equals("Tăng dần") ? "ASC" : "DESC";
        switch (type) {
            case 0:
                sql = "SELECT TOP 8 * FROM SanPham WHERE MaSP NOT IN (SELECT TOP " + (pageCurrent * 8 - 8) + " MaSP FROM SanPham)";
                quantity = new SanPhamDao().selectBySql(sql).size();
                return new SanPhamDao().selectBySql(sql);
            case 1:
                sql = "SELECT TOP 8 * FROM SanPham WHERE MaSP NOT IN (SELECT TOP " + (pageCurrent * 8 - 8) + " MaSP FROM SanPham) and MaSP like ?";
                quantity = new SanPhamDao().selectBySql(sql, "%" + keyWord + "%").size();
                return new SanPhamDao().selectBySql(sql, "%" + keyWord + "%");
            case 2:
                sql = "SELECT TOP 8 * FROM SanPham WHERE MaSP NOT IN (SELECT TOP " + (pageCurrent * 8 - 8) + " MaSP FROM SanPham) and TenSP like ?";
                quantity = new SanPhamDao().selectBySql(sql, "%" + keyWord + "%").size();
                return new SanPhamDao().selectBySql(sql, "%" + keyWord + "%");
            case 3:
                sql = "SELECT TOP 8 sp.* FROM SanPham sp inner join LoaiSP lsp on sp.MaLoai=lsp.MaLoai where MaSP NOT IN (SELECT TOP " + (pageCurrent * 8 - 8) + " MaSP FROM SanPham) and MaSP like ? and lsp.TenLoai like ?;";
                quantity = new SanPhamDao().selectBySql(sql, "%" + keyWord + "%", "%" + TenLoai + "%").size();
                return new SanPhamDao().selectBySql(sql, "%" + keyWord + "%", "%" + TenLoai + "%");
            case 4:
                sql = "SELECT TOP 8 sp.* FROM SanPham sp inner join LoaiSP lsp on sp.MaLoai=lsp.MaLoai inner join DanhMuc dm on lsp.MaDM=dm.MaDM "
                        + "where MaSP NOT IN (SELECT TOP " + (pageCurrent * 8 - 8) + " MaSP FROM SanPham sp2 join LoaiSP lsp2 on sp2.MaLoai=lsp2.MaLoai join danhmuc dm2 on dm2.MaDM=lsp2.MaDM where (sp2.MaSP like ? or sp2.TenSP like ?) and lsp2.MaLoai like ? and dm2.TenDM like ?)"
                        + "and (sp.MaSP like ? or sp.TenSP like ?) and lsp.TenLoai like ? and dm.TenDM like ? order by sp.Gia " + sort;
                quantity = new SanPhamDao().selectBySql(sql, "%" + keyWord + "%", "%" + keyWord + "%", "%" + TenLoai + "%", "%" + TenDM + "%", "%" + keyWord + "%", "%" + keyWord + "%", "%" + TenLoai + "%", "%" + TenDM + "%").size();
                return new SanPhamDao().selectBySql(sql, "%" + keyWord + "%", "%" + keyWord + "%", "%" + TenLoai + "%", "%" + TenDM + "%", "%" + keyWord + "%", "%" + keyWord + "%", "%" + TenLoai + "%", "%" + TenDM + "%");
            default:
                return null;
        }
    }

    public List<LoaiSP> getLSPFromDM(String tenDM) {
        String sql = "Select lsp.* from LoaiSP lsp inner join DanhMuc dm on lsp.MaDM = dm.MaDM where dm.TenDM like ?;";
        return new LoaiSPDao().selectBySql(sql, "%" + tenDM + "%");
    }

    public DanhMuc DMFromLSP(String tenLoai) {
        String sql = "Select dm.* from LoaiSP lsp inner join DanhMuc dm on lsp.MaDM = dm.MaDM where lsp.TenLoai like ?;";
        DanhMuc dm = new DanhMuc();
        try {
            ResultSet responce = JdbcHelper.query(sql, "%" + tenLoai + "%");
            // admission a ResultSet return a Box
            if (responce.next()) {
                dm = new DanhMucDao().createObjecet(responce);
            }
        } catch (Exception e) {
        }
        return dm;
    }

    int getPageNumber() {
        return (int) Math.ceil(quantity / 8) + 1;
    }
}
