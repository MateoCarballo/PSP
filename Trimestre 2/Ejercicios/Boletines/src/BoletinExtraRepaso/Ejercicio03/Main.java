package BoletinExtraRepaso.Ejercicio03;

public class Main {
    public static void main(String[] args) {
        ClaseCompartidaEj3 compartidaEj3 = new ClaseCompartidaEj3();
        Productor productor = new Productor(compartidaEj3);
        Consumidor consumidor = new Consumidor(compartidaEj3);

        productor.start();
        consumidor.start();

    }
}
