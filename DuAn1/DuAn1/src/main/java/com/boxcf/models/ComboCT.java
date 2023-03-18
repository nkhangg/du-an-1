
package com.boxcf.models;


public class ComboCT {

    String MaCB;
    int MaSP;
    String GhiChu;

    public ComboCT() {
    }

    public ComboCT(String MaCB, int MaSP, String GhiChu) {
        this.MaCB = MaCB;
        this.MaSP = MaSP;
        this.GhiChu = GhiChu;
    }

    public String getMaCB() {
        return MaCB;
    }

    public void setMaCB(String MaCB) {
        this.MaCB = MaCB;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
