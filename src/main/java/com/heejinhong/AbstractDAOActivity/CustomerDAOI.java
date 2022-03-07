package com.heejinhong.AbstractDAOActivity;

import java.sql.SQLTransientConnectionException;
import java.util.List;

public interface CustomerDaoI {
    enum SQL {
        GET_CUSTOMER_BY_ID("SELECT * FROM customer WHERE id=?"),
        ADD_CUSTOMER("SELECT * FROM students WHERE id=?"),
        REMOVE_CUSTOMER("SELECT * FROM students WHERE id=?");
        private final String query;

        private SQL(String s) {
            this.query = s;
        }
        public String getQuery() {
            return query;
        }
    }
    Customer getCustomerById(int id);
    Customer addCustomer(Customer c);
    Customer removeCustomerById(int id);
}
