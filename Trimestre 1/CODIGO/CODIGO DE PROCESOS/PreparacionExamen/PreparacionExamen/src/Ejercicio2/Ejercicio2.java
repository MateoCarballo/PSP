package Ejercicio2;


import java.io.IOException;

/*
---

### Ejercicio 2
Con la clase `ProcessBuilder`, que es otra manera de ejecutar procesos:

1. Lanza **Paint**.
2. Lanza **Notepad**.
3. Lanza **Chrome**.

---
 */
public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        lanzaPaint();
        lanzaNotepad();
        lanzaChrome();
    }

    private static void lanzaPaint() throws IOException {
        Process p = new ProcessBuilder("mspaint.exe").start();

    }

    private static void lanzaNotepad() throws IOException {
        Process p = new ProcessBuilder("notepad.exe").start();
    }

    private static void lanzaChrome() throws IOException {
        Process p = new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe").start();
    }
}
