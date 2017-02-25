package com.osb.referencedmethod;

import com.osb.referencedmethod.IHello;
import java.util.Arrays;


/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Methods {
    public static void sayStaticHello() {
        System.out.println("Hey!!! i'am a static hello!");
    }

    public void sayInstanceHello() {
        System.out.println("Hey!!! i'am a instance hello");
    }

    public static void main(String[] args) {
        //Referencia a un método estatico
        IHello staticRef = Methods::sayStaticHello;
        staticRef.sayHello();
        
        //Referencia a un método de un objeto
        Methods methods = new Methods();
        IHello instanceRef = methods::sayInstanceHello;
        instanceRef.sayHello();
        
        //Referencia a un método de un objeto arbitrario
        String[] names = new String[]{"Oscar", "Alex", "Maria", "Samuel", "Perla", "Fausto"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println("Hey!!! i'am a ordered array " + Arrays.toString(names));
        
        //Referencia a un constructor
        IHello hello = Hello::new;
        hello.sayHello();
    }
}