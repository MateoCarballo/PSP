package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Cinta cinta = new Cinta();
        RobotGenerador robotGenerador = new RobotGenerador(cinta);
        RobotConsumidor RobotConsumidor = new RobotConsumidor(cinta);
        robotGenerador.start();
        RobotConsumidor.start();
    }
}
