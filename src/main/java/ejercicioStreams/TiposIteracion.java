package ejercicioStreams;

import java.util.Arrays;
import java.util.List;

public class TiposIteracion {

    public static void main(String [] args){
     List<Integer> numeros = Arrays.asList(1,2,3,4,5);

     int suma=0;
     for(int num:numeros){
         if(num%2 == 1){
             int cuadrado = num * num;
             suma = suma + cuadrado;
         }
     }

     int sumaStream = numeros.stream().
                filter(n -> n % 2 == 1).
                map(n -> n * n).
                reduce(0, Integer::sum);

        int sumaStreamMultiNucleo = numeros.parallelStream().
                filter(n -> n % 2 == 1).
                map(n -> n * n).
                reduce(0, Integer::sum);
    //elemento por elemento un solo hilo(thread) un solo procesador (secuencial) iteracion externa
     System.out.println("Resultado de la suma de cuadrados: " + suma);
     System.out.println("Resultado con Stream de la suma  de cuadrados: " + sumaStream);
      //de manera paralela varias nucleos de nuestro procesador, el sistema de procesar los datos de manera interna por meedio de la tecnologia multinucleo.
      System.out.println("Resultado con Stream MultiNucleo de la suma  de cuadrados: " + sumaStreamMultiNucleo);
    }

}
