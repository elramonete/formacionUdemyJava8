package com.ejercicoComparator;

import java.util.*;

public class Ordenacion {

    public static void main (String[] args){
        List<String> nombres =
                Arrays.asList("Carlos", "Ana", "Abías", "German");

        System.out.println("Lista antes de ordenarse"  + nombres);

        Collections.sort(nombres);

        System.out.println("Lista despues de ordenarse"  + nombres);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Mario"));
        personas.add(new Persona(2, "Alicia"));
        personas.add(new Persona(3, "Juan"));
        personas.add(new Persona(4, "Omar"));
        personas.add(new Persona(5, "Luisa"));

        //Opcion A tradicional ordenado por nombre
        System.out.println("Lista de personas sin ordenadas por nombre"  + personas);

        Collections.sort(personas);

        System.out.println("Lista de personas ordenadas por nombre"  + personas);


        //Opcion A tradicional ordenado por id
        Collections.sort(personas, new OrdernarPersonasPorId());

        System.out.println("Lista de personas ordenadas por id"  + personas);


        //Opcion B tradicional ordenado por id
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getIdPersona() - o2.getIdPersona();
            }
        });
        System.out.println("Lista de personas ordenadas por id solucion2"  + personas);


        //Opcion ideal con expresion lambda por id
        Collections.sort(personas, (p1,p2) -> p1.getIdPersona() - p2.getIdPersona());

        System.out.println("Lista de personas ordenadas por id funcion lambda"  + personas);

        //Opcion ideal con expresion lambda por nombre
        Collections.sort(personas, (p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));

        System.out.println("Lista de personas ordenadas por nombre funcion lambda"  + personas);


    }
}
