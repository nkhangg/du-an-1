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
public class HoaDon {

    int MaHD;
    Date NgayTao;
    String TenKH;
    String MaNV;
    String GhiChu;
    long TONGTIEN;
    String MaKM;
    boolean DaXoa;

    public HoaDon() {
    }

    public HoaDon(int MaHD, Date NgayTao, String TenKH, String MaNV, String GhiChu, long TONGTIEN,String MaKM, boolean DaXoa) {
        this.MaHD = MaHD;
        this.NgayTao = NgayTao;
        this.TenKH = TenKH;
        this.MaNV = MaNV;
        this.GhiChu = GhiChu;
        this.TONGTIEN = TONGTIEN;
        this.MaKM = MaKM;
        this.DaXoa = DaXoa;
    }

    public HoaDon( Date NgayTao, String TenKH, String MaNV, String GhiChu, long TONGTIEN,String MaKM, boolean DaXoa) {
        this.NgayTao = NgayTao;
        this.TenKH = TenKH;
        this.MaNV = MaNV;
        this.GhiChu = GhiChu;
        this.TONGTIEN = TONGTIEN;
        this.MaKM = MaKM;
        this.DaXoa = DaXoa;
    }

    

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public String getMaKM() {
        return GhiChu;
    }

    public void setDaXoa(Boolean DaXoa) {
        this.DaXoa = DaXoa;
    }

    public Boolean getDaXoa() {
        return DaXoa;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    

    public long getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(long TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

}
