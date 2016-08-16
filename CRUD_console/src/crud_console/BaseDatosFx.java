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
            //System.out.print("N col " + resultSet.getMetaData().getColumnCount());
            int nCol = resultSet.getMetaData().getColumnCount();
            

            while (resultSet.next()) {
                
                producto auxProducto = new producto();
                for (int i = 1; i <= nCol; i++) {
                    auxProducto.setDataByIndex(resultSet.getString(i), i);
                    //System.out.println(resultSet.getString(i));
                }
                System.out.print("\n");    
                outList.add(auxProducto);
            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en busqueda");

        }

        return outList;
    }

}
