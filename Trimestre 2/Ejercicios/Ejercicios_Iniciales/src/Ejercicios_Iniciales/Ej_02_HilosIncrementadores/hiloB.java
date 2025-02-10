package ej02_hilosincrementadores;

public class hiloB extends Thread{
    private int valor = 0;

    public void run() {
        try {
            while (true) {
                valor += 50;
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getValor() {
        return valor;
    }
}
