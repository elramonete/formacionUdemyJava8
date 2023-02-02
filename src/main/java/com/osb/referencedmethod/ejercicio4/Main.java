package com.osb.referencedmethod.ejercicio4;

public class Main {

    public static void main(String[] args){

        System.out.println(create().calculate(2,2));
    }

    public static CalculdoraLong create(){
        long variab = 201;
        return (x, y) -> x/y + variab;
    }
}
