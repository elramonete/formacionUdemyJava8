package com.ejercicioPredicate;

import com.ejercicioBiFunction.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador2 {

    public List<Empleado> evaluar (List<Empleado> listEmp, BiPredicate<Integer, String> eval){
        List<Empleado> liastaNueva = new ArrayList<>();

        for (Empleado empleado : listEmp){
            //  if(eval.negate().test(empleado)) { con la negative es que sea lo contrario a la funcion de < 25 y que empiece por el nombre la 'J'
            if(eval.test(empleado.getEdad(), empleado.getDepartamento())) {
                liastaNueva.add(empleado);
            }
        }
        return  liastaNueva;
    }

}
