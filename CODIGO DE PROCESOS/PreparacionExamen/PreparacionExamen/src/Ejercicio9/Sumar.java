package Ejercicio9;

import java.io.*;
import java.util.Scanner;

public class Sumar {
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

}
