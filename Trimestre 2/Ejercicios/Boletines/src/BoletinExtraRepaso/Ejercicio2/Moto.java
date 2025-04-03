package BoletinExtraRepaso.Ejercicio2;

public class Moto extends Thread {
    private Semaforo semaforo;
    private int id;

    public Moto(int id, Semaforo semaforo) {
        this.semaforo = semaforo;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            semaforo.pasarMoto(id);  // La moto intenta pasar
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
