/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.makery.address;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author mami
 */
public class MainApp extends Application{
    private Stage primaryStage;
    private BorderPane rootLayout;
    
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        this.primaryStage.setTitle("MAGI System");
        
        iniciar_RootLayout();
        mostrar_ventas();
        
    }
    
    
    public void iniciar_RootLayout(){
        
        try {
        //Cargar FMXL
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
        rootLayout = (BorderPane) loader.load();
        
        //Mostrar la escena denstro del root Layout
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false); //No se modifica el tamaño
        primaryStage.show();
        
        
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void mostrar_ventas(){
        try{
            FXMLLoader loader = new FXMLLoader ();
            loader.setLocation(MainApp.class.getResource("view/ventas.fxml"));
            AnchorPane ventas = (AnchorPane) loader.load();
            
            rootLayout.setCenter(ventas);
          
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    
        public void mostrar_compras(){
        try{
            FXMLLoader loader = new FXMLLoader ();
            loader.setLocation(MainApp.class.getResource("view/compras.fxml"));
            AnchorPane ventas = (AnchorPane) loader.load();
            
            rootLayout.setCenter(ventas);
          
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    
}
