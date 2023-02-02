package com.osb.referencedmethod.ejercicio4;

public class Principal {

    public static void main (String[] args){
        CalculdoraLong calL =  ( x, y) -> x + y;
        CalculdoraInt calI =  ( x, y) -> x + y;

        engine(calL);
        engine(calI);
    }

    public static void engine(CalculdoraInt cal){
        int x = 2, y = 4;
        int resultado = cal.calculate(x,y);
        System.out.println(resultado);

    }

    public static void engine(CalculdoraLong cal){
        long x = 2, y = 4;
        long resu = cal.calculate(x,y);
        System.out.println(resu);
    }
}
