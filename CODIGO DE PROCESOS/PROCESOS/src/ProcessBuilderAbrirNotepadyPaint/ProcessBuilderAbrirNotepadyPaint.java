package ProcessBuilderAbrirNotepadyPaint;

import java.io.IOException;

public class ProcessBuilderAbrirNotepadyPaint {
    public static void main(String[] args) {
        /*
        Crea dos procesos para lanzae:
        1 -> Notepad.
        2 -> Paint
         */
        Process pb = null;
        try {
            pb = new ProcessBuilder("notepad.exe").start();
        } catch (IOException e) {
            System.out.println("Error al abrir el notepad");;
        }

        try {
            pb = new ProcessBuilder("mspaint.exe").start();
        } catch (IOException e) {
            System.out.println("Error al abrir paint");
        }
        /*
        Crea un proceso para lanzar el chrome:
            1-> Brave o cualquier programa instalado despues de Windows, que no lo traiga por defecto.
         */
        String [] data = {"C:\\Users\\a22mateoca\\AppData\\Local\\BraveSoftware\\Brave-Browser\\Application\\brave.exe"};
        try {
            Process process = Runtime.getRuntime().exec(data);
        } catch (IOException e) {
            System.out.println("Error al abrir brave");
        }

    }
}
