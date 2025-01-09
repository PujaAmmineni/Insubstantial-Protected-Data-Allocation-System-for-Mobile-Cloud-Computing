/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Puja
 */
public class DbConnection {
    public static Connection con = null;

    public static Connection getConnection() {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection using DriverManager
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DataPrivacyProtection", "root", "Puja@3108"); // Modify credentials accordingly
            
            // Return the connection if successful
            return con;
        } catch (ClassNotFoundException e) {
            // Handle the error for class not found
            System.out.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle errors for JDBC
            System.out.println("Connection failed! Check output console.");
            e.printStackTrace();
        }
        return null;
    }
}

/**package network;

/**
 *
 * @author java3
 */
