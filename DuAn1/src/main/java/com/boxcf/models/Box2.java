/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

import com.boxcf.constands.BoxState;

/**
 *
 * @author ji
 */
public class Box2 {

    int MaBox;
    String TenBox;
    String HinhAnh;
    BoxState TrangThai;
    String MaLoaiBox;
    String moTa;

    public Box2() {
    }

    public Box2(int MaBox, String TenBox, String HinhAnh, BoxState TrangThai, String MaLoaiBox) {
        this.MaBox = MaBox;
        this.TenBox = TenBox;
        this.HinhAnh = HinhAnh;
        this.TrangThai = TrangThai;
        this.MaLoaiBox = MaLoaiBox;
    }

    public Box2( String TenBox, String HinhAnh, BoxState TrangThai, String MaLoaiBox) {
        this.TenBox = TenBox;
        this.HinhAnh = HinhAnh;
        this.TrangThai = TrangThai;
        this.MaLoaiBox = MaLoaiBox;
    }

    public int getMaBox() {
        return MaBox;
    }

    public void setMaBox(int MaBox) {
        this.MaBox = MaBox;
    }

    public String getTenBox() {
        return TenBox;
    }

    public void setTenBox(String TenBox) {
        this.TenBox = TenBox;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public BoxState getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(BoxState TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaLoaiBox() {
        return MaLoaiBox;
    }

    public void setMaLoaiBox(String MaLoaiBox) {
        this.MaLoaiBox = MaLoaiBox;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
