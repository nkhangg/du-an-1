/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

/**
 *
 * @author PC
 */
public class ModelStatistical {

    private String title;
    private long num;
    private int time;
    private String type;
    private String category;

    public ModelStatistical() {
    }

    public ModelStatistical(String title, long num) {
        this.title = title;
        this.num = num;
    }

    public ModelStatistical(String title, int time, String type, String category) {
        this.title = title;
        this.time = time;
        this.type = type;
        this.category = category;
    }

    public ModelStatistical(String category, String type) {
        this.type = type;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.title;
    }

}
