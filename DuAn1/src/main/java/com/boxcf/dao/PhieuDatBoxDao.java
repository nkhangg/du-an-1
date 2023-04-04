package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.PhieuDatBox;
import com.box.utils.JdbcHelper;
import com.box.utils.XDate;
import com.boxcf.constands.BoxState;
import com.boxcf.models.ModelItem;
import com.boxcf.store.Store;
import java.sql.Timestamp;
import java.util.Date;

public class PhieuDatBoxDao implements BoxCfDAO<PhieuDatBox, Integer> {

    public static PhieuDatBoxDao getInstant() {
        return new PhieuDatBoxDao();
    }

    @Override
    public PhieuDatBox createObjecet(ResultSet responce) {
        try {
            return new PhieuDatBox(
                    responce.getInt(1),
                    responce.getString(2),
                    responce.getString(3),
                    responce.getDate(4),
                    responce.getTimestamp(5),
                    responce.getString(6),
                    responce.getInt(7)
            );

        } catch (Exception e) {
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
    public void insert(PhieuDatBox e) {
        String sql = "Insert into DATBOX values (?, ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql, e.getTenKH(), e.getGioBD(), e.getGioKT(), e.getTrangThai(), e.getMaBox());

            if (responce == 0) {
                throw new Error("The Error in insert DATBOX !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert DATBOX !");
        }

    }

    public void insertProc(int maHD, ModelItem e, String nameCutomer) {
        String sql = "{ call sp_DatBox ( ?, ?, ?, ?, ?, ?, ? ) }";

        try {
            int responce = JdbcHelper.update(sql, maHD, e.getMaItem(), nameCutomer, e.getGioBD(), e.getGioKT(), "active", e.getSoLuong() * e.getLoaiBox().getGiaLoai());

            if (responce == 0) {
                throw new Error("Them du lieu that bai!");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insertProc DATBOX !");
        }
    }

    public void updateProc(ModelItem e, String state, Date gioKTMoi) {
        String sql = "{ call sp_update_DatBox ( ?, ?, ?, ?) }";

        try {
            int responce = JdbcHelper.update(sql, state, e.getGioKT(), e.getMaItem(), gioKTMoi);

            if (responce == 0) {
                throw new Error("The Error in updateProc DATBOX !");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Error("The Error in updateProc DATBOX !");
        }
    }

    @Override
    public List<PhieuDatBox> selectAll() {
        List<PhieuDatBox> list = new ArrayList<>();
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
    public PhieuDatBox selectById(Integer id) {
        String sql = "select * from DATBOX where MaDat = ?";
        PhieuDatBox db = null;
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

    //----------------------------------------------------
    public PhieuDatBox selectByBox(String id) {
        String sql = "select * from PhieuDatBox where MaBox = ? and TrangThai = 'active'";
        PhieuDatBox db = null;

        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if (responce.next()) {
                db = createObjecet(responce);
                System.out.println(db);
            }

            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectByBox DATBOX !");
        }
        return db;
    }
    
    public PhieuDatBox selectByIdBox(String idBox) {
        String sql = "select * from PhieuDatBox where MaBox = ? and TrangThai = 'active'";
        PhieuDatBox db = null;

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
    public List<PhieuDatBox> selectBySql(String sql, Object... args) {
        List<PhieuDatBox> list = new ArrayList<>();

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
    public void update(PhieuDatBox e) {
//        String sql = "update DATBOX set TenKH = ?, GioBD = ?, GioKT = ?, TrangThai = ?, MaBox = ? where MaDat = ?";
//
//        try {
//            int responce = JdbcHelper.update(sql, e.getTenKH(), e.getGioBD(), e.getGioKT(), e.getTrangThai(), e.getMaDat());
//
//            if (responce == 0) {
//                throw new Error("The Error in update DATBOX !");
//            }
//        } catch (Exception ex) {
//            throw new Error("The Error in update DATBOX !");
//        }

    }
    
    
    //---------------------------dat box--------------------------
    
    //get trang thai tu mabox
    public String getTrangThai(String mabox) {
        String sql = "select top 1 trangthai\n"
                + "from box a\n"
                + "inner join PhieuDatBox b on b.mabox = a.mabox\n"
                + "where a.mabox = ? "
                + "order by GioKT desc";
        
//        Date gioKT = getGioKT(mabox);
//        if (gioKT != null && gioKT.getTime() < System.currentTimeMillis()) {
//            String updateSql = "update PhieuDatBox set trangthai = 'empty' where mabox = ?";
//            JdbcHelper.update(updateSql, mabox);
//        }

        return (JdbcHelper.value(sql, mabox) ==  null) ? "empty" : JdbcHelper.value(sql, mabox).toString();
    }
    
    public Date getGioKT(String maBox) {
        String sql = "select gioKT from PhieuDatBox where mabox = ?";
        
        return (Date)JdbcHelper.value(sql, maBox);
    }
    
    //huy box --> set trangthai = empty
    public void setEmpty(String maBox) {
        String sql = "update PhieuDatBox set trangthai = 'used' where mabox = ?";
        
        JdbcHelper.update(sql, maBox);
    }
    
    //get ra phieu dat box thong qua maBox
}
