package org.CCristian.Ejemplos.List;
import org.CCristian.Ejemplos.Modelos.Alumno;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ejemplo_LinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada_alumnos = new LinkedList<>();
        System.out.println(enlazada_alumnos + "\n(ANTES de agregar elementos) size = " + enlazada_alumnos.size());
        System.out.println("¿Está vacía? = " + enlazada_alumnos.isEmpty() + "\n");

        enlazada_alumnos.add(new Alumno("Pato", 5));   /*pos. 0*/
        enlazada_alumnos.add(new Alumno("Cata", 6));   /*pos. 1*/
        enlazada_alumnos.add(new Alumno("Luci", 4));   /*pos. 2*/
        enlazada_alumnos.add(new Alumno("Jano", 7));   /*pos. 3*/
        enlazada_alumnos.add(new Alumno("Andrés", 3)); /*pos. 4*/

        System.out.println(enlazada_alumnos + "\n(DESPUÉS de agregar elementos) size = " + enlazada_alumnos.size());

        enlazada_alumnos.addFirst(new Alumno("Zeus",5));
        enlazada_alumnos.addLast(new Alumno("Atenea",6));
        System.out.println("\n"+ enlazada_alumnos + "\n(Elementos agregados usando 'addFirst' y 'addLast') size = " + enlazada_alumnos.size() + "\n");

        System.out.println("(getFirst)Primer elemento -> " + enlazada_alumnos.getFirst());
        System.out.println("(getLast)Último elemento -> " + enlazada_alumnos.getLast());
        System.out.println("(get(i))Elemento (Indicie = 2) -> " + enlazada_alumnos.get(2)); /*get(indice)*/
        System.out.println("(peekFirst)Primer elemento -> " + enlazada_alumnos.peekFirst());
        System.out.println("(peekLast)Último elemento -> " + enlazada_alumnos.peekLast());

        Alumno zeus = enlazada_alumnos.removeFirst();
        /*EXTRAE el elemento de la lista*/
        enlazada_alumnos.removeLast();

        //Alumno zeus = enlazada_alumnos.pollFirst();
        //Alumno zeus = enlazada_alumnos.pop();

        System.out.println("\n"+ enlazada_alumnos + "\n(Elemento EXTRAÍDO usando 'removeFirst y removeLast') size = " + enlazada_alumnos.size() + "\n");

        enlazada_alumnos.remove(new Alumno("Jano",7));
        /*remove(Objeto) regresa un boolean*/
        System.out.println("\n"+ enlazada_alumnos + "\n(Elemento EXTRAÍDO usando 'remove(Object)') size = " + enlazada_alumnos.size() + "\n");

        Alumno lucas = new Alumno("Lucas",5);
        enlazada_alumnos.addLast(lucas);
        System.out.println("Indice de Lucas: " + enlazada_alumnos.indexOf(lucas));

        enlazada_alumnos.remove(2);
        System.out.println("\n"+ enlazada_alumnos + "\nsize = " + enlazada_alumnos.size() + "\n");
        System.out.println("Indice de Lucas: " + enlazada_alumnos.indexOf(lucas));

        enlazada_alumnos.set(3,new Alumno("Lalo",7));
        /*Set reemplaza, pos.3*/
        System.out.println("\n"+ enlazada_alumnos + "\nsize = " + enlazada_alumnos.size() + "\n");

        ListIterator<Alumno> listIterator_alumnos = enlazada_alumnos.listIterator();
        /*
        1-Iteración bidireccional: ListIterator permite la iteración bidireccional, lo que significa que puedes recorrer
        la lista tanto hacia adelante como hacia atrás.
        2-Modificación durante la iteración: ListIterator te permite modificar la lista durante la iteración. Puedes
        agregar, eliminar o reemplazar elementos mientras recorres la lista.
        3-Acceso a índices: ListIterator proporciona métodos para acceder al índice actual del elemento y para mover
        el iterador directamente a un índice específico.
        4-Métodos adicionales: ListIterator ofrece varios métodos adicionales que no están presentes en Iterator,
        como hasPrevious(), previous(), nextIndex(), previousIndex(), entre otros.*/

        System.out.println("-----------Se MUEVE hacia ADELANTE----------");
        while (listIterator_alumnos.hasNext()){
            Alumno alumno = listIterator_alumnos.next();
            System.out.print(alumno);
        }
        /*el cursor AHORA se encuentra en el ÚLTIMO elemento*/

        System.out.println("-----------Se MUEVE hacia ATRÁS----------");
        while (listIterator_alumnos.hasPrevious()){
            Alumno alumno = listIterator_alumnos.previous();
            System.out.print(alumno);
        }
        /*el cursor AHORA se encuentra en el PRIMER elemento*/

    }
}