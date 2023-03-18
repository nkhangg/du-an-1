/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.events;

import com.boxcf.components.PanelItem;
import com.boxcf.components.Spiner;
import com.boxcf.components.material.ItemBill;
import com.boxcf.components.material.PanelBill;
import com.boxcf.components.material.ProductItem;
import com.boxcf.events.interfaces.EventIncrease;
import com.boxcf.models.SanPham;
import com.boxcf.ui.OrderView;
import java.awt.Component;
import com.boxcf.events.interfaces.EventItem;
import com.boxcf.models.ModelItem;

/**
 *
 * @author PC
 */
public class StoreEvents {

    // xử lí sự kiện khi click vào sản phẩm
    public static void product(OrderView order) {
        order.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                order.setEventIncreace(com, item);
                order.setSelected(com);
                order.showItemBill(item);
                order.repaint();

            }
        });
    }

    // xử lí sự kiện giảm số lượng của sản phẩm
    public static void decreaseProduct(Spiner spiner, PanelBill panelBill, ProductItem i, ModelItem data) {
        spiner.setEvenDecrease(new EventIncrease() {
            @Override
            public void itemClick(java.awt.Component com, int quantity) {
                // trừ 1 vì khi tăng lên số lượng bị châm hơn 1 số
                panelBill.setQuantity(i.getData(), quantity - 1);

                if (quantity <= 1) {
                    panelBill.removeItem(data);
                }
            }

        });
    }

    // xử lí sự kiện tăng số lượng của sản phẩm
    public static void increaseProduct(Spiner spiner, PanelBill panelBill, ProductItem i, ModelItem data) {
        spiner.setEvenIncrease(new EventIncrease() {
            @Override
            public void itemClick(java.awt.Component com, int quantity) {
                // cộng 1 vì khi tăng lên số lượng bị châm hơn 1 số
                panelBill.setQuantity(i.getData(), quantity + 1);

            }

        });
    }

    // xử lí sự kiện tắt bill
    public static void closeBillProduct(ItemBill item, PanelBill panelBill, PanelItem panelItem) {
        item.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                panelBill.removeItem(item);
                for (Component component : panelItem.getComponents()) {
                    ProductItem i = (ProductItem) component;
                    if (i.getData().getGia() == item.getGia()) {
                        i.clearSelected();
                        i.repaint();
                        i.revalidate();
                        return;
                    }

                }
            }
        });
    }

}
