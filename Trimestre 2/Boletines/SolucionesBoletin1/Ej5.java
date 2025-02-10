package Boletin1;

class Ej5A extends Thread{
    public void run() {
        System.out.println();
        for (int i = 1; i <= 30; i++)
            System.out.println("NO");
    }
}
class Ej5B extends Thread{
    public void run() {
        System.out.println();
        for (int i = 1; i <= 30; i++)
            System.out.println("YES");
    }
}
public class Ej5 {
    public static void main(String[] args) {
        Ej5A hilo1 = new Ej5A();
        Ej5B hilo2 = new Ej5B();

        System.out.println("Ejecución A: NO");
        hilo1.start();
        System.out.println("Ejecución B: YES");
        hilo2.start();
        System.out.println("Ejecución main");

    }
}