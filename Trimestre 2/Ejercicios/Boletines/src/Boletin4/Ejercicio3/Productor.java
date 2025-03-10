package Boletin4.Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Productor extends Thread{
    private Compartido compartido;
    private String nombreArchivo;

    public Productor(Compartido compartido, String nombreArchivo) {
        this.compartido = compartido;
        this.nombreArchivo = nombreArchivo;
    }
    public void run(){
        File file = new File(nombreArchivo);
        if (file.exists()){
            try {
                FileReader fr = new FileReader(file);
                int numeroCaracter;

                while((numeroCaracter = fr.read()) != -1) {
                    this.compartido.put(numeroCaracter);
                }
                this.compartido.put(numeroCaracter);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("El fichero no existe!");
        }
    }
}
