package BoletinExtraRepaso.Ejercicio1;

public class HiloEjercicio1 extends Thread {
    private BaseDatos bd;

    public HiloEjercicio1(BaseDatos bd) {
        this.bd = bd;
    }

    @Override
    public void run() {
        try {
            bd.accederBD();
            Thread.sleep(2000);  // Simula el uso del recurso
            bd.liberarBD();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
