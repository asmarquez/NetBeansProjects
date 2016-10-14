package raspiclient;

import java.io.*;
import java.net.*;

public class RasPiClient2 {

    public static void main(String[] args) throws IOException {

        String nombreCliente = "MAC";
        
        Socket s = new Socket("192.168.2.69", 7777);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter salida = new PrintWriter(s.getOutputStream());
        
        System.out.println(entrada.readLine());
        salida.print(nombreCliente);
        salida.flush();
        
        
        s.close(); 

    }

}
