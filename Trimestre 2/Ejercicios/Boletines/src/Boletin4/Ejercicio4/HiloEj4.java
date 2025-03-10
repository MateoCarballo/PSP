package Boletin4.Ejercicio4;

public class HiloEj4 extends Thread{
    private int numeroHilo;

    public HiloEj4(int numeroHilo) {
        this.numeroHilo = numeroHilo;
    }

    public void run(){
        System.out.println("Soy el hilo: " + numeroHilo);
    }
}
