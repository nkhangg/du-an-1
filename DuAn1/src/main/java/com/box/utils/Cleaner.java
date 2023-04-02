package com.box.utils;

import com.boxcf.dao.DatTruocDao;
import com.boxcf.dao.KhuyenMaiDao;
import com.boxcf.models.DatTruoc;
import com.boxcf.models.KhuyenMai;
import com.boxcf.store.Store;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Cleaner {

    public static void start() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                cleanInvalidDiscount();
                cleanInvalidBook();

            }
        };

        timer.scheduleAtFixedRate(task, 0, 60 * 1000);
    }

    public static void cleanInvalidDiscount() {
        KhuyenMaiDao dKm = KhuyenMaiDao.getInstant();
        List<KhuyenMai> list = dKm.selectAll();
        String date = XDate.toString(XDate.now(), "yyyy-MM-dd");
        boolean flag = false;

        for (KhuyenMai km : list) {
            if (XDate.toDate(date, "yyyy-MM-dd").after(km.getNgayKT())) {
                dKm.delete(km.getMaKM());
                flag = true;
            }
        }

        if (flag) {
            Store.kmView.fillTable();
        }

    }

    public static void cleanInvalidBook() {
        DatTruocDao dDt = DatTruocDao.getInstant();
        String date = XDate.toString(XDate.now(), "yyyy-MM-dd HH:mm:ss");
        boolean flag = false;
        for (DatTruoc dt : dDt.selectAll()) {
            if (XDate.toDate(date, "yyyy-MM-dd HH:mm:ss").after(dt.getGioKT())) {
                dDt.delete(dt.getMaDT());
                flag = true;
            }
        }

        if (flag && Store.dbView != null) {
            Store.dbView.renderDataTable();
            Store.dbView.renderHour();
        }

    }

}
