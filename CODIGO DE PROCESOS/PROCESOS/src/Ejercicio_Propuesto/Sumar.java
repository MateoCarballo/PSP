package Ejercicio_Propuesto;

import java.util.Scanner;

public class Sumar {
    public static void sumarDosNumeros() {
        int numero1;
        int numero2;
        try{
                Scanner scanner = new Scanner(System.in);
                numero1= scanner.nextInt();
                numero2= scanner.nextInt();
                System.out.println("Resultado -> " + (numero1 + numero2));

        } catch (Exception e) {
            System.out.println("Ha ocurrido una excepcion genérica");
        }
    }
}
