package Boletin1.Ejercicio6;

public class Main {
    /*
    Hacer un programa que calcule el factorial y un número de la sucesión de Fibonacci. Cada uno de
    los cálculos tiene que ser realizado por un hilo independiente. Las clases que implementen cada
    hilo tienen que llamarse Factorial y Fibonacci. Implementar los procesos de 2 maneras diferentes:
        a) Heredando de la clase Thread
        b) Implementando la interface Runnable
    Recuerda que factorial(0)=1 y para todo n>0, factorial(n)=n*factorial(n-1).
    Recuerda que fib(0)=0, fib(1)=1 y para todo n>1, fib(n)=fib(n-1)+fib(n-2).
     */
    public static void main(String[] args) {
        HiloFibonacci hfb = new HiloFibonacci(10);

        HiloFactorial hiloFactorial = new HiloFactorial(4);
        Thread hf = new Thread(hiloFactorial);

        hfb.start();
        hf.start();

        try{
            hfb.join();
            hf.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
