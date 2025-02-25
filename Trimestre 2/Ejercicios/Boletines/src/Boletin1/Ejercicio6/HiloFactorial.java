package Boletin1.Ejercicio6;

public class HiloFactorial implements Runnable {
    private int factorial;

    public HiloFactorial(int factorial) {
        this.factorial = factorial;
    }

    @Override
    public void run() {
        for (int i = (factorial-1); i > 1; i--) {
            factorial = factorial * i;
            //10 * 9 * 8 * 7
        }
        System.out.println(factorial);
    }
}
