package com.boxcf.models;

public class Combo {

    String MaCB;
    String TenCB;
    long Gia;
    String MaLoaiBox;
    int soLuongDoUong;
    int SoLuongDoAn;
    String MoTa;

    public Combo() {
    }

    public Combo(String MaCB, String TenCB, long Gia, String MaLoaiBox, int soLuongDoUong, int SoLuongDoAn, String MoTa) {
        this.MaCB = MaCB;
        this.TenCB = TenCB;
        this.Gia = Gia;
        this.MaLoaiBox = MaLoaiBox;
        this.soLuongDoUong = soLuongDoUong;
        this.SoLuongDoAn = SoLuongDoAn;
        this.MoTa = MoTa;
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

    public String getMaLoaiBox() {
        return MaLoaiBox;
    }

    public void setMaLoaiBox(String MaLoaiBox) {
        this.MaLoaiBox = MaLoaiBox;
    }

    public int getSoLuongDoUong() {
        return soLuongDoUong;
    }

    public void setSoLuongDoUong(int soLuongDoUong) {
        this.soLuongDoUong = soLuongDoUong;
    }

    public int getSoLuongDoAn() {
        return SoLuongDoAn;
    }

    public void setSoLuongDoAn(int SoLuongDoAn) {
        this.SoLuongDoAn = SoLuongDoAn;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

}
