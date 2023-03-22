package com.boxcf.components;

import com.boxcf.components.material.BoxItem;
import com.boxcf.components.material.ProductItem;
import com.boxcf.constands.BoxState;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

public class PanelItem extends JPanel {

    public PanelItem() {
        setBackground(Color.WHITE);
        setLayout(new WrapLayout(WrapLayout.LEFT, 10, 10));
    }

    public void clearActive() {
        for (Component component : this.getComponents()) {
            if (component instanceof ProductItem) {
                ProductItem product = (ProductItem) component;

                if (product != null) {
                    product.setSelected(false);
                    product.getSoLuong().setSoLuong(0);
                    product.repaint();
                }
            }

            if (component instanceof BoxItem) {
                BoxItem box = (BoxItem) component;
                if (box != null && box.getData().getTrangThai() != BoxState.waiting) {
                    box.clearSelected();
                }
            }
        }
    }

    public void setTimer() {
        for (Component com : this.getComponents()) {
            if (com instanceof BoxItem) {
                BoxItem b = (BoxItem) com;
                if (b.getData().getGioKT() != null && b.getData().getTrangThai() == BoxState.waiting) {
                    b.timer();

                }
            }

        }
    }
}
