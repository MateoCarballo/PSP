package Boletin1.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Crea un hilo cuya única funcionalidad sea visualizar el mensaje "Hola Mundo". Crea un programa
    Java que visualice el mensaje anterior 5 veces creando para ello 5 hilos diferentes usando la clase
    creada anteriormente. Modifica el mensaje en el hilo para incluir el identificador del hilo.
     */
    public static void main(String[] args) {
        List<HolaMundo> holaMundos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            holaMundos.add(new HolaMundo(i));
        }
        for (int i = 0; i < holaMundos.size(); i++) {
            holaMundos.get(i).start();
        }
    }
    
}
