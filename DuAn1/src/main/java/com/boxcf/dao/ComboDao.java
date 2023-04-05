package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.Combo;
import com.box.utils.JdbcHelper;

public class ComboDao implements BoxCfDAO<Combo, String> {

    public static ComboDao getInstant() {
        return new ComboDao();
    }

    @Override
    public Combo createObjecet(ResultSet responce) {
        try {
            return new Combo(
                    responce.getString(1),
                    responce.getString(2),
                    responce.getLong(3),
                    responce.getString(4),
                    responce.getString(5),
                    responce.getInt(6)
            );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet Combo !");
        }

    }

    @Override
    public void delete(String id) {
        String sql = "delete Combo where MaCB = ?";

        try {
            int responce = JdbcHelper.update(sql, id);

            if (responce == 0) {
                throw new Error("The Error in delete Combo !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete Combo !");
        }

    }

    @Override
    public void insert(Combo e) {
        String sql = "Insert into Combo values ( ?, ?, ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql,
                    e.getMaCB(),
                    e.getTenCB(),
                    e.getGia(),
                    e.getMoTa(),
                    e.getMaLoaiBox(),
                    e.getSoLuong()
            );

            if (responce == 0) {
                throw new Error("The Error in insert Combo !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert Combo !");
        }

    }

    @Override
    public List<Combo> selectAll() {
        List<Combo> list = new ArrayList<>();
        String sql = "select * from Combo";

        try {
            ResultSet responce = JdbcHelper.query(sql);

            while (responce.next()) {
                list.add(createObjecet(responce));
            }

            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectAll Combo !");
        }
        return list;
    }

    @Override
    public Combo selectById(String id) {
        String sql = "select * from Combo where MaCB = ?";
        Combo c = null;
        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if (responce.next()) {
                c = createObjecet(responce);
            }

            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectById Combo !");
        }
        return c;
    }

    @Override
    public List<Combo> selectBySql(String sql, Object... args) {
        List<Combo> list = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);

            while (responce.next()) {
                list.add(createObjecet(responce));
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectBySql Combo !");
        }
        return list;
    }

    @Override
    public void update(Combo e) {
        String sql = "update Combo set TenCB = ?, Gia = ?, MoTa = ?, MaLoaiBox = ?, SoLuong = ? where MaCB = ?";

        try {
            int responce = JdbcHelper.update(sql, e.getTenCB(), e.getGia(), e.getMoTa(), e.getMaLoaiBox(), e.getSoLuong(), e.getMaCB());

            if (responce == 0) {
                throw new Error("The Error in update Combo !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update Combo !");
        }

    }

}
