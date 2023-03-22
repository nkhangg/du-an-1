/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.box.utils;

import com.boxcf.models.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

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

    public static String toString(Date date, String pattern) {
        fm.applyPattern(pattern);
        return fm.format(date);
    }

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 6 * 6 * 1000);
        return date;
    }

    public static Date addHours(Date date, int hours) {
        date.setTime(date.getTime() + hours * 60 * 60 * 1000);
        return date;
    }

    public static Time getCurTime(String myDate) {
        Time t = null;
        try {
            System.out.println("in get curent time: " + myDate);
            Date date = XDate.toDate(myDate, "MM/dd/yyyy HH:mm:ss");
            long millis = date.getTime();
            long next = millis - XDate.now().getTime();
            double totalTime = Math.floor(next) / 1000;
            int munite = (int) (Math.floor(totalTime / 60) % 60);
            int hour = (int) (Math.floor(totalTime / 3600) % 24);

            t = new Time(hour, munite);
        } catch (Exception e) {
            System.out.println(e);
//            throw new Error("Error in getCurTime");
        }
        return t;
    }

    public static void main(String[] args) throws ParseException {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Time t = XDate.getCurTime("03/22/2023 02:52:26");
                System.out.println(t.getHour() + "gio");
                System.out.println(t.getMuntite() + 1 + "phut");

            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

}
