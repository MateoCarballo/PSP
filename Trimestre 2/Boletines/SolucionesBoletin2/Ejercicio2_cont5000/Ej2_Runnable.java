package Ejercicio2_cont5000;

class ContadorEj2_Runnable {
	int c;

	ContadorEj2_Runnable(int c) {
		this.c = c;
	}

	// synchronized
	public synchronized void incrementa() {
		c = c + 1;
	}

	public synchronized int getContador() {
		return c;
	}
}// ContadorEjercicio7

class Ej2_Runnable_hilo implements Runnable {
	ContadorEj2_Runnable contador;

	public Ej2_Runnable_hilo(ContadorEj2_Runnable contador) {
		this.contador = contador;
	}

	public void run() {
		//synchronized (contador) {
			for (int i = 0; i < 5000; i++)
				contador.incrementa();
		//}
	}
}// Ejercicio7_Runnable_hilo

public class Ej2_Runnable {

	public static void main(String[] args) {
		ContadorEj2_Runnable cont = new ContadorEj2_Runnable(0);

		Ej2_Runnable_hilo hilo = new Ej2_Runnable_hilo(cont);

		Thread h1 = new Thread(hilo);
		Thread h2 = new Thread(hilo);
		Thread h3 = new Thread(hilo);
		Thread h4 = new Thread(hilo);
		Thread h5 = new Thread(hilo);

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();

		try {
			h1.join();
			h2.join();
			h3.join();
			h4.join();
			h5.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Valor del contador: " + cont.getContador());

	}

}// Actividad2_7_Runnable
