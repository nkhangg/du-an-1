package com.boxcf.dao;

import com.boxcf.models.Box;
import com.box.utils.JdbcHelper;
import com.boxcf.models.Box;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoxDao implements BoxCfDAO<Box, String> {

    public static BoxDao getInstance() {
        return new BoxDao();
    }

    final String INSERT_SQL = "INSERT INTO Box VALUES (?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE Box SET TenBox = ?, HinhAnh = ?, Mota = ?, MaLoaiBox = ? WHERE MaBox = ?";
    final String DELETE_SQL = "DELETE FROM Box WHERE MaBox = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM Box";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Box WHERE MaBox = ?";
    final String SELECT_BY_NAME_SQL = "SELECT * FROM Box WHERE TenBox LIKE ?";

    @Override
    public void insert(Box box) {
        JdbcHelper.update(INSERT_SQL, box.getMaBox(), box.getTenBox(), box.getHinhAnh(), box.getMoTa(), box.getMaLoaiBox());
    }

    @Override
    public void update(Box box) {
        JdbcHelper.update(UPDATE_SQL, box.getTenBox(), box.getHinhAnh(), box.getMoTa(), box.getMaLoaiBox(), box.getMaBox());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<Box> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Box selectById(String id) {
        List<Box> list = selectBySql(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<Box> selectBySql(String sql, Object... args) {
        List<Box> list = new ArrayList<>();

        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Box box = new Box();

                box.setMaBox(rs.getString("MaBox"));
                box.setTenBox(rs.getString("TenBox"));
                box.setHinhAnh(rs.getString("HinhAnh"));
                box.setMoTa(rs.getString("MoTa"));
                box.setMaLoaiBox(rs.getString("MaLoaiBox"));

                list.add(box);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Box createObjecet(ResultSet responce) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Box> panigation(Integer pageCurrent) {
        String sql = "SELECT TOP 8 * FROM Box WHERE MaBox NOT IN (SELECT TOP " + (pageCurrent * 8 - 8) + " MaBox FROM Box)";
        return this.selectBySql(sql);
    }

    public Integer getPageNumber() {
        return (int) Math.ceil(this.selectAll().size() / 8) + 1;
    }

    public List<Box> selectByKeyWord(String keyword) {
        if (selectById(keyword) != null) {
            return selectBySql(SELECT_BY_ID_SQL, keyword);
        }
        return selectBySql(SELECT_BY_NAME_SQL, "%" + keyword + "%");
    }

    public List<Box> selectByLoaiBox(String maLoai) {
        String sql = "SELECT * FROM BOX WHERE MALOAIBOX = ?";
        return selectBySql(sql, maLoai);
    }

    public String getMaxId() throws SQLException {
        String sql = "SELECT TOP 1 * FROM Box ORDER BY MaBox DESC";
        List<Box> list = this.selectBySql(sql);

        return list.get(0).getMaBox();
    }

    //------------------dat box-----------------------
//    public void updateBoxState(Box2 box) {
//        String sql = "update Box\n"
//                + "set TrangThai = ?\n"
//                + "where MaBox = ?";
//
//        try {
//            int responce = JdbcHelper.update(sql, box.getTrangThai());
//
//            if (responce == 0) {
//                throw new Error("The Error in updateBoxState !");
//            }
//        } catch (Exception e) {
//            throw new Error("The Error in updateBoxState !");
//        }
//
//    }
//    private BoxState boxState(String value) {
//        switch (value) {
//            case "reserved":
//
//                return BoxState.reserved;
//            case "isActive":
//
//                return BoxState.isActive;
//            case "inactive":
//
//                return BoxState.inactive;
//            default:
//                return BoxState.inactive;
//        }
//    }
//    @Override
//    public Box2 createObjecet(ResultSet response) {
//
//        try {
//            return new Box2(
//                    response.getInt(1),
//                    response.getString(2),
//                    response.getString(3),
//                    boxState(response.getString(4)),
//                    response.getString(5)
//            );
//        } catch (Exception e) {
//            throw new Error("The Error in createObjecet Box !");
//        }
//
//    }
    
}
