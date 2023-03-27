/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

import com.box.utils.MsgBox;
import com.box.utils.XDate;
import com.boxcf.components.material.BoxItem;
import com.boxcf.constands.BoxState;
import java.util.TimerTask;
import com.boxcf.dao.DatBoxDao;
import com.boxcf.store.Store;

/**
 *
 * @author PC
 */
public class Timer {

    BoxItem box;
    ModelItem data;

    public Timer() {
    }

    public Timer(BoxItem box, ModelItem data) {
        this.box = box;
        this.data = data;
    }

    public BoxItem getBox() {
        return box;
    }

    public void setBox(BoxItem box) {
        this.box = box;
    }

    public ModelItem getData() {
        return data;
    }

    public void setData(ModelItem data) {
        this.data = data;
    }

    public synchronized void setTime() {
        java.util.Timer timer = new java.util.Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                box.setSelected(BoxState.isActive);

                Time t = XDate.getCurTime(XDate.toString(data.getGioKT(), "MM/dd/yyyy HH:mm:ss"));

                if (t.getHour() < 0 && t.getMuntite() < 0) {
                    DatBoxDao.getInstant().updateProc(box.getData(), BoxState.inactive.toString());
                    MsgBox.alert(Store.orderView, box.getData().getTen() + " đã hết thời gian !");
                    box.clearSelected();
                    timer.cancel();
                    return;
                }

                box.setLblTime(t);
            }
        };

        timer.scheduleAtFixedRate(task, 0, 2000);

    }

    @Override
    public String toString() {

        return "Timer{" + "box=" + box + ", data=" + data + '}';
    }

}
