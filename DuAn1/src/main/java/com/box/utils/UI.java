/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.box.utils;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class UI {
    public static void changeTransBG(Color color, JTextField ...txts) {
        for (JTextField txt : txts) {
            txt.setBackground(color);
        }
    }
}
