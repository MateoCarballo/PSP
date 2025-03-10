package Ejercicio7_juego;

class Arbitro {
    private int totalJugadores; // num. de jugadores
    private int turno; // a quien le toca
    private int numero; // numero a adivinar
    private boolean acabo; // true cuando se haya terminado el juego

    public Arbitro(int nJugadores) {// constructor
        totalJugadores = nJugadores;
        turno = 1;// + (int) (totalJugadores * Math.random());
        numero = 1 + (int) (10 * Math.random()); // numero entre 1 y 10
        System.out.println("NUMERO A ADIVINAR: " + numero);
        acabo = false;
    }

    public int toca() {
        return turno;
    }

    public boolean seAcabo() {
        return acabo;
    }

    public synchronized void nuevaJugada(int jugador, int suNumero) {

        if (jugador == toca()) { // es su turno
            System.out.println("Jugador" + jugador + " dice: " + suNumero);
            if (suNumero == numero) {// ha acertado
                System.out.println("Jugador " + jugador + " gana, adivino el numero!!!");
                acabo = true;
            } else // ha fallado. Se avanza el turno
                if (turno == totalJugadores)
                    turno = 1;
                else
                    turno++;
        } else
            System.out.println(jugador + " trata de hacer trampa!");

        if (!acabo)
            System.out.println("\tLe toca a Jug" + turno);
    }
}