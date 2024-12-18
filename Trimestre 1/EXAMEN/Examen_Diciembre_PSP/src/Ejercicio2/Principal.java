package Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        ProcessBuilder processBuilder = null;
        //CREAR ARCHIVO SI NO EXISTE
        File outputFile = new File("src/Ejercicio1/Salida_Ping_Google.txt");
        if (!(outputFile.exists())){
            boolean creado = outputFile.createNewFile();
        }

        try {
            // Crear un proceso con ProcessBuilder
            processBuilder = new ProcessBuilder();

            // Configurar el comando para listar archivos en C:\
            processBuilder.command("ping","google.com");

            // Configurar la salida del proceso a un archivo
            processBuilder.redirectOutput(outputFile);

            // Iniciar el proceso
            Process process = processBuilder.start();

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();
            System.out.println("El proceso terminó con el código: " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
