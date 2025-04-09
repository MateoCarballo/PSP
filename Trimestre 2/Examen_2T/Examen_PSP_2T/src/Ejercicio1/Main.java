package Ejercicio1;

public class Main {
    //Guardado en C:\Users\a22mateoca\IdeaProjects\Examen_PSP_2T
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        Cliente[] clientes = new Cliente[15];
        for (int i = 0; i < 15; i++) {
            clientes[i] = new Cliente(panaderia, i + 1);
        }
        System.out.println("Todos los hilos creados!");
        for (int i = 0; i < 15; i++) {
            clientes[i].start();
        }
    }
}
