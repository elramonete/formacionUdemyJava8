package com.ejercioBiConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    public static void main(String [] args){
        Map<String, String> map = new HashMap<String, String>();
        String[][] arreglo = {{"Chirs","USA"},{"Andre","UK"},{"Luis","FRANCIA"},{"Mireia","PAISES BAJOS"} ,{"Kroos","RUSSIA"} ,{"Glend","JAPON"}};

        for (int i=0;i<arreglo.length;i++){
            map.put(arreglo[i][0], arreglo[i][1]);
        }

        //Opcion A tradiocional
        System.out.println("Usando la forma tradicional de imprimir" + " clave y valor de un mapa. ");

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        if(iter != null){
            while ((iter.hasNext())){
                Map.Entry<String,String> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() + "\t" + " Valor " + entry.getValue());
            }
        }

        //Opcion B JAVA 8
        System.out.println("\nUsando BiConsumer y expresiones lambda: ");

        map.forEach((key,value) -> {System.out.println("Clave: " + key + "\t " + " Valor " + value);});

    }
}
