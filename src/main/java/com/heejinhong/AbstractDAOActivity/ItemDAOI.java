package com.heejinhong.AbstractDAOActivity;

import java.sql.SQLTransientConnectionException;
import java.util.List;

public interface ItemDAOI {
    enum SQL{
        GET_ALL_ITEM("SELECT * FROM item"),
        ADD_ITEM("SELECT * FROM students WHERE id=?"),
        REMOVE_ITEM_BY_ID("SELECT * FROM item where id =?");
        private final String query;

        private SQL(String s) {
            this.query = s;
        }
        public String getQuery() {
            return query;
        }
    }
    List<Item> getAllItems();
    Item addItem(Item i);
    Item removeItemById(int id);
}
