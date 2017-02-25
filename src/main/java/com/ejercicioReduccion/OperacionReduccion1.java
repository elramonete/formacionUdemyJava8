package com.ejercicioReduccion;

import com.ejercicioFilter.EmpleadoFilter;

import java.io.InputStream;
import java.util.List;
import java.util.stream.IntStream;

public class OperacionReduccion1 {

    public static void main(String [] args) {
        System.out.println("Operacion Reduccion ");

        System.out.println("************PROGRAMA TRADICIONAL **********************");

        int[] numeros = {4,6,129,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};

        int suma =0;
        for (int i=0; i< numeros.length;i++) {
            suma += numeros[i];
        }
        System.out.println("La suma es: " + suma);

        double promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);

        System.out.println("Cantidad de elementos: " + numeros.length);

        //obtener el maximo
        int maximo = numeros[0];
        for(int numero : numeros) {
            if(numero > maximo) {
                maximo = numero;
            }
        }

        System.out.println("El maximo es: " + maximo);

        //Obtener el minimo
        int minimo = numeros[0];
        for(int numero : numeros){
            if(numero < minimo){
                minimo = numero;
            }
        }
        System.out.println("El minimo es: " + minimo);


        System.out.println("\n");
        System.out.println("Operaciones de reduccion con empleados ");
        List<EmpleadoFilter> empleados = EmpleadoFilter.empleados();

        double sumaSalarios = 0.0;

        for(EmpleadoFilter empleado : empleados){
            sumaSalarios +=empleado.getIngresos();
        }

        System.out.println("La suma de los salarios es: " + sumaSalarios);
        System.out.println("La cantidad de empleados es: " + empleados.size());

        //Obtener el empleado con salario maximo
        EmpleadoFilter empMaximo = empleados.get(0);
        for(EmpleadoFilter empleado : empleados){
            if(empleado.getIngresos() > empMaximo.getIngresos()){
                empMaximo = empleado;
            }
        }
        System.out.println("Empleado maximo salario: " + empMaximo.getNombre() + " " + empMaximo.getIngresos());


        System.out.println("************PROGRAMA CON STREAMS **********************");

        System.out.println("La suma es InStream : " + IntStream.of(numeros).sum());

        //Obtener el promedio de los elementos
        System.out.println("El promedio es InStream : " + IntStream.of(numeros).average().getAsDouble());

        System.out.println("El valor maximo InStream : " + IntStream.of(numeros).max().getAsInt());

        System.out.println("El valor minimo InStream : " + IntStream.of(numeros).min().getAsInt());

        System.out.println("Cantidad de elementos InStream : " + IntStream.of(numeros).count());

        System.out.println("\nOperaciones con empelados y streams");
        System.out.println("Suma de salarios: " +
                empleados.stream()
                        .mapToDouble(EmpleadoFilter::getIngresos)
                        .sum());

        //empleados con el salario maximo
        EmpleadoFilter empMax = empleados
                .stream()
                .max(
                        (emp1, emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos())
                ).get();

        System.out.println("Empleado con el maximo Salario: " + empMax.getNombre() + " " + empMaximo.getIngresos());
    }

}
