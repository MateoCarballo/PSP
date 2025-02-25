package Boletin1.Ejercicio1;

/*
Crea 2 hilos en Java que realicen lo siguiente:
El primero de ellos deberá visualizar en pantalla en un bucle infinito la palabra "TIC". El otro hará
lo mismo con la palabra "TAC". Dentro de los bucles emplea el método sleep para generar un
retardo e intentar que las 2 palabras aparezcan de manera ordenada. ¿Es esto posible? ¿O se
duplican siempre en algún punto?
 */

public class Main {
    public static void main(String[] args){
        Tic tic = new Tic(1);
        Tac tac = new Tac(2);

        tic.start();
        tac.start();

        try {
            tic.join();
            tac.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}