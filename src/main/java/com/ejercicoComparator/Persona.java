package com.ejercicoComparator;

import java.util.Date;

public class Persona implements Comparable<Persona>{

    private int idPersona;
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        return String.format("persona{idPersona:%1s,nombre:%2s}", idPersona,nombre);
    }

    @Override
    public int compareTo(Persona o) {
        int result = this.nombre.compareTo(o.nombre);
        return result;
    }
}
