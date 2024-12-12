package Ejercicio4;

import java.io.IOException;

/*
### Ejercicio 4
Con la clase `Runtime`:

1. Lanza un proceso para abrir **Chrome**.
2. Obtén su PID y muestra su información.
3. Comprueba si el proceso está vivo antes y después de destruirlo.

---
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            System.out.println("    PID ->              " + p.pid());
            System.out.println("    INFO ->             " + p.info());
            System.out.println("    Its Alive ->        " + p.isAlive());
            p.waitFor();
            p.destroy();
            System.out.println("Destruimos el proceso ");
            System.out.println("Its Alive -> " + p.isAlive());

            System.out.println(" PID -> " + p.pid());
        } catch ( InterruptedException | IOException e) {
            System.out.println("Error al usar el metodo 'start() del proccesBuilder");
        }
    }
}
