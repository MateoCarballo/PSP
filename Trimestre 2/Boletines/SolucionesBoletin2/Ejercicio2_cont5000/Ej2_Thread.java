package Ejercicio2_cont5000;

class ContadorEj2 {
	int c;

	ContadorEj2(int c) {
		this.c = c;
	}

	//synchronized 
	public synchronized void incrementa() {
		c = c + 1;
	}

	public synchronized int getContador() {
		return c;
	}
}// ContadorActividad2_7

public class Ej2_Thread extends Thread {

	ContadorEj2 contador;

	public Ej2_Thread(ContadorEj2 contador) {
		this.contador = contador;
	}

	public void run() {
		//synchronized (contador) {
			for (int i = 0; i < 5000; i++)
				contador.incrementa();
		//}
	}

	public static void main(String[] args) {
		ContadorEj2 cont = new ContadorEj2(0);
		
		Ej2_Thread h1 = new Ej2_Thread(cont);
		Ej2_Thread h2 = new Ej2_Thread(cont);
		Ej2_Thread h3 = new Ej2_Thread(cont);
		Ej2_Thread h4 = new Ej2_Thread(cont);
		Ej2_Thread h5 = new Ej2_Thread(cont);

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
		try {
	       h1.join(); h2.join(); h3.join();
	       h4.join(); h5.join(); 
	   } catch (InterruptedException e) { }		
	   
	  System.out.println("Valor del contador: "+cont.getContador());	
		
	}

}
