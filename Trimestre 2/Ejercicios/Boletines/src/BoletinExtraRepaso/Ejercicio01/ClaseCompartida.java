package BoletinExtraRepaso.Ejercicio01;

public class ClaseCompartida {
    boolean recursoCompartidoLibre = true;

    public ClaseCompartida() {
    }

    synchronized public void accederDB() throws InterruptedException {
        if (!recursoCompartidoLibre){
            wait();
        }
    }

    synchronized public void liberarDB() throws InterruptedException {
        if (!recursoCompartidoLibre) {
            recursoCompartidoLibre =true;
            notifyAll();
        }
    }
}
