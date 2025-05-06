import java.io.*;
import java.net.*;
	public class servidorMC1 {
	public static void main(String args[]) throws Exception {
		// FLUJO PARA ENTRADA ESTANDAR
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//Se crea el socket multicast.
		MulticastSocket ms = new MulticastSocket() ;
		int Puerto = 12345;//Puerto multicast
		InetAddress grupo = InetAddress.getByName("225.0.0.1");//Grupo
		String cadena="";
		//
		while(!cadena.trim().equals("*")) {
			System.out.print("Datos a enviar al grupo: ");
			cadena = in.readLine();
			// ENVIANDO AL GRUPO
			DatagramPacket paquete = new DatagramPacket(cadena.getBytes(), cadena.length(), grupo, Puerto);
			ms.send(paquete);
			String msg = new String(paquete.getData());
			System.out.println ("Envío: " + msg.trim());
		}
		ms.close ();//cierro socket
		System.out.println ("Socket cerrado ... ");
	}
}