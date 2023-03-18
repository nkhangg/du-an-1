package com.boxcf.components;

import com.boxcf.components.material.ProductItem;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

public class PanelItem extends JPanel {
    
    public PanelItem() {
        setBackground(Color.WHITE);
        setLayout(new WrapLayout(WrapLayout.LEFT, 10, 10));
    }
    
    public void clearActiveProduct() {
        for (Component component : this.getComponents()) {
            ProductItem product = (ProductItem) component;
            
            if (product != null) {
                product.setSelected(false);
                product.getSoLuong().setSoLuong(0);
                product.repaint();
            }
        }
    }
}
