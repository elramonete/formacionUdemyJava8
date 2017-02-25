package com.ejercicioReduccion;

import java.util.stream.IntStream;

public class OperacionReduccion3 {

    public static void main(String[] args) {
        System.out.println("Operacion Reduccion ");
        System.out.println(IntStream.range(1,20).summaryStatistics());

        System.out.println("suma: " + IntStream.range(1,20)
                .summaryStatistics()
                .getSum());

        System.out.println("Promedio: " + IntStream.range(1,20)
                .summaryStatistics()
                .getAverage());

        System.out.println("Max : " + IntStream.range(1,20)
                .summaryStatistics()
                .getMax());

    }
    }
