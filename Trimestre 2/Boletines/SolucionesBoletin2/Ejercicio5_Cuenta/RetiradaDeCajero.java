package Ejercicio5_Cuenta;

public class RetiradaDeCajero extends Thread{
    private Cuenta c;

    public RetiradaDeCajero(String n, Cuenta cuentaComp) {
        super(n);
        c = cuentaComp;
    }

    public void run() {
        for (int x = 1; x <= 4; x++) {
            c.RetirarDinero(30, getName());
        }
    }// run

}
