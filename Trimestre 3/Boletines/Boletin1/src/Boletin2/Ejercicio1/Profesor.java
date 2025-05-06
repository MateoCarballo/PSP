package Boletin2.Ejercicio1;

public class Profesor {
    int idProfesor;
    String nombre;
    Asignatura [] asignaturas;
    Especialidad especialidad;

    public Profesor(int idProfesor, String nombre, Asignatura[] asignaturas, Especialidad especialidad) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.especialidad = especialidad;
    }
}
