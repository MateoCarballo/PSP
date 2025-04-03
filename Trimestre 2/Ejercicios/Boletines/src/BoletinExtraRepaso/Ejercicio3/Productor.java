package BoletinExtraRepaso.Ejercicio3;


public class Productor extends Thread {
    private Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int producto = (int) (Math.random() * 100);
                buffer.producir(producto);
                Thread.sleep(500);  // Simula el tiempo de producción
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
