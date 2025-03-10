package Boletin3.Ejercicio2;

import com.sun.jdi.IncompatibleThreadStateException;

public class Cliente extends Thread{
    private int numeroCliente;
    private int cuenta;
    private int cola;
    private Supermercado supermarket;


    public Cliente() {
        this.cuenta = (int) (Math.random() * 100) + 50;
    }

    public void run(){
        int tiempoEspera = (int) (Math.random()*5000)+1000;
        try {
            System.out.println("Cliente -> " + numeroCliente + " comprando ...");
            Thread.sleep(tiempoEspera);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.cola = (int) (Math.random()*supermarket.cajas.size()-1)+1;
        System.out.println("Cliente -> " + numeroCliente + " acudiendo a cola " + cola);
        supermarket.cajas.get(cola).addCliente(this);
        System.out.println("Cliente -> " + numeroCliente + "esperando su turno..." );
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCuenta() {
        return cuenta;
    }
}
