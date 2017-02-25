package com.osb.referencedmethod.ejercicioMetodosReferenciados;

public class ProveedorComparaciones {

    public int compararPorNombre(PersonaReferenciado per1, PersonaReferenciado per2){
        return per1.getNombre().compareTo(per2.getNombre());
    }

    public int compararPorEdad(PersonaReferenciado per1, PersonaReferenciado per2){
        return per1.getEdad().compareTo(per2.getEdad());
    }


}
