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
public class KhuyenMai {

    String MaKM;
    String TenKM;
    Date NgayBD;
    Date NgayKT;
    int SoLuot;
    int PhanTram;
    long DieuKienGiam;

    public KhuyenMai() {
    }

    public KhuyenMai(String MaKM, String TenKM, Date NgayBD, Date NgayKT, int SoLuot, int PhanTram, long DieuKienGiam) {
        this.MaKM = MaKM;
        this.TenKM = TenKM;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.SoLuot = SoLuot;
        this.PhanTram = PhanTram;
        this.DieuKienGiam = DieuKienGiam;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }

    public int getSoLuot() {
        return SoLuot;
    }

    public void setSoLuot(int SoLuot) {
        this.SoLuot = SoLuot;
    }

    public int getPhanTram() {
        return PhanTram;
    }

    public void setPhanTram(int PhanTram) {
        this.PhanTram = PhanTram;
    }

    public long getDieuKienGiam() {
        return DieuKienGiam;
    }

    public void setDieuKienGiam(long DieuKienGiam) {
        this.DieuKienGiam = DieuKienGiam;
    }
    
    
}
