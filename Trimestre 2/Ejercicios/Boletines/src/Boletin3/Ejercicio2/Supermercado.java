package Boletin3.Ejercicio2;

import java.util.ArrayList;

public class Supermercado {
    ArrayList<Caja> cajas = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Supermercado() {
        for (int i = 0; i < (int) (Math.random()*10) +1 ; i++) {
            cajas.add(new Caja());
        }
    }
}
