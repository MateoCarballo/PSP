package Boletin1.Ejercicio1;

public class Tic extends Thread {
    private int pasos;
    public Tic(int pasos) {
        this.pasos = pasos;
    }

    public void run() {
        while (true) {
            try {
                if (pasos%2 != 0){
                    System.out.println("TIC");
                    sleep(1000);
                }
                pasos++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
