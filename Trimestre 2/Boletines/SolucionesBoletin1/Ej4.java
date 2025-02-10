package Boletin1;

public class Ej4 extends Thread{
    public void run() {
        System.out.println();
        for (int i = 1; i <= 30; i++)
            System.out.println("NO");
    }
}
class Principal {
    public static void main(String[] args) {
        Ej4 hilo1 = new Ej4();
        hilo1.start();
        System.out.println();
        for (int i = 1; i <= 30; i++)
            System.out.println("YES");
    }
}