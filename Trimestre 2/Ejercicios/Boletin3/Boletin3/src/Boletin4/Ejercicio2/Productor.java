package Boletin4.Ejercicio2;

public class Productor {
    private Cola cola;

    public Productor(Cola cola) {
        this.cola = cola;
    }

    public void llenar(){
        cola.put();
    }
}
