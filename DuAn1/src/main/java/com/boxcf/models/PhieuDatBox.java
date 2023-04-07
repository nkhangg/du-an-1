/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

import com.boxcf.constands.BoxState;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author ji
 */
public class PhieuDatBox {
    
    int maHD;
    String maBox;
    String TenKH;
    Date GioBD;
    java.sql.Timestamp GioKT;
    String TrangThai;
    int thanhTien;

    public PhieuDatBox() {
    }

    public PhieuDatBox(int maHD, String maBox, String TenKH, Date GioBD, Timestamp GioKT, String TrangThai, int thanhTien) {
        this.maHD = maHD;
        this.maBox = maBox;
        this.TenKH = TenKH;
        this.GioBD = GioBD;
        this.GioKT = GioKT;
        this.TrangThai = TrangThai;
        this.thanhTien = thanhTien;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getMaBox() {
        return maBox;
    }

    public void setMaBox(String maBox) {
        this.maBox = maBox;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public Date getGioBD() {
        return GioBD;
    }

    public void setGioBD(Date GioBD) {
        this.GioBD = GioBD;
    }

    public Timestamp getGioKT() {
        return GioKT;
    }

    public void setGioKT(Timestamp GioKT) {
        this.GioKT = GioKT;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }


    @Override
    public String toString() {
        return "DatBox{" + ", TenKH=" + TenKH + ", GioBD=" + GioBD + ", GioKT=" + GioKT + ", TrangThai=" + TrangThai + ", MaBox=" + maBox + '}';
    }
    
}
