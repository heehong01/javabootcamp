package com.heejinhong.AbstractDAOActivity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl
        extends AbstractDAO
        implements ItemDAOI {
    @Override
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        try {
            this.connect();
            ps = conn.prepareStatement(SQL.GET_ALL_ITEM.getQuery());
            rs = ps.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt(1));
                item.setName(rs.getString(2));
                item.setPrice(rs.getDouble(3));
                items.add(item);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            this.dispose();
            return items;
        }
        return null;
    }

    @Override
    public Item addItem(Item i) {
        return null;
    }

    @Override
    public Item removeItemById(int id) {
        return null;
    }
}
