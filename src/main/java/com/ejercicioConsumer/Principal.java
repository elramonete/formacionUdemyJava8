package com.ejercicioConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {

    public static void main(String[] args){
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Jhon",6),
                new Estudiante("Alberto",19),
                new Estudiante("Maria",20),
                new Estudiante("Jaime",15),
                new Estudiante("Julia",12),
                new Estudiante("Raul",1),
                new Estudiante("Augusto",2),
                new Estudiante("Pablo",3),
                new Estudiante("Luis",5),
                new Estudiante("Tom",4),
                new Estudiante("Maceda",7),
                new Estudiante("Arturo",10),
                new Estudiante("Vanesa",9));

                OperacionEstudiantes op = new OperacionEstudiantes();

        /*
        // Opcion A mismo resultado
        Consumer<Estudiante> cons1 = e -> System.out.println(
                "Nombre: " + e.getNom() +
                " Calificacion " + e.getCal());

        System.out.println("Estudiantes sin calificacion actualizada: " );
        op.aceptaTodos(estudiantes, cons1);

        Consumer<Estudiante> cons2 = e -> e.setCal((e.getCal()*1.5));

        op.aceptaTodos(estudiantes,cons2);
        System.out.println("Estudiantes con calificacion actualizada: " );
        op.aceptaTodos(estudiantes,cons1);*/

        //opcion B mismo resultado Y usando el andThen
        Consumer<Estudiante> cons1 = e -> System.out.println(
                "Nombre: " + e.getNom() +
                        " Calificacion " + e.getCal());

        System.out.println("Estudiantes sin calificacion actualizada: " );
        op.aceptaTodos(estudiantes, cons1);

        Consumer<Estudiante> cons2 = e -> e.setCal((e.getCal()*1.5));

        Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        System.out.println("Estudiantes con calificacion actualizada: " );
        op.aceptaTodos(estudiantes,cons3);
    }

    }

