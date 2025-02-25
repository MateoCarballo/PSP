package Boletin1.Ejercicio1;

public class Tac extends Thread {

    private int pasos;

    public Tac(int pasos) {
        this.pasos = pasos;
    }


    public void run() {
        while (true) {
            try {
                if (pasos % 2 != 0) {
                    System.out.println("TAC");
                    sleep(1000);
                }
                pasos++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
