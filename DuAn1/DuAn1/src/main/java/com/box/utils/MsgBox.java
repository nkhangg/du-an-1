/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.box.utils;

import java.awt.Component;
import javax.swing.JOptionPane;


public class MsgBox {
    
    public static void alert(Component parent, String mess) {
        JOptionPane.showMessageDialog(parent, mess, "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component parent, String mess) {
        int option = JOptionPane.showConfirmDialog(parent, mess, "Hệ thống quản lý đào tạo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return option == JOptionPane.YES_OPTION;
    }
    
    public static String prompt(Component parent, String mess) {
        return JOptionPane.showInputDialog(parent, mess, "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
