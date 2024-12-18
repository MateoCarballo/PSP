package Ejercicio3.paqueteA.paqueteA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HallarArea {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int numeroA = Integer.parseInt(reader.readLine());
            int numeroB = Integer.parseInt(reader.readLine());
            System.out.println(numeroA+numeroB);
        }catch (IOException e){
            System.out.println("Error al leer los numeros");
        }
    }

    /*
    public static void main(String[] args) {
        int radio = 0;
        System.out.println("Programa para hallar el area");
        do{
            System.out.println("Introduce el radio para carcular el area del circulo");
            BufferedReader readerTeclado = new BufferedReader(new InputStreamReader(System.in));
            try {
                radio = Integer.parseInt(readerTeclado.readLine());
            } catch (IOException e) {
                System.out.println("Error en la entrada de datos por teclado");
            }
        }while(radio < 0);
        System.out.println(radio*radio*Math.PI);
    }
     */
}
