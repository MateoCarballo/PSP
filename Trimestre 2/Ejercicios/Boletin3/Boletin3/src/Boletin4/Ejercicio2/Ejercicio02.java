package Boletin4.Ejercicio2;

public class Ejercicio02 {
    /*
    2. Implementar una aplicación compuesta por 3 clases:
    Una Cola, que será el objeto compartido.
    Un productor y un consumidor.
   El productor generará 10 números, y los insertará en
   el objeto Cola, tras hacer un
   pequeño sleep. El consumidor los leerá, y los mostrará
   por pantalla.
     */


    Cola cola = new Cola(0,false);
    Productor prod = new Productor(cola);
    Consumidor com = new Consumidor(cola);


}
