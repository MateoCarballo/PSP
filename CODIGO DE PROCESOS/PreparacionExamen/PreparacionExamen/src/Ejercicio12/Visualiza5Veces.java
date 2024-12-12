package Ejercicio12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Visualiza5Veces {
    public static void main(String[] args) {
        if (args.length != 0){
            for (int i = 0; i < 5 ; i++) {
                System.out.println(args[0]);
            }
            System.exit(0);
        }
        System.exit(1);
    }



}
