package com.heejinhong.AbstractDAOActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.heejinhong.AbstractDAOActivity.Item.*;
import com.heejinhong.AbstractDAOActivity.Customer.*;
import com.heejinhong.AbstractDAOActivity.mydb.*;
import static com.heejinhong.AbstractDAOActivity.Constants.*;

public class DAOMain {
    public static void main(String[] args) {
        //DropCustomerTable.dropCustomerTable();
        //DropItemTable.dropItemTable();
        //Initialization of Customers and Item table
        initializationOfTablesCustomersAndItem();

        InsertCustomersTable.insertCustomersTable();
        InsertItemsTable.insertItemsTable();

        CustomerDAOI customerDAOI = new CustomerDAOImpl();
        ItemDAOI itemDAOI = new ItemDAOImpl();
git

        itemDAOI.getAllItems();

        DropCustomerTable.dropCustomerTable();
        DropItemTable.dropItemTable();
    }

    private static void initializationOfTablesCustomersAndItem() {
        CreateCustomersTable.createCustomersTable();
        CreateItemsTable.createItemsTable();
    }

}
/*Database Tables:
Customer - id(int), email(varchar2), fname(varchar2), lname(varchar2).
Item - id(int), name(varchar2), price(Number(4,2)).
Create models for each table.
Create DAOs with the following methods:
CustomerDAO
getCustomerById(int id) - Returns the customer object for the given id.
addCustomer(Customer c) - Adds a customer with given information.
removeCustomerById(int id) - Removes a customer with the given id.
ItemDAO
getAllItems() - Returns a list of all item objects in the database.
addItem(Item i) - Adds an item with given information.
removeItemById(int id) - Removes an item with the given id.
*/
