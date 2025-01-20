Implementa un programa que reciba a través de sus argumentos una lista de ficheros de texto y
cuente el número de caracteres que hay en cada fichero.
Modifica el programa para que se cree un hilo por cada fichero a contar. Muestra lo que se tarda
en contar cada fichero en la forma secuencial, y a continuación empleando hilos. Para calcular el
tiempo que tarda en ejecutarse un proceso podemos usar el método de la siguiente maner

```
System.currentTimeMillis()
long t_comienzo, t_fin;
t_comienzo = System.currentTimeMillis();
Proceso();
t_fin = System.currentTimeMillis();
long tiempoTotal = t_fin – t_comienzo;
System.out.println(“El proceso ha tardado: “ +
tiempototal + “ miliseg”);
```