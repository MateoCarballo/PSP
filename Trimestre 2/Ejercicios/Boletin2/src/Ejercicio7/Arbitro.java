package Ejercicio7;

public class Arbitro {
    private int numeroAdivinar;
    private int turno;
    private int ganador;
    private boolean finalizado;

    public Arbitro(int numeroAdivinar, int turno, int ganador, boolean finalizado) {
        this.numeroAdivinar = numeroAdivinar;
        this.turno = turno;
        this.ganador = ganador;
        this.finalizado = finalizado;
    }

    public void comprobarJugada(int idJugador, int jugada){
        System.out.println("Jugador " + idJugador + " dice: " + jugada);
        if (this.numeroAdivinar == jugada){
            this.ganador = idJugador;
            this.finalizado = true;
        }else{
            if (idJugador == 2){
                this.turno = 0;
            }else{
                this.turno++;
            }
            System.out.println("Le toca a " + this.turno);
        }

    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getGanador() {
        return ganador;
    }

    public void setGanador(int ganador) {
        this.ganador = ganador;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}
