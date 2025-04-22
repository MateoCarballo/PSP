package BoletinExtraRepaso.Ejercicio2;

public class Coche extends Thread {
    private Semaforo semaforo;
    private int id;

    public Coche(int id, Semaforo semaforo) {
        this.semaforo = semaforo;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            semaforo.pasarCoche(id);  // El coche intenta pasar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
