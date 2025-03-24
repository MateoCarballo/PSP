package BoletinExtraRepaso.Ejercicio01;
/*
Se necesita implementar un sistema de procesamiento de datos en una base de
datos que se comparte entre varios hilos. El acceso a esta base de datos debe estar
controlado de forma estricta para evitar que varios hilos accedan a la vez, lo que
podría causar corrupción de datos o inconsistencia en la información. Por ello, se
deberá implementar un sistema que gestione el acceso exclusivo de un solo hilo a la
base de datos (no es necesario crear una base de datos, emplear una sección crítica
como una variable o un fichero) en cada momento. Los hilos que no tengan acceso
deberán esperar hasta que el hilo actual termine de usar la base de datos, y una vez
que esto suceda, deben ser notificados para intentar acceder.
Debe simularse un proceso de acceso de 2 segundos a la base de datos por parte de
los hilos.

 */
public class Main {
    public static void main(String[] args) {

    }
}
