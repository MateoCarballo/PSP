package Boletin1.Ej2_holamundo;

public class Ejercicio2Main {
	public static void main(String[] args) {
		Ejercicio2Hilo h1 = new Ejercicio2Hilo();
		Ejercicio2Hilo h2 = new Ejercicio2Hilo();
		Ejercicio2Hilo h3 = new Ejercicio2Hilo();
		Ejercicio2Hilo h4 = new Ejercicio2Hilo();
		Ejercicio2Hilo h5 = new Ejercicio2Hilo();
			
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();		
		
	}

}
