/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.boxcf.components.material;

import com.box.utils.Sort;
import com.boxcf.models.ModelItem;
import com.boxcf.components.PanelItem;
import com.boxcf.events.StoreEvents;
import com.boxcf.store.Store;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class PanelBill extends javax.swing.JPanel {

    private ArrayList<ItemBill> list = new ArrayList<>();
    private PanelItem panelItem;

    public PanelBill() {
        initComponents();
    }

    public PanelItem getPanelItem() {
        return panelItem;
    }

    public void setPanelItem(PanelItem panelItem) {
        this.panelItem = panelItem;
    }

    public void render() {

        // sấp xếp theo mã tăng dần
        Sort.sortIncreased(list);
        Store.orderView.handleTotal();
        for (ItemBill itemBill : list) {
            this.add(itemBill);
        }
    }

    public ArrayList<ItemBill> getList() {
        return list;
    }

    public void setList(ArrayList<ItemBill> list) {
        this.list = list;
        this.repaint();
        this.revalidate();
    }

    public void setList(ModelItem data) {
        ItemBill item = new ItemBill();

        // đưa sự kiện sang class khác xử lí
        StoreEvents.closeBillProduct(item, this, panelItem);

        item.setData(data);
        list.add(item);
        render();
        this.repaint();
        this.revalidate();
    }

    public void removeItem(ModelItem data) {
        for (ItemBill itemBill : list) {
            if (data.getMaItem() == itemBill.getData().getMaItem()) {
                list.remove(itemBill);
                this.removeAll();
                render();
                this.repaint();
                this.revalidate();
                return;
            }
        }
    }

    public void setQuantity(ModelItem data, int quantity) {

        for (ItemBill itemBill : list) {

            if (data.getMaItem() == itemBill.getData().getMaItem()) {
                itemBill.tangLen(quantity);
                return;
            }
        }
    }

    public void clearList() {
        list.removeAll(list);
        render();
        this.removeAll();
        panelItem.clearActiveProduct();
        this.repaint();
        this.revalidate();
    }

    public long total() {

        long reuslt = 0;

        if (list.size() <= 0) {
            return reuslt;
        }

        for (ItemBill itemBill : list) {
            reuslt += itemBill.getData().getSoLuong() * itemBill.getData().getGia();
        }

        return reuslt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(410, 500));
        setPreferredSize(new java.awt.Dimension(410, 500));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
