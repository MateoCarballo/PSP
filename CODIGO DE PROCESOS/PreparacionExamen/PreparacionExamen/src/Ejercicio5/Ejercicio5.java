package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
---

### Ejercicio 5
Con la clase `ProcessBuilder`:

1. Crea un proceso que muestre por pantalla el resultado de hacer un **ping a google.com**.

---
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        Process process = null;

        try {
            process = new ProcessBuilder("ping","google.com").start();
        } catch (IOException e) {
            System.out.println("Excepcion al arrancar el proceso");
        }
        if (process != null){
            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        }
        try {
            do {
                if (bufferedReader != null){
                    System.out.println(bufferedReader.readLine());
                }
            }while(process.isAlive());
            // Sugerencia de IntelliJ while(Objects.requireNonNull(process).isAlive())
        } catch (IOException e) {
            System.out.println("Excepcion al printear en la consola el ping a google");
        }
        // Mostrar el codigo de salida

        try {
            int codigo = process.waitFor();
            System.out.println(codigo);
        } catch (InterruptedException e) {
            System.out.println("Error al printear el codigo");
        }

        process.destroy();
    }
}
