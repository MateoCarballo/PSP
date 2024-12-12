package Ejercicio11;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
---

### Ejercicio 11
#### Parte 1: Clase `Visualiza5Veces`

1. Crea un programa en Java que:
    - Visualice 5 veces la cadena que recibe desde los argumentos de `main()`.
    - Si no recibe ninguna cadena, muestre el mensaje: **"Se necesita una cadena"** y termine con `System.exit(1)`.

#### Parte 2: Clase `Principal`

1. Crea un programa que:
    - Introduzca una cadena por teclado.
    - Ejecute el programa anterior (`Visualiza5Veces`) para visualizar 5 veces la cadena.

#### Pasos sugeridos:

1. Recoge la cadena desde la consola.
2. Configura el archivo del ejecutable.
3. Usa un `ProcessBuilder` y añade el argumento correspondiente.
4. Establece el directorio donde se encuentra el ejecutable.
5. Inicia el proceso.
6. Usa un `BufferedReader` para leer errores.
7. Muestra el código de salida y los resultados obtenidos.

---
 */

public class Ejercicio11 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduzca la cadena: ");
        cadena = sc.nextLine();

        File directorio = new File("out/production/PreparacionExamen");

        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio11.VisualizaCincoVeces", cadena);

        // se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);

        // se ejecuta el proceso
        Process p = pb.start();

        try {
            //InputStream er = p.getErrorStream();
            BufferedReader brer = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String liner = null;
            while ((liner = brer.readLine()) != null)
                System.out.println("ERROR >" + liner); //ejemplo: no poner el paquete (paquete11) en el ProcessBuilder
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // COMPROBACION DE la salida del programa
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
            switch (exitVal) {
                case (0):
                    System.out.println("FINAL CORRECTO...");
                    break;
                case (1):
                    System.out.println("FINAL INCORRECTO...");//ejemplo no meter parámetro:ProcessBuilder pb = new ProcessBuilder("java", "Visualiza5Veces");
                    break;
            }

        } catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            //InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null)
            {
                System.out.println(linea);
            }
            br.close();
        } catch (Exception ee) 	{
            ee.printStackTrace();
        }

    }
}
