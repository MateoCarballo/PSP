package Boletin4.Ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Compartido compartido = new Compartido();
        Productor productor = new Productor(compartido,"src/Boletin4/Ejercicio3/Fichero.txt");
        Consumidor consumidor = new Consumidor(compartido);

        productor.start();
        consumidor.start();
    }
}
