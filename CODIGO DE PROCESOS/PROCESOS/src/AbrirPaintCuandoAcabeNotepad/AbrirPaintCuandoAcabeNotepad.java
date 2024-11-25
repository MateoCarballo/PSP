package AbrirPaintCuandoAcabeNotepad;

import java.io.IOException;

public class AbrirPaintCuandoAcabeNotepad {
    /*
        nombreProceso.waitFor(); => ESPERA A QUE EL PROCESO ACABE

        1 -> Arrancamos Notepad ->

         */

    public static void main(String[] args){
        Process p1 = null;
        try {
            p1 = new ProcessBuilder("notepad.exe").start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            p1.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Process p2 = null;
        try {
            p2 = new ProcessBuilder("mspaint.exe").start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            p2.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Process p3 = null;
        try {
            p3 = new ProcessBuilder("mspaint.exe").start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            p3.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
