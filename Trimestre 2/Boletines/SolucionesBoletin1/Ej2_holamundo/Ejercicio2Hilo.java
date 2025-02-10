package Boletin1.Ej2_holamundo;

public class Ejercicio2Hilo extends Thread{

	public void run() {	
			System.out.println("Hola Mundo "+ this.getId() );
	}
}
