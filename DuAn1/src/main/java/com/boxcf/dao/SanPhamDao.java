package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.SanPham;
import com.box.utils.JdbcHelper;

public class SanPhamDao implements BoxCfDAO<SanPham, Integer> {

    public static SanPhamDao getInstant() {
        return new SanPhamDao();
    }

    @Override
    public SanPham createObjecet(ResultSet responce) {
        try {
            return new SanPham(
                    responce.getInt(1),
                    responce.getString(2),
                    responce.getLong(3),
                    responce.getString(4),
                    responce.getString(5),
                    responce.getString(6)
            );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet SanPham !");
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete SanPham where MaSP = ?";

        try {
            int responce = JdbcHelper.update(sql, id);

            if (responce == 0) {
                throw new Error("The Error in delete SanPham !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete SanPham !");
        }

    }

    @Override
    public void insert(SanPham e) {
        String sql = "Insert into SanPham values ( ?, ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql, e.getTenSP(), e.getGia(), e.getHinhAnh(), e.getMoTa(), e.getMaLoai());

            if (responce == 0) {
                throw new Error("The Error in insert SanPham !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert SanPham !");
        }
    }

    @Override
    public List<SanPham> selectAll() {
        List<SanPham> list = new ArrayList<>();
        String sql = "select * from SanPham";

        try {
            ResultSet responce = JdbcHelper.query(sql);

            while (responce.next()) {
                list.add(createObjecet(responce));
            }

            responce.getStatement().getConnection().close();

        } catch (Exception e) {
            throw new Error("The Error in selectAll SanPham !");
        }
        return list;
    }

    @Override
    public SanPham selectById(Integer id) {
        String sql = "select * from SanPham where MaSp = ?";
        SanPham sanPham = null;
        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if (responce.next()) {
                sanPham = createObjecet(responce);
            }

            responce.getStatement().getConnection().close();

        } catch (Exception e) {
            throw new Error("The Error in selectById SanPham !");
        }
        return sanPham;
    }

    @Override
    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);

            while (responce.next()) {
                list.add(createObjecet(responce));
            }

            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectBySql SanPham !");
        }
        return list;
    }

    @Override
    public void update(SanPham e) {
        String sql = "update SanPham set TenSP = ?, Gia = ?, HinhAnh = ?, MoTa = ?, MaLoai = ? where MaSP = ?";

        try {
            int responce = JdbcHelper.update(sql, e.getTenSP(), e.getGia(), e.getHinhAnh(), e.getMoTa(), e.getMaLoai(), e.getMaSP());

            if (responce == 0) {
                throw new Error("The Error in update SanPham !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update SanPham !");
        }

    }

}
