package Ejercicio6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
---

### Ejercicio 6
Con la clase `Runtime`:

1. Crea un proceso que muestre por pantalla el resultado de hacer un **ping a google.com**.

---
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            // Crear el proceso para ejecutar el comando ping
            Process process = Runtime.getRuntime().exec("ping google.com");

            // Leer la salida del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Mostrar cada línea de salida
            }

            // Esperar a que el proceso termine y verificar su código de salida
            int exitCode = process.waitFor();
            System.out.println("El proceso terminó con el código: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones
        }
    }
}
