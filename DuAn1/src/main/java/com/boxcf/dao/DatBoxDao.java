package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.DatBox;
import com.box.utils.JdbcHelper;

public class DatBoxDao implements BoxCfDAO<DatBox, Integer> {

    public static DatBoxDao getInstant () {
        return new DatBoxDao();
    }

    @Override
    public DatBox createObjecet(ResultSet responce) {
        try {
//            return new DatBox(
//                    responce.getInt(1), 
//                    responce.getString(2),
//                    responce.getDate(3),
//                    responce.getDate(4),
//                    responce.getString(5),
//                    responce.getInt(6)
//                );
            
            return new DatBox();
        } catch (Exception e) {
            throw new Error("The Error in createObjecet DATBOX !");
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete DATBOX where MaDat = ?";
        
        try {
            int responce = JdbcHelper.update(sql, id);

            if(responce == 0){
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

            if(responce == 0){
                throw new Error("The Error in insert DATBOX !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert DATBOX !");
        }
        
    }

    @Override
    public List<DatBox> selectAll() {
        List<DatBox> list  = new ArrayList<>();
        String sql = "select * from DATBOX";

        try {
            ResultSet responce = JdbcHelper.query(sql);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectAll DATBOX !");
        }
        return list;
    }

    @Override
    public DatBox selectById(Integer id) {
        String sql = "select * from DATBOX where MaDat = ?";

        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if(responce.next()){
                return createObjecet(responce);
            }


        } catch (Exception e) {
            throw new Error("The Error in selectById DATBOX !");
        }
        return null;
    }

    @Override
    public List<DatBox> selectBySql(String sql, Object... args) {
        List<DatBox> list  = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


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

            if(responce == 0){
                throw new Error("The Error in update DATBOX !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update DATBOX !");
        }
        
    }

}
