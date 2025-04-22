package BoletinExtraRepaso.Ejercicio1;

public class BaseDatos {
    private boolean recursoEnUso = false;

    public synchronized void accederBD() throws InterruptedException {
        while (recursoEnUso) {
            wait();  // Espera si el recurso está en uso
        }
        System.out.println(Thread.currentThread().getName() + " está utilizando la base de datos.");
        recursoEnUso = true;
    }

    public synchronized void liberarBD() {
        System.out.println(Thread.currentThread().getName() + " ha liberado la base de datos.");
        recursoEnUso = false;
        notifyAll();  // Notifica a otros hilos que el recurso ha sido liberado
    }
}
