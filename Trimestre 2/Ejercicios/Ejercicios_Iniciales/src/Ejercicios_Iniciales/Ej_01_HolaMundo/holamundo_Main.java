package Ejercicios_Iniciales.Ej_01_HolaMundo;

public class holamundo_Main {
	public static void main(String[] args) {
		holamundo_hilo hilo1 = new holamundo_hilo(1);
		new Thread(hilo1).start();
	
		new Thread(new holamundo_hilo(2)).start();
		new Thread(new holamundo_hilo(3)).start();
		new Thread(new holamundo_hilo(4)).start();

		holamundo_hilo hilo5 = new holamundo_hilo(5);
		Thread hilo = new Thread(hilo5);
		hilo.start();
	}
}
