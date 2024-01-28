package org.CCristian.Ejemplos.Map;

import java.util.*;

public class Ejemplo_HashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        /*Map<Key, Value>*/
        System.out.println("¿Contiene elementos? ==> " + !persona.isEmpty());

        persona.put(null,"1234");
        persona.put(null,"1234");

        persona.put("nombre","John");

        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        
        persona.put("email","john.doe@email.com");
        persona.put("edad",30);

        /*---------------------------------------------------------*/
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);
        /*Asignamos la variable direccion a persona*/
        /*---------------------------------------------------------*/


        System.out.println(persona);
        
        String nombre = (String) persona.get("nombre");
        /*OBTENER un valor, persona.get(Key)*/
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
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

        Collection<Object> valores = persona.values();
        /*Collection<Value>*/
        System.out.println("\n-------Obtener y Mostrar los VALORES (values)-------");
        for (Object v : valores){
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
        for (Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                System.out.println("Key: " + par.getKey());
                Map<String, String> direccion_Map = (Map<String, String>) valor;
                for (Map.Entry<String, String>parDir: direccion_Map.entrySet()){
                    System.out.println("\t"+parDir.getKey() +" ==> "+parDir.getValue());
                }

            }else {
                System.out.println("Key: " + par.getKey() + " => Value:" + valor);
            }
        }

        System.out.println("\n-------ITERAR usando (getSet())-------");
        /*persona.get(Key)*/
        for (String llave : persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccion_Map = (Map<String, String>) valor;
                System.out.println("El país de "+nom+" es: "+direccion_Map.get("pais"));
                System.out.println("El estado de "+nom+" es: "+direccion_Map.get("estado"));
                System.out.println("La ciudad de "+nom+" es: "+direccion_Map.get("ciudad"));

            }else {
                System.out.println("llave(" + llave + ") ==> valor: " + valor);
            }
        }

        System.out.println("\n-------ITERAR usando FOREACH y Expresión LAMBDA-------");
        /*Map<llave, valor> persona*/ /*Expresión LAMBDA*/
        persona.forEach((llave, valor) ->{
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


        Map<String, String> direccion_Persona = (Map<String, String>) persona.get("direccion");
        String pais = direccion_Persona.get("pais");
        String ciudad = direccion_Persona.get("ciudad");
        String barrio = direccion_Persona.getOrDefault("barrio","La playa");
        /*get(key) -> null en caso de que no exista la key que se busca*/
        /*getOrDefault(key, defaultValue) -> defaultValue en caso de que no exista la key que se busca*/
        System.out.println("El pais de " + nombre +" es: " + pais);
        System.out.println("La ciudad de " + nombre +" es: " + ciudad);
        System.out.println("El barrio de " + nombre +" es: " + barrio);
    }

}

