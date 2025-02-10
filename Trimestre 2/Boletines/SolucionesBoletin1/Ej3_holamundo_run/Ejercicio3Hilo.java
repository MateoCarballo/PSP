package Boletin1.Ej3_holamundo_run;

public class Ejercicio3Hilo extends Thread {
	String cadena;

	Ejercicio3Hilo(String cadena) {
		this.cadena = cadena;
	}

	public void run() {
		try {
			sleep(Thread.currentThread().getId() * 10);
		} catch (InterruptedException e) {

		}

		System.out.println("Hola Mundo " + cadena + " " + Thread.currentThread().getId());
	}
}
