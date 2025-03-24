package BoletinExtraRepaso.Ejercicio03;

public class Consumidor extends Thread{
    ClaseCompartidaEj3 compartidaEj3;

    public Consumidor(ClaseCompartidaEj3 compartidaEj3) {
        this.compartidaEj3 = compartidaEj3;
    }

    @Override
    public void run() {
        while(true){
            compartidaEj3.vaciarBuffer();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
