/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.Icon;

/**
 *
 * @author PC
 */
public class ModelItem {

    private String maItem;
    private Icon hing;
    private double gia;
    private String ten;
    private int soLuong;

    public String getMaItem() {
        return maItem;
    }

    public void setMaItem(String maItem) {
        this.maItem = maItem;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
        
    }

    public Icon getHing() {
        return hing;
    }

    public void setHing(Icon hing) {
        this.hing = hing;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ModelItem(String maItem, Icon hing, double gia, String ten, int soLuong) {
        this.maItem = maItem;
        this.hing = hing;
        this.gia = gia;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public ModelItem() {
    }

    @Override
    public String toString() {
        return "ModelItem{" + "maItem=" + maItem + ", hing=" + hing + ", gia=" + gia + ", ten=" + ten + ", soLuong=" + soLuong + '}';
    }
    
    

}
