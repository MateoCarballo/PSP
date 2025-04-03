package BoletinExtraRepaso.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        new HiloCambioColorSemaforo(semaforo).start();

        // Crear y arrancar los vehículos
        for (int i = 0; i < 5; i++) {
            new Coche(i, semaforo).start();
            new Moto(i, semaforo).start();
        }
    }
}
