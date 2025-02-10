package org.example;

public class Hilo2 extends Thread{
    public void run() {
        while (true) {
            System.out.println(" TAC ");
            try {
                sleep(2050);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
