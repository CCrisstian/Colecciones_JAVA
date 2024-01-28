package org.CCristian.Ejemplos.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ejemplo_TreeMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new TreeMap<>(); /*TreeMap<> ordena las key´s de forma natural*/
        /*Map<Key, Value>*/

        /*persona.put(null,"1234");
        persona.put(null,"1234");*/
        /*No puede almacenar elementos null*/

        persona.put("nombre","John");

        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        
        persona.put("email","john.doe@email.com");
        persona.put("edad",30);

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);
        /*Asignamos la variable direccion a persona*/

        System.out.println(persona);

        System.out.println("\n---------Orden de key´s INVERTIDO (Comparator.reverseOrder())------------\n");
        Map<String, Object> aux_DESCENDENTE = new TreeMap<>(Comparator.reverseOrder());
        aux_DESCENDENTE.putAll(persona);
        System.out.println(aux_DESCENDENTE);

        System.out.println("\n---------Orden de key´s por largo de nombre(ASCENDENTE) (Comparator.comparing())------------\n");
        Map<String, Object> aux_SIZE_KeyName = new TreeMap<>(Comparator.comparing(String::length));
        aux_SIZE_KeyName.putAll(persona);
        System.out.println(aux_SIZE_KeyName);

        System.out.println("\n---------Orden de key´s por largo de nombre(DESCENDENTE) (Comparator.comparing().reversed)------------\n");
        Map<String, Object> aux_SIZE_Name_reversed = new TreeMap<>(Comparator.comparing(String::length).reversed());
        aux_SIZE_Name_reversed.putAll(persona);
        System.out.println(aux_SIZE_Name_reversed);
    }

}

