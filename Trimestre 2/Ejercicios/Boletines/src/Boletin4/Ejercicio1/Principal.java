package Boletin4.Ejercicio1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Bienvenida bienvenida = new Bienvenida();
        ArrayList<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            alumnos.add(new Alumno(bienvenida,"Alumno " + i));
        }
        Profesor profesor = new Profesor(bienvenida);

        for (int i = 0; i < 5; i++) {
            alumnos.get(i).start();
        }

        profesor.start();

    }
}
