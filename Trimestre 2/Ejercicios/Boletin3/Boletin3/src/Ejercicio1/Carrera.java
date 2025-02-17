package Ejercicio1;

public class Carrera {

    private int turno;

    public Carrera(int turno) {
        this.turno = turno;
    }

    public int getTurno() {
        return turno;
    }

    public synchronized void obtenerTurno(int desdeHilo){
        try {
            if (desdeHilo != turno){
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Error en el metodo syncronized");
        }
    }

    public synchronized void avanzaTurno(){
        turno++;
        notifyAll();
    }
}

