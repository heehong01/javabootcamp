package com.heejinhong.AbstractDAOActivity;

import java.sql.SQLException;

public class CustomerDAOImpl
        extends AbstractDAO
        implements CustomerDaoI{
    @Override
    public Customer getCustomerById(int id) {
        Customer customer = new Customer();
        try{
            this.connect();
            ps = conn.prepareStatement(SQL.GET_CUSTOMER_BY_ID.getQuery());
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                customer.setId(rs.getInt(1));
                customer.setEmail(rs.getString(2));
                customer.setFName(rs.getString(3));
                customer.setLName(rs.getString(4));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            this.dispose();
            return customer;
        }
    }

    @Override
    public Customer addCustomer(Customer c) {
        return null;
    }

    @Override
    public Customer removeCustomerById(int id) {

        return null;
    }
}
