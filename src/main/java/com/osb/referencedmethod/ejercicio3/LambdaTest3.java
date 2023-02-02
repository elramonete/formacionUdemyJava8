package com.osb.referencedmethod.ejercicio3;

public class LambdaTest3 {

    public static void main( String[] args) {
        engine(((x, y) -> x+y));
        engine(((x, y) -> x/y));
        engine(((x, y) -> x*y));
        engine(((x, y) -> x%y));

    }

    private static void engine(Calculadora cal){
        int x = 2, y = 4;
        int resultado = cal.calcular(x,y);
        System.out.println(resultado);
    }

}
