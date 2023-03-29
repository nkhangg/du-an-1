/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.store;

import com.boxcf.components.material.Category;
import com.boxcf.components.material.PanelBill;
import com.boxcf.events.StoreEvents;
import com.boxcf.models.LoaiBox;
import com.boxcf.models.LoaiSP;
import com.boxcf.ui.OrderView;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Store {

    public final static Category categoryAll(JPanel panelCategory, String name, boolean active) {
        Category ctgrAll = new Category();
        StoreEvents.categoryActive(ctgrAll, panelCategory, name);

        ctgrAll.setActive(active);
        LoaiSP lsp = new LoaiSP(Store.idAllCategory, "Tất cả", Store.idAllCategory);
        LoaiBox lb = new LoaiBox(Store.idAllCategory, "Tất cả", 0, "");
        ctgrAll.addData(lsp, lb);
        return ctgrAll;
    }

    public final static String idAllCategory = "TẤT CẢ";

    public static OrderView orderView = null;

    public static PanelBill globelPanelBill = null;

    public static String partten = "MM/dd/yyyy HH:mm:ss";
    
    public static int breaks = 5;

}
