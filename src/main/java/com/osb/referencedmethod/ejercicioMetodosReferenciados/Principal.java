package com.osb.referencedmethod.ejercicioMetodosReferenciados;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {


    public static void main(String[] args) {
        List<PersonaReferenciado> personas =
                Arrays.asList(
                        new PersonaReferenciado("Juan", 18, "juanito@hotmail.com"),
                        new PersonaReferenciado("Mario", 17, "mario@hotmail.com"),
                        new PersonaReferenciado("Arturo", 17, "arturito@hotmail.com"),
                        new PersonaReferenciado("Maria", 15, "maria@hotmail.com"),
                        new PersonaReferenciado("Beatriz", 14, "bety@hotmail.com"),
                        new PersonaReferenciado("Olivia", 12, "oli@hotmail.com"),
                        new PersonaReferenciado("Angel", 25, "angelito@hotmail.com"),
                        new PersonaReferenciado("Omar", 32, "omaro@hotmail.com"),
                        new PersonaReferenciado("Pamela", 28, "pamelita@hotmail.com"),
                        new PersonaReferenciado("Sadee", 25, "sadeeo@hotmail.com"),
                        new PersonaReferenciado("Jared", 12, "jared@hotmail.com"));

       System.out.println("Personas sin ordenar: ");
       personas.forEach(p -> System.out.println(p));
       System.out.println("");
        //Opcion A mas tradicional
//        Collections.sort(personas,
//                (persona1, persona2) -> persona1.getEdad().compareTo(persona2.getEdad()));

        //Opcion B cogemos el metodo estatico de la clase PersonaReferenciado
//        Collections.sort(personas,
//                (persona1, persona2) -> PersonaReferenciado.compararPorEdad(persona1,persona2));

        //Opcion C uso de Referenciado el IDEAL PersonaReferenciado, 1-metodo referenciado a un metodo estatico
        Collections.sort(personas, PersonaReferenciado::compararPorEdad);

        System.out.println("Personas con ordenacion por edad: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println("");

    //2- Metodo referenciado a un instancia de un objeto en particular (ProveedorComparaciones)
        ProveedorComparaciones proveedorComparaciones = new ProveedorComparaciones();
        //Opcion A de referenciado a un instancia de un objeto en particular (ProveedorComparaciones)
//        Collections.sort(personas, (p1,p2) -> proveedorComparaciones.compararPorNombre(p1,p2));

        //Opcion B IDEAL referenciado a un instancia de un objeto en particular (ProveedorComparaciones)
        Collections.sort(personas, proveedorComparaciones::compararPorNombre);

        System.out.println("Personas con ordenacion por nombre: ");
        //Invocando a metodos referenciados
//        personas.forEach(p -> System.out.println(p));
        personas.forEach(System.out::println);
        System.out.println("");


//        Collections.sort(personas, (per1, per2) -> per1.compararPorEdad2(per2))
          Collections.sort(personas, PersonaReferenciado::compararPorEdad2);
        // metodos referenciado de una instancia de un objeto aribtrario de un tipo en particular (PersonaReferenciado)
          // PersonaReferenciado::compararPorEdad2 es lo mismo que  (per1, per2) -> per1.compararPorEdad2(per2)

    }

}
