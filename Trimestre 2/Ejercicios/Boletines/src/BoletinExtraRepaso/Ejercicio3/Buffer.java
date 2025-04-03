package BoletinExtraRepaso.Ejercicio3;

public class Buffer {
    private int[] buffer;
    private int capacidad; //capacidad total del buffer
    private int siguienteProducto = 0;
    private int siguienteConsumo = 0;
    private int elementos = 0; // lleva recuento de números insertados en el buffer

    public Buffer(int capacidad) {
        this.capacidad = capacidad;
        buffer = new int[capacidad];
    }

    public synchronized void producir(int producto) throws InterruptedException {
        while (elementos == capacidad) {
            wait();  // Espera si el buffer está lleno
        }
        buffer[siguienteProducto] = producto;

        //Reiniciamos la posición
        //siguienteProducto = (siguienteProducto + 1) % capacidad;
        if (siguienteProducto+1 == capacidad) {
            System.out.println("Fin buffer");
            siguienteProducto=0;
        }
        else siguienteProducto++;

        elementos++;
        System.out.println("Producido: " + producto);
        notify();
    }

    public synchronized int consumir() throws InterruptedException {
        while (elementos == 0) {
            wait();  // Espera si el buffer está vacío
        }
        int producto = buffer[siguienteConsumo];

        //Reiniciamos la posición
        if (siguienteConsumo+1 == capacidad) siguienteConsumo=0;
        else siguienteConsumo++;

        elementos--;
        System.out.println("Consumido: " + producto);
        notify();
        return producto;
    }
}
