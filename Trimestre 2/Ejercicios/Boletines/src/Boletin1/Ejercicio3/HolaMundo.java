package Boletin1.Ejercicio3;

public class HolaMundo extends Thread implements Runnable{
    private String string;
    public HolaMundo(String s) {
        this.string = s;
    }

    public void run() {
        try {
            sleep(100*threadId());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hola Mundo desde hilo " + threadId() +  "\n Cadena recibida -> "
                        + string +" " );
    }
}
