package Boletin3.Ejercicio1;

public class Relevos {


    public static void main(String[] args) {

        Carrera carrera = new Carrera(1);
        Corredor corredores[] = new Corredor[4];

        for (int i = 0; i < 4; i++) {
            corredores[i] = new Corredor(i + 1, carrera);
            corredores[i].start();
        }

        try {
            for (int i = 0; i < 4; i++) {
                corredores[i].join();
            }
        } catch (InterruptedException ex) {
            System.out.println("Hilo principal interrumpido.");
        }

    }

}
