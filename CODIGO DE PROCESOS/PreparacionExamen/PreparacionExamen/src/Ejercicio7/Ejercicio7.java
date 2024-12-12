package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
---

### Ejercicio 7
Con la clase `ProcessBuilder`:

1. Crea un proceso que muestre por pantalla los directorios o archivos de la ruta `C:\`.

---
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        metodoA();
        metodoB();
    }

    public static void metodoA(){
        try {
            // Crear un proceso con ProcessBuilder
            ProcessBuilder processBuilder = new ProcessBuilder();

            // Configurar el comando para listar archivos en C:\
            processBuilder.command("cmd.exe", "/c", "dir", "C:\\");

            // Iniciar el proceso
            Process process = processBuilder.start();

            // Leer la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();
            System.out.println("\nEl proceso terminó con el código: " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void metodoB(){
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/C","dir","C:\\");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processBuilder.start().getInputStream()));
            do {
                System.out.println(bufferedReader.readLine());
            }while (bufferedReader.readLine() != null);
        } catch (IOException e) {
            System.out.println("Error en el ejercicio 7");
        }
    }
}
