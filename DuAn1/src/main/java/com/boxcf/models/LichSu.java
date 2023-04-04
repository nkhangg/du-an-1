/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

import java.util.Date;

/**
 *
 * @author PC
 */
public class LichSu extends HoaDon {

    private String TenNV;
    private String TenSP;
    private long ThanhTien;
    private int Soluong;
    private String KhuyenMai;

    public LichSu(int MaHD, Date NgayTao, String TenKH, String TenNV, String TenSP, int Soluong, long ThanhTien, long TONGTIEN, String KhuyenMai) {
        super(MaHD, NgayTao, TenKH, TONGTIEN);
        this.TenNV = TenNV;
        this.TenSP = TenSP;
        this.Soluong = Soluong;
        this.ThanhTien = ThanhTien;
        this.KhuyenMai = KhuyenMai;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public long getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(long ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public String getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(String KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
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

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public long getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(long TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    @Override
    public String toString() {
        return "LichSu{" + "TenNV=" + TenNV + ", TenSP=" + TenSP + ", ThanhTien=" + ThanhTien + ", Soluong=" + Soluong + ", KhuyenMai=" + KhuyenMai + '}';
    }

}
