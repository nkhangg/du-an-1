/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

/**
 *
 * @author ji
 */
public class SanPham {

    String MaSP;
    String TenSP;
    long Gia;
    String HinhAnh;
    String MoTa;
    String MaLoai;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, long Gia, String HinhAnh, String MoTa, String MaLoai) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Gia = Gia;
        this.HinhAnh = HinhAnh;
        this.MoTa = MoTa;
        this.MaLoai = MaLoai;
    }

    public SanPham(String MaSP, String TenSP, long Gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Gia = Gia;
    }
    
    

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", Gia=" + Gia + ", HinhAnh=" + HinhAnh + ", MoTa=" + MoTa + ", MaLoai=" + MaLoai + '}';
    }

}
