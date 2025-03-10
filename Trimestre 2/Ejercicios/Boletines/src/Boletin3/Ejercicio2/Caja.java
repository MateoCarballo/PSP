package Boletin3.Ejercicio2;

import java.util.LinkedList;

public class Caja extends Thread{
    LinkedList<Cliente> cola1;
    private int turno = 0;

    public Caja() {
    }

    public void addCliente(Cliente cliente){
        cola1.add(cliente);
    }

    public void run(){
        System.out.println("El cliente => "+ turno+" tiene que pagar = " + cola1.get(turno).getCuenta());
    }
}
