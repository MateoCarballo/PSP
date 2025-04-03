package BoletinExtraRepaso.Ejercicio3;


public class Ejercicio3 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        productor.start();
        consumidor.start();
    }
}
