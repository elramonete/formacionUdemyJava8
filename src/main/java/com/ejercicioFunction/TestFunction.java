package com.ejercicioFunction;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args){

/*        Function<Integer, String> convertidor2 = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                throw new UnsupportedOperationException("No supported yet.");
            }
        };*/

        Function<Integer, String> convetidor = x -> Integer.toString((x));

        System.out.println(convetidor.apply(3).length());
        System.out.println(convetidor.apply(30).length());
    }
}
