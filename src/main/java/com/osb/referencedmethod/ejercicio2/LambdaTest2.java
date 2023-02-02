package com.osb.referencedmethod.ejercicio2;

public class LambdaTest2 {
    public static void main(String[] args) {
        Operationes op = ((num, num2) -> System.out.println(num + num2));

//        op.imprimeOperacion(15, 30);
        LambdaTest2 objeto = new LambdaTest2();
//        objeto.miMetodo(op, 25, 30);
        objeto.miMetodo((num, num2) -> System.out.println("parametro1 " + num + " parametro2 " + num2), 10, 8);
        objeto.miMetodo((num, num2) -> System.out.println("divdimos " + num/num2), 10, 2);
    }

    public void miMetodo(Operationes op, int num , int num2){
        op.imprimeOperacion(num, num2);
    }
}
