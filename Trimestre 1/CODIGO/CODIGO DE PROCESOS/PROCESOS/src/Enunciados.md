# ENUNCIADOS EJERCICIOS PROCESOS:


## Ejercicio1:

//Con la clase Runtime, que es la clase del sistema que te permite
//acceder al entorno de ejecución java. Incluyendo la capacidad
//de ejecutar comandos del sistema operativo
//consigue lanzar un proceso que arranque el notepad en el que se visualice
//lo escrito en otro archivo llamado saludo.txt ubicado en la
//raíz del proyecto que contiene el texto hola
//comprueba si está vivo el proceso antes y después

-----------------------------------------------------------------------------------

## Ejercicio2:
//Con la clase ProcessBuilder que es otra manera de ejecutar
//procesos arranca el paint, el notepad y el chrome.

-----------------------------------------------------------------------------------

## Ejercicio3:
//Con ProcessBuilder arranca el paint, cuando lo cierres
//arranca el notepad y cuando lo cierres, arranca el chrome.
//Ayúdate de la clase Process

-----------------------------------------------------------------------------------

## Ejercicio 4
//Crea un proceso que lance el Chrome con la clase Runtime. Mira su pid y muestra su información (info)
//comprueba si está vivo antes y después de destruir el proceso
-----------------------------------------------------------------------------------

## Ejercicio 5
//Crea un proceso que muestre por pantalla la salida de hacer un ping a google.com
//con ProcessBuilder

-----------------------------------------------------------------------------------

## Ejercicio 6
//Crea un proceso que muestre por pantalla la salida de hacer un ping a google.com mediante Runtime

-----------------------------------------------------------------------------------

## Ejercicio 7
//Crea un proceso con ProcessBuilder que muestre por pantalla
//los directorios o archivos de C:\\
-----------------------------------------------------------------------------------

## Ejercicio 8
//Crea un proceso con ProcessBuilder que guarde en un archivo
//los directorios o archivos de C:\\

-----------------------------------------------------------------------------------

## Ejercicio 9

### PRIMERO:
Crea una clase llamada Sumar que coja por consola dos números enteros y que muestre por consola el resultado de la suma.  Debes capturar una excepción general si introduces otra cosa que no sean dos números.

### SEGUNDO:
Crea una clase llamada Principal que lance el proceso anterior y que verifique si lo introducido por teclado son dos números.

### Pasos:
1) Crea una clase File en donde está alojado el archivo Sumar.class
2) Crea un ProcessBuilder en donde eliges la clase a ejecutar.
3) Elige el directorio con el método directory de la clase ProcessBuilder.
4) Arranca el proceso.
5) Crea un OutputStream en donde meterás los datos que van a entrar al proceso.
6) Crea un BufferedReader en donde leeremos línea a línea para mostrar la información recibida
   7)Muestra el código de salida
8) Crea un BufferedReader en donde leeremos línea a línea para mostrar los errores recibidos
-----------------------------------------------------------------------------------

### Ejercicio 10
Realiza una clase llamada Devol que admita argumentos desde main() y devuelva con System.exit() los siguientes valores:

- Si el número de argumentos es <1 debe devolver 1.
- Si el argumento es una cadena debe devolver 2.
- Si el argumento es un número entero menor que 0 debe devolver 3.
- En cualquier otra situación debe devolver 0.

Realiza una clase llamada Principal que ejecute lo anterior. Este segundo programa deberá mostrar en pantalla la situación ocurrida dependiendo del valor devuelto al ejecutar el programa anterior. Queremos que el argumento se meta directamente en el ProcessBuilder.
PASOS:
1) Crear el File que apunte al directorio en donde está el ejecutable Devol.
2) Crea el ProcessBuilder en el que añadas como parámetro el argumento.
3) Establece el directorio en donde se encuentra el ejecutable.
4) Ejecuta el proceso.
5) Crea un BufferedReader para los errores que leerás línea  a línea
6) Luego coge el valor de salida del proceso, en función del cual podrás mostrar el mensaje más adecuado a cada caso.
-----------------------------------------------------------------------------------



### Ejercicio 11.
Crea un programa en Java (una clase llamada Visualiza5Veces) que visualice 5 veces la cadena que se le envía desde los argumentos de main(). Si no se le envía ninguna cadena, deberá mostrar un mensaje indicándolo (“Se necesita una cadena”) y finalizar con System.exit(1).


Crea un segundo programa Java que introduzca por teclado una cadena y ejecute el programa anterior para visualizar 5 veces esa cadena. A la clase llámale Principal.
PASOS:
1) Coges por consola la cadena.
2) Establece el File
3) Crea el ProcessBuilder y añade el argumento que metiste en el paso 1.
4) Establece el directorio en donde se encuentra el ejecutable
5) Inicia el proceso.
6) Crea un BufferedReader para los errores.
7) Muestra el código de salida. Según sea 0 o 1 será un Final correcto/incorrecto.
8) Crea un BufferedReader para mostrar el resultado.

-----------------------------------------------------------------------------------

### Ejercicio 12
Partiendo del ejercicio anterior (Ejercicio 11), realiza los cambios necesarios para que la cadena introducida por teclado se almacene en un fichero de texto, no mostrándola por pantalla

-----------------------------------------------------------------------------------

### Ejercicio 13
Realiza un programa Java que lea una cadena desde la entrada estándar y visualice en pantalla si la cadena es o no palíndromo o si la cadena está vacía (longitud = 0)


Realiza un segundo programa Java con una clase llamada Principal que ejecute el anterior, debe leer la cadena desde teclado y mostrar la salida por pantalla. La cadena no se introduce en el ProcessBuilder por ello necesitarás un PrintStream.
-----------------------------------------------------------------------------------

### Ejercicio 14
En este ejercicio se quiere demostrar lo siguiente:
sumar(1,10)=>55 es lo mismo que crear dos procesos: uno que sume(1,5)=>15 y otro que sume(6,10)=>40. La ventaja de hacer dos procesos consiste que en paralelo o concurrente va más rápido



PASO 1. Realiza una clase llamada Sumar que sume los números comprendidos entre dos números, ellos incluidos. Los números se pasarán como argumentos al programa y el primero de ellos será el menor

Paso 2. Crea una clase llamada CrearProcesoSumar que tenga como atributos numInicial, numFinal, ficheroResultado y p (Process), que tenga un constructor con los 3 primeros atributos como parámetros. En ese constructor crea un ProcessBuilder para ejecutar la clase Sumar y que guarde el resultado en el fichero correspondiente y lanza el proceso.

Paso 3: Crea un programa llamado Principal en el que se creen dos instancias de CrearProcesoSumar, uno con los datos 1,5, “fichero1.txt” y otro con los datos 6,10,”fichero2.txt”
Llama al método getResultadoSuma para cada número y muestra el resultado final.
-----------------------------------------------------------------------------------


### Ejercicio 15
Tendremos que adivinar un número aleatorio generado por la máquina del 1 al 100 con un máximo de 5 intentos. Nosotros no sabremos qué número ha escogido la máquina y cada vez que hagamos un intento, la máquina nos devolverá si su número elegido es mayor o menor. Así, nosotros podremos ir afinando puntería hasta dar con el número secreto.
-----------------------------------------------------------------------------------