package com.osb.referencedmethod;

import com.osb.referencedmethod.IHello;
import java.util.Arrays;
import java.util.logging.Logger;


/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Methods {
    private static Logger log =  Logger.getLogger(Methods.class.getName());
    public static void sayStaticHello() {
        log.info("Hey!!! i'am a static hello!");

    }

    public void sayInstanceHello() {
        log.info("Hey!!! i'am a instance hello");
    }

    public static void main(String[] args) {
        //Referencia a un método estatico  "usamos la clase Methods"
        IHello staticRef = Methods::sayStaticHello;
        staticRef.sayHello();
        
        //Referencia a un método de un objeto  "usamos el objeto de la clase Methods"
        Methods methods = new Methods(); //objeto Methods
        IHello instanceRef = methods::sayInstanceHello;
        instanceRef.sayHello();
        
        //Referencia a un método de un objeto arbitrario
        String[] names = new String[]{"Oscar", "Alex", "Maria", "Samuel", "Perla", "Fausto"};
        Arrays.sort(names, String::compareToIgnoreCase);
        log.info(new StringBuilder().append("Hey!!! i'am a ordered array ").append(Arrays.toString(names)).toString());
        
        //Referencia a un constructor
        IHello hello = Hello::new;
        hello.sayHello();
        Logger.getLogger(String.valueOf(Methods.class));
    }
}

// *     https://www.oscarblancarteblog.com/2017/02/27/java-8-metodos-referenciados/
// *     https://github.com/oscarjb1/MethodReferences