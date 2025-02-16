package com.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
    private static String url = "jdbc:mysql://localhost:3306/ e_channeling";
    private static String username = "root";
    private static String pwd = "31415";
    private static Connection con;

    public static Connection getConnection() 
    {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the database connection
            con = DriverManager.getConnection(url, username, pwd);
            System.out.println("Database connection successful!");
        } 
        catch (ClassNotFoundException e)
        {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
            
        } catch (SQLException e) 
        {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
        return con;
    }
}
