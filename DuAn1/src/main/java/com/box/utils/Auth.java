/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.box.utils;

//import com.edusys.model.NhanVien;

import com.boxcf.dao.NhanVienDao;
import com.boxcf.models.NhanVien;



/**
 *
 * @author HP
 */
public class Auth {
    
    public static NhanVien user = NhanVienDao.getInstant().selectById("NV01");
    
    public static void clear() {
        Auth.user = null;
    }
    
    public static boolean isLogin() {
        return Auth.user != null;
    }
    
    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro().equals("Admin");
    }
    
    
}
