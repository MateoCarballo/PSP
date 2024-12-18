package Ejercicio1;

import java.io.*;

public class Ejercicio1 {
    /*
    Ejercicio 1
Con la clase Runtime, que es la clase del sistema que permite acceder al
 entorno de ejecución de Java (incluyendo la capacidad de ejecutar comandos del sistema operativo):

Lanza un proceso que abra el Notepad.
Visualiza en el Notepad lo escrito en un archivo llamado saludo.txt ubicado en
la raíz del proyecto. Este archivo contiene el texto "hola".
Comprueba si el proceso está vivo antes y después de su ejecución.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        abrirArchivoEnNotepad(crearArchivo());
    }

    private static String crearArchivo() throws IOException {
        String rutaArchivo = "src/Ejercicio1/Ejercicio1.txt";  // Puede ser una ruta relativa o absoluta

        // Escribir en el archivo
        try {
            // Crear el archivo
            File archivo = new File(rutaArchivo);

            // Si el archivo no existe, lo creamos
            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            // Usamos FileWriter y BufferedWriter para escribir "hola" en el archivo
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            // Escribir el contenido
            bw.write("hola");

            // Cerrar el BufferedWriter
            bw.close();

            System.out.println("El archivo fue creado y escrito con éxito.");

        } catch (IOException e) {
            System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
        }
        return rutaArchivo;
    }

    private static void abrirArchivoEnNotepad(String rutaArchivo) throws IOException, InterruptedException {
        //Crear un objeto runtime
        /* OPCION 1

        ProcessBuilder pb = new ProcessBuilder("notepad.exe",rutaArchivo);
        Process process = pb.start();

         */

        Process process = new ProcessBuilder("notepad.exe",rutaArchivo).start();

    }
}