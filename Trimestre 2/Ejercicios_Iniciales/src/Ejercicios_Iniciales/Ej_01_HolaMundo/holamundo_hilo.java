package Ejercicios_Iniciales.Ej_01_HolaMundo;

public class holamundo_hilo implements Runnable {
	private int id;

	public holamundo_hilo(int id) {
		this.id = id;
	}
	public void run() {
		System.out.println("Hola desde el Hilo " + id );
	}

}
