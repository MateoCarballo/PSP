package Boletin_1_Hilos.Ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) {
        HiloFactorial[] procesosFactoriales = new HiloFactorial[10];
        for (int i = 0; i < procesosFactoriales.length; i++) {
            procesosFactoriales[i] = new HiloFactorial(i+5);
        }

        /*
        for (HiloFactorial h : procesosFactoriales){
            h.start();
        }
         */

        procesosFactoriales[9].start();
    }
}
