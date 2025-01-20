package ej03_CalcularMediaThreads;

public class calcularMedias {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i + 1;
        }

        hiloMedia hilo1 = new hiloMedia(array, 0, 250);
        hiloMedia hilo2 = new hiloMedia(array, 250, 500);
        hiloMedia hilo3 = new hiloMedia(array, 500, 750);
        hiloMedia hilo4 = new hiloMedia(array, 750, 1000);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        // Esperamos a que todos los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Media hilo1 = " + hilo1.getMedia());
        System.out.println("Media hilo2 = " + hilo2.getMedia());
        System.out.println("Media hilo3 = " + hilo3.getMedia());
        System.out.println("Media hilo4 = " + hilo4.getMedia());

        double mediaTotal = hilo1.getMedia() + hilo2.getMedia() + hilo3.getMedia() + hilo4.getMedia();

        System.out.println("La media total es: " + mediaTotal);
    }
}
