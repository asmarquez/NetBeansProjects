/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PERSONAL
 */
public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3307/mydb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }

}
