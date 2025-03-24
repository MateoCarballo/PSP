package BoletinExtraRepaso.Ejercicio02;

public class AlterarSemaforo extends Thread{
    Semaforo semaforo;

    public AlterarSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public void run(){
        while (true){
            try {
                sleep(2000);
                semaforo.cambiarSemaforo();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
