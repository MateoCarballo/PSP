package Boletin_1_Hilos.Ejercicio6;

public class HiloFibonacci implements Runnable{
    @Override
    public void run() {
        int limiteSucesion = 5;
        int actual = 1;
        int anterior = 0;
        int acumulado = 1;
        System.out.println("Primeros " + limiteSucesion + " numeros de la sucession de fibonacci");
        for (int i = 1; i < limiteSucesion; i++) {
            if (i == 1){
                System.out.print(anterior + ", ");
            }
                System.out.print(acumulado +", ");

            if ((limiteSucesion-1) == i){
                System.out.println("");
                System.out.println("El elemento " + limiteSucesion + " es " + acumulado);
            }
                acumulado = anterior + actual;
                anterior = actual;
                actual = acumulado;


        }
    }
}
