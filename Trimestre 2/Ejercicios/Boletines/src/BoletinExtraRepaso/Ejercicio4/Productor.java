package BoletinExtraRepaso.Ejercicio4;

public class Productor extends Thread {
    private Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = (int) (Math.random() * 100);
                buffer.producir(item);
                Thread.sleep(500);  // Simula la producción de un item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
