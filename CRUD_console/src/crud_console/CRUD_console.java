/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_console;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        
        query = "SELECT * FROM mydb.stock";
        
        productoData = BaseDatosFx.consultar(query);
        
        try {

            //System.out.println("TERMINADO ");
            producto resProducto = productoData.get(200000);

            System.out.print(resProducto.getDataByIndex(12) + "\t");
        } catch (Exception ex) {
            System.out.println(ex);
        } 
       

    }

}
