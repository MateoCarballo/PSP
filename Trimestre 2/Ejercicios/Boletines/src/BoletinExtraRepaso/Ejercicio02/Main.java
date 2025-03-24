package BoletinExtraRepaso.Ejercicio02;

import java.sql.Array;
import java.util.ArrayList;

/*
Se va a implementar un sistema de control de tráfico en una intersección donde
existen dos tipos de vehículos: coches y motos. El cruce está regulado por un
semáforo que alterna entre permitir que los coches pasen y luego permitir que las
motos pasen. Solo un tipo de vehículo debe pasar a la vez, y los vehículos deben
esperar su turno cuando el semáforo esté en rojo.
Los coches tienen prioridad para pasar primero. Cuando todos los coches han
pasado, el semáforo cambia a verde para las motos, permitiéndoles pasar.
Cuando los coches terminan de pasar, deben esperar su turno hasta que las motos
pasen completamente.
Los vehículos deben esperar si el semáforo no está en verde para ellos.
Cada hilo de coche y moto debe simular un tiempo de paso de 1 segundo, y el
semáforo debe alternar entre ambos tipos de vehículos.
Se deberán simular al menos 5 vehículos de cada tipo
 */
public class Main {
    public static void main(String[] args) {

        Coche[] coches = new Coche[5];
        Moto[] motos = new Moto[5];
        Semaforo semaforo = new Semaforo();
        AlterarSemaforo alterarSemaforo = new AlterarSemaforo(semaforo);
        for (int i = 0; i < 5; i++) {
            coches[i] = new Coche(i,semaforo);
            motos[i] = new Moto(i,semaforo);
        }

        for (int i = 0; i < 5; i++) {
            coches[i].start();
            motos[i].start();
        }
        alterarSemaforo.start();

    }
}
