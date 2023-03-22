/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.events;

import com.boxcf.components.PanelItem;
import com.boxcf.components.Spiner;
import com.boxcf.components.material.BoxItem;
import com.boxcf.components.material.Category;
import com.boxcf.components.material.ItemBill;
import com.boxcf.components.material.PanelBill;
import com.boxcf.components.material.ProductItem;
import com.boxcf.dao.SanPhamDao;
import com.boxcf.events.interfaces.EventIncrease;
import com.boxcf.models.SanPham;
import com.boxcf.ui.OrderView;
import java.awt.Component;
import com.boxcf.events.interfaces.EventItem;
import com.boxcf.models.ModelItem;
import com.boxcf.store.Store;
import com.boxcf.ui.DatBoxView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

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
                if (com instanceof ProductItem) {
                    order.setEventIncreace(com, item);
                    order.setSelected(com);
                    order.showItemBill(item);
                    order.repaint();
                }

                if (com instanceof BoxItem) {
                    BoxItem box = (BoxItem) com;
                    new DatBoxView(item).setVisible(true);
                    order.repaint();
                }

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
                    if (component instanceof ProductItem) {
                        ProductItem i = (ProductItem) component;
                        if (i.getData().getMaItem() == item.getMaItem()) {
                            i.clearSelected();
                            i.repaint();
                            i.revalidate();
                            return;
                        }
                    }
                    
                    if(component instanceof BoxItem){
                        BoxItem i = (BoxItem) component;
                        if (i.getData().getMaItem() == item.getMaItem()) {
                            i.clearSelected();
                            i.revalidate();
                            return;
                        }
                    }

                }
            }
        });
    }

    // xử lý sự kiện active loại sản phẩm
    public static void categoryActive(Category ctgr, JPanel panelCategory) {

        OrderView order = Store.orderView;
        PanelItem panelItem = order.getPanelItem();
        PanelBill panelBill = Store.globelPanelBill;
        String sql = "select * from SanPham\n"
                + "where MaLoai = ?";
        ctgr.addMouseListener(new MouseAdapter() {
            List<SanPham> listProduct;

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // xóa hết các active trước đó
                for (Component component : panelCategory.getComponents()) {
                    Category c = (Category) component;
                    if (c != null) {
                        c.setActive(false);
                    }
                }

                // toggle active :))
                ctgr.toggleActive();

                // xóa các sản phẩm trước khi add vào mới không bị trùng sản phẩm
                panelItem.removeAll();

                if (ctgr.getData().getMaLoai().equals(Store.idAllCategory)) {
                    listProduct = SanPhamDao.getInstant().selectAll();

                    // add sản phẩm vào panelItem;
                    order.renderData(listProduct);

                    // active các sản phẩm có trên bill
                    panelBill.activeProductOnBill(panelItem);
                    return;
                }

                // lấy sản phẩm tương ứng với mã loại
                listProduct = SanPhamDao.getInstant().selectBySql(sql, ctgr.getData().getMaLoai());

                // kiểm tra nếu không chứa sản phẩm thì không cần thêm vào panelItem
                if (listProduct.isEmpty()) {
                    panelItem.removeAll();
                    panelItem.repaint();
                    panelItem.revalidate();
                    return;
                }

                // add sản phẩm vào panelItem;
                order.renderData(listProduct);

                // active các sản phẩm có trên bill
                panelBill.activeProductOnBill(panelItem);

            }

        });
    }

}
