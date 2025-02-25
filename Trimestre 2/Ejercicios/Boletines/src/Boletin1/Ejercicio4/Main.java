package Boletin1.Ejercicio4;

public class Main {
    /*
    Crea un hilo que en su método run() muestre un “NO” hasta un máximo de 30 veces. En el método
    principal (main) tras ejecutar el start() de tu hilo, mostrará “YES” hasta un máximo de 30 veces.
    Como salida obtendrás una serie alternativa de NOes YESes ya que una vez iniciada la ejecución
    del thread, el tiempo de la CPU se reparte entre todos los procesos y threads del sistema, con lo
    cual se intercalan instrucciones del método main() con instrucciones del método run().
     */
    public static void main(String[] args) {
        HiloNo hn = new HiloNo();
        hn.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("YES");
        }
    }
}
