package org.CCristian.Ejemplos.Set;

import org.CCristian.Ejemplos.Modelos.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class Ejemplo_TreeSet_Comparable {
    public static void main(String[] args) {

        Set<Alumno> set_alumnos = new TreeSet<>((a, b) -> a.getNota().compareTo(b.getNota()));
        /*Expresión LAMBDA para ordenar*/

        set_alumnos.add(new Alumno("Pato",5));
        set_alumnos.add(new Alumno("Cata",6));
        set_alumnos.add(new Alumno("Luci",4));
        set_alumnos.add(new Alumno("Jano",7));
        set_alumnos.add(new Alumno("Andrés",3));
        set_alumnos.add(new Alumno("Zeus",2));

        /*La clase 'Alumno' implementa la interfaz 'Comparable' para poder usar TreeSet*/
        System.out.println("set_alumnos esta ordenado de forma ASCENDENTE [0-...] por NOTA\n");
        System.out.println(set_alumnos);
    }
}
