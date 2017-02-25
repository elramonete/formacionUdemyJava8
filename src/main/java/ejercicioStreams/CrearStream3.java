package ejercicioStreams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream3 {
    public static void main(String [] args) {

        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9});
        numStream.forEach(System.out::println);

        Stream<String> nombre = Arrays.stream(new String[]{"Juan","Pedro","Maria"});
        nombre.forEach(System.out::println);
//        System.out.println("1- Stream iterate: ");

        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("JAVA");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");
        lenguajesSet.forEach(System.out::println);

        List<EstudianteStream> estudiantes = new ArrayList<>();
        estudiantes.add(new EstudianteStream("Juan", 25, 1.80, 5 ));
        estudiantes.add(new EstudianteStream("Abel", 26, 1.30, 6 ));
        estudiantes.add(new EstudianteStream("Juan", 5, 1.10, 8 ));

        System.out.println("\nStream de estudiantes ");
        Stream<EstudianteStream> estudiantesStr = estudiantes.parallelStream();
        estudiantes.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));


    }
}
