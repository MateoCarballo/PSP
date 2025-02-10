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

    public synchronized void comprobarJugada(int idJugador, int jugada){

        if (this.turno == idJugador){
            System.out.println("Jugador " + idJugador + " dice: " + jugada);
            if (this.numeroAdivinar == jugada){
                this.ganador = idJugador;
                this.finalizado = true;
                System.out.println("Jugador " + this.ganador + " gana, adivinó el numero!!!!");
            }else{
                if (idJugador == 2){
                    this.turno = 0;
                }else{
                    this.turno++;
                }
                System.out.println("Le toca a " + this.turno);
            }
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
