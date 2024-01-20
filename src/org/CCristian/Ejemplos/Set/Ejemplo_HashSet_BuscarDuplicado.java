package org.CCristian.Ejemplos.Set;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo_HashSet_BuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina","Lenguado","Pejerrey","Robalo","Atún","Lenguado"};

        Set<String> unicos = new HashSet<>();

        for (String pez: peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento DUPLICADO: '"+pez+"'");
            }
        }

        System.out.println(unicos.size() + " Elementos unicos: "+unicos);
    }
}
