package org.CCristian.Ejemplos.Set;

import org.CCristian.Ejemplos.Modelos.Alumno;

import java.util.*;

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

        System.out.println("\n---------HashSet<>()------------------");
        System.out.println(set_alumnos);

        System.out.println("-------Iterando usando un For-------------");
        for (Alumno a : set_alumnos){
            System.out.print(a);
        }
        System.out.println("-------Iterando usando un While e Iterator-------------");
        Iterator<Alumno> iterator = set_alumnos.iterator();
        while (iterator.hasNext()){
            Alumno a = iterator.next();
            System.out.print(a);
        }
        System.out.println("-------Iterando usando Stream forEach-------------");
        set_alumnos.forEach(System.out::print);


        System.out.println("\n\n---------TreeSet<>()------------------");
        Set<Alumno> set_alumnos2 = new TreeSet<>();
        set_alumnos2.add(new Alumno("Pato",5));
        set_alumnos2.add(new Alumno("Cata",6));
        set_alumnos2.add(new Alumno("Luci",4));
        set_alumnos2.add(new Alumno("Jano",7));
        set_alumnos2.add(new Alumno("Andrés",3));
        set_alumnos2.add(new Alumno("Zeus2",2));
        set_alumnos2.add(new Alumno("Zeus",2));
        set_alumnos2.add(new Alumno("Lucas",2));
        set_alumnos2.add(new Alumno("Lucas",3));

        System.out.println(set_alumnos2);

        System.out.println("-------Iterando usando un For-------------");
        for (Alumno a : set_alumnos2){
            System.out.print(a);
        }
        System.out.println("-------Iterando usando un While e Iterator-------------");
        Iterator<Alumno> iterator2 = set_alumnos2.iterator();
        while (iterator2.hasNext()){
            Alumno a = iterator2.next();
            System.out.print(a);
        }
        System.out.println("-------Iterando usando Stream forEach-------------");
        set_alumnos2.forEach(System.out::print);


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

        System.out.println("\n\n---------ArrayList<>()------------------");
        System.out.println(list_alumnos);

        System.out.println("-------Iterando usando un For-------------");
        for (Alumno a : list_alumnos){
            System.out.print(a);
        }
        System.out.println("-------Iterando usando un While e Iterator-------------");
        Iterator<Alumno> iterator3 = list_alumnos.iterator();
        while (iterator3.hasNext()){
            Alumno a = iterator3.next();
            System.out.print(a);
        }
        System.out.println("-------Iterando usando Stream forEach-------------");
        list_alumnos.forEach(System.out::print);
        System.out.println("-------Iterando usando un For clásico-------------");
        for (int i = 0; i < list_alumnos.size(); i++){
            Alumno alumno3 = list_alumnos.get(i);
            System.out.print(alumno3);
        }


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

        System.out.println("\n\n---------LinkedList<>()------------------");
        System.out.println(list_alumnos2);

        System.out.println("-------Iterando usando un For-------------");
        for (Alumno a : list_alumnos2){
            System.out.print(a);
        }
        System.out.println("-------Iterando usando un While e Iterator-------------");
        Iterator<Alumno> iterator4 = list_alumnos2.iterator();
        while (iterator4.hasNext()){
            Alumno a = iterator4.next();
            System.out.print(a);
        }
        System.out.println("-------Iterando usando Stream forEach-------------");
        list_alumnos2.forEach(System.out::print);
        System.out.println("-------Iterando usando un For clásico-------------");
        for (int i = 0; i < list_alumnos2.size(); i++){
            Alumno alumno4 = list_alumnos2.get(i);
            System.out.print(alumno4);
        }
    }
}
