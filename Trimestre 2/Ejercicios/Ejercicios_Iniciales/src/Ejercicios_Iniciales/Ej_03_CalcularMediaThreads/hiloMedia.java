package ej03_CalcularMediaThreads;

public class hiloMedia extends Thread{
    private int[] numeros;
    private int inicio, fin;
    private double media;

    public hiloMedia(int[] numeros, int inicio, int fin) {
        this.numeros = numeros;
        this.inicio = inicio;
        this.fin = fin;
    }

    public void run() {
        int suma = 0;
        for (int i = inicio; i < fin; i++) {
            suma += numeros[i];
        }
        media = suma / (double) (fin - inicio);
    }

    public double getMedia() {
        return media;
    }
}
