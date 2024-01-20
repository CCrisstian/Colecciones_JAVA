package org.CCristian.Ejemplos.Set;

import org.CCristian.Ejemplos.Modelos.Alumno;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo_HashSet_Unicidad {
    public static void main(String[] args) {

        Set<Alumno> set_alumnos = new HashSet<>();

        set_alumnos.add(new Alumno("Pato",5));
        set_alumnos.add(new Alumno("Cata",6));
        set_alumnos.add(new Alumno("Luci",4));
        set_alumnos.add(new Alumno("Jano",7));
        set_alumnos.add(new Alumno("Andrés",3));
        set_alumnos.add(new Alumno("Zeus",2));
        set_alumnos.add(new Alumno("Zeus2",2));
        set_alumnos.add(new Alumno("Lucas",2));
        set_alumnos.add(new Alumno("Lucas",3));

        System.out.println(set_alumnos);
    }
}
