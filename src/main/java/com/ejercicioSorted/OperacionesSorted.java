package com.ejercicioSorted;

import com.ejercicioFilter.EmpleadoFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OperacionesSorted {

    public static void main(String [] args){
        System.out.println("Nombres ordenados " );
        Arrays.asList("Alfredo", "Maria", "Daniel", "Brenda")
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Numeros ordenados " );
        Arrays.asList(1,2,7,8,9,1,5,2,1,5,3,5)
                .stream()
                .sorted()
                .forEach(System.out::println);

        // hemos ido al objeto EmpleadoFilter y hemos añadido
        // el implements Comparable y hemos añadido el metodo compareTo ordenado por nombre
        System.out.println("Empleados ordenados por nombre alfabeticamente: " );
        List<EmpleadoFilter> empleados = EmpleadoFilter.empleados();

        empleados.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre()));

        System.out.println("\nEmpleados ordenados por edad " );

        empleados.stream()
                .sorted(new Comparator<EmpleadoFilter>() {
                    @Override
                    public int compare(EmpleadoFilter emp1, EmpleadoFilter emp2) {
                        return emp1.getEdad() - emp2.getEdad();
                    }
                })
                .forEach(emp -> System.out.println(emp.getNombre() +  " "  + emp.getEdad()));


        System.out.println("\nEmpleados ordenados por salario, > 25 años y solo mujeres" );

        empleados.stream()
                .filter(emp -> emp.getEdad() > 25 && emp.esMujer())
                .sorted((emp1, emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos()))
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad() + " "  + emp.getIngresos()));

    }

}
