package com.ejercicioBiFunction;

import java.util.Arrays;
import java.util.List;

public class ejercicioBiFuncion3 {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Javier", 256.2, 25, ""),
                new Empleado("Juan", 333.1, 25, ""),
                new Empleado("Pablo", 124.9, 25, ""),
                new Empleado("Irene", 111.4, 25, ""),
                new Empleado("Alonso", 0759.1, 25, ""),
                new Empleado("Bernardo", 786.2, 25, ""),
                new Empleado("Ana", 256.2, 25, ""),
                new Empleado("Marina", 56.1, 25, ""),
                new Empleado("Roberto", 286.2, 25, ""));

        Calculadora2 cal = new Calculadora2();

        List<Double> salarios = cal.calc((salario, incremento) -> salario + (salario *(incremento/100)), listaEmpleados, 50.0);

        for (Double salario : salarios) {
            System.out.println(salario);
        }


    }

}
