package Boletin1.Ejercicio5;

import java.io.*;
import java.net.*;

public class ejercicio5_Cliente {
    public static void main(String[] args) throws Exception {
        String Host = "localhost";
        int Puerto = 6000;
        System.out.println("Conectando con el servidor...");

        // ABRIR SOCKET
        Socket Cliente = null;

        try {
            Cliente = new Socket(Host, Puerto);
        } catch (ConnectException c) {
            System.out.println("SERVIDOR CERRADO. ");
            return;
        }
        // RECIBO SALUDO DEL SERVIDOR
        InputStream aux = Cliente.getInputStream();
        DataInputStream flujo = new DataInputStream(aux);

        System.out.println("Recibiendo del servidor: " + flujo.readUTF());

        System.out.println("CLIENTE CERRADO. ");

        Cliente.close();// Cierra el socket
    }// main
}//
