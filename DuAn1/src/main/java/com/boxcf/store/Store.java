/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.store;

import com.boxcf.components.material.Category;
import com.boxcf.components.material.PanelBill;
import com.boxcf.events.StoreEvents;
import com.boxcf.models.LoaiSP;
import com.boxcf.ui.OrderView;
import javax.swing.JPanel;
import test.PanelBill1;

/**
 *
 * @author PC
 */
public class Store {

    public final static String idAllCategory = "TẤT CẢ";

    public final static Category categoryAll(JPanel panelCategory) {
        Category ctgrAll = new Category();
        StoreEvents.categoryActive(ctgrAll, panelCategory);
        ctgrAll.setActive(false);
        ctgrAll.addData(new LoaiSP(Store.idAllCategory, "Tất cả", Store.idAllCategory));
        return ctgrAll;
    }

    public static OrderView orderView = null;

    public static PanelBill1 globelPanelBill1 = null;
    public static PanelBill globelPanelBill = null;

}
