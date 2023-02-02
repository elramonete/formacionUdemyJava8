package com.ejercicioConsumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {

    public void aceptaTodos(List<Estudiante> estudiantes, Consumer<Estudiante> cons){

        for (Estudiante estudiante: estudiantes) {
            cons.accept(estudiante);

        }

    }
}
