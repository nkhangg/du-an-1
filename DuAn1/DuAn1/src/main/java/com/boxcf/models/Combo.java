/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

/**
 *
 * @author ji
 */
public class Combo {

    String MaCB;
    String TenCB;
    long Gia;
    String MoTa;
    String MaLoaiBox;
    int SoLuong;

    public Combo() {
    }

    public Combo(String MaCB, String TenCB, long Gia, String MoTa, String MaLoaiBox, int SoLuong) {
        this.MaCB = MaCB;
        this.TenCB = TenCB;
        this.Gia = Gia;
        this.MoTa = MoTa;
        this.MaLoaiBox = MaLoaiBox;
        this.SoLuong = SoLuong;
    }

    public String getMaCB() {
        return MaCB;
    }

    public void setMaCB(String MaCB) {
        this.MaCB = MaCB;
    }

    public String getTenCB() {
        return TenCB;
    }

    public void setTenCB(String TenCB) {
        this.TenCB = TenCB;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getMaLoaiBox() {
        return MaLoaiBox;
    }

    public void setMaLoaiBox(String MaLoaiBox) {
        this.MaLoaiBox = MaLoaiBox;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
