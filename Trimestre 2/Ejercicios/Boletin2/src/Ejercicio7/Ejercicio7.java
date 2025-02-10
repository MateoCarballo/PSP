package Ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) {
        Arbitro arbitro = new
                Arbitro((int) (Math.random() * 10) + 1,
                0,-1,false);

        Jugador j0 = new Jugador(arbitro,0,5);
        Jugador j1 = new Jugador(arbitro,1,6);
        Jugador j2 = new Jugador(arbitro,2,7);

        System.out.println( "NUMERO A ADIVINAR " + arbitro.getNumeroAdivinar());


        j0.start();
        j1.start();
        j2.start();

        try{
            do{
                switch (arbitro.getTurno()){
                    case 0 -> j0.join();
                    case 1 -> j1.join();
                    case 2 -> j2.join();
                }
            }while(!arbitro.isFinalizado());

            System.out.println("Jugador " + arbitro.getGanador() + " gana, adivinó el numero!!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
