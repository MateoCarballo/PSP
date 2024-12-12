package Ejercicio10;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/*
---
### Ejercicio 10
Crea una clase llamada `Devol` que devuelva valores con `System.exit()` según estas condiciones:

- Si el número de argumentos es menor a 1, devuelve **1**.
- Si el argumento es una cadena, devuelve **2**.
- Si el argumento es un número entero menor que 0, devuelve **3**.
- En cualquier otro caso, devuelve **0**.
---
 */
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        File ruta = new File("./out/production/PROCESOS");
        ProcessBuilder processBuilder = new ProcessBuilder("java","Ejercicio10.Devol","5");
        processBuilder.directory(ruta);
        Process process = processBuilder.start();

        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String error;
        while ((error = errorReader.readLine()) != null ){
            System.out.println(error);
        }
        int exitCode = process.waitFor();
        switch (exitCode){
            case 0 -> System.out.println("Funcionamiento correcto");
            case 1 -> System.out.println("No tiene argumentos");
            case 2 -> System.out.println("El parametro no es un numero");
            case 3 -> System.out.println("El parametro es negativo");
            default -> System.out.println("Opcion fuera de rango 0-3");
        }
    }
}
