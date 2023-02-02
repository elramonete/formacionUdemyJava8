package com.osb.referencedmethod.comensal;

import java.util.function.Function;

public class DatosComensal {

    public static void main(String[] args){
        Comensal com1 = new Comensal("Javier", 256.2, 5);
        String nombreCom = (String) getDatoComensal(com1, x -> x.getNombre());
        int mesa = (int) getDatoComensal(com1, x -> x.getMesa());
//        int mesa = get

        System.out.println(("el nombre del comensal es: " +nombreCom));
        System.out.println(("la mesa del comensal es: " +mesa));
    }
    public static Object getDatoComensal(Comensal com, Function<Comensal, Object> func){

        return func.apply(com);
    }
}
