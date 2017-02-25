package com.ejercicioCollect;

import com.ejercicioFilter.EmpleadoFilter;

import java.util.*;
import java.util.stream.Collectors;

public class ejercicioCollect {

    public static void main(String[] args) {
//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
// 1- collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
// 2- collect(Collector<? super T,A,R> collector)

//  1- Supplier <ArrayList<String>> proveedor = () -> new ArrayList<>();
//     Supplier <ArrayList<String>> proveedor = ArrayList::new;
//     BiConsumer <ArrayList<String>, String> acumulador = (lista, str) -> lista.add(str);
//     BiConsumer <ArrayList<String>, String> acumulador = ArrayList::add;
//     BiConsumer <ArrayList<String>, ArrayList<String> combinador = (list1, list1) -> list1.addAll(list2);
//     BiConsumer <ArrayList<String>, ArrayList<String> combinador = ArrayList::addAll;
        List<String> nombres = EmpleadoFilter.empleados()
                .stream()
                .map(EmpleadoFilter::getNombre)
                .collect(ArrayList::new,ArrayList::add, ArrayList::addAll);
        System.out.println(nombres);

        List<String> nombresCollector = EmpleadoFilter.empleados()
                .stream()
                .map(EmpleadoFilter::getNombre)
                .collect(Collectors.toList());
        System.out.println("nombresCollector: " + nombresCollector);

        //Set es un conjunto que no tiene elementos repetidos
        Set<String> nombresSet = EmpleadoFilter.empleados()
                .stream()
                .map(EmpleadoFilter::getNombre)
                .collect(Collectors.toSet());
        System.out.println("nombresCollector set: " + nombresSet);

        //Set es un conjunto que no tiene elementos repetidos
        SortedSet<String> nombresTreeSet = EmpleadoFilter.empleados()
                .stream()
                .map(EmpleadoFilter::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("nombresCollector nombresTreeSet: " + nombresTreeSet);
}
}
