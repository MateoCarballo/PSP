package Boletin1.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Crea una clase que implemente la interfaz Runnable cuya única funcionalidad sea visualizar el
    mensaje "Hola Mundo" seguido de una cadena que se recibirá en el constructor y seguido del
    identificador del hilo. Crea un programa Java que visualice el mensaje anterior creando para ello
    5 hilos diferentes. Luego haz que el hilo espere un tiempo proporcional a su identificador, usando
    para ello el método sleep.
     */
    public static void main(String[] args) {
        List<HolaMundo> holaMundos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            holaMundos.add(new HolaMundo("Posicion " + i));
        }

        for(HolaMundo hm: holaMundos){
            hm.start();
        }
    }
}
