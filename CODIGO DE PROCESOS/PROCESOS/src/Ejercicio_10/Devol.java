package Ejercicio_10;

public class Devol {
    public static void main(String[] args) {
        int i = 100;
        if(args.length < 1) System.exit(1);
        try{
            i = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            System.exit(2);
        }
        if (i<0) System.exit(3);
        System.exit(0);

    }
}
