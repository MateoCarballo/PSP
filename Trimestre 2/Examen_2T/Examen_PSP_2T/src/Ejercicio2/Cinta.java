package Ejercicio2;

import java.util.ArrayList;

public class Cinta {
    /**
     * Mi idea para solucionar la tarea es que cada robot tiene 2 etapas
     * ROBOT CARGA ->  ETAPA 1: SOLO CARGA
     * ETAPA 2: CARGA SOLO SI HA DESCARGADO EL ROBOTDESCARGA Y DEJA POSICION LIBRE
     * <p>
     * Mi idea para solucionar la tarea es que cada robot tiene 3 etapas
     * ROBOT CARGA ->  ETAPA 1: ESPERA A TENER 10 EN LA LISTA
     * ETAPA 2: CARGA CUANDO TIENE 10 DISPONIBLES
     * ETAPA 3: DESCARGA LOS ULTIMOS 10 ELEMENTOS CARGADOS, VACIA LA LISTA.
     */
    boolean ultimaDiez;
    int ritmoCarga;
    int ritmoRecogida;
    int piezasDescargadas;
    int piezasCargadas;
    int ultimosCiclos;
    String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BB", "CC", "DD"};
    ArrayList<String> listaPiezas;

    public Cinta() {
        this.ultimaDiez = false;
        this.listaPiezas = new ArrayList<>();
        this.piezasDescargadas = 0;
        this.piezasCargadas = 0;
        this.ritmoCarga = 1000;
        this.ritmoRecogida = 1500;
        this.ultimosCiclos = 9;
    }

    public synchronized void colocarPieza() throws InterruptedException {
        while (listaPiezas.size() >= 10) {
            try {
                wait();
            } catch (Exception ignored) {
            }
        }
        //listaPiezas.add(random.nextInt(101));
        listaPiezas.add(letras[piezasCargadas]);
        piezasCargadas++;
        System.out.println("El robot cargador lleva " + piezasCargadas + " piezas cargadas||||| Este ciclo cargo el numero " + listaPiezas.getLast());
        Thread.sleep(ritmoCarga);
        notifyAll();
    }

    public synchronized void descargarPieza() throws InterruptedException {
        while ((listaPiezas.size() < 10) && (ultimosCiclos == 9)) {
            try {
                wait();
            } catch (Exception ignored) {
            }
        }
        if (piezasCargadas < 30) {
            if (listaPiezas.size() == 10) {
                piezasDescargadas++;
                System.out.println("El robot consumidor lleva " + piezasDescargadas + " piezas descargadas ||||| Este ciclo descargo el numero " + listaPiezas.getFirst());
                listaPiezas.removeFirst();
                Thread.sleep(ritmoRecogida);
                notifyAll();
            }
        } else {
            if ((!listaPiezas.isEmpty()) && (ultimosCiclos > 0)) {
                ultimosCiclos--;
                piezasDescargadas++;
                System.out.println("El robot consumidor lleva " + piezasDescargadas + " piezas descargadas ||||| Este ciclo descargo el numero " + listaPiezas.getFirst());
                listaPiezas.removeFirst();
                Thread.sleep(ritmoRecogida);
                notifyAll();
            }
        }

    }
}
