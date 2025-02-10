package Boletin_1_Hilos.Ejercicio6;

public class HiloFactorial extends Thread{
    public void run() {
        int factorial = 1;
        int a = 5;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es -> " + factorial);
    }
}
