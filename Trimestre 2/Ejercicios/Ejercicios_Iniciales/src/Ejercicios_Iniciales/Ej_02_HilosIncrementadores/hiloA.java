package ej02_hilosincrementadores;

public class hiloA extends Thread{
    private int valor = 0;

    public void run() {
        try {
            while (true) {
                valor += 1;
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
