package Boletin2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Servidor {
    public static void main(String[] args) {
        final int numeroProfesores = 5;
        Profesor[] profesores = new Profesor[5];

        Asignatura programacion = new Asignatura(0,"Programacion");
        Asignatura databases = new Asignatura(1,"Bases de datos");
        Asignatura contornos = new Asignatura(2,"Entornos de desarrollo");
        Asignatura lenguajeMarcas = new Asignatura(3,"Lenguajes de marcas");
        Asignatura sitemasInformaticos = new Asignatura(4,"Sistemas informaticos");

        Asignatura accesoDatos = new Asignatura(5,"Acceso a datos");
        Asignatura programacionMultimedia = new Asignatura(6,"Programacion multimedia y dispositivos moviles");
        Asignatura programacionServicios = new Asignatura(7,"Programacion de servicios y procesos");
        Asignatura sistemasGestion = new Asignatura(8,"Sistemas de gestion empresarial");

        for (int i = 0; i < 12; i++) {
            Asignatura[] asignaturas = {new Asignatura()};
        }
        for (int i = 0; i < numeroProfesores; i++){
            Profesor profesor = new Profesor(i,
                    "Profesor " + i,
                    );
            profesores[i] = profesor;
        }

    }
}
