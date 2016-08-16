/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PERSONAL
 */
public class Conexion {

    public static final String URL = "jdbc:mysql://192.168.0.58:3307/mydb";
    public static final String USERNAME = "cliente1";
    public static final String PASSWORD = "root";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion exitosa, eres super!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return connection;
    }

}
