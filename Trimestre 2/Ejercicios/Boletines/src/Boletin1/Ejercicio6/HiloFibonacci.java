package Boletin1.Ejercicio6;

public class HiloFibonacci extends Thread {
    private int indiceNumero;

    public HiloFibonacci(int indiceNumero) {
        this.indiceNumero = indiceNumero;
    }

    public void run() {
        int[] listaFibonacci = new int[25];
        listaFibonacci[0] = 0;
        listaFibonacci[1] = 1;
        for (int i = 2; i < listaFibonacci.length; i++) {
            listaFibonacci[i] = listaFibonacci[i-1] + listaFibonacci[i-2];
        }
        System.out.println(listaFibonacci[indiceNumero]);

    }
}
