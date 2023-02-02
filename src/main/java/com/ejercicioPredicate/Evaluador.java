package com.ejercicioPredicate;

import com.ejercicioBiFunction.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluador {

    public List<Empleado> evaluar (List<Empleado> listEmp, Predicate<Empleado> eval){
        List<Empleado> liastaNueva = new ArrayList<>();

        for (Empleado empleado : listEmp){
            //  if(eval.negate().test(empleado)) { con la negative es que sea lo contrario a la funcion de < 25 y que empiece por el nombre la 'J'
            if(eval.test(empleado)) {
                liastaNueva.add(empleado);
            }
        }
        return  liastaNueva;
    }

}
