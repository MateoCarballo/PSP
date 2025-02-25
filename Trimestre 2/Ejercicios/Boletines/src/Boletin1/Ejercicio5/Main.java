package Boletin1.Ejercicio5;

public class Main {
    /*
    Vamos a hacer un programa similar al anterior pero instanciando 2 threads.
    En el HiloA mostrará el mensaje NO, hasta un maximo de 30 veces
    En el HiloB mostrará el mensaje YES, hasta un máximo de 30 veces
    En el programa principal mostrará un mensaje “Ejecución en HiloA” y se ejecutará el HiloA; luego
    mostrará un mensaje “Ejecución en HiloB” y se ejecutará el HiloB; y luego un mensaje “Ejecución
    en main”. Por ejemplo
     */

    public static void main(String[] args) throws InterruptedException {
        Hilo h1 = new Hilo("YES");
        Hilo h2 = new Hilo("NO");

        System.out.println("Ejecucion hilo YES");
        h1.start();
        // Thread.sleep(1000); Si quieres parar la main
        System.out.println("Ejecucion hilo NO");
        h2.start();
        // Thread.sleep(1000); Si quieres parar la main
        System.out.println("Ejecucion hilo Main");
        System.out.println("Esto pertenece a la main papapapapapapapa");

    }
}
