package NotepadAbreArchivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class NotePadAbreArchivo {
    /*
    Utilizando la clase runtime consigue que se abra el notepad y que
    contenga lo que hay en otro archivo externo creado por nosotros
     */
    public static void main(String[] args){
        try {
            //Podemos decirle el programa a ejeccutar como los argumentos

            File f = new File("src/NotepadAbreArchivo/Archivo.txt");
            if (!f.exists()){
                if (f.mkdirs()){

                }
            }

            String [] param = {"C:\\Users\\a22mateoca\\AppData\\Local\\BraveSoftware\\Brave-Browser\\Application\\brave.exe"};
            Process process = Runtime.getRuntime().exec(param);
        } catch (IOException e) {
            System.out.println("Error durante la apertura de Notepad");;
        }
    }

}
