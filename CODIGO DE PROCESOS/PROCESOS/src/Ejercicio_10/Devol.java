package Ejercicio_10;

public class Devol {
    public static void main(String[] args) {
        int i = 100;
        if(args.length < 1){
            System.out.println("Aplicado codigo 1 antes de la salida");
            System.exit(1);
        }
        try{
            i = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            System.out.println("Aplicado codigo 2 antes de la salida");
            System.exit(2);
        }
        if (i<0){
            System.out.println("Aplicado codigo 3 antes de la salida");
            System.exit(3);
        }
        System.out.println("Ejecutado sin problemas");
        System.exit(0);

    }
}
