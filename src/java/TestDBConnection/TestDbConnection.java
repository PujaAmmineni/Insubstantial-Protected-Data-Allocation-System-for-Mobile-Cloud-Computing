/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestDBConnection;

import java.sql.Connection;
import network.DbConnection;
/**
 *
 * @author Puja
 */
public class TestDbConnection {
    public static void main(String[] args) {
        Connection con = DbConnection.getConnection();
        if (con != null) {
            System.out.println("Connection established successfully!");
        } else {
            System.out.println("Failed to establish connection!");
        }
    }
    
}
