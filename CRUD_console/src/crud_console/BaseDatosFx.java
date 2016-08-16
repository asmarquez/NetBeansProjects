/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_console;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mami
 */
public class BaseDatosFx {
    
    public static Connection connection;
    public static PreparedStatement preparedStatement;
    public static ResultSet resultSet;
    //String query;
    
    public static List<producto> consultar(String query) {
        
        List<producto> outList = new ArrayList<producto>();
        
        
        connection = Conexion.getConnection();
        
        try {

            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            //System.out.println("Registro aceptado!");

            //resultSet.next();
            //String codigo = 
            while (resultSet.next()) {

                outList.add(new producto(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(10)));

                //for (int i = 1; i < 11; i++) {
                //    //System.out.print(resultSet.getMetaData().getColumnLabel(i).toUpperCase() + ":   ");
                //    System.out.print(resultSet.getString(i) + "\t");
                //}
                //System.out.print("\n");
            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en busqueda");

        }
        
        
        return outList;
    }  
    
}
