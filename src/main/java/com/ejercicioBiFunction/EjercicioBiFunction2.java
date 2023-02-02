package com.ejercicioBiFunction;

public class EjercicioBiFunction2 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        String resultado = calculadora.calc((x,y) -> ": " + (x*y), 60,10 );

        System.out.println("El resultado es " + resultado);
    }
}
