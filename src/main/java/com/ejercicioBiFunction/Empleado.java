package com.ejercicioBiFunction;

public class Empleado {
    private String nombre;
    private double salario;
    private int edad;
    private String departamento;

    public Empleado(String nombre, double salario, int edad, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.departamento = departamento;
    }




    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
