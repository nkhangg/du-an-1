/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.dao;

import com.boxcf.models.Box;
import com.box.utils.JdbcHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class BoxDao implements BoxCfDAO<Box, Integer>{

    public static BoxDao getInstant () {
        return new BoxDao();
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete Box where MaBox = ?";
        
        try {
            int response = JdbcHelper.update(sql, id);

            if(response == 0){
                throw new Error("The Error in delete Box !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete Box !");
        }
    }

    @Override
    public void insert(Box e) {
        String sql = "Insert into Box values ( ?, ?, ?, ?)";

        try {
            int response = JdbcHelper.update(sql, e.getTenBox(), e.getHinhAnh(), e.getTrangThai(), e.getMaLoaiBox());

            if(response == 0){
                throw new Error("The Error in insert Box !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert Box !");
        }
        
    }

    @Override
    public List<Box> selectAll() {
        List<Box> list  = new ArrayList<>();
        String sql = "select * from Box";

        try {
            ResultSet response = JdbcHelper.query(sql);


            while(response.next()){
                list.add(createObjecet(response));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectAll Box !");
        }
        return list;
    }

    @Override
    public Box selectById(Integer id) {
        String sql = "select * from Box where MaBox = ?";

        try {

            ResultSet response = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if(response.next()){
                return createObjecet(response);
            }

        } catch (Exception e) {
            throw new Error("The Error in selectById Box !");
        }
        return null;
    }

    @Override
    public List<Box> selectBySql(String sql, Object... args) {
        List<Box> list  = new ArrayList<>();

        try {
            ResultSet response = JdbcHelper.query(sql, args);

            while(response.next()){
                list.add(createObjecet(response));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectBySql Box !");
        }
        return list;
    }

    @Override
    public void update(Box e) {
        String sql = "update Box set TenBox = ? , HinhAnh = ?, TrangThai = ?, MaLoaiBox = ? where MaBox = ?";

        try {
            int response = JdbcHelper.update(sql, e.getTenBox(), e.getHinhAnh(), e.getTrangThai(), e.getMaLoaiBox(), e.getMaBox());

            if(response == 0){
                throw new Error("The Error in update Box !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update Box !");
        }
        
    }

    @Override
    public Box createObjecet(ResultSet response){

        try {
            return new Box(
                response.getInt(1), 
                response.getString(2), 
                response.getString(3), 
                response.getString(4), 
                response.getString(5)
                );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet Box !");
        }

    }

    public static void main(String[] args) {
        BoxDao.getInstant().delete(null);
    }


}
