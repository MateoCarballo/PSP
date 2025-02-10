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
        while (!this.arbitro.isFinalizado()){
            if (arbitro.getTurno() == this.idJugador){
                this.jugada = (int) (Math.random() * 10) + 1;
                this.arbitro.comprobarJugada(this.idJugador, this.jugada);
            }
        }
    }
}
