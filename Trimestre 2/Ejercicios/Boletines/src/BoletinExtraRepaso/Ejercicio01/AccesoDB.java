package BoletinExtraRepaso.Ejercicio01;

public class AccesoDB extends Thread{
    private ClaseCompartida claseCompartida;

    public AccesoDB( ClaseCompartida claseCompartida) {
        this.claseCompartida = claseCompartida;
    }

    public void run(){
        try{
            claseCompartida.accederDB();
            System.out.println("Usando la base de datos por " + Thread.class.getName());
            Thread.sleep(2000);
            claseCompartida.liberarDB();
            System.out.println("DB liberada por  " + Thread.class.getName());
        } catch (RuntimeException | InterruptedException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
