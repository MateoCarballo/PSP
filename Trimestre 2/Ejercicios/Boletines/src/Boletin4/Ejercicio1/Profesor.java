package Boletin4.Ejercicio1;

public class Profesor extends Thread{
    private Bienvenida bienvenida;

    public Profesor(Bienvenida bienvenida) {
        this.bienvenida = bienvenida;
    }

    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El profesor ha llegado");
        bienvenida.saludoProfesor();
    }

}
