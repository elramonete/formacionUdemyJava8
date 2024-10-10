package com.ejercicioMap;

import com.ejercicioFilter.EmpleadoFilter;
import io.reactivex.rxjava3.core.Observable;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class OperacionesMap {

    public static void main(String [] args){
        IntStream.rangeClosed(1,5)
                .map(new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int numero) {
                        return numero *  numero;
                    }
                }).forEach(System.out::println);

        System.out.println("Otro ejemplo");

        IntStream.rangeClosed(1,10)
                .map(n -> n*2)
                .forEach(System.out::println);

        System.out.println("Otro ejemplo Suma ingresos");

        List<EmpleadoFilter> empleados = EmpleadoFilter.empleados();

        empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .forEach(emp -> System.out.println(emp.getNombre() + " " +  emp.getEdad() + " " + emp.getIngresos()));

        System.out.println("7- RxJava y Reactor");

        System.out.println("**** rxjava Observable ****");
        //rxjava
        Observable<EmpleadoFilter> observable = Observable.fromIterable(empleados);
        observable.filter(emp -> emp.getEdad() > 25)
                .subscribe(System.out::println);

        System.out.println("**** reactor Flux ****");
        //reactor
        Flux<EmpleadoFilter> flux = Flux.fromIterable(empleados);

        flux.filter(emp -> emp.getEdad() > 25)
                .subscribe(System.out::println);

        System.out.println("-----------------------------");

        double suma = empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .mapToDouble(emp -> emp.getIngresos())
                .sum();
        System.out.println("Suma: " + suma);

        double promedio = suma / empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .count();

        System.out.println("Promedio: " + promedio);


    }
}
