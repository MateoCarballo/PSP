package BoletinExtraRepaso.Ejercicio02;

import java.util.ArrayList;

public class Semaforo {
    boolean esTurnoCoches = true;
    int cochesEsperando = 0;
    int motosEsperando = 0;

    public synchronized void cambiarSemaforo() {
        if (!esTurnoCoches && motosEsperando == 0) {
            esTurnoCoches = true;
        } else if (esTurnoCoches && cochesEsperando==0) {
            esTurnoCoches = false;
        }
        System.out.println(esTurnoCoches);
    }

}
