package Boletin1.Ejercicio5;

public class Hilo extends Thread {
    private String mensaje;
    public Hilo(String mensaje) {
        this.mensaje = mensaje;
    }
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println(mensaje);
        }
    }
}
