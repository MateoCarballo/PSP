package Boletin4.Ejercicio2;

public class Cola {
    private int numero;
    private boolean disponible;

    public Cola(int numero, boolean disponible) {
        this.numero = numero;
        this.disponible = disponible;
    }

    public synchronized int get(){
        return numero;
    }
    public synchronized void put(int valor){
        if (disponible){
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println("Excepcion en el metodo put");
            }
        }

    }
}
