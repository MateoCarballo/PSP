package Boletin1.Ejercicio8_Contar;

import java.io.*;

class Ejercicio8Hilo extends Thread {

    FileReader fic;

    public Ejercicio8Hilo(FileReader fic, String nombre) {
        this.fic = fic;
        setName(nombre);
    }

    public void run() {
        int c = 0;
        try {
            long t_comienzo = System.currentTimeMillis();
            c = ContarCaracteres(fic);
            long t_fin = System.currentTimeMillis();
            long tiempoTotal = t_fin - t_comienzo;
            System.out.printf("Caracteres de %s => %d %n "
                    + "   El proceso ha tardado: %d milisegundos %n", getName(), c, tiempoTotal);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fic.close();
        } catch (IOException e) {
            e.printStackTrace();
        } // cerrar fichero

    }

    int ContarCaracteres(FileReader fic) throws IOException {
        int i;
        int c = 0;
        while ((i = fic.read()) != -1) // se va leyendo un car�cter
            c++;
        return c;
    }


}//fin del hilo

public class Ejercicio8_Contar_Hilo {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Faltan argumentos en main...");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            File fichero = new File(args[i]); // declarar fichero
            if (fichero.exists()) {
                FileReader fic = new FileReader(fichero); // crear el flujo de entrada
                Ejercicio8Hilo hilo = new Ejercicio8Hilo(fic, args[i]);
                hilo.start();
            } else
                System.out.printf("El fichero [%s] no existe...%n", args[i]);
        }

    }//main


}
