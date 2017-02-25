package com.ejercicioCollect;

import com.ejercicioFilter.EmpleadoFilter;

import java.util.Map;
import java.util.stream.Collectors;

public class ejercicioCollect2 {

    public static void main(String[] args) {
        Map<Long,String> idNombreMap =
                EmpleadoFilter.empleados()
                        .stream()
                        .collect(Collectors.toMap(
                                EmpleadoFilter::getId, EmpleadoFilter::getNombre));
        System.out.println(idNombreMap);



        Map<EmpleadoFilter.Genero,String> generoANombreMapa =
                EmpleadoFilter.empleados()
                        .stream()
                        .collect(Collectors.toMap(
                                EmpleadoFilter::getGenero, EmpleadoFilter::getNombre,
                                //manejar los valores que tiene las claves repetidas
                                (nom1, nom2) -> String.join(" - ", nom1, nom2))
                                );
        System.out.println(generoANombreMapa);
            }
}
