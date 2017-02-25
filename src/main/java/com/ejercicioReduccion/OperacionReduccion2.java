package com.ejercicioReduccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperacionReduccion2 {

    public static void main(String[] args) {
        System.out.println("Operacion Reduccion ");

        System.out.println("************PROGRAMA TRADICIONAL **********************");

        int[] numeros = {4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99};

        int suma = IntStream.of(numeros)
                .reduce(0, new IntBinaryOperator() {
                    @Override
                    public int applyAsInt(int left, int right) {
                        return left + right;
                    }
                });
        System.out.println("La suma es: " + suma);


        int sumaLambda = IntStream.of(numeros)
                .reduce(0,(num1, num2) -> num1 + num2);

        System.out.println("La suma con Lambda Funcion es: " + sumaLambda);

        int sumaIntegerSumLambda = IntStream.of(numeros)
                .reduce(0,(num1, num2) -> Integer.sum(num1, num2));

        System.out.println("La suma con Lambda Funcion Integer es: " + sumaIntegerSumLambda);

        int sumaIntegerSumReferenciadoLambda = IntStream.of(numeros)
                .reduce(0,Integer::sum);

        System.out.println("La suma con Lambda Funcion Integer Referenciado es: " + sumaIntegerSumReferenciadoLambda);


        //leer un archivo a travers de un stream
        System.out.println("Creacion de streams desde archivos, cogemos un txt lo recorremos y reemplazamos las comas por espacio vacios y lo guardamos en otro fichero txt ");

        Path path1 = Paths.get("C:/Users/rnbr/IdeaProjects/MethodReferences/src/main/java/ejercicioStreams/Parrafo2.txt");
        String texto = "";
        try(Stream<String> lineas = Files.lines(path1)){
                  texto = lineas.map(linea -> linea.replace("8","?"))
                           .reduce("",(linea1, linea2) -> linea1.concat("\n").concat(linea2));

        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/rnbr/IdeaProjects/MethodReferences/src/main/java/ejercicioStreams/Parrafo3.txt"))){
            bw.write(texto);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
