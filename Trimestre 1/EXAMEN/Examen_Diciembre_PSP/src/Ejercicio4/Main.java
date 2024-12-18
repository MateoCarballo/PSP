package Ejercicio4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File ruta = new File(".out/production/ExamenDiciembrePSP");
        ProcessBuilder processBuilder = new ProcessBuilder("java","Ejercicio4.ReplicarCadena","5");
        processBuilder.directory(ruta);
        Process process = processBuilder.start();
        System.out.println(process.isAlive());
    }
}
