package com.osb.referencedmethod.comensal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {

    public static void main(String[] args){

        List<Comensal> listaComensales = Arrays.asList(
                new Comensal("Javier", 256.2, 5),
                new Comensal("Juan", 333.1, 2),
                new Comensal("Pablo", 124.9, 3),
                new Comensal("Irene", 111.4, 4),
                new Comensal("Alonso", 0759.1, 6),
                new Comensal("Bernardo", 786.2, 5),
                new Comensal("Ana", 256.2, 1),
                new Comensal("Marina", 56.1, 8),
                new Comensal("Roberto", 286.2, 14));

        List<Object> nombresComensales = getDataComensales(listaComensales, x -> x.getNombre() );

        System.out.println("La lista de nombre de comensales es la siguiente: ");
        for (Object nombreComensal : nombresComensales) {
            System.out.println("El nombre es : " +  nombreComensal);
        }

        List<Object> montosComensales = getDataComensales(listaComensales, x -> x.getMonto_pedido() );

        System.out.println("La lista de monto  de comensales es la siguiente: ");
        for (Object montoComensal : montosComensales) {
            System.out.println("El monto Comensal es : " +  montoComensal);
        }



//        System.out.println(("el nombre del comensal es: " +nombreCom));
//        System.out.println(("la mesa del comensal es: " +mesa));
    }
    public  static List<Object> getDataComensales
            (List<Comensal> listaCom, Function<Comensal, Object> func) {

        List<Object> listaDatos = new ArrayList<>();
        for (Comensal comensal : listaCom) {
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;
    }
}
