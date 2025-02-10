package Boletin1.Ej6_FactorialFibonacci;

public class PrincipalRunnable {
    public static void main(String[] args) {
        FactorialRunnable f1 = new FactorialRunnable(5);
        Thread tfac = new Thread(f1);

        FibonacciRunnable fib2 = new FibonacciRunnable(6);
        Thread tfib = new Thread(fib2);
        tfac.start();
        tfib.start();

        try {
            tfac.join();
            tfib.join();
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
