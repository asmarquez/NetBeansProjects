/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspiserver;

/**
 *
 * @author Juan
 */
import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RasPiServer extends Thread {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    Socket id;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public RasPiServer(Socket s) {
        id = s;
    }

    @Override
    public void run() {
        try {
            PrintWriter salida = new PrintWriter(id.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(id.getInputStream()));
             
            salida.println("ServidorSphynix: "+dateFormat.format(new Date()));
            System.out.print("Cliente conectado: ");
            System.out.println(entrada.readLine());


        } catch (IOException ex) {
            Logger.getLogger(RasPiServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here

        ServerSocket ss = new ServerSocket(7777);

        while (true) {
            System.out.println("Escuchando en puerto:7777");
            Socket s = ss.accept();
            System.out.println("Cliente encontrado");
            RasPiServer t = new RasPiServer(s);
            t.start();
        }

        //ss.close();

    }

}
