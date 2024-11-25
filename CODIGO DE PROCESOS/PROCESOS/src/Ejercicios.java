import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios {
    public static void main(String[] args){
        // ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        ejercicio8();
    }


    //Ejercicio1:
    //Con la clase Runtime, que es la clase del sistema que te permite
    //acceder al entorno de ejecución java. Incluyendo la capacidad
    //de ejecutar comandos del sistema operativo
    //consigue lanzar un proceso que arranque el notepad en el que se visualice
    //lo escrito en otro archivo llamado saludo.txt ubicado en la
    //raíz del proyecto que contiene el texto hola
    //comprueba si está vivo el proceso antes y después
    private static void ejercicio1(){
        try {
            Process p1 = new ProcessBuilder("notepad.exe").start();
            if (p1.waitFor() == 0){
                Process p2 = new ProcessBuilder("mspaint.exe").start();
                p2.waitFor();
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Process p3 = new ProcessBuilder("\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe\"").start();
            p3.waitFor();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    //Ejercicio2:
    //Con la clase ProcessBuilder que es otra manera de ejecutar
    //procesos arranca el paint, el notepad y el chrome.
    private static void ejercicio2(){
        try {
            //Podemos decirle el programa a ejeccutar como los argumentos

            File f = new File("src/Archivo.txt");
            if (!f.exists()){
                if (f.mkdirs()){

                }
            }

            String [] param = {"C:\\Users\\a22mateoca\\AppData\\Local\\BraveSoftware\\Brave-Browser\\Application\\brave.exe"};
            Process process = Runtime.getRuntime().exec(param);
        } catch (IOException e) {
            System.out.println("Error durante la apertura de Notepad");;
        }
    }


    //Ejercicio3:
    //Con ProcessBuilder arranca el paint, cuando lo cierres
    //arranca el notepad y cuando lo cierres, arranca el chrome.
    //Ayúdate de la clase Process
    private static void ejercicio3() {
        Process pb = null;
        try {
            pb = new ProcessBuilder("notepad.exe").start();
        } catch (IOException e) {
            System.out.println("Error al abrir el notepad");;
        }

        try {
            pb = new ProcessBuilder("mspaint.exe").start();
        } catch (IOException e) {
            System.out.println("Error al abrir paint");
        }
        /*
        Crea un proceso para lanzar el chrome:
            1-> Brave o cualquier programa instalado despues de Windows, que no lo traiga por defecto.
         */
        String [] data = {"C:\\Users\\a22mateoca\\AppData\\Local\\BraveSoftware\\Brave-Browser\\Application\\brave.exe"};
        try {
            Process process = Runtime.getRuntime().exec(data);
        } catch (IOException e) {
            System.out.println("Error al abrir brave");
        }
    }


    //Ejercicio 4
    //Crea un proceso que lance el Chrome con la clase Runtime. Mira su pid y muestra su información (info)
    //comprueba si está vivo antes y después de destruir el proceso
    private static void ejercicio4() {
        try {
            Process edge = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
            System.out.println("    PID ->              " + edge.pid());
            System.out.println("    INFO ->             " + edge.info());
            System.out.println("    Its Alive ->        " + edge.isAlive());
            edge.waitFor();
            edge.destroy();
            System.out.println("Destruimos el proceso ");
            System.out.println("Its Alive -> " + edge.isAlive());

            System.out.println(" PID -> " + edge.pid());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al usar el metodo 'start() del proccesBuilder");
        }
    }

    //Ejercicio 5
    //Crea un proceso que muestre por pantalla la salida de hacer un ping a google.com
    //con ProcessBuilder
    private static void ejercicio5() {
        BufferedReader bufferedReader = null;
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ping","google.com");
        Process process = null;
        try {
            process = processBuilder.start();
        } catch (IOException e) {
            System.out.println("Excepcion al arrancar el proceso");
        }
        if (process != null){
            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        }
        try {
           do {
               if (bufferedReader != null){
                   System.out.println(bufferedReader.readLine());
               }
           }while(process.isAlive());
           // Sugerencia de IntelliJ while(Objects.requireNonNull(process).isAlive())
        } catch (IOException e) {
            System.out.println("Excepcion al printear en la consola el ping a google");
        }
        // Mostrar el codigo de salida

        try {
            int codigo = process.waitFor();
            System.out.println(codigo);
        } catch (InterruptedException e) {
            System.out.println("Error al printear el codigo");
        }

        process.destroy();

    }


    //Ejercicio 6
    //Crea un proceso que muestre por pantalla la salida de hacer un ping a google.com mediante Runtime
    private static void ejercicio6() {
        Process process = null;
        try{
            process = Runtime.getRuntime().exec("ping google.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            do
                System.out.println(br.readLine());
            while(process.isAlive());
        } catch (IOException e) {
            System.out.println("Error durante la escritura del ping a Google en el ejercicio 6");;
        } finally {
            if (process != null) process.destroy();
        }
    }

    //Ejercicio 7
    //Crea un proceso con ProcessBuilder que muestre por pantalla
    //los directorios o archivos de C:\\

    private static void ejercicio7() {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/C","dir","C:\\");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processBuilder.start().getInputStream()));
            do {
                System.out.println(bufferedReader.readLine());
            }while (bufferedReader.readLine() != null);
        } catch (IOException e) {
            System.out.println("Error en el ejercicio 7");
        }
    }

    //Ejercicio 8
    //Crea un proceso con ProcessBuilder que guarde en un archivo
    //los directorios o archivos de C:\\
    private static void ejercicio8(){
        ProcessBuilder processBuilder = new ProcessBuilder("cmd","/C","dir","C:\\");
        processBuilder.redirectOutput(new File("Fichero_resultado.txt"));
        try {
            Process p = processBuilder.start();
        } catch (IOException e) {
            System.out.println("Error al castear a proceso el proccesBuilder");
        }


    }

}
