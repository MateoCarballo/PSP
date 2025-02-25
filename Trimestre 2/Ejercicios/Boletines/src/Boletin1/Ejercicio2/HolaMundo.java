package Boletin1.Ejercicio2;

public class HolaMundo extends Thread{
    private int numeroHilo;

    public HolaMundo(int numeroHilo) {
        this.numeroHilo = numeroHilo;
    }

    public void run() {
        System.out.println("Hola Mundo desde hilo -> " + this.threadId());
    }
}
