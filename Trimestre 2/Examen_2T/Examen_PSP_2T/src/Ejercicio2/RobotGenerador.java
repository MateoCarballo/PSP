package Ejercicio2;

public class RobotGenerador extends Thread {
    private Cinta cinta;

    public RobotGenerador(Cinta cinta) {
        this.cinta = cinta;
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                cinta.colocarPieza();
            } catch (Exception ignored) {
            }
        }
    }
}
