package com.boxcf.ui;

import com.box.utils.UI;
import com.boxcf.components.ScrollBar;
import com.boxcf.dao.DanhMucDao;
import com.boxcf.dao.LoaiSPDao;
import com.boxcf.dao.SanPhamDao;
import com.boxcf.models.DanhMuc;
import com.boxcf.models.LoaiSP;
import com.boxcf.models.SanPham;
import com.boxcf.store.Store;
import java.awt.Color;
import java.util.List;
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
        fillCBBLoaiSP();
        fillCBBDM();
        fillToTableSanPham();
        fillToTableDanhMuc();
        fillToTableLoaiSP();

        Store.spView = this;
    }

    private void prepareUI() {
        scroll.setVerticalScrollBar(new ScrollBar());
        UI.changeTransBG(new Color(0, 0, 0, 0), txtTimSP, txtTimLoaiSP, txtTimDM);
    }

    private void renderDataTable(List<SanPham> list) {
        DefaultTableModel tbl = (DefaultTableModel) tblSanPham.getModel();
        tbl.setRowCount(0);
        int i = 1;
        for (SanPham sp : list) {
            Object row[] = {i, sp.getMaSP(), sp.getTenSP(), sp.getGia(), lspDAO.selectById(sp.getMaLoai()).getTenLoai(), sp.getMoTa()};
            tbl.addRow(row);
            i++;
        }
    }

    void fillCBBLoaiSP() {
        cboLoaiSP.removeAllItems();
        cboLoaiSP.addItem("All");
        for (LoaiSP lsp : lspDAO.selectAll()) {
            cboLoaiSP.addItem(lsp.getTenLoai().toString());
        }
    }

    void fillCBBDM() {
        cboDanhMuc1.removeAllItems();
        cboDanhMuc1.addItem("All");
        for (DanhMuc dm : dmDAO.selectAll()) {
            cboDanhMuc1.addItem(dm.getTenDM().toString());
            cboDanhMuc2.addItem(dm.getTenDM().toString());
        }
    }

    public void fillToTableSanPham() {
        DefaultTableModel tbl = (DefaultTableModel) tblSanPham.getModel();
        tbl.setRowCount(0);
        String keyWord = txtTimSP.getText();
        int i = 1;
        for (SanPham sp : spDAO.selectByKeyWord(keyWord, cboTimTheoSP.getSelectedIndex())) {
            Object row[] = {i, sp.getMaSP(), sp.getTenSP(), sp.getGia(), lspDAO.selectById(sp.getMaLoai()).getTenLoai(), sp.getMoTa()};
            tbl.addRow(row);
            i++;
        }

//        for (SanPham sp : spDAO.selectAll()) {
//            Object row[] = {sp.getMaSP(), sp.getTenSP(), sp.getGia(), sp.getMaLoai(), sp.getMoTa()};
//            tbl.addRow(row);
//        }
    }

    void filterLoaiSP() {
        String tenLoai = (cboLoaiSP.getSelectedItem().toString());
        if (tenLoai.equals("All")) {
            renderDataTable(spDAO.selectAll());
            return;
        }
        renderDataTable(spDAO.selectByTenLoaiSP(tenLoai));
    }

    void filterDM() {
        String maDanhMuc = cboDanhMuc1.getSelectedItem().toString();
        if (maDanhMuc.equals("All")) {
            renderDataTable(spDAO.selectAll());
            return;
        }
        renderDataTable(spDAO.selectByTenDanhMuc(maDanhMuc));
    }

    void fillToTableLoaiSP() {
        DefaultTableModel tbl = (DefaultTableModel) tblLoaiSP.getModel();
        tbl.setRowCount(0);
        String keyWord = txtTimLoaiSP.getText();
        int i = 1;
        for (LoaiSP lsp : lspDAO.selectByKeyWord(keyWord, cboTimTheoLSP.getSelectedIndex())) {
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
        for (DanhMuc dm : dmDAO.selectByKeyWord(keyWord, cboTimTheoDM.getSelectedIndex())) {
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
        if (maLoai == null) {
            return;
        }
        new ThongTinLoaiSP(maLoai).setVisible(true);
    }

    void xoaSP() {
        if (!getClick(tblSanPham)) {
            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm!");
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

    void editw() {
        try {
            DanhMuc dm = dmDAO.selectById(maDanhMuc);
            setModel(dm);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void setModel(DanhMuc dm) {
        txtMaDM.setText("" + dm.getMaDM());
        txtTenDM.setText("" + dm.getTenDM());
    }

    DanhMuc getModel() {
        DanhMuc dm = new DanhMuc();
        dm.setMaDM(txtMaDM.getText());
        dm.setTenDM(txtTenDM.getText());
        return dm;
    }

    void insertDM() {
        if (!validateForm()) {
            return;
        }
        if (!checkTrungID()) {
            JOptionPane.showMessageDialog(this, "Mã danh mục đã tồn tại!");
            return;
        }
        try {
            dmDAO.insert(getModel());
            fillToTableDanhMuc();
            fillCBBDM();
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void updateDM() {
        if (!validateForm()) {
            return;
        }
        try {
            dmDAO.update(getModel());
            fillToTableDanhMuc();
            fillCBBDM();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    boolean validateForm() {
        StringBuilder sb = new StringBuilder();
        sb.append(txtMaDM.getText().isEmpty() ? "Mã danh mục không thể trống!" : "");
        sb.append(txtTenDM.getText().isEmpty() ? "\nTên danh mục không thể trống!" : "");
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return false;
        }
        return true;
    }

    boolean checkTrungID() {
        String maLoaiSP = txtMaDM.getText();
        for (DanhMuc dm : dmDAO.selectAll()) {
            if (maLoaiSP.equals(dm.getMaDM())) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new com.boxcf.components.ButtonRound();
        buttonRound1 = new com.boxcf.components.ButtonRound();
        lblMaNV = new javax.swing.JLabel();
        txtTimSP = new javax.swing.JTextField();
        btnTimSP = new com.boxcf.components.ButtonRound();
        gradientPanel1 = new com.boxcf.components.GradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboDanhMuc1 = new com.boxcf.components.Combobox();
        cboLoaiSP = new com.boxcf.components.Combobox();
        scroll = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        cboTimTheoSP = new javax.swing.JComboBox<>();
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
        cboTimTheoLSP = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhMuc = new javax.swing.JTable();
        lblMaNV3 = new javax.swing.JLabel();
        txtTimDM = new javax.swing.JTextField();
        btnTimDM = new com.boxcf.components.ButtonRound();
        gradientPanel3 = new com.boxcf.components.GradientPanel();
        txtMaDM = new com.boxcf.components.TextField();
        lblMaNV1 = new javax.swing.JLabel();
        lblMaNV4 = new javax.swing.JLabel();
        txtTenDM = new com.boxcf.components.TextField();
        btnThemSP = new com.boxcf.components.ButtonRound();
        btnSuaSP = new com.boxcf.components.ButtonRound();
        btnMoiSP = new com.boxcf.components.ButtonRound();
        btnXoaSP = new com.boxcf.components.ButtonRound();
        cboTimTheoDM = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("UTM Aptima", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 90, 1000, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(2, 172, 171));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("THÊM");
        btnAdd.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 96, 40));

        buttonRound1.setBackground(new java.awt.Color(2, 172, 171));
        buttonRound1.setForeground(new java.awt.Color(255, 255, 255));
        buttonRound1.setText("XÓA");
        buttonRound1.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 96, 40));

        lblMaNV.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV.setText("Sản phẩm");
        jPanel1.add(lblMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 44, 86, -1));

        txtTimSP.setBackground(new java.awt.Color(255, 255, 255,0));
        txtTimSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimSP.setForeground(new java.awt.Color(51, 51, 51));
        txtTimSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        jPanel1.add(txtTimSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 520, 32));

        btnTimSP.setBackground(new java.awt.Color(2, 172, 171));
        btnTimSP.setForeground(new java.awt.Color(255, 255, 255));
        btnTimSP.setText("Tìm kiếm");
        btnTimSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnTimSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSPActionPerformed(evt);
            }
        });
        jPanel1.add(btnTimSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 31, -1, -1));

        gradientPanel1.setColor1(new java.awt.Color(240, 240, 240));
        gradientPanel1.setColor2(new java.awt.Color(240, 240, 240));

        jLabel2.setText("Danh mục");

        jLabel3.setText("Loại");

        cboDanhMuc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDanhMuc1ActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
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
        ));
        tblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblSanPham.setGridColor(new java.awt.Color(204, 204, 204));
        tblSanPham.setRowHeight(30);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSanPhamMousePressed(evt);
            }
        });
        scroll.setViewportView(tblSanPham);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 930, 310));

        cboTimTheoSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo tên", "theo mã" }));
        jPanel1.add(cboTimTheoSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 120, 30));

        jTabbedPane1.addTab("SẢN PHẨM", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLoaiSP.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
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
        ));
        tblLoaiSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblLoaiSP.setGridColor(new java.awt.Color(204, 204, 204));
        tblLoaiSP.setRowHeight(30);
        tblLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLoaiSPMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblLoaiSP);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 970, 320));

        lblMaNV2.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaNV2.setForeground(new java.awt.Color(51, 51, 51));
        lblMaNV2.setText("Loại sản phẩm");
        jPanel2.add(lblMaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 44, 110, -1));

        txtTimLoaiSP.setBackground(new java.awt.Color(0, 153, 153,0));
        txtTimLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimLoaiSP.setForeground(new java.awt.Color(51, 51, 51));
        txtTimLoaiSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(2, 172, 171)));
        jPanel2.add(txtTimLoaiSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 520, 32));

        btnTimLoaiSP.setBackground(new java.awt.Color(2, 172, 171));
        btnTimLoaiSP.setForeground(new java.awt.Color(255, 255, 255));
        btnTimLoaiSP.setText("Tìm kiếm");
        btnTimLoaiSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
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

        jLabel4.setText("Danh mục");

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cboDanhMuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDanhMuc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 350, 70));

        btnXoaLSP.setBackground(new java.awt.Color(2, 172, 171));
        btnXoaLSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLSP.setText("XÓA");
        btnXoaLSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnXoaLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLSPActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoaLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 96, 40));

        btnThemLSP.setBackground(new java.awt.Color(2, 172, 171));
        btnThemLSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemLSP.setText("THÊM");
        btnThemLSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnThemLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLSPActionPerformed(evt);
            }
        });
        jPanel2.add(btnThemLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 96, 40));

        cboTimTheoLSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo tên", "theo mã" }));
        jPanel2.add(cboTimTheoLSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 120, 30));

        jTabbedPane1.addTab("LOẠI SP", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDanhMuc.setFont(new java.awt.Font("UTM BryantLG", 0, 12)); // NOI18N
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
        ));
        tblDanhMuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDanhMuc.setGridColor(new java.awt.Color(204, 204, 204));
        tblDanhMuc.setRowHeight(30);
        tblDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhMucMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblDanhMuc);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 640, 370));

        lblMaNV3.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        btnTimDM.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
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

        gradientPanel3.setColor1(new java.awt.Color(240, 240, 240));
        gradientPanel3.setColor2(new java.awt.Color(240, 240, 240));

        txtMaDM.setLabelText("");

        lblMaNV1.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV1.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV1.setText("Mã DM");

        lblMaNV4.setBackground(new java.awt.Color(102, 0, 204));
        lblMaNV4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblMaNV4.setForeground(new java.awt.Color(27, 51, 61));
        lblMaNV4.setText("Tên DM");

        txtTenDM.setLabelText("");

        btnThemSP.setBackground(new java.awt.Color(2, 172, 171));
        btnThemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSP.setText("THÊM");
        btnThemSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnSuaSP.setBackground(new java.awt.Color(2, 172, 171));
        btnSuaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaSP.setText("SỬA");
        btnSuaSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        btnMoiSP.setBackground(new java.awt.Color(2, 172, 171));
        btnMoiSP.setForeground(new java.awt.Color(255, 255, 255));
        btnMoiSP.setText("MỚI");
        btnMoiSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnMoiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiSPActionPerformed(evt);
            }
        });

        btnXoaSP.setBackground(new java.awt.Color(2, 172, 171));
        btnXoaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSP.setText("XÓA");
        btnXoaSP.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel3Layout = new javax.swing.GroupLayout(gradientPanel3);
        gradientPanel3.setLayout(gradientPanel3Layout);
        gradientPanel3Layout.setHorizontalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMaNV4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaDM, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(txtTenDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMoiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        gradientPanel3Layout.setVerticalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblMaNV1)
                .addGap(0, 0, 0)
                .addComponent(txtMaDM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMaNV4)
                .addGap(0, 0, 0)
                .addComponent(txtTenDM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel3.add(gradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 370));

        cboTimTheoDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo tên", "theo mã" }));
        jPanel3.add(cboTimTheoDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 120, 30));

        jTabbedPane1.addTab("DANH MỤC SP", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 102, 1010, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        openTTSP();
    }//GEN-LAST:event_btnAddActionPerformed

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        // TODO add your handling code here:
        xoaSP();
    }//GEN-LAST:event_buttonRound1ActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnMoiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoiSPActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        xoaDM();
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnXoaLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLSPActionPerformed

        xoaLoaiSP();
    }//GEN-LAST:event_btnXoaLSPActionPerformed

    private void btnThemLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLSPActionPerformed
        openTTLSP();
    }//GEN-LAST:event_btnThemLSPActionPerformed

    private void tblSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMousePressed

        int index = tblSanPham.rowAtPoint(evt.getPoint());
        maSP = (String) tblSanPham.getValueAt(index, 1);
        if (evt.getClickCount() == 2) {
            openEditTTSP();
        }
    }//GEN-LAST:event_tblSanPhamMousePressed

    private void tblLoaiSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSPMousePressed
        // TODO add your handling code here:
        int index = tblLoaiSP.rowAtPoint(evt.getPoint());
        maLoai = (String) tblLoaiSP.getValueAt(index, 1);
        if (evt.getClickCount() == 2) {
            openTTLSP();
        }
    }//GEN-LAST:event_tblLoaiSPMousePressed

    private void tblDanhMucMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhMucMousePressed
        // TODO add your handling code here:
        int index = tblDanhMuc.rowAtPoint(evt.getPoint());
        maDanhMuc = (String) tblDanhMuc.getValueAt(index, 1);
        editw();
    }//GEN-LAST:event_tblDanhMucMousePressed

    private void btnTimSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSPActionPerformed
        fillToTableSanPham();
    }//GEN-LAST:event_btnTimSPActionPerformed

    private void btnTimLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimLoaiSPMouseClicked
        fillToTableLoaiSP();
    }//GEN-LAST:event_btnTimLoaiSPMouseClicked

    private void btnTimDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimDMMouseClicked
        fillToTableLoaiSP();
    }//GEN-LAST:event_btnTimDMMouseClicked

    private void cboDanhMuc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDanhMuc1ActionPerformed
        if (cboDanhMuc1.getItemCount() > 0) {
            filterDM();
        }
    }//GEN-LAST:event_cboDanhMuc1ActionPerformed

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        if (cboLoaiSP.getItemCount() > 0) {
            filterLoaiSP();
        }
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void btnTimLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimLoaiSPActionPerformed
        fillToTableLoaiSP();
    }//GEN-LAST:event_btnTimLoaiSPActionPerformed

    private void btnTimDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDMActionPerformed
        fillToTableDanhMuc();
    }//GEN-LAST:event_btnTimDMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.boxcf.components.ButtonRound btnAdd;
    private com.boxcf.components.ButtonRound btnMoiSP;
    private com.boxcf.components.ButtonRound btnSuaSP;
    private com.boxcf.components.ButtonRound btnThemLSP;
    private com.boxcf.components.ButtonRound btnThemSP;
    private com.boxcf.components.ButtonRound btnTimDM;
    private com.boxcf.components.ButtonRound btnTimLoaiSP;
    private com.boxcf.components.ButtonRound btnTimSP;
    private com.boxcf.components.ButtonRound btnXoaLSP;
    private com.boxcf.components.ButtonRound btnXoaSP;
    private com.boxcf.components.ButtonRound buttonRound1;
    private com.boxcf.components.Combobox cboDanhMuc1;
    private com.boxcf.components.Combobox cboDanhMuc2;
    private com.boxcf.components.Combobox cboLoaiSP;
    private javax.swing.JComboBox<String> cboTimTheoDM;
    private javax.swing.JComboBox<String> cboTimTheoLSP;
    private javax.swing.JComboBox<String> cboTimTheoSP;
    private com.boxcf.components.GradientPanel gradientPanel1;
    private com.boxcf.components.GradientPanel gradientPanel2;
    private com.boxcf.components.GradientPanel gradientPanel3;
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
    private javax.swing.JLabel lblMaNV1;
    private javax.swing.JLabel lblMaNV2;
    private javax.swing.JLabel lblMaNV3;
    private javax.swing.JLabel lblMaNV4;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tblDanhMuc;
    private javax.swing.JTable tblLoaiSP;
    private javax.swing.JTable tblSanPham;
    private com.boxcf.components.TextField txtMaDM;
    private com.boxcf.components.TextField txtTenDM;
    private javax.swing.JTextField txtTimDM;
    private javax.swing.JTextField txtTimLoaiSP;
    private javax.swing.JTextField txtTimSP;
    // End of variables declaration//GEN-END:variables

}
