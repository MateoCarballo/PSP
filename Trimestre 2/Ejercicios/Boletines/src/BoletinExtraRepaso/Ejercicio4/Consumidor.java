package BoletinExtraRepaso.Ejercicio4;


public class Consumidor extends Thread {
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consumir();
                Thread.sleep(700);  // Simula el consumo de un item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
