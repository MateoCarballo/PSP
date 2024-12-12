package Ejercicio9;

import java.io.*;

/*
---

### Ejercicio 9
#### Parte 1: Clase `Sumar`

1. Crea una clase llamada `Sumar` que:
    - Lea dos números enteros desde la consola.
    - Muestre el resultado de su suma.
    - Capture una excepción general si se introducen datos no numéricos.

#### Parte 2: Clase `Principal`

1. Crea una clase llamada `Principal` que:
    - Lance el proceso anterior (`Sumar`).
    - Verifique si los datos introducidos son dos números.

#### Pasos sugeridos:

1. Crea un archivo `Sumar.class` en un directorio específico.
2. Utiliza un `ProcessBuilder` para ejecutar la clase `Sumar`.
3. Configura el directorio usando el mét0do `directory` de `ProcessBuilder`.
4. Inicia el proceso.
5. Usa un `OutputStream` para enviar datos al proceso.
6. Usa un `BufferedReader` para leer línea por línea la información recibida.
7. Muestra el código de salida.
8. Usa otro `BufferedReader` para leer los errores recibidos línea por línea.

---
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        metodoClase();
        //METODO-B
    }

    public static void metodoClase(){
        // OJO CON LAS RUTAS NO ESTAN BIEN
        //Dependiendo del IDE la ruta al .class varía

        File ruta = new File("out/production/PreparacionExamen");
        ProcessBuilder pb = new ProcessBuilder("java","Ejercicio9.Sumar");
        pb.directory(ruta);
        Process p = null;
        try {
            p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try{
            OutputStream os = p.getOutputStream();
            os.write("15\n".getBytes());
            os.write("3\n".getBytes());
            os.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            // Leer los posibles errores (si los hay)
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String errorLine;
            while ((errorLine = errorReader.readLine()) != null) {
                System.err.println(errorLine);  // Mostrar los errores
            }

            // Esperar a que el proceso termine y obtener su código de salida
            int exitCode = p.waitFor();
            System.out.println("Código de salida: " + exitCode);

        }catch (IOException e){
            System.out.println("Error del tipo IOE");
        } catch (InterruptedException e) {
            System.out.println("Error en el wait For");
        }
    }
}
