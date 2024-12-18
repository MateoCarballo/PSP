package Ejercicio4;

public class ReplicarCadena {
    public static void main(String[] args) {
        if (args.length > 0){
            for (int i = 0; i < Integer.parseInt(args[1]); i++) {
                System.out.println((i+1) + "." + args[0]);
            }
        }
    }
}
