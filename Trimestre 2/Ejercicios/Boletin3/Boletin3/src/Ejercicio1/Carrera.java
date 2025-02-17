package Ejercicio1;

public class Carrera {

    private int turno;

    public Carrera() {
    }

    public int getTurnoCorredor() {
        return turno;
    }

    public void setTurnoCorredor(int turnoCorredor) {
        this.turno = turnoCorredor;
    }

    public synchronized void turnoCorredor(int desdeHilo){
        try {
            if (desdeHilo != turno){
                wait();
            }else{
                notifyAll();
                turno++;
            }
        } catch (InterruptedException e) {
            System.out.println("Error en el metodo syncronized");
        }
    }
}

