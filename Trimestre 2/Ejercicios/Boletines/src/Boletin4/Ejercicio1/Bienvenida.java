package Boletin4.Ejercicio1;

public class Bienvenida {
   private boolean llegoProfesor = false;

   public synchronized void saludoAlumnos(String nombreAlumno){
        while(!llegoProfesor){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
       System.out.println(nombreAlumno + " dice: Buenos Dias Profesor!");
   }

   public synchronized void saludoProfesor(){
       llegoProfesor = true;
       System.out.println("Buenos dias a todos! La clase ha comenzado");
       notifyAll();
   }

}
