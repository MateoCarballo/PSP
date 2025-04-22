package BoletinExtraRepaso.Ejercicio4;


public class Buffer {
    private int[] buffer;
    private int capacidad;
    private int contador = 0;

    public Buffer(int capacidad) {
        this.capacidad = capacidad;
        buffer = new int[capacidad];
    }

    public synchronized void producir(int item) throws InterruptedException {
        while (contador == capacidad) {
            wait();  // Espera si el buffer está lleno
        }
        buffer[contador] = item;
        contador++;
        System.out.println("Producido: " + item);
        notify();  // Notifica al consumidor que hay un nuevo producto
    }

    public synchronized int consumir() throws InterruptedException {
        while (contador == 0) {
            wait();  // Espera si el buffer está vacío
        }
        int item = buffer[contador - 1];
        contador--;
        System.out.println("Consumido: " + item);
        notify();  // Notifica al productor que el buffer ha espacio
        return item;
    }
}
