package Ejercicio2;

public class RobotConsumidor extends Thread {
    private Cinta cinta;

    public RobotConsumidor(Cinta cinta) {
        this.cinta = cinta;
    }

    public void run() {
        while (cinta.piezasDescargadas < 29) {
            try {
                cinta.descargarPieza();
            } catch (Exception ignored) {
            }
        }
        System.out.println("Arduo trabajo");
    }
}
