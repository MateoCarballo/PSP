package Boletin1.Ej6_FactorialFibonacci;

public class FibonacciRunnable implements Runnable{
    int numero;
    int fibonacci = 0;

    public FibonacciRunnable(int numero) {
        this.numero = numero;
    }

    public void run() {
        int fibn = 0;
        int fibAntAnt = 0; // n-2
        int fibAnt = 1; // n-1

        if (numero == 0) fibonacci = 0;
        else {
            if (numero == 1)
                fibonacci = 1;
            else {
                for (int i = 2; i <= numero; i++) {
                    fibn = fibAnt + fibAntAnt; // Se aplica la fórmula
                    fibAntAnt = fibAnt;
                    fibAnt = fibn; // Se guarda el valor de la serie
                }
                fibonacci = fibn;
            }
        }
        System.out.println("El resultado del Fibonacci es: " + fibonacci);
    }
}
