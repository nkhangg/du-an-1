package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.DatBox;
import com.box.utils.JdbcHelper;
import com.box.utils.XDate;
import com.boxcf.constands.BoxState;
import com.boxcf.models.ModelItem;
import java.sql.Timestamp;

public class DatBoxDao implements BoxCfDAO<DatBox, Integer> {

    public static DatBoxDao getInstant() {
        return new DatBoxDao();
    }

    @Override
    public DatBox createObjecet(ResultSet responce) {
        try {
            return new DatBox(
                    responce.getInt(1),
                    responce.getString(2),
                    responce.getDate(3),
                    responce.getTimestamp(4),
                    responce.getString(5),
                    responce.getInt(6)
            );

        } catch (Exception e) {
            System.out.println(e);
            throw new Error("The Error in createObjecet DATBOX !");
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete DATBOX where MaDat = ?";

        try {
            int responce = JdbcHelper.update(sql, id);

            if (responce == 0) {
                throw new Error("The Error in delete DATBOX !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete DATBOX !");
        }

    }

    @Override
    public void insert(DatBox e) {
        String sql = "Insert into DATBOX values ( ?, ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql, e.getTenKH(), e.getGioBD(), e.getGioKT(), e.getTrangThai(), e.getMaBox());

            if (responce == 0) {
                throw new Error("The Error in insert DATBOX !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert DATBOX !");
        }

    }

    public void insertProc(ModelItem e, String nameCutomer) {
        String sql = "{ call sp_DatBox ( ?, ?, ?, ?, ? ) }";

        try {
            int responce = JdbcHelper.update(sql, nameCutomer, e.getGioBD(), e.getGioKT(), "isActive", e.getMaItem());

            if (responce == 0) {
                throw new Error("The Error in insertProc DATBOX !");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Error("The Error in insertProc DATBOX !");
        }
    }

    public void updateProc(ModelItem e, String state) {
        String sql = "{ call sp_update_DatBox ( ?, ?, ?) }";

        try {
            int responce = JdbcHelper.update(sql, state, e.getGioKT(), e.getMaItem());

            if (responce == 0) {
                throw new Error("The Error in updateProc DATBOX !");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Error("The Error in updateProc DATBOX !");
        }
    }

    @Override
    public List<DatBox> selectAll() {
        List<DatBox> list = new ArrayList<>();
        String sql = "select * from DATBOX";

        try {
            ResultSet responce = JdbcHelper.query(sql);

            while (responce.next()) {
                list.add(createObjecet(responce));
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectAll DATBOX !");
        }
        return list;
    }

    @Override
    public DatBox selectById(Integer id) {
        String sql = "select * from DATBOX where MaDat = ?";
        DatBox db = null;
        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if (responce.next()) {
                db = createObjecet(responce);
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectById DATBOX !");
        }
        return db;
    }

    public DatBox selectByBox(Integer id) {
        String sql = "select * from DATBOX where MaBox = ? and TrangThai = 'isActive'";
        DatBox db = null;

        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if (responce.next()) {
                db = createObjecet(responce);
            }

            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectByBox DATBOX !");
        }
        return db;
    }

    public DatBox selectByIdBox(Integer idBox) {
        String sql = "select * from DATBOX where MaBox = ? and TrangThai = 'isActive'";
        DatBox db = null;

        try {

            ResultSet responce = JdbcHelper.query(sql, idBox);

            // admission a ResultSet return a Box
            if (responce.next()) {
                db = createObjecet(responce);
            }

            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectByBox DATBOX !");
        }
        return db;
    }

    @Override
    public List<DatBox> selectBySql(String sql, Object... args) {
        List<DatBox> list = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);

            while (responce.next()) {
                list.add(createObjecet(responce));
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectBySql DATBOX !");
        }
        return list;
    }

    @Override
    public void update(DatBox e) {
        String sql = "update DATBOX set TenKH = ?, GioBD = ?, GioKT = ?, TrangThai = ?, MaBox = ? where MaDat = ?";

        try {
            int responce = JdbcHelper.update(sql, e.getTenKH(), e.getGioBD(), e.getGioKT(), e.getTrangThai(), e.getMaDat());

            if (responce == 0) {
                throw new Error("The Error in update DATBOX !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update DATBOX !");
        }

    }

    public static void main(String[] args) {
//        System.out.println(DatBoxDao.getInstant().isActiveBox());
    }

}
