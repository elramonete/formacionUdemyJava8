package ejercicioStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream1 {
    public static void main(String [] args){

        System.out.println("1- Stream of un valor  forEach: ");
        Stream<String> stream1 = Stream.of("Curso de programacion");

        stream1.forEach(System.out::println);

        System.out.println("2- Stream of varios valores  forEach : ");
        Stream<String> stream2 = Stream.of("curso1","curso2","curso3","curso4" );
        stream2.forEach(System.out::println);

        System.out.println("3- Stream con String[] : ");
        String[] arreglo ={"java","C++","C#","ruby"};
        Stream<String> stream3 = Stream.of(arreglo);
        stream3.forEach(System.out::println);

        System.out.println("4- Stream con bulider add: ");
        Stream<EstudianteStream> streamEstudiantes = Stream.<EstudianteStream> builder()
                .add(new EstudianteStream("n01", 17 , 1.70,9.5))
                .add(new EstudianteStream("n02", 21 , 1.70,9.5))
                .build();
//        streamEstudiantes.forEach(System.out::println);
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));

        System.out.println("5- IntStream con RangeClosed incluye el valor 20 Rangeclosed: ");
        IntStream unoAVeinte = IntStream.rangeClosed(1,20);
        unoAVeinte.forEach(System.out::println);

        System.out.println("6- IntStream con Range no incluye el valor 6 Range: ");
        IntStream unoACinco = IntStream.range(1,6);
        unoACinco.forEach(System.out::println);
    }
}
