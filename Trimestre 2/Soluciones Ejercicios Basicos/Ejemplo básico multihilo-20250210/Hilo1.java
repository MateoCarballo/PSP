package org.example;

public class Hilo1 extends Thread{
    public void run() {
        while (true) {
            System.out.println(" TIC ");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
