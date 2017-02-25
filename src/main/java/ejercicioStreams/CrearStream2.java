package ejercicioStreams;

import java.util.Random;
import java.util.stream.Stream;

public class CrearStream2 {

    public static void main(String [] args) {

        System.out.println("1- Stream iterate: ");
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1).limit(10);

      primerosDiez.forEach(System.out::println);


        Stream.iterate(1L, n -> n +1)
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("\nDespues de 100");
        Stream.iterate(1L, n -> n +1)
                .filter(n -> n % 2 == 0)
                .skip(100)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("\nNumeros aleatorios");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\nEnteros aleatorios Random");
        new Random().ints()
                .filter(n -> n > 0)
                .limit(5)
                .forEach(System.out::println);

            }
    }
