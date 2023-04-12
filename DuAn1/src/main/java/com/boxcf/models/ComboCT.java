package com.boxcf.models;

public class ComboCT {

    int maHd;
    String MaCB;
    String GhiChu;

    public ComboCT() {
    }

    public ComboCT(int maHd, String MaCB, String GhiChu) {
        this.maHd = maHd;
        this.MaCB = MaCB;
        this.GhiChu = GhiChu;
    }

    public int getMaHd() {
        return maHd;
    }

    public void setMaHd(int maHd) {
        this.maHd = maHd;
    }

    public String getMaCB() {
        return MaCB;
    }

    public void setMaCB(String MaCB) {
        this.MaCB = MaCB;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return "ComboCT{" + "maHd=" + maHd + ", MaCB=" + MaCB + ", GhiChu=" + GhiChu + '}';
    }

}
