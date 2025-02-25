## Ejercicios sobre procesos en Java

---

### Ejercicio 1
Con la clase `Runtime`, que es la clase del sistema que permite acceder al entorno de ejecución de Java (incluyendo la capacidad de ejecutar comandos del sistema operativo):

1. Lanza un proceso que abra el **Notepad**.
2. Visualiza en el Notepad lo escrito en un archivo llamado `saludo.txt` ubicado en la raíz del proyecto. Este archivo contiene el texto **"hola"**.
3. Comprueba si el proceso está vivo antes y después de su ejecución.

---

### Ejercicio 2
Con la clase `ProcessBuilder`, que es otra manera de ejecutar procesos:

1. Lanza **Paint**.
2. Lanza **Notepad**.
3. Lanza **Chrome**.

---

### Ejercicio 3
Con la clase `ProcessBuilder`:

1. Lanza **Paint**.
2. Cuando cierres Paint, lanza **Notepad**.
3. Cuando cierres Notepad, lanza **Chrome**.
4. Ayúdate de la clase `Process`.

---

### Ejercicio 4
Con la clase `Runtime`:

1. Lanza un proceso para abrir **Chrome**.
2. Obtén su PID y muestra su información.
3. Comprueba si el proceso está vivo antes y después de destruirlo.

---

### Ejercicio 5
Con la clase `ProcessBuilder`:

1. Crea un proceso que muestre por pantalla el resultado de hacer un **ping a google.com**.

---

### Ejercicio 6
Con la clase `Runtime`:

1. Crea un proceso que muestre por pantalla el resultado de hacer un **ping a google.com**.

---

### Ejercicio 7
Con la clase `ProcessBuilder`:

1. Crea un proceso que muestre por pantalla los directorios o archivos de la ruta `C:\`.

---

### Ejercicio 8
Con la clase `ProcessBuilder`:

1. Crea un proceso que guarde en un archivo la lista de directorios o archivos de la ruta `C:\`.

---

### Ejercicio 9
#### Parte 1: Clase `Sumar`

1. Crea una clase llamada `Sumar` que:
    - Lea dos números enteros desde la consola.
    - Muestre el resultado de su suma.
    - Capture una excepción general si se introducen datos no numéricos.

#### Parte 2: Clase `Principal`

1. Crea una clase llamada `Principal` que:
    - Lance el proceso anterior (`Sumar`).
    - Verifique si los datos introducidos son dos números.

#### Pasos sugeridos:

1. Crea un archivo `Sumar.class` en un directorio específico.
2. Utiliza un `ProcessBuilder` para ejecutar la clase `Sumar`.
3. Configura el directorio usando el método `directory` de `ProcessBuilder`.
4. Inicia el proceso.
5. Usa un `OutputStream` para enviar datos al proceso.
6. Usa un `BufferedReader` para leer línea por línea la información recibida.
7. Muestra el código de salida.
8. Usa otro `BufferedReader` para leer los errores recibidos línea por línea.

---

### Ejercicio 10
Crea una clase llamada `Devol` que devuelva valores con `System.exit()` según estas condiciones:

- Si el número de argumentos es menor a 1, devuelve **1**.
- Si el argumento es una cadena, devuelve **2**.
- Si el argumento es un número entero menor que 0, devuelve **3**.
- En cualquier otro caso, devuelve **0**.

#### Clase `Principal`

1. Crea una clase llamada `Principal` que ejecute el programa anterior (`Devol`).
2. Muestra un mensaje en pantalla según el valor devuelto por `Devol`.

#### Pasos sugeridos:

1. Crea un archivo `Devol.class` en el directorio correspondiente.
2. Configura un `ProcessBuilder` con el argumento requerido.
3. Establece el directorio del ejecutable.
4. Ejecuta el proceso.
5. Usa un `BufferedReader` para leer los errores línea por línea.
6. Obtén el valor de salida del proceso y muestra el mensaje adecuado.

---

### Ejercicio 11
#### Parte 1: Clase `Visualiza5Veces`

1. Crea un programa en Java que:
    - Visualice 5 veces la cadena que recibe desde los argumentos de `main()`.
    - Si no recibe ninguna cadena, muestre el mensaje: **"Se necesita una cadena"** y termine con `System.exit(1)`.

#### Parte 2: Clase `Principal`

1. Crea un programa que:
    - Introduzca una cadena por teclado.
    - Ejecute el programa anterior (`Visualiza5Veces`) para visualizar 5 veces la cadena.

#### Pasos sugeridos:

1. Recoge la cadena desde la consola.
2. Configura el archivo del ejecutable.
3. Usa un `ProcessBuilder` y añade el argumento correspondiente.
4. Establece el directorio donde se encuentra el ejecutable.
5. Inicia el proceso.
6. Usa un `BufferedReader` para leer errores.
7. Muestra el código de salida y los resultados obtenidos.

---

### Ejercicio 12
Partiendo del **Ejercicio 11**:

1. Modifica el programa para que la cadena introducida por teclado se guarde en un archivo de texto en lugar de mostrarse por pantalla.

---

### Ejercicio 13
#### Parte 1: Programa inicial

1. Crea un programa Java que:
    - Lea una cadena desde la entrada estándar.
    - Determine si la cadena es un palíndromo o si está vacía.

#### Parte 2: Clase `Principal`

1. Crea un programa que:
    - Ejecute el programa anterior.
    - Lea la cadena desde teclado.
    - Muestre la salida por pantalla.

**Nota**: La cadena no se introduce directamente en el `ProcessBuilder`. Usa un `PrintStream` para enviarla al proceso.

---

### Ejercicio 14
Este ejercicio demuestra que sumar los números del 1 al 10 (resultado: 55) es equivalente a:

1. Crear un proceso que sume los números del 1 al 5 (resultado: 15).
2. Crear otro proceso que sume los números del 6 al 10 (resultado: 40).

La ventaja es que al ejecutarlos en paralelo o concurrentemente, el cálculo es más rápido.

#### Parte 1: Clase `Sumar`

1. Crea una clase `Sumar` que sume los números comprendidos entre dos valores (incluidos).
2. Los valores se pasan como argumentos y el primero debe ser el menor.

#### Parte 2: Clase `CrearProcesoSumar`

1. Define los atributos: `numInicial`, `numFinal`, `ficheroResultado`, y `p` (de tipo `Process`).
2. Crea un constructor que reciba los 3 primeros atributos como parámetros.
3. En el constructor:
    - Crea un `ProcessBuilder` para ejecutar la clase `Sumar`.
    - Guarda el resultado en el archivo correspondiente.
    - Lanza el proceso.

#### Parte 3: Clase `Principal`

1. Crea dos instancias de `CrearProcesoSumar` con los siguientes datos:
    - Instancia 1: Datos (1, 5, `fichero1.txt`).
    - Instancia 2: Datos (6, 10, `fichero2.txt`).
2. Llama al método `getResultadoSuma` para cada instancia.
3. Muestra el resultado final sumando ambos resultados.

---

### Ejercicio 15
Crea un juego en el que debas adivinar un número aleatorio generado por la máquina (entre 1 y 100) en un máximo de 5 intentos.

1. La máquina no mostrará el número seleccionado.
2. Cada vez que realices un intento, la máquina indicará si el número es mayor o menor al introducido.
3. Ajusta tus intentos hasta dar con el número secreto.
