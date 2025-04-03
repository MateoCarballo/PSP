package BoletinExtraRepaso.Ejercicio2;

public class HiloCambioColorSemaforo extends Thread {
    Semaforo semaforo;

    public HiloCambioColorSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);  // El semáforo cambia de color cada 2 segundos
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            semaforo.cambiarSemaforo();
        }
    }
}
