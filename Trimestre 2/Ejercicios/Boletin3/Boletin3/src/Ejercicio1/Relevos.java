package Ejercicio1;

public class Relevos {


    public static void main(String[] args) {

        Carrera carrera = new Carrera();
        Corredor c1 = new Corredor(1,carrera);
        Corredor c2 = new Corredor(2,carrera);
        Corredor c3 = new Corredor(3,carrera);
        Corredor c4 = new Corredor(4,carrera);
        carrera.setTurnoCorredor(1);


        c1.start();
        c2.start();
        c3.start();
        c4.start();




    }

}
