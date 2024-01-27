package org.CCristian.Ejemplos.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ejemplo_HashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        /*Map<Key, Value>*/
        System.out.println("¿Contiene elementos? ==> " + !persona.isEmpty());

        persona.put(null,"1234");
        persona.put(null,"1234");

        persona.put("nombre","John");

        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        
        persona.put("email","john.doe@email.com");
        persona.put("edad","30");
        System.out.println(persona);
        
        String nombre = persona.get("nombre");
        /*OBTENER un valor, persona.get(Key)*/
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        //String valor_apellidoPaterno = persona.remove("apellidoPaterno");
        /*EXTRAE el elemento remove(Key) y devuelve el elemento*/
        boolean b = persona.remove("apellidoPaterno","Doe");
        /*EXTRAE el elemento remove(Key, Value) y devuelve boolean*/
        //System.out.println("Eliminado -> " + valor_apellidoPaterno);
        System.out.println("b -> " + b);
        System.out.println(persona);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("¿Tiene la Key:apellidoPaterno? -> b2:" + b2);

        b2 = persona.containsValue("Roe");
        System.out.println("¿Tiene el Value:Roe? -> b2:" + b2);

        b2 = persona.containsValue("john.doe@email.com");
        System.out.println("¿Tiene el Value:john.doe@email.com? -> b2:" + b2);

        Collection<String> valores = persona.values();
        /*Collection<Value>*/
        System.out.println("\n-------Obtener y Mostrar los VALORES (values)-------");
        for (String v : valores){
            System.out.println("value: "+ v);
        }

        Set<String> llaves = persona.keySet();
        /*Set<Key>*/
        System.out.println("\n-------Obtener y Mostrar las LLAVES (KeySet())-------");
        for (String l : llaves){
            System.out.println("key: "+ l);
        }

        System.out.println("\n-------ITERAR usando (entrySet)-------");
        /*Map.Entry<Key, Value>*/
        for (Map.Entry<String, String> par: persona.entrySet()){
            System.out.println("Key: "+par.getKey()+" => Value:" + par.getValue());
        }

        System.out.println("\n-------ITERAR usando (getSet())-------");
        /*persona.get(Key)*/
        for (String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println("llave("+llave+") ==> valor: "+ valor);
        }

        System.out.println("\n-------ITERAR usando FOREACH y Expresión LAMBDA-------");
        /*Map<llave, valor> persona*/ /*Expresión LAMBDA*/
        persona.forEach((llave, valor) -> {
            System.out.println("llave("+llave+") ==> valor: "+ valor);
        });

        System.out.println("\nTotal de elementos: " + persona.size());
        System.out.println("¿Contiene elementos? ==> " + !persona.isEmpty());
        /*persona.isEmpty = false porque si contiene elementos*/

        System.out.println("\n-------REEMPLAZAR un elemento (replace)-------");
        System.out.println(persona);
        boolean b3 = persona.replace("nombre","John","Andrés");
        System.out.println("nombre:John ---> Andrés");
        System.out.println("b3 = " + b3);
        /*replace(Key, Value) regresa el valor cambiado*/
        /*replace(Key, OldValue, NewValue) regresa un boolean*/
        System.out.println(persona);

    }
}
