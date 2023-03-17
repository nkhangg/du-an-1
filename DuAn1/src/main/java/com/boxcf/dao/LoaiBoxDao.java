package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.LoaiBox;
import com.box.utils.JdbcHelper;

public class LoaiBoxDao implements BoxCfDAO<LoaiBox, String>{

    public static LoaiBoxDao getInstant () {
        return new LoaiBoxDao();
    }


    @Override
    public LoaiBox createObjecet(ResultSet responce) {
        try {
            return new LoaiBox(
                    responce.getString(1), 
                    responce.getString(2),
                    responce.getLong(3),
                    responce.getString(4)
                );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet LoaiBox !");
        }
    }

    @Override
    public void delete(String id) {
        String sql = "delete LoaiBox where MaLoaiBox = ?";
        
        try {
            int responce = JdbcHelper.update(sql, id);

            if(responce == 0){
                throw new Error("The Error in delete LoaiBox !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete LoaiBox !");
        }
        
    }

    @Override
    public void insert(LoaiBox e) {
        String sql = "Insert into LoaiBox values ( ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql, e.getMaLoaiBox(), e.getTenLoaiBox(), e.getGiaLoai(), e.getMoTa());

            if(responce == 0){
                throw new Error("The Error in insert LoaiBox !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert LoaiBox !");
        }
    }

    @Override
    public List<LoaiBox> selectAll() {
        List<LoaiBox> list  = new ArrayList<>();
        String sql = "select * from LoaiBox";

        try {
            ResultSet responce = JdbcHelper.query(sql);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectAll LoaiBox !");
        }
        return list;
    }

    @Override
    public LoaiBox selectById(String id) {
        String sql = "select * from LoaiBox where MaLoaiBox = ?";

        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if(responce.next()){
                return createObjecet(responce);
            }


        } catch (Exception e) {
            throw new Error("The Error in selectById LoaiBox !");
        }
        return null;
    }

    @Override
    public List<LoaiBox> selectBySql(String sql, Object... args) {
        List<LoaiBox> list  = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectBySql LoaiBox !");
        }
        return list;
    }

    @Override
    public void update(LoaiBox e) {
        String sql = "update LoaiBox set TenLoaiBox = ?, GiaLoai = ?, MoTa = ? where MaLoaiBox = ?";

        try {
            int responce = JdbcHelper.update(sql, e.getTenLoaiBox(), e.getGiaLoai(), e.getMoTa(), e.getMaLoaiBox());

            if(responce == 0){
                throw new Error("The Error in update LoaiBox !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update LoaiBox !");
        }
        
    }
    
}
