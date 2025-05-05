import java.io.*;
import java.net.*;
	public class HiloServidor extends Thread{
		BufferedReader fentrada;
		PrintWriter fsalida;
		Socket socket = null;
		
		public HiloServidor(Socket s){//CONSTRUCTOR
			socket =s;
			//se crean flujos de entrada y salida
			try{
				fsalida = new PrintWriter(socket.getOutputStream(),true);//True significa que 
				//el bufer de salida se vacía
				fentrada = new BufferedReader(new InputStreamReader(socket.getInputStream())) ;
				}catch( IOException e ) {
			System.out.println( "Excepción de entrada/salida" );
		}
		}
		
		public void run() {//tarea a realizar con el cliente
			String cadena="";
			try{
				while (!cadena.trim().equals("*")) {
					System.out.println("COMUNICO CON: "+ socket.toString()) ;
					cadena = fentrada.readLine();//obtener cadena
					fsalida.println(cadena.trim().toUpperCase());//enviar mayúscula
				}// fin while
				System.out.println("FIN CON: "+ socket.toString());
				fsalida.close() ;
				fentrada.close() ;
				socket.close() ;
				}catch( IOException e ) {
			System.out.println( "Excepción de entrada/salida" );
			}
		}
}