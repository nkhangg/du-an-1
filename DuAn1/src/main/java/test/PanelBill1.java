/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package test;

import com.boxcf.components.PanelItem;
import com.boxcf.models.Box;
import com.boxcf.models.DatBox;
import java.awt.Component;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PC
 */
public class PanelBill1 extends javax.swing.JPanel {

    private Set<ItemBill1> list = new HashSet<>();
    private PanelItem panelItem;

    public PanelBill1() {
        initComponents();
    }

    public PanelItem getPanelItem() {
        return panelItem;
    }

    public void setPanelItem(PanelItem panelItem) {
        this.panelItem = panelItem;
    }

    public void render() {
        for (ItemBill1 itemBill : list) {
            this.add(itemBill);
        }
    }

    public void setList(DatBox datBox) {
        ItemBill1 itemBill = new ItemBill1();

//         xử lí sự kiện tắt bill
        itemBill.setEvent(new EventItem1() {
            @Override
            public void itemClick(Component com, Box item) {
//                removeItem(item);
//                for (Component component : panelItem.getComponents()) {
//                    Items i = (Items) component;
////                    if (i.getData().getGia() == item.getGia()) {
////                        i.clearSelected();
////                        return;
////                    }
//
//                }
            }

        });
//
        itemBill.setData(datBox);
        list.add(itemBill);
        render();
        this.repaint();
        this.revalidate();
    }

    public Set<ItemBill1> getList() {
        return list;
    }

    public void setList(Set<ItemBill1> list) {
        this.list = list;
        this.repaint();
        this.revalidate();
    }

    public void removeItem(Box data) {
        for (ItemBill1 itemBill : list) {
//            if (data.getGia() == itemBill.getData().getGia()) {
//                list.remove(itemBill);
//                this.removeAll();
//                render();
//                this.repaint();
//                this.revalidate();
//                return;
//            }
        }
    }

    public void setQuantity(Box data, int quantity) {

        for (ItemBill1 itemBill : list) {

//            if (data.getGia() == itemBill.getData().getGia()) {
//                itemBill.tangLen(quantity);
//                return;
//            }
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
