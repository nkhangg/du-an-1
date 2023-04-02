/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.dao;

import com.box.utils.JdbcHelper;
import com.box.utils.XDate;
import com.boxcf.models.ModelStatistical;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ThongKeDao {

    Date dateStart = XDate.getHour("23:59:59");
    Date dateEnd = XDate.getHour("00:00:00");

    private final String DateNowSql = "where NgayTao <= '" + XDate.toString(dateStart, "yyyy-MM-dd HH:mm:ss") + "' and NgayTao >= ' " + XDate.toString(dateEnd, "yyyy-MM-dd HH:mm:ss") + " '";

    public static ThongKeDao getInstant() {
        return new ThongKeDao();
    }

    private String toDate(String value) {
        if (value.length() < 6) {
            return value;
        }
        String year = value.substring(0, 4);
        String mont = value.substring(4, 6);
        String day = value.substring(6, value.length());
        return day + "/" + mont + "/" + year;
    }

    public double revenueOfTheDay() {

        double revenue = 0;
        String sql = "select SUM(ThanhTien) from HoaDon hd \n"
                + "join HoaDonCT ct on ct.MaHD = hd.MaHD \n"
                + DateNowSql;

        try {

            ResultSet responce = JdbcHelper.query(sql);

            // admission a ResultSet return a Box
            if (responce.next()) {
                revenue = responce.getDouble(1);
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in revenueOfTheDay Combo !");
        }
        return revenue;
    }

    public double productOfTheDay() {

        double revenue = 0;
        String sql = "select  Sum(ThanhTien * SoLuong) from HoaDon hd\n"
                + "join HoaDonCT ct on ct.MaHD = hd.MaHD \n"
                + DateNowSql + " and MaSP in (select MaSP from SanPham)";

        try {

            ResultSet responce = JdbcHelper.query(sql);

            // admission a ResultSet return a Box
            if (responce.next()) {
                revenue = responce.getDouble(1);
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectById Combo !");
        }
        return revenue;
    }

    public double boxOfTheDay() {

        double revenue = 0;
        String sql = "select  Sum(ThanhTien * SoLuong) from HoaDon hd\n"
                + "join HoaDonCT ct on ct.MaHD = hd.MaHD\n"
                + DateNowSql + " and MaDat in (select MaDat from DatBox)";

        try {

            ResultSet responce = JdbcHelper.query(sql);

            // admission a ResultSet return a Box
            if (responce.next()) {
                revenue = responce.getDouble(1);
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectById Combo !");
        }
        return revenue;
    }

    public double comboOfTheDay() {

        double revenue = 0;
        String sql = "select  Sum(TongTien) from HoaDon hd\n"
                + "join HoaDonCT ct on ct.MaHD = hd.MaHD\n"
                + "where NgayTao <= '2023-04-01 23:59:59' and NgayTao >= '2023-04-01 00:00:00' and MaSP in (select MaCB from Combo)";

        try {

            ResultSet responce = JdbcHelper.query(sql);

            // admission a ResultSet return a Box
            if (responce.next()) {
                revenue = responce.getDouble(1);
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new Error("The Error in selectById Combo !");
        }
        return revenue;
    }

    public List<ModelStatistical> revenueOfDay(int time, String type) {
        List<ModelStatistical> list = new ArrayList<>();
        String sql = "";

        String sqlDay = "SELECT top " + time
                + "CONVERT(VARCHAR(10),NgayTao,112), SUM(TongTien)\n"
                + "FROM HoaDon\n"
                + "GROUP BY CONVERT(VARCHAR(10),NgayTao,112)\n"
                + "order by CONVERT(VARCHAR(10),NgayTao,112) desc";

        String sqlMonth = "select top " + time
                + "MONTH(NgayTao), SUM(TongTien) from HoaDon\n"
                + "group by MONTH(NgayTao)\n"
                + "order by MONTH(NgayTao) desc";

        String sqlYear = "select top " + time
                + "YEAR(NgayTao), SUM(TongTien) from HoaDon\n"
                + "group by YEAR(NgayTao)\n"
                + "order by YEAR(NgayTao) desc";

        switch (type) {
            case "day":
                sql = sqlDay;
                break;
            case "month":
                sql = sqlMonth;
                break;
            case "year":
                sql = sqlYear;
                break;
            default:
                throw new AssertionError();
        }

        try {

            ResultSet responce = JdbcHelper.query(sql);

            // admission a ResultSet return a Box
            while (responce.next()) {
                list.add(new ModelStatistical(toDate(responce.getString(1)), responce.getLong(2)));
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
            throw new Error("The Error in revenueOfDay Combo !");
        }
        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {

    }
}
