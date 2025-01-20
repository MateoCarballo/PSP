package Boletin_Tema_2.Ejercicio7;

public class HiloFactorial extends Thread{
    private int iteraciones;
    private int factorial;

    public HiloFactorial(int iteraciones){
        this.iteraciones = iteraciones;
        this.factorial = 1;
    }

    public void run() {
        for (int i = 1; i <= iteraciones; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es -> " + factorial);
    }
}
