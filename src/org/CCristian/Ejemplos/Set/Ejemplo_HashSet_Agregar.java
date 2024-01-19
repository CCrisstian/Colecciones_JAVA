package org.CCristian.Ejemplos.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejemplo_HashSet_Agregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println("hs = " + hs);

        boolean b = hs.add("tres");
        System.out.println("¿'Set<>' permite elementos duplicados? --> " + b);
        System.out.println("hs = " + hs);

        /*Las implementaciones de Set no garantizan un orden específico de los elementos.*/
        /*Un Set es que no permite elementos duplicados. Se verifica automáticamente si el elemento ya está presente
         en el conjunto.*/
        System.out.println("\n=================================================\n");
        List<String> hsL = new ArrayList<>();
        hsL.add("uno");
        hsL.add("dos");
        hsL.add("tres");
        hsL.add("cuatro");
        hsL.add("cinco");
        System.out.println("hsList = " + hsL);

        boolean b2 = hsL.add("tres");
        System.out.println("¿'List<>' permite elementos duplicados? --> " + b2);
        System.out.println("hsList = " + hsL);


    }
}
