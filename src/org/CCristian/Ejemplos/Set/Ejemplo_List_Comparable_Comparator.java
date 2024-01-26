package org.CCristian.Ejemplos.Set;

import org.CCristian.Ejemplos.Modelos.Alumno;

import java.util.*;

import static java.util.Comparator.comparing;

public class Ejemplo_List_Comparable_Comparator {
    public static void main(String[] args) {

        List<Alumno> list_alumnos = new ArrayList<>();
        list_alumnos.add(new Alumno("Pato",5));
        list_alumnos.add(new Alumno("Cata",6));
        list_alumnos.add(new Alumno("Luci",4));
        list_alumnos.add(new Alumno("Jano",7));
        list_alumnos.add(new Alumno("Andrés",3));
        list_alumnos.add(new Alumno("Zeus",2));
        list_alumnos.add(new Alumno("Zeus2",2));
        list_alumnos.add(new Alumno("Lucas",2));
        list_alumnos.add(new Alumno("Lucas",3));

        System.out.println("\n-------ArrayList<>()-------------");
        System.out.print(list_alumnos);

        System.out.println("\n-------Iterando usando Stream forEach-------------");
        list_alumnos.forEach(System.out::print);

        System.out.println("\n-------Ordenando usado 'Collections.sort' e iterando-------------");
        Collections.sort(list_alumnos);
        /*Ordenamiento especificado dentro de la clase 'Alumno', por Nota*/
        System.out.print(list_alumnos);

        System.out.println("\n-------Ordenando usado 'sort.comparing' (NOMBRE) e iterando-------------");
//        Collections.sort(list_alumnos,(a, b) -> a.getNombre().compareTo(b.getNombre()));
//        list_alumnos.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        list_alumnos.sort(comparing(Alumno::getNombre));
        System.out.print(list_alumnos);

        System.out.println("\n-------Ordenando usado 'sort.comparing.reversed' (NOMBRE-DESCENDENTE) e iterando-------------");
//        Collections.sort(list_alumnos,(a, b) -> a.getNombre().compareTo(b.getNombre()));
//        list_alumnos.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        list_alumnos.sort(comparing(Alumno::getNombre).reversed());
        System.out.print(list_alumnos);

        System.out.println("\n-------Ordenando usado 'sort.comparing' (NOTA) e iterando-------------");
        list_alumnos.sort(comparing((Alumno a) -> a.getNota()));
        System.out.print(list_alumnos);

        System.out.println("\n-------Ordenando usado 'sort.comparing.reversed' (NOTA-DESCENDENTE) e iterando-------------");
        list_alumnos.sort(comparing((Alumno a) -> a.getNota()).reversed());
        System.out.print(list_alumnos);

        System.out.println("\n-------Ordenando usado 'sort.compareTo' (NOMBRE-DESCENDENTE) e iterando-------------");
//        Collections.sort(list_alumnos,(a, b) -> b.getNombre().compareTo(a.getNombre()));
        list_alumnos.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));
        System.out.print(list_alumnos);


        List<Alumno> list_alumnos2 = new LinkedList<>();
        list_alumnos2.add(new Alumno("Pato",5));
        list_alumnos2.add(new Alumno("Cata",6));
        list_alumnos2.add(new Alumno("Luci",4));
        list_alumnos2.add(new Alumno("Jano",7));
        list_alumnos2.add(new Alumno("Andrés",3));
        list_alumnos2.add(new Alumno("Zeus",2));
        list_alumnos2.add(new Alumno("Zeus2",2));
        list_alumnos2.add(new Alumno("Lucas",2));
        list_alumnos2.add(new Alumno("Lucas",3));

        System.out.println("\n-------LinkedList<>()-------------");
        System.out.print(list_alumnos2);

        System.out.println("\n-------Iterando usando Stream forEach-------------");
        list_alumnos2.forEach(System.out::print);

        System.out.println("\n-------Ordenando usado 'Collections.sort' e iterando-------------");
        Collections.sort(list_alumnos2);
        /*Ordenamiento especificado dentro de la clase 'Alumno', por Nota*/
        System.out.print(list_alumnos2);

        System.out.println("\n-------Ordenando usado 'sort.comparing' (NOMBRE) e iterando-------------");
//        Collections.sort(list_alumnos2,(a, b) -> a.getNombre().compareTo(b.getNombre()));
//        list_alumnos2.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        list_alumnos2.sort(comparing(Alumno::getNombre));
        System.out.print(list_alumnos2);

        System.out.println("\n-------Ordenando usado 'sort.comparing.reversed' (NOMBRE-DESCENDENTE) e iterando-------------");
//        Collections.sort(list_alumnos2,(a, b) -> a.getNombre().compareTo(b.getNombre()));
//        list_alumnos2.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        list_alumnos2.sort(comparing(Alumno::getNombre).reversed());
        System.out.print(list_alumnos2);

        System.out.println("\n-------Ordenando usado 'sort.comparing' (NOTA) e iterando-------------");
        list_alumnos2.sort(comparing((Alumno a) -> a.getNota()));
        System.out.print(list_alumnos2);

        System.out.println("\n-------Ordenando usado 'sort.comparing.reversed' (NOTA-DESCENDENTE) e iterando-------------");
        list_alumnos2.sort(comparing((Alumno a) -> a.getNota()).reversed());
        System.out.print(list_alumnos2);

        System.out.println("\n-------Ordenando usado 'sort.compareTo' (NOMBRE-DESCENDENTE) e iterando-------------");
//        Collections.sort(list_alumnos2,(a, b) -> b.getNombre().compareTo(a.getNombre()));
        list_alumnos2.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));
        System.out.print(list_alumnos2);
    }
}
