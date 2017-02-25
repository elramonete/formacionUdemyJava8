package com.ejercicioBiFunction;

import java.util.function.BiFunction;

public class EjercicioBiFunciont {

    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x,y) -> x + y;

        System.out.println(bi.apply("Hola", " Mundo!"));
    }

    }
