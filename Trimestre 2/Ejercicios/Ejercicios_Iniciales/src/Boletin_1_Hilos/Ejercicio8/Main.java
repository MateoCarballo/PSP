package Boletin_1_Hilos.Ejercicio8;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File ruta = new File("out/production/Ejercicios_Iniciales/Boletin_Tema_2");
        ProcessBuilder processBuilder = new ProcessBuilder("java","Ejercicio8.ContarFicheros","./src/Boletin_Tema_2/Ejercicio8/Ficheros");
        processBuilder.directory(ruta);
        Process process = processBuilder.start();
        System.out.println(process.isAlive());
    }
}
