package Ejercicio8;


import java.io.File;
import java.io.IOException;

/*
---

### Ejercicio 8
Con la clase `ProcessBuilder`:

1. Crea un proceso que guarde en un archivo la lista de directorios o archivos de la ruta `C:\`.

---

 */
public class Ejercicio8 {
    public static void main(String[] args) {
        metodoA();
        metodoB();
    }

    private static void metodoA() {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/C","dir","C:\\");
        processBuilder.redirectOutput(new File("Fichero_resultado.txt"));
        try {
            Process p = processBuilder.start();
        } catch (IOException e) {
            System.out.println("Error al castear a proceso el proccesBuilder");
        }
    }
    private static void metodoB() {
        try {
            // Crear un proceso con ProcessBuilder
            ProcessBuilder processBuilder = new ProcessBuilder();

            // Configurar el comando para listar archivos en C:\
            processBuilder.command("cmd.exe", "/c", "dir", "C:\\");

            // Configurar la salida del proceso a un archivo
            File outputFile = new File("output.txt");
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
