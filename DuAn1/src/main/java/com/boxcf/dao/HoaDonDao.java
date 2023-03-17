package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.HoaDon;
import com.box.utils.JdbcHelper;

public class HoaDonDao implements BoxCfDAO<HoaDon, Integer>{

    public static HoaDonDao getInstant () {
        return new HoaDonDao();
    }

    @Override
    public HoaDon createObjecet(ResultSet responce) {
        try {
            return new HoaDon(
                    responce.getInt(1), 
                    responce.getDate(2),
                    responce.getString(3),
                    responce.getString(4),
                    responce.getString(5),
                    responce.getLong(6),
                    responce.getString(7),
                    responce.getBoolean(8)
                );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet HoaDon !");
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "update HoaDon set DaXoa = 1 where MaHD = ?";
        
        try {
            int responce = JdbcHelper.update(sql, id);

            if(responce == 0){
                throw new Error("The Error in delete HoaDon !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete HoaDon !");
        }
        
    }

    @Override
    public void insert(HoaDon e) {
        String sql = "Insert into HoaDon values ( ?, ?, ?, ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql, e.getNgayTao(), e.getTenKH(), e.getMaNV(), e.getGhiChu(), e.getTONGTIEN(), e.getMaKM(), 0);

            if(responce == 0){
                throw new Error("The Error in insert HoaDon !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert HoaDon !");
        }
        
    }

    @Override
    public List<HoaDon> selectAll() {
        List<HoaDon> list  = new ArrayList<>();
        String sql = "select * from HoaDon where DaXoa = 0";

        try {
            ResultSet responce = JdbcHelper.query(sql);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectAll HoaDon !");
        }
        return list;
    }

    @Override
    public HoaDon selectById(Integer id) {
        String sql = "select * from HoaDon where MaHD = ?";

        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if(responce.next()){
                return createObjecet(responce);
            }


        } catch (Exception e) {
            throw new Error("The Error in selectById HoaDon !");
        }
        return null;
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list  = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectBySql HoaDon !");
        }
        return list;
    }

    @Override
    public void update(HoaDon e) {
        String sql = "update HoaDon set DaXoa = 0 where MaHD = ?";

        try {
            int responce = JdbcHelper.update(sql, e.getMaHD());

            if(responce == 0){
                throw new Error("The Error in update HoaDon !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update HoaDon !");
        }
    }
    
}
