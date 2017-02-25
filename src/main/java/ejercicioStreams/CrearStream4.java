package ejercicioStreams;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CrearStream4 {

    public static void main(String [] args) {

        System.out.println("Quitamos los espacios en blanco y los numeros que hemos introducido: ");

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        IntStream streamChars = entrada.chars();
//        streamChars.forEach(System.out::println);

        //Quitamos los espacios en blanco y los numeros que hemos introducido
        streamChars.filter(n -> !Character.isDigit((char)n)
                && !Character.isWhitespace((char)n))
                .forEach(n -> System.out.print((char)n));

        System.out.println("\nQuitamos las COMAS ',' que tenemos en el string: ");

        String str ="HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::println);




    }
}
