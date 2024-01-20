package org.CCristian.Ejemplos.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo_HashSet_BuscarDuplicado_2 {
    public static void main(String[] args) {

        String[] peces = {"Corvina","Lenguado","Pejerrey","Robalo","Atún","Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces){
            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        System.out.println("\n"+peces.length + " Elementos Arreglo original peces[]: "+ Arrays.toString(peces) +"\n");
        System.out.println(unicos.size() + " Elementos UNICOS: "+unicos+"\n");
        System.out.println(duplicados.size() + " Elementos DUPLICADOS: "+duplicados);
    }
}
