package Boletin1.Ejercicio4;

public class HiloNo extends Thread{
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println("NO");
        }
    }
}
