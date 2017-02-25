package com.ejercicioPredicate;

import com.ejercicioBiFunction.Empleado;

import java.util.function.BiFunction;

public class Funciones {
    public double incrementeSalario(Empleado emp, double incremento, BiFunction<Double, Double, Double> bi) {
        return  bi.apply(emp.getSalario(), incremento);
    }
}
