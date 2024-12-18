package Ejercicio12;

import java.io.*;

/*
---

### Ejercicio 12
Partiendo del **Ejercicio 11**:

1. Modifica el programa para que la cadena introducida por teclado se guarde en un archivo de texto en lugar de mostrarse por pantalla.

---
 */

public class Ejercicio12 {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe el argumento para ejecutar Visualiza5Veces");
        String argumentoParaLaMain = bufferedReader.readLine();
        File ruta = new File("./out/production/PreparacionExamen");
        ProcessBuilder processBuilder = new ProcessBuilder("java","Ejercicio12.Visualiza5Veces",argumentoParaLaMain);
        processBuilder.directory(ruta);
        Process process = processBuilder.start();

        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        File archivoSalida = new File("./src/Ejercicio12/Salida_Ejercicio_12.txt");
        if (!archivoSalida.exists()) {
            boolean creado = false;
            try {
                creado = archivoSalida.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (creado) {
                System.out.println("Archivo creado: " + archivoSalida.getAbsolutePath());
            }
        }
        String leido;
        while ((leido = errorReader.readLine()) != null){

            try {
                // Escribir en el archivo
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
                    for (int i = 0; i < 5; i++) {
                        writer.write(leido);
                        writer.newLine();
                    }
                }
                System.exit(0);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int i = process.waitFor();

        String salida = ("Programa finalido con codigo " + i);
    }
}

