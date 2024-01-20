<h1 align="center"><b>HashSet</b></h1>

<p>En JAVA, <b>'HashSet'</b> es una clase que implementa la interfaz <b>Set</b> y extiende la clase <b>AbstractSet</b>. Representa una colección que no permite elementos duplicados y no garantiza el orden de los elementos. Está respaldada por una tabla hash, lo que permite un acceso rápido y eficiente a los elementos.</p>

<p>Algunas características clave de <b>HashSet</b> son:</p>

- <b>No permite duplicados:</b> Si intentas agregar un elemento que ya existe en el conjunto, la operación no tendrá ningún efecto y el conjunto permanecerá sin cambios.

- <b>No garantiza orden:</b>  Los elementos en un HashSet no se almacenan en un orden específico. Si necesitas un orden específico, podrías considerar usar LinkedHashSet, que mantiene el orden de inserción, o TreeSet, que ordena los elementos naturalmente o mediante un comparador.

- <b>Permite elementos nulos:</b>  Un HashSet puede contener un único elemento nulo. Si intentas agregar más de un elemento nulo, se ignorarán.

<h1 align="center"><b>TreeSet</b></h1>

<p>En JAVA, <b>'TreeSet'</b> es una clase que implementa la interfaz <b>Set</b> y extiende la clase <b>AbstractSet</b>. Representa una colección que no permite elementos duplicados y mantiene los elementos ordenados en orden natural o mediante un comparador personalizado. A diferencia de <b>'HashSet'</b>, <b>'TreeSet'</b> garantiza un orden específico para sus elementos, lo cual es útil en situaciones donde se necesita iterar o recuperar elementos en un orden predefinido.</p>

<p>Algunas características clave de <b>TreeSet</b> son:</p>

- <b>No permite duplicados:</b> Similar a HashSet, TreeSet no permite la inclusión de elementos duplicados. Si intentas agregar un elemento que ya existe en el conjunto, la operación no tendrá ningún efecto.

- <b>Mantiene el orden:</b> Los elementos en un TreeSet se almacenan y ordenan automáticamente. Puedes usar el orden natural de los elementos (si son comparables) o proporcionar un comparador personalizado.

- <b>Implementa la interfaz NavigableSet:</b> TreeSet implementa la interfaz NavigableSet, que proporciona métodos adicionales para la navegación y búsqueda eficientes en el conjunto.

<h2 align="center">Métodos de Collection</h2>

- <b>boolean add( Object )</b> Agrega un elemento a la colección. Devuelve false si no se pudo agregar.

- <b>boolean addAll( Collection )</b> Agrega una colección que se pasa por argumento.

- <b>void clear()</b> Elimina todos los elementos que componen la colección.

- <b>boolean contains( Object )</b> Verdadero si la colección contiene el objeto que se pasa como parámetro, utiliza el método equals() para ubicar el objeto.

- <b>boolean isEmpty()</b> Verdadero si la colección está vacía, no contiene elementos.

- <b>Iterator iterator()</b> Devuelve un objeto Iterator que se puede utilizar para avanzar a través de los elementos.

- <b>boolean remove( Object )</b> Elimina un elemento de la colección y devuelve true si se ha conseguido.

- <b>boolean removeAll( Collection )</b> Elimina todos los elementos que están contenidos en el argumento. Devuelve true si consigue eliminar cualquiera de ellos.

- <b>boolean retainAll( Collection )</b> Mantiene solamente los elementos que están contenidos en el argumento, es lo que sería una intersección en la teoría de conjuntos. Devuelve verdadero en caso de que se produzca algún cambio.

- <b>int size() Devuelve el número de elementos que componen la colección

- <b>Object[] toArray()</b>

<h2 align="center">Métodos adicionales del LinkedList</h2>
<p>Que no están definidos en ningún interfaz o clase base y que permiten utilizar la Lista Enlazada como una Pila y una Cola.</p>

- <b>addFirst()</b>
  
- <b>addLast()</b>
  
- <b>getFirst()</b>
  
- <b>getLast()</b>
  
- <b>removeFirst()</b>
  
- <b>removeLast()</b>

<p>Lanzan NoSuchElementException si la lista está vacía.</p>

- <b>getFirst()</b>

- <b>getLast()</b>

- <b>removeFirst()</b>

- <b>removeLast()</b> 

![image](https://github.com/CCrisstian/Colecciones_JAVA/assets/111469216/7d1e1094-4b2a-4bfb-a20e-4d42e5a8e061)
