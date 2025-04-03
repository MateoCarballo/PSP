package BoletinExtraRepaso.Ejercicio2;

public class Semaforo {
    private boolean esCochesTurno = true;  // Empieza con los coches
    private int cochesEsperando = 0;
    private int motosEsperando = 0;

    public synchronized void pasarCoche(int id) throws InterruptedException {
        cochesEsperando++;
        while (!esCochesTurno && motosEsperando>0) {
            wait();  // El coche espera si no es su turno o si hay motos esperando
        }
        cochesEsperando--;
        System.out.println("Coche " + id + " pasando...");
        Thread.sleep(1000);  // Simula el tiempo que tarda un coche en pasar
        notifyAll();  // Notifica a otros vehículos que pueden pasar
    }

    public synchronized void pasarMoto(int id) throws InterruptedException {
        motosEsperando++;
        while (esCochesTurno || cochesEsperando>0) {
            wait();  // La moto espera si no es su turno o si hay coches esperando
        }
        motosEsperando--;
        System.out.println("Moto " + id + " pasando...");
        Thread.sleep(1000);  // Simula el tiempo que tarda una moto en pasar
        notifyAll();  // Notifica a otros vehículos que pueden pasar
    }

    public synchronized void cambiarSemaforo() {
        // El semáforo solo cambia si ya no quedan vehículos del otro tipo esperando
        if (!esCochesTurno && motosEsperando==0) {
            esCochesTurno = true;  // Ahora es el turno de los coches
        } else if (esCochesTurno && cochesEsperando==0) esCochesTurno = false;  // Ahora es el turno de las motos
        notifyAll();  // Notifica a todos los vehículos que pueden pasar
    }
}
