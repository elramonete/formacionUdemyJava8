package com.ejercicioFilter;

import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter {

    public static void main(String [] args){
        List<EmpleadoFilter> empleados = EmpleadoFilter.empleados();

        System.out.println("********* Empleados HOMBRE *************");

        empleados.stream().filter(new Predicate<EmpleadoFilter>() {
            @Override
            public boolean test(EmpleadoFilter empleadoFilter) {
                       return empleadoFilter.esHombre();
            }
        }).forEach(emp -> System.out.println(emp.getNombre()+ " " + emp.getGenero()));


        System.out.println("********* Empleados MUJER *************");

        empleados
                .stream()
                .filter(EmpleadoFilter::esMujer)
                .forEach(emp -> System.out.println(emp.getNombre()+ " " + emp.getGenero()));

        System.out.println("********* Empleados > 25 *************");

        empleados
                .stream()
                .filter(emp -> emp.getEdad() > 25)
                .forEach(emp -> System.out.println(emp.getNombre()+ " " + emp.getEdad()));


        System.out.println("********* Personal masculino cuya letra comience con la letra A *************");

        empleados
                .stream()
                .filter(EmpleadoFilter::esHombre)
                .filter(emp -> emp.getNombre().startsWith("A"))
                .forEach(emp -> System.out.println(emp.getNombre()+ " " + emp.getGenero()));

        System.out.println("********* Personal masculino  que gana > 500 *************");

        empleados
                .stream()
//                .filter(EmpleadoFilter::esHombre)
                .filter(emp -> emp.esHombre() && emp.getIngresos() > 500)
                .forEach(emp -> System.out.println(emp.getNombre()+ " " + emp.getGenero()  + " " + emp.getIngresos()));


        System.out.println("********* Personal femenino mayor de 23 años, coon ingresos por encima > 300 *************");

        Predicate<EmpleadoFilter> emFemenino = emp -> emp.esMujer();
        Predicate<EmpleadoFilter> empMayor25 = emp -> emp.getEdad() > 25;
        Predicate<EmpleadoFilter> empMayor300Ing = emp -> emp.getIngresos() > 300;
        Predicate<EmpleadoFilter> fem25300 = emFemenino.and(empMayor25).and(empMayor300Ing);

        empleados.stream().filter(fem25300)
                .forEach(emp -> System.out.println(emp.getNombre()+ " " + emp.getGenero()  + " " + emp.getIngresos() + " " + emp.getEdad()));

        System.out.println("********* Cantidad Total: "  + empleados.stream().filter(fem25300).count());
    }
}
