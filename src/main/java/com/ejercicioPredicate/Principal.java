package com.ejercicioPredicate;

import com.ejercicioBiFunction.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Principal {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Javier",  1200, 26, "Cobranzas"),
                new Empleado("Juan",  2500,32, "Ventas"),
                new Empleado("Pablo",  3300,42, "Mostrador"),
                new Empleado("Irene",  1800,12, "Ventas"),
                new Empleado("Alonso",  2500,82, "Mostrador"),
                new Empleado("Bernardo", 50000,66, "Creditos"),
                new Empleado("Ana",  8000,24, "Pagos"),
                new Empleado("Marina",  3000,18, "Ventas"),
                new Empleado("Roberto", 2500,23, "Recursos humanos"));

        Evaluador evaluador = new Evaluador();

        System.out.println("Empelado con salarios > = 3000 " );
        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados, empleado ->empleado.getSalario() ==  3000);

        for (Empleado empleado : empSalariosAltos) {
        System.out.println(empleado.getNombre());

        }

        System.out.println("\nEmpleados que su nombre inicia con J: ");
        List<Empleado> emInicialnConJ =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("J"));

        for (Empleado empleado: emInicialnConJ ) {
            System.out.println(empleado.getNombre());
        }

        System.out.println("\nEmpleados menor que 25 ");
        List<Empleado> empJovenes =
                evaluador.evaluar(listaEmpleados, empleado -> empleado.getEdad() < 25);

        for (Empleado empleado: empJovenes ) {
            System.out.println(empleado.getNombre());
        }

        Funciones func = new Funciones();

        for (Empleado empleado: empJovenes) {
            double nuevoSalario = func.incrementeSalario(empleado, 10,
                    (salario, incremento) -> salario + (salario * incremento/100));
            empleado.setSalario(nuevoSalario);
        }

        for (Empleado empleado: empJovenes) {
            System.out.println("Nombre: " + empleado.getNombre() + " Salario: " + empleado.getSalario());

        }

        Evaluador2 evaluador2 = new Evaluador2();

        BiPredicate<Integer, String> primerCriterio =
                (edad, departamento) -> (edad >= 25) && (departamento.equals(("Ventas")));


        BiPredicate<Integer, String> segundoCriterio =
                (edad, departamento) -> (edad >= 25) && (departamento.equals(("Mostrador")));

        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        System.out.println("Empleados de mostrador o ventas " + "mayores de 25 años");

        List<Empleado> listaActualizada = evaluador2.evaluar(listaEmpleados, criterio);

        for (Empleado empleado: listaActualizada) {
            System.out.println("Nombre: " + empleado.getNombre() +
                    " Edad: " + empleado.getEdad() +
                    " Departamento: " + empleado.getDepartamento());

        }


    }
    }
