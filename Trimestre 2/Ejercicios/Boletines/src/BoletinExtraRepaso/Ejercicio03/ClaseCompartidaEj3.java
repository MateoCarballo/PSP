package BoletinExtraRepaso.Ejercicio03;

public class ClaseCompartidaEj3 {
    private int estadoBuffer;
    private boolean lleno;

    public ClaseCompartidaEj3() {
        this.estadoBuffer = 0;
        this.lleno = false;
    }

    synchronized public void llenarBuffer(){
        if (estadoBuffer<10){
            System.out.println("Cargando buffer ...");
            estadoBuffer++;
        }else{
            lleno = true;
        }
    }

    synchronized public void vaciarBuffer(){
        if (lleno){
            estadoBuffer = 0;
            System.out.println("Buffer vaciado");
        }
    }
}
