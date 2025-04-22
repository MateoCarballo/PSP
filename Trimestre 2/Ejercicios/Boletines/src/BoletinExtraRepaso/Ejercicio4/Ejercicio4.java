package BoletinExtraRepaso.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        productor.start();
        consumidor.start();
    }
}
