package BoletinExtraRepaso.Ejercicio03;

public class Productor extends Thread{
    ClaseCompartidaEj3 comp;

    public Productor(ClaseCompartidaEj3 comp) {
        this.comp = comp;
    }

    @Override
    public void run() {
        while(true){
            comp.llenarBuffer();
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
