/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.dao;

import com.box.utils.JdbcHelper;
import com.box.utils.Validator;
import com.box.utils.XDate;
import com.boxcf.models.ModelStatistical;
import com.boxcf.models.ThongKeNhanVien;
import com.boxcf.models.ThongKeSanPham;
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
        String sql = "select SUM(TongTien) from HoaDon hd \n"
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
                + DateNowSql + " and MaSP in (select MaCB from Combo)";

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

    public List<ModelStatistical> revenue(String type, Date... date) {
        List<ModelStatistical> list = new ArrayList<>();
        String sql = "";

        String sqlDay = "SELECT top " + 7
                + "CONVERT(VARCHAR(10),NgayTao,112), SUM(TongTien)\n"
                + "FROM HoaDon\n"
                + "GROUP BY CONVERT(VARCHAR(10),NgayTao,112)\n"
                + "order by CONVERT(VARCHAR(10),NgayTao,112) desc";

        String sqlMonth = "select top " + 7
                + "MONTH(NgayTao), SUM(TongTien) from HoaDon\n"
                + "group by MONTH(NgayTao)\n"
                + "order by MONTH(NgayTao) desc";

        String sqlYear = "select top " + 7
                + "YEAR(NgayTao), SUM(TongTien) from HoaDon\n"
                + "group by YEAR(NgayTao)\n"
                + "order by YEAR(NgayTao) desc";

        String sqlProc = "{ call sp_select_dt  (?, ?) }";

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
            case "period":
                sql = sqlProc;
                break;
            default:
                break;
        }

        try {
            if (sql.equals("")) {
                return null;
            }

            ResultSet responce = null;

            if (date.length >= 2) {
                responce = JdbcHelper.query(sql, date[0], date[1]);
            } else {
                responce = JdbcHelper.query(sql);
            }
            // admission a ResultSet return a Box
            while (responce.next()) {
                list.add(new ModelStatistical(toDate(responce.getString(1)), responce.getLong(2), null));
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
            throw new Error("The Error in revenueOfDay Combo !");
        }
        Collections.reverse(list);

        return list;
    }

    private String sqlProduct(int time, String conditon) {
        return "select ct.MaSP, sp.TenSP, sp.Gia, sum(SoLuong) as soluong from HoaDonCT ct\n"
                + "join HoaDon hd on hd.MaHD = ct.MaHD\n"
                + "join SanPham sp on sp.MaSP = ct.MaSP \n"
                + conditon
                + " group by ct.MaSP, sp.TenSP, sp.Gia\n"
                + "order by sum(SoLuong) desc";
    }

    private String sqlStaff(int time, String conditon) {
        return "select top 10  hd.MaNV,TenNV, NgayVaoLam, SUM(SoLuong) as soluong from HoaDon hd\n"
                + "join HoaDonCT ct on ct.MaHD = hd.MaHD\n"
                + "join NhanVien nv on nv.MaNV = hd.MaNV \n"
                + conditon
                + "group by  hd.MaNV, TenNV, NgayVaoLam";
    }

    public List<ModelStatistical> product(int time, String type) {
        List<ModelStatistical> list = new ArrayList<>();
        String sql = "";

        String sqlDay = "where ct.MaSP is not null and CONVERT(VARCHAR(10),NgayTao,112) in (select distinct top " + time + " CONVERT(VARCHAR(10),NgayTao,112) from HoaDon\n"
                + "order by  CONVERT(VARCHAR(10),NgayTao,112) desc)";

        String sqlMonth = " where ct.MaSP is not null and MONTH(NgayTao) >= MONTH(NgayTao) - " + time;

        String sqlYear = " where ct.MaSP is not null and YEAR(NgayTao) >= YEAR(NgayTao) - " + time;

        switch (type) {
            case "day":
                sql = sqlProduct(time, sqlDay);
                break;
            case "month":
                sql = sqlProduct(time, sqlMonth);
                break;
            case "year":
                sql = sqlProduct(time, sqlYear);
                break;
            default:
                return null;
        }

        try {

            ResultSet responce = JdbcHelper.query(sql);

            // admission a ResultSet return a Box
            while (responce.next()) {
                list.add(new ModelStatistical(responce.getString(2), responce.getLong(4),
                        new ThongKeSanPham(responce.getString(1), responce.getString(2), responce.getLong(3), responce.getInt(4))));
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
            throw new Error("The Error in revenueOfDay Combo !");
        }
        Collections.reverse(list);

        return list;
    }

    public List<ModelStatistical> staff(int time, String type) {
        List<ModelStatistical> list = new ArrayList<>();
        String sql = "";

        String sqlDay = " where TrangThai = 1 and CONVERT(VARCHAR(10),NgayTao,112) in (select distinct top " + time + " CONVERT(VARCHAR(10),NgayTao,112) from HoaDon\n"
                + "order by  CONVERT(VARCHAR(10),NgayTao,112) desc) ";

        String sqlMonth = " where TrangThai = 1 and MONTH(NgayTao) >= MONTH(NgayTao) - " + time;

        String sqlYear = " where TrangThai = 1 and YEAR(NgayTao) >= YEAR(NgayTao) - " + time;

        switch (type) {
            case "day":
                sql = sqlStaff(time, sqlDay);
                break;
            case "month":
                sql = sqlStaff(time, sqlMonth);
                break;
            case "year":
                sql = sqlStaff(time, sqlYear);

                break;
            default:
                return null;
        }

        try {

            ResultSet responce = JdbcHelper.query(sql);

            // admission a ResultSet return a Box
            while (responce.next()) {
                list.add(new ModelStatistical(responce.getString(2), responce.getLong(4),
                        new ThongKeNhanVien(responce.getString(1), responce.getString(2), responce.getDate(3), responce.getInt(4))));
            }
            responce.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
            throw new Error("The Error in staff ThongKe !");
        }
        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {
        Date dateStart = XDate.toDate("2023/02/2", "yyyy/MM/dd");
        Date dateEnd = XDate.toDate("2023/04/3", "yyyy/MM/dd");
        for (ModelStatistical object : ThongKeDao.getInstant().revenue("day")) {
            System.out.println(object.getNum());
        }
    }
}
