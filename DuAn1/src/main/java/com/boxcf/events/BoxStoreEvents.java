/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.events;

import com.boxcf.components.PanelItem;
import com.boxcf.components.material.BoxItemBill;
import com.boxcf.components.material.ItemBill;
import com.boxcf.components.material.PanelBill;
import com.boxcf.components.material.ProductItem;
import com.boxcf.models.BoxModelItem;
import com.boxcf.ui.OrderView;
import java.awt.Component;
import com.boxcf.events.interfaces.BoxEvents;
import com.boxcf.events.interfaces.EventItem;
import com.boxcf.models.ModelItem;
import com.boxcf.ui.ThongTinBoxDat;

/**
 *
 * @author HP
 */
public class BoxStoreEvents {
    
    public static void boxClick(OrderView orderView) {
        orderView.setEventBox(new BoxEvents() {
            @Override
            public void boxClick(Component cpn, BoxModelItem boxItem) {
                orderView.setBoxSelected(cpn);
//                orderView.repaint();
            }
        });
    }
    
    
    // xử lí sự kiện tắt bill
    public static void closeBillBox(BoxItemBill item, PanelBill panelBill, PanelItem panelItem) {
        item.setBoxEvent(new BoxEvents() {
            @Override
            public void boxClick(Component cpn, BoxModelItem boxItem) {
                panelBill.removeBoxItem(boxItem);
//                for (Component component : panelItem.getComponents()) {
//                    ProductItem i = (ProductItem) component;
//                    if (i.getData().getGia() == item.getGia()) {
//                        i.clearSelected();
//                        i.repaint();
//                        i.revalidate();
//                        return;
//                    }
//                }
            }
        });
    }
}


