package org.CCristian.Ejemplos.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ejemplo_TreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println("\n---- Set<String> ts = new TreeSet<>()-----\n");
        System.out.println("ts: " + ts);
        /*Ordena en orden alfabético*/

        Set<String> ts2 = new TreeSet<>((a, b) -> b.compareTo(a));
        ts2.add("uno");
        ts2.add("dos");
        ts2.add("tres");
        ts2.add("tres");
        ts2.add("cuatro");
        ts2.add("cinco");
        System.out.println("\n---- Set<String> ts2 = new TreeSet<>((a, b) -> b.compareTo(a));-----\n");
        System.out.println("ts2: " + ts2);
        /*Ordena en orden alfabético DESCENDENTE*/

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("\n----Set<Integer> numeros = new TreeSet<>()-----\n");
        System.out.println("numeros: " + numeros);
        /*Ordena en orden ascendente*/

        Set<Integer> numeros2 = new TreeSet<>(Comparator.reverseOrder());
        numeros2.add(1);
        numeros2.add(5);
        numeros2.add(4);
        numeros2.add(2);
        numeros2.add(3);
        numeros2.add(10);
        System.out.println("\n----Set<Integer> numeros2 = new TreeSet<>(Comparator.reverseOrder())-----\n");
        System.out.println("numeros2: " + numeros2);
        /*Ordena en orden ascendente*/
    }
}
