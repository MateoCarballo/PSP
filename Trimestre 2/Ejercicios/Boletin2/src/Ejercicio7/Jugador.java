package Ejercicio7;

public class Jugador extends Thread{
    private Arbitro arbitro;
    private int idJugador;
    private int jugada;

    public Jugador(Arbitro arbitro, int idJugador, int jugada) {
        this.arbitro = arbitro;
        this.idJugador = idJugador;
        this.jugada = jugada;
    }

    public void run(){
        this.arbitro.comprobarJugada(this.idJugador, this.jugada);
    }
}
