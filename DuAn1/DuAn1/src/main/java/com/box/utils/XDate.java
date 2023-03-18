/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.box.utils;

import java.text.ParseException;
import  java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class XDate {
    static SimpleDateFormat fm = new SimpleDateFormat();
    
    
    public static Date now() {
        return new Date();
    }
    
    public static Date toDate(String date, String pattern) {
        try {
            fm.applyPattern(pattern);
            return fm.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String toString (Date date, String pattern) {
        fm.applyPattern(pattern);
        return fm.format(date);
    }
    
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days*24*6*6*1000);
        return date;
    }
}
