package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.KhuyenMai;
import com.box.utils.JdbcHelper;

public class KhuyenMaiDao implements BoxCfDAO<KhuyenMai, String> {


    public static KhuyenMaiDao getInstant () {
        return new KhuyenMaiDao();
    }


    @Override
    public KhuyenMai createObjecet(ResultSet responce) {
        try {
            return new KhuyenMai(
                    responce.getString(1), 
                    responce.getString(2),
                    responce.getDate(3),
                    responce.getDate(4),
                    responce.getInt(5),
                    responce.getInt(6),
                    responce.getLong(7)
                );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet KhuyenMai !");
        }
    }

    @Override
    public void delete(String id) {
        String sql = "delete KhuyenMai where MaKM = ?";
        
        try {
            int responce = JdbcHelper.update(sql, id);

            if(responce == 0){
                throw new Error("The Error in delete KhuyenMai !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete KhuyenMai !");
        }
        
    }

    @Override
    public void insert(KhuyenMai e) {
        String sql = "Insert into KhuyenMai values ( ?, ?, ?, ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql, e.getMaKM(), e.getTenKM(), e.getNgayBD(), e.getNgayKT(), e.getSoLuot(), e.getPhanTram(), e.getDieuKienGiam());

            if(responce == 0){
                throw new Error("The Error in insert KhuyenMai !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert KhuyenMai !");
        }
        
    }

    @Override
    public List<KhuyenMai> selectAll() {
        List<KhuyenMai> list  = new ArrayList<>();
        String sql = "select * from KhuyenMai";

        try {
            ResultSet responce = JdbcHelper.query(sql);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectAll KhuyenMai !");
        }
        return list;
    }

    @Override
    public KhuyenMai selectById(String id) {
        String sql = "select * from KhuyenMai where MaKM = ?";

        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if(responce.next()){
                return createObjecet(responce);
            }


        } catch (Exception e) {
            throw new Error("The Error in selectById KhuyenMai !");
        }
        return null;
    }

    @Override
    public List<KhuyenMai> selectBySql(String sql, Object... args) {
        List<KhuyenMai> list  = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectBySql KhuyenMai !");
        }
        return list;
    }

    @Override
    public void update(KhuyenMai e) {
        String sql = "update KhuyenMai set TenKM = ?, NgayBD = ?, NgayKT = ?, SoLuot = ? , PhanTram = ?, DieuKienGiam = ? where MaKM = ?";

        try {
            int responce = JdbcHelper.update(sql, e.getTenKM(), e.getNgayBD(), e.getNgayKT(), e.getSoLuot(), e.getPhanTram(), e.getDieuKienGiam(), e.getMaKM());

            if(responce == 0){
                throw new Error("The Error in update KhuyenMai !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update KhuyenMai !");
        }
        
    }
    
}
