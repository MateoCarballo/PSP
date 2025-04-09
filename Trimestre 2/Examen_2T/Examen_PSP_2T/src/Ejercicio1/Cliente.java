package Ejercicio1;

public class Cliente extends Thread {
    private Panaderia panaderia;
    private int idCliente;

    public Cliente(Panaderia panaderia, int idCliente) {
        this.panaderia = panaderia;
        this.idCliente = idCliente;
    }
    public void run() {
        try {
            panaderia.despacharCliente(idCliente);
        } catch (Exception ignored) {
        }
    }
}
