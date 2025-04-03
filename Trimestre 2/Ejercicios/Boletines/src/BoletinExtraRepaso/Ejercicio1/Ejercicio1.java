package BoletinExtraRepaso.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        Thread[] hilos = new Thread[5];

        // Crear 5 hilos que intentan acceder al recurso compartido
        for (int i = 0; i < 5; i++) {
            hilos[i] = new HiloEjercicio1(bd);
            hilos[i].start();
        }
    }
}
