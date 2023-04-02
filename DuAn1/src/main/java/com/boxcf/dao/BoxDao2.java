package com.boxcf.dao;

import com.boxcf.models.Box2;
import com.box.utils.JdbcHelper;
import com.boxcf.constands.BoxState;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoxDao2 implements BoxCfDAO<Box2, String> {

    public static BoxDao2 getInstant() {
        return new BoxDao2();
    }

    @Override
    public void delete(String id) {
        String sql = "delete Box where MaBox = ?";

        try {
            int response = JdbcHelper.update(sql, id);

            if (response == 0) {
                throw new Error("The Error in delete Box !");
            }
        } catch (Exception e) {
            throw new Error("The Error in delete Box !");
        }
    }

    @Override
    public void insert(Box2 e) {
        String sql = "Insert into Box values (?, ?, ?, ?)";

        try {
            int response = JdbcHelper.update(sql, e.getTenBox(), e.getHinhAnh(), e.getMoTa(), e.getMaLoaiBox());

            if (response == 0) {
                throw new Error("The Error in insert Box !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in insert Box !");
        }

    }

    @Override
    public List<Box2> selectAll() {
        List<Box2> list = new ArrayList<>();
        String sql = "select * from Box";

        try {
            ResultSet response = JdbcHelper.query(sql);

            while (response.next()) {
                list.add(createObjecet(response));
            }

            response.getStatement().getConnection().close();

        } catch (Exception e) {
            throw new Error("The Error in selectAll Box !");
        }
        return list;
    }

    @Override
    public Box2 selectById(String id) {
        String sql = "select * from Box where MaBox = ?";
        Box2 box = null;
        try {

            ResultSet response = JdbcHelper.query(sql, id);

            // admission a ResultSet return a Box2
            if (response.next()) {
                box = createObjecet(response);
            }
            response.getStatement().getConnection().close();

        } catch (Exception e) {
            throw new Error("The Error in selectById Box !");
        }
        return box;
    }

    @Override
    public List<Box2> selectBySql(String sql, Object... args) {
        List<Box2> list = new ArrayList<>();

        try {
            ResultSet response = JdbcHelper.query(sql, args);

            while (response.next()) {
                list.add(createObjecet(response));
            }

            response.getStatement().getConnection().close();

        } catch (Exception e) {
            throw new Error("The Error in selectBySql Box !");
        }
        return list;
    }

    @Override
    public void update(Box2 e) {
        String sql = "update Box set TenBox = ? , HinhAnh = ?, TrangThai = ?, MaLoaiBox = ? where MaBox = ?";

        try {
            int response = JdbcHelper.update(sql, e.getTenBox(), e.getHinhAnh(), e.getTrangThai(), e.getMaLoaiBox(), e.getMaBox());

            if (response == 0) {
                throw new Error("The Error in update Box !");
            }
        } catch (Exception ex) {
            throw new Error("The Error in update Box !");
        }

    }

    public void updateBoxState(Box2 box) {
        String sql = "update Box\n"
                + "set TrangThai = ?\n"
                + "where MaBox = ?";

        try {
            int responce = JdbcHelper.update(sql, box.getTrangThai());

            if (responce == 0) {
                throw new Error("The Error in updateBoxState !");
            }
        } catch (Exception e) {
            throw new Error("The Error in updateBoxState !");
        }

    }

    private BoxState boxState(String value) {
        switch (value) {
            case "reserved":

                return BoxState.reserved;
            case "isActive":

                return BoxState.isActive;
            case "inactive":

                return BoxState.inactive;
            default:
                return BoxState.inactive;
        }
    }

    @Override
    public Box2 createObjecet(ResultSet response) {

        try {
            return new Box2(
                    response.getInt(1),
                    response.getString(2),
                    response.getString(3),
                    boxState(response.getString(4)),
                    response.getString(5)
            );
        } catch (Exception e) {
            throw new Error("The Error in createObjecet Box !");
        }

    }

    public List<Box2> panigation(Integer pageCurrent) {
        String sql = "SELECT TOP 8 * FROM Box WHERE MaBox NOT IN (SELECT TOP " + (pageCurrent * 8 - 8) + " MaBox FROM Box)";
        return this.selectBySql(sql);
    }

    public Integer getPageNumber() {
        return (int) Math.ceil(this.selectAll().size() / 8) + 1;
    }

    public static void main(String[] args) {
        BoxDao2.getInstant().delete(null);
    }

    final String SELECT_BY_ID_SQL = "SELECT * FROM BOX WHERE MABOX = ?";
    final String SELECT_BY_NAME_SQL = "SELECT * FROM BOX WHERE TENBOX LIKE ?";

    public List<Box2> selectByKeyWord(String keyword) {
        try {
            Integer.parseInt(keyword);
            if (selectById(keyword) != null) {
                return selectBySql(SELECT_BY_ID_SQL, keyword);
            }else {
                return selectBySql(SELECT_BY_NAME_SQL, "%" + keyword + "%");
            }
        } catch (Exception e) {
            return selectBySql(SELECT_BY_NAME_SQL, "%" + keyword + "%");
        }
    }

    public List<Box2> selectByLoaiBox(String maLoai) {
        String sql = "SELECT * FROM BOX WHERE MALOAIBOX = ?";

        return selectBySql(sql, maLoai);
    }
}
