package Boletin4.Ejercicio1;

public class Alumno extends Thread{
    private Bienvenida bienvenida;
    private String nombre;

    public Alumno(Bienvenida bienvenida, String nombre) {
        this.bienvenida = bienvenida;
        this.nombre = nombre;
    }

    public void run(){
        System.out.println(nombre + " Ha llegado");
        bienvenida.saludoAlumnos(nombre);
    }
}
