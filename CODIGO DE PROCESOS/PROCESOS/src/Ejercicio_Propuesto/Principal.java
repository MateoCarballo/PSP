package Ejercicio_Propuesto;

import java.io.*;

public class Principal {
    /*
     9.
PRIMERO:Crea una clase llamada Sumar que coja por consola dos números enteros y que muestre por consola el resultado de la suma.  Debes capturar una excepción general si introduces otra cosa que no sean dos números.

SEGUNDO:  Crea una clase llamada Principal que lance el proceso anterior y que verifique si lo introducido por teclado son dos números.
Pasos:
1) Crea una clase File en donde está alojado el archivo Sumar.class
2) Crea un ProcessBuilder en donde eliges la clase a ejecutar.
3) Elige el directorio con el método directory de la clase ProcessBuilder.
4) Arranca el proceso.
5) Crea un OutputStream en donde meterás los datos que van a entrar al proceso.
6) Crea un BufferedReader en donde leeremos línea a línea para mostrar la información recibida
7)Muestra el código de salida
8) Crea un BufferedReader en donde leeremos línea a línea para mostrar los errores recibidos
     */

    public static void main(String[] args) throws IOException {
        primerPaso();
    }

    public static void primerPaso() throws IOException {
        //Dependiendo del IDE la ruta al .class varía

        File ruta = new File(".\\out\\production\\PROCESOS");
        ProcessBuilder pb = new ProcessBuilder("java","Ejercicio_Propuesto.Sumar");
        pb.directory(ruta);
        Process p = pb.start();


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
