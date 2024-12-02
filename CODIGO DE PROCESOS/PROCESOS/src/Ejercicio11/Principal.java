package Ejercicio11;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe el argumento para ejecutar Visualiza5Veces");
        String argumentoParaLaMain = bufferedReader.readLine();

        File ruta = new File("./out/production/PROCESOS");
        ProcessBuilder processBuilder =
                new ProcessBuilder("java","Ejercicio11.Visualiza5Veces",argumentoParaLaMain);
        processBuilder.directory(ruta);
        Process process = processBuilder.start();

        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        String leido;
        while ((leido = errorReader.readLine()) != null){
            System.out.println("Error :" + leido);
        }

        int i = process.waitFor();

        System.out.println("Programa finalido con codigo " + i);


    }
}
