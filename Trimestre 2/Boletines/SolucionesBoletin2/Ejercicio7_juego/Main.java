package Ejercicio7_juego;

public class Main {
	public static void main(String[] args) {
		// creamos el arbitro y los jugadores
		Arbitro arbitro = new Arbitro(3); // 3 jugadores
		
		Jugador j1 = new Jugador(1, arbitro);
		Jugador j2 = new Jugador(2, arbitro);
		Jugador j3 = new Jugador(3, arbitro);
		// ponemos a los jugadores en marcha
		
		j1.start();
		j2.start();
		j3.start();
	}
}

