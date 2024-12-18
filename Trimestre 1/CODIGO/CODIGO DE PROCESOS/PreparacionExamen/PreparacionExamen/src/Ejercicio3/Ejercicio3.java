package Ejercicio3;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
---

### Ejercicio 3
Con la clase `ProcessBuilder`:

1. Lanza **Paint**.
2. Cuando cierres Paint, lanza **Notepad**.
3. Cuando cierres Notepad, lanza **Chrome**.
4. Ayúdate de la clase `Process`.

---

 */
public class Ejercicio3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p1 = new ProcessBuilder("mspaint.exe").start();
        p1.waitFor();
        Process p2 = new ProcessBuilder("notepad.exe").start();
        //tras cerrar lanzar notepad
        p2.waitFor();
        Process p3 = new ProcessBuilder("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"").start();
    }
}
