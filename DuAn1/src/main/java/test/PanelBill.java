/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package test;

import com.boxcf.components.PanelItem;
import java.awt.Component;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PC
 */
public class PanelBill extends javax.swing.JPanel {

    private Set<ItemBill> list = new HashSet<>();
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
        for (ItemBill itemBill : list) {
            this.add(itemBill);
        }
    }

    public void setList(ModelItem data) {
        ItemBill item = new ItemBill();

        // xử lí sự kiện tắt bill
        item.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                removeItem(item);
                for (Component component : panelItem.getComponents()) {
                    Items i = (Items) component;
                    if (i.getData().getGia() == item.getGia()) {
                        i.clearSelected();
                        return;
                    }

                }
            }
        });

        item.setData(data);
        list.add(item);
        render();
        this.repaint();
        this.revalidate();
    }

    public Set<ItemBill> getList() {
        return list;
    }

    public void setList(Set<ItemBill> list) {
        this.list = list;
        this.repaint();
        this.revalidate();
    }

    public void removeItem(ModelItem data) {
        for (ItemBill itemBill : list) {
            if (data.getGia() == itemBill.getData().getGia()) {
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

            if (data.getGia() == itemBill.getData().getGia()) {
                itemBill.tangLen(quantity);
                return;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(410, 700));
        setPreferredSize(new java.awt.Dimension(410, 700));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
