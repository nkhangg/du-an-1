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
public class NhanVien {

    String MaNV;
    String TenNV;
    Date NgaySinh;
    String SDT;
    String DiaChi;
    String MatKhau;
    String HinhAnh;
    Date NgayVaoLam;
    String VaiTro;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, Date NgaySinh, String SDT, String DiaChi, String MatKhau, String HinhAnh, Date NgayVaoLam, String VaiTro) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.MatKhau = MatKhau;
        this.HinhAnh = HinhAnh;
        this.NgayVaoLam = NgayVaoLam;
        this.VaiTro = VaiTro;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", TenNV=" + TenNV + ", NgaySinh=" + NgaySinh + ", SDT=" + SDT + ", DiaChi=" + DiaChi + ", MatKhau=" + MatKhau + ", HinhAnh=" + HinhAnh + ", NgayVaoLam=" + NgayVaoLam + ", VaiTro=" + VaiTro + '}';
    }
    
    

}
