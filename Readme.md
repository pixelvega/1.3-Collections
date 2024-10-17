# Colecciones en Java

# Nivel 1

## Ejercicio 1

- Crea una clase llamada **Month** con un atributo **"name"** (que almacenará el nombre del mes del año). 
- Añade 11 objetos **Month** (cada uno con su atributo diferente) en un <code>ArrayList</code>, a excepción del objeto con atributo **"Agosto"**. 
- Después, efectúa la inserción en el sitio que corresponde a este mes y demuestra que <code>ArrayList</code> mantiene el orden correcto.
- Convierte <code>ArrayList</code> del ejercicio anterior en un <code>HashSet</code> y asegúrate de que no permite duplicados.
- Recorre la lista con un <code>for</code> y con un <code>iterator</code>.

<HR></HR>

## Ejercicio 2

- Crea y rellena un <code>List<Integer></code>.

- Crea un segundo <code>List<Integer></code> e inserta en la segunda lista los elementos de la primera en orden inverso.

- Emplea los objetos <code>ListIterator</code> para leer los elementos de la primera lista e insertarlos en la segunda.


<HR></HR>

## Ejercicio 3

Dado el archivo <CODE>countries.txt</CODE> que contiene países y capitales. 
- El programa debe leer el archivo y guardar los datos en un <code>HashMap<String, String></code>. 
- El programa pide el **nombre del usuario/a**, y después debe **mostrar un país de forma aleatoria**, guardado en <code>HashMap</code>. 
- El usuario debe escribir el nombre de la capital del país en cuestión. 
- Si acierta se le suma un punto. 
- Esta acción se **repite 10 veces**. 
- Una vez solicitadas las capitales de 10 países de forma aleatoria: 
  - debe guardarse en un fichero llamado **classificacio.txt**, el **nombre del usuario** y su **puntuación**.

<HR></HR>

# Nivel 2

## Ejercicio 1
Crea una clase llamada **Restaurante** con dos atributos: <CODE>nombre(String)</CODE> y <CODE>puntuación(int)</CODE>. 
- Implementa los métodos necesarios para que NO se puedan introducir objetos Restaurante con el mismo nombre y puntuación en un <CODE>HashSet</CODE> **creado en el main()** de la aplicación.

~~

**! Importante**

Puede haber restaurantes con el mismo nombre con distinta puntuación, pero no puede haber restaurantes con el mismo nombre y igual puntuación.

~~

## Ejercicio 2
Utilizando la clase del programa anterior, crea la implementación necesaria para que 
- los objetos de la clase **Restaurante** estén **ordenados por nombre y por puntuación en orden descendente**.

~~

Ejemplo:

nombre: restaurant1, puntuación: 8

nombre: restaurant1, puntuación: 7


~~