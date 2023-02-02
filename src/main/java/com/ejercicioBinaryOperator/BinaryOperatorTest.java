package com.ejercicioBinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<Integer> bOperator = (num1, num2) -> num1 * num2;

        int resultado = bOperator.apply(10,20);
        System.out.println("El resultado es: " + resultado);

        //uso del minby
        BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));

        resultado = bOperatorMin.apply(10,20);

        System.out.println("El numero menor de 10 y 20 es: " +resultado);


        //uso del maxby
        BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));

        resultado = bOperatorMax.apply(10,20);

        System.out.println("El numero mayor de 10 y 20 es: " +resultado);
    }

}
