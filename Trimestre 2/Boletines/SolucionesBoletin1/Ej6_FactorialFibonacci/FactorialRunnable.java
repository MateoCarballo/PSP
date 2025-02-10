package Boletin1.Ej6_FactorialFibonacci;

public class FactorialRunnable implements Runnable {
    int numero;
    int factorial = 1;

    public FactorialRunnable(int numero) {
        this.numero = numero;
    }

    public void run() {
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de: " + numero + " es " + factorial);
    }
}
