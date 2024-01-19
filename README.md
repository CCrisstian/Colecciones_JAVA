<h1>Métodos de Collection</h1>
- boolean add( Object ) Agrega un elemento a la colección. Devuelve false si no se pudo agregar.
- boolean addAll( Collection ) Agrega una colección que se pasa por argumento.
- void clear() Elimina todos los elementos que componen la colección
- boolean contains( Object ) Verdadero si la colección contiene el objeto que se pasa como parámetro, utiliza el método equals() para ubicar el objeto
- boolean isEmpty() Verdadero si la colección está vacía, no contiene elementos
- Iterator iterator() Devuelve un objeto Iterator que se puede utilizar para avanzar a través de los elementos
- boolean remove( Object ) Elimina un elemento de la colección y devuelve true si se ha conseguido
- boolean removeAll( Collection ) Elimina todos los elementos que están contenidos en el argumento. Devuelve true si consigue eliminar cualquiera de ellos
- boolean retainAll( Collection ) Mantiene solamente los elementos que están contenidos en el argumento, es lo que sería una intersección en la teoría de conjuntos. Devuelve verdadero en caso de que se produzca algún cambio
- int size() Devuelve el número de elementos que componen la colección
- <b>Object[] toArray()</b>

![image](https://github.com/CCrisstian/Colecciones_JAVA/assets/111469216/7d1e1094-4b2a-4bfb-a20e-4d42e5a8e061)
