package Boletin4.Ejercicio3;

public class Compartido {
    private int numero;
    private boolean disponible = false;


    public synchronized int get(){
        while(!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        disponible = false;
        notify();
        return numero;
    }

    public synchronized void put(int caracterASCII){
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        numero = caracterASCII;
        disponible= true;
        notify();

    }
}
