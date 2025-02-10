package Boletin1.Ej3_holamundo_run;

public class Ejercicio3Main {
	public static void main(String[] args) {
		Ejercicio3Hilo hilo1 = new Ejercicio3Hilo("uno");
		new Thread(hilo1).start();
	
		new Thread(new Ejercicio3Hilo("dos")).start();
		new Thread(new Ejercicio3Hilo("tres")).start();
		new Thread(new Ejercicio3Hilo("cuatro")).start();
	
		Ejercicio3Hilo hilo5 = new Ejercicio3Hilo("cinco");
		Thread hilo = new Thread(hilo5);
		hilo.start(); 
		
	}

}
