package Boletin4.Ejercicio3;

public class Consumidor extends Thread{
    private Compartido compartido;

    public Consumidor(Compartido compartido) {
        this.compartido = compartido;
    }

    public void run(){
        int numeroCaracter;

        while((numeroCaracter = this.compartido.get()) != -1){
            System.out.println("Caracter " + (char) numeroCaracter);
        }
    }
}
