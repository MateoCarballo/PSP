package BoletinExtraRepaso.Ejercicio02;

public class Moto extends Thread {

    int idMoto;
    Semaforo semaforo;

    public Moto(int idMoto, Semaforo semaforo) {
        this.idMoto = idMoto;
        this.semaforo = semaforo;
    }

    public void run() {
        //TODO
    }
}
