/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author aizarrahima
 */
public class dbconnection {
    Connection conn;

    public dbconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/retail_management", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 0);
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
