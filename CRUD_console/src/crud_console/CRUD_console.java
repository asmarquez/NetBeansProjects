/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_console;


import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author mami
 */
public class CRUD_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<producto> productoData = new ArrayList<producto>();
        
        String query;
        
        query = "SELECT * FROM cheer.usuarios";
        
        productoData = BaseDatosFx.consultar(query);
        
        try {

            
            producto resProducto = productoData.get(6);

            for (int i = 1; i<=2 ; i++)
                System.out.print(resProducto.getDataByIndex(i) + "\t");
            
        } catch (Exception ex) {
            System.out.println(ex);
        } 
       

    }

}
