package com.heejinhong.AbstractDAOActivity.mydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.heejinhong.AbstractDAOActivity.Constants.*;

public class DropItemTable {
    public static void dropItemTable() {
        String url = JDBC_MYSQL_LOCALHOST_MYDB;
        Connection con;
        String dropString = "DROP TABLE item";
        Statement stmt;

        try{
            Class.forName(MYSQL_CJ_JDBC_DRIVER);
        }catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try{
            con = DriverManager.getConnection(url, USERNAME, PASSWORD);
            stmt = con.createStatement();
            stmt.executeUpdate(dropString);

            System.out.println("ITEM table is successfully dropped");
            stmt.close();
            con.close();
        }catch (SQLException ex){
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}
