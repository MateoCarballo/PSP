package Ejercicio1;

import java.util.Random;

public class Panaderia {
    private int[] listadoClientes;
    int turno;
    Random random;

    public Panaderia() {
        listadoClientes = new int[15];
        turno = 1;
        random = new Random();
    }

    public synchronized void despacharCliente(int idCliente) throws InterruptedException {
        while (idCliente != turno) {
            wait();
        }
        System.out.println("El cliente " + idCliente + " está comprando...");
        Thread.sleep((random.nextInt(3) + 1) * 1000); //Esperar entre 1 y 4 segundos
        if (listadoClientes.length != turno) {
            System.out.println("Terminé, le toca al cliente " + (turno + 1));
            turno++;
        } else {
            System.out.println("Soy el último cliente!");
        }

        notifyAll();
    }
}
