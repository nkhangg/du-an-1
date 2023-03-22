/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

/**
 *
 * @author PC
 */
public class Time {

    private int hour;
    private int muntite;

    public Time() {
    }

    public Time(int hour, int muntite) {
        this.hour = hour;
        this.muntite = muntite;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMuntite() {
        return muntite;
    }

    public void setMuntite(int muntite) {
        this.muntite = muntite;
    }

    @Override
    public String toString() {
        return "Time{" + "hour=" + hour + ", muntite=" + muntite + '}';
    }

}
