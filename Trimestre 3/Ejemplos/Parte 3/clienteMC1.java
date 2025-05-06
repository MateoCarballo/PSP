package Ejemplos.Parte3;

import java.io.*;
import java.net.*;
public class clienteMC1 {
	public static void main(String args[]) throws Exception {
		//Se crea el socket multicast
		int Puerto = 12345;//Puerto multicast
		MulticastSocket ms = new MulticastSocket(Puerto) ;
		InetAddress grupo = InetAddress.getByName("225.0.0.1") ;//Grupo
		//Nos unimos al grupo
		//ms.joinGroup(grupo); // obsoleto
		SocketAddress sock = new InetSocketAddress(grupo, Puerto); // Crear SocketAddress con la referencia al grupo Multicast
		ms.joinGroup(sock, NetworkInterface.getByInetAddress(grupo));

		String msg="";
		byte[] buf = new byte[1000];
		while(!msg.trim().equals("*")) {
			//Recibe el paquete del servidor multicast
			DatagramPacket paquete = new DatagramPacket(buf, buf.length);
			ms.receive(paquete);
			//msg = new String(paquete.getData());
			//En lugar de hacerlo como en la línea anterior comentada, 
			//lo hago así (Obtener la cadena) especificando que sólo
			//admito los bytes de la longitud correspondiente, para que
			//no lea bytes que están por debajo.
			msg = new String(paquete.getData(), 0, paquete.getLength());
			System.out.println ("Recibo: " + msg.trim());
		}
		// Abandonamos grupo
		// Mismos parámetros que join
		ms.leaveGroup(sock, NetworkInterface.getByInetAddress(grupo));
		ms.close (); //cierra socket
		System.out.println ("Socket cerrado ... ");
	}
}