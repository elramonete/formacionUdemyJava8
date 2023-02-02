package com.ejercioBiConsumer;

import java.util.function.BiConsumer;

public class InterfazBiConsumerTest {

    public static void main (String[] args){
        BiConsumer<Double,Double> biconsumer =
                (num1, num2) -> {
                    double mult = num1 * num2;
                    System.out.println("La multiplicacion es: " + mult);
                };
        biconsumer.accept(15.2, 52.25);
    }
}
