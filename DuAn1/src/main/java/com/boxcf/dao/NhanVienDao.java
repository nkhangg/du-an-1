package com.boxcf.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.boxcf.models.NhanVien;
import com.box.utils.JdbcHelper;

public class NhanVienDao implements BoxCfDAO<NhanVien, String>{

    public static NhanVienDao getInstant () {
        return new NhanVienDao();
    }


    @Override
    public NhanVien createObjecet(ResultSet responce) {
        try {
            return new NhanVien(
                    responce.getString(1), 
                    responce.getString(2),
                    responce.getDate(3),
                    responce.getString(4),
                    responce.getString(5),
                    responce.getString(6),
                    responce.getString(7),
                    responce.getDate(8),
                    responce.getString(9)
                );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet NhanVien !");
        }
    }

    @Override
    public void delete(String id) {
        String sql = "delete NhanVien where MaNV = ?";
        
        try {
            int responce = JdbcHelper.update(sql, id);

            if(responce == 0){
                throw new Error("The Error in delete NhanVien !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete NhanVien !");
        }
        
    }

    @Override
    public void insert(NhanVien e) {
        String sql = "Insert into NhanVien values ( ?, ?, ?, ?, ?, ?, ?)";

        try {
            int responce = JdbcHelper.update(sql, e.getMaNV(), e.getTenNV(), e.getNgaySinh(), e.getSDT(), e.getDiaChi(), e.getMatKhau(), e.getHinhAnh(), e.getNgayVaoLam(), e.getVaiTro());

            if(responce == 0){
                throw new Error("The Error in insert NhanVien !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert NhanVien !");
        }
        
    }

    @Override
    public List<NhanVien> selectAll() {
        List<NhanVien> list  = new ArrayList<>();
        String sql = "select * from NhanVien";

        try {
            ResultSet responce = JdbcHelper.query(sql);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectAll NhanVien !");
        }
        return list;
    }

    @Override
    public NhanVien selectById(String id) {
        String sql = "select * from NhanVien where MaNV = ?";

        try {

            ResultSet responce = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box
            if(responce.next()){
                return createObjecet(responce);
            }


        } catch (Exception e) {
            throw new Error("The Error in selectById NhanVien !");
        }
        return null;
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list  = new ArrayList<>();

        try {
            ResultSet responce = JdbcHelper.query(sql, args);


            while(responce.next()){
                list.add(createObjecet(responce));
            }
            


        } catch (Exception e) {
            throw new Error("The Error in selectBySql NhanVien !");
        }
        return list;
    }

    @Override
    public void update(NhanVien e) {
        String sql = "update NhanVien set TenNV = ?, NgaySinh = ?, SDT = ?, DiaChi = ?, MatKhau = ?, HinhAnh = ? , NgayVaoLam = ?, VaiTro = ? where MaNV = ?";

        try {
            int responce = JdbcHelper.update(sql, e.getTenNV(), e.getNgaySinh(), e.getSDT(), e.getDiaChi(), e.getMatKhau(), e.getHinhAnh(), e.getNgayVaoLam(), e.getVaiTro(), e.getMaNV());

            if(responce == 0){
                throw new Error("The Error in update NhanVien !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update NhanVien !");
        }
    }
    
}
