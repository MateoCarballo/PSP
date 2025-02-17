package Ejercicio1;

public class Corredor extends Thread{
    private int numeroThread;
    private Carrera carrera;

    public Corredor(int numeroThread, Carrera carrera) {
        this.numeroThread = numeroThread;
        this.carrera = carrera;
    }

    public void run(){
        do{
            carrera.obtenerTurno(numeroThread);
        }while(carrera.getTurno() != numeroThread);

        if (carrera.getTurno() == numeroThread){
            System.out.println("Soy el thread " + numeroThread + ",corriendo . . .");
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Error al parar 1500 ms");
            }
            if (numeroThread < 4){
                System.out.println("Termine paso el relevo al corredor " + (numeroThread+1));
                carrera.avanzaTurno();
            }else {
                System.out.println("Terminé!");
            }
        }
    }

}
