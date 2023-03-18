/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

import java.util.Date;

/**
 *
 * @author ji
 */
public class DatBox {

    int MaDat;
    String TenKH;
    Date GioBD;
    Date GioKT;
    String TrangThai;
    int soLuong;
    int MaBox;

    public DatBox() {
    }

    public DatBox(int MaDat, String TenKH, Date GioBD, Date GioKT, String TrangThai, int soLuong, int MaBox) {
        this.MaDat = MaDat;
        this.TenKH = TenKH;
        this.GioBD = GioBD;
        this.GioKT = GioKT;
        this.TrangThai = TrangThai;
        this.soLuong = soLuong;
        this.MaBox = MaBox;
    }
    
    public DatBox(int MaDat, String TenKH, String TrangThai, int soLuong, int MaBox) {
        this.MaDat = MaDat;
        this.TenKH = TenKH;
//        this.GioBD = GioBD;
//        this.GioKT = GioKT;
        this.TrangThai = TrangThai;
        this.soLuong = soLuong;
        this.MaBox = MaBox;
    }


    public int getMaDat() {
        return MaDat;
    }

    public void setMaDat(int MaDat) {
        this.MaDat = MaDat;
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

    public Date getGioKT() {
        return GioKT;
    }

    public void setGioKT(Date GioKT) {
        this.GioKT = GioKT;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getMaBox() {
        return MaBox;
    }

    public void setMaBox(int MaBox) {
        this.MaBox = MaBox;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
