package Ejercicio3.paqueteA.paqueteA1;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        File ruta = new File("out/production/Examen_Diciembre_PSP/Ejercicio3/paqueteA");
        ProcessBuilder pb = new ProcessBuilder("java","paqueteA1.HallarArea");
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

/*
public static void main(String[] args) throws IOException {
        BufferedReader readerTeclado = new BufferedReader(new InputStreamReader(System.in));
        File directorio = new File("out/production/Examen_Diciembre_PSP/Ejercicio3/paqueteA");
        ProcessBuilder pb = new ProcessBuilder("java", "paqueteA1.HallarArea");
        // se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);

        // se ejecuta el proceso
        Process p =  pb.start();
        String cadenaRecibida;
        do {
            System.out.println("Introduce el radio del circulo");
            cadenaRecibida = readerTeclado.readLine();
        }while((Integer.parseInt(cadenaRecibida)) < 0);

        cadenaRecibida = cadenaRecibida + "\n";
        try{
            OutputStream os = p.getOutputStream();
            os.write("11\n".getBytes());
            os.flush();

            /*
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
        }

        /*
        catch (InterruptedException e) {
            System.out.println("Error en el wait For");
        }
         */


