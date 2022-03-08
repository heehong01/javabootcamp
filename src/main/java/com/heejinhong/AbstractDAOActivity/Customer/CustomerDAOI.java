package com.heejinhong.AbstractDAOActivity.Customer;

import java.sql.SQLTransientConnectionException;

public interface CustomerDAOI {
        enum SQL {
            GET_CUSTOMER_BY_ID("SELECT * FROM customer WHERE id=?"),
            ADD_CUSTOMER("INSERT INTO customer VALUES (?, ?, ?, ?)"),
            REMOVE_CUSTOMER("DELETE FROM customer WHERE id=?");
            private final String query;

            private SQL(String s) {
                this.query = s;
            }
            public String getQuery() {
                return query;
            }
        }
        Customer getCustomerById(int id);
        void addCustomer(Customer c);
        void removeCustomerById(int id);
    }

