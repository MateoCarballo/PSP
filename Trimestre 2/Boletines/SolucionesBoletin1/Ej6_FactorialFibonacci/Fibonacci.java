package Boletin1.Ej6_FactorialFibonacci;

public class Fibonacci extends Thread{
    int numero;
    int fibonacci = 0;

    public Fibonacci(int numero) {
        this.numero = numero;
    }

    public void run() {
        int fibn = 0;
        int v2 = 0; // n-2
        int v1 = 1; // n-1

        if (numero == 0) fibonacci = 0;
        else {
            if (numero == 1)
                fibonacci = 1;
            else {
                for (int i = 2; i <= numero; i++) {
                    fibn = v1 + v2;
                    v2 = v1;
                    v1 = fibn; // Se guarda el valor de la serie
                }
                fibonacci = fibn;
            }
        }
    }

    public void mostrarFibonacci () {
        System.out.println("El resultado del Fibonacci es: " + fibonacci);
    }
}
