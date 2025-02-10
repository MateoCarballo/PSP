package ej02_hilosincrementadores;

public class hilosincrementadores_main {
    public static void main(String[] args) {

        hiloA hiloA = new hiloA();
        hiloB hiloB = new hiloB();

        hiloA.start();
        hiloB.start();

        try {
            while (true) {
                System.out.println("Valor de Hilo A: " + hiloA.getValor());
                System.out.println("Valor de Hilo B: " + hiloB.getValor());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
