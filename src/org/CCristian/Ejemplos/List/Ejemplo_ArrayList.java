package org.CCristian.Ejemplos.List;
import org.CCristian.Ejemplos.Modelos.Alumno;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo_ArrayList {
    public static void main(String[] args) {

        List<Alumno> al_alumnos = new ArrayList<>();
        System.out.println(al_alumnos + "\n(ANTES de agregar elementos) size = " + al_alumnos.size());
        System.out.println("¿Está vacía? = " + al_alumnos.isEmpty()+"\n");

        al_alumnos.add(new Alumno("Pato",5));   /*pos. 0*/
        al_alumnos.add(new Alumno("Cata",6));   /*pos. 1*/
        al_alumnos.add(new Alumno("Luci",4));   /*pos. 2*/
        al_alumnos.add(2, new Alumno("Jano",7));   /*pos. 3*/ /*Intercambian pos.*/
        al_alumnos.set(3, new Alumno("Andrés",3)); /*pos. 4*/

        System.out.println(al_alumnos + "\n(DESPUÉS de agregar elementos) size = " + al_alumnos.size());
        System.out.println("¿Está vacía? = " + al_alumnos.isEmpty()  + "\n");

        al_alumnos.remove(new Alumno("Jano",7));
        /*remove(instancia)*/
//        al_alumnos.remove(2);
        /*remove(indice)*/
        System.out.println(al_alumnos + "\n(DESPUÉS de REMOVER elementos) size = " + al_alumnos.size() + "\n");

        boolean b = al_alumnos.contains(new Alumno("Cata",6));
        /*contains(instancia)*/
        System.out.println("¿La lista contiene a Cata? = " + b);

        System.out.println("\n---------Convertir ArrayList en un Array----------");
        Object array_alumnos[] = al_alumnos.toArray();
        for (int i = 0; i < array_alumnos.length; i++){
            System.out.print(array_alumnos[i]);
        }
        }
    }