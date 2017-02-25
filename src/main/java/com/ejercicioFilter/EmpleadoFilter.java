package com.ejercicioFilter;



import java.util.Arrays;
import java.util.List;

public class EmpleadoFilter implements Comparable {

    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;

    private int edad;

    public EmpleadoFilter(long id, String nombre, double ingresos, int edad,  Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        return this.getNombre().compareTo(((EmpleadoFilter)o).getNombre());
    }

    public static enum Genero {
        HOMBRE, MUJER;
    }

    public boolean esHombre(){
        return  this.genero == Genero.HOMBRE;
    }

    public boolean esMujer(){
        return this.genero == Genero.MUJER;
    }

    public static List<EmpleadoFilter> empleados() {
        EmpleadoFilter emp1 = new EmpleadoFilter(1, "Juan Perez", 538.00, 26, Genero.HOMBRE);
        EmpleadoFilter emp2 = new EmpleadoFilter(2, "Alicia Ramirez", 414.00, 38, Genero.HOMBRE);
        EmpleadoFilter emp3 = new EmpleadoFilter(3, "Juan Puga", 333.00, 36, Genero.HOMBRE);
        EmpleadoFilter emp4 = new EmpleadoFilter(4, "Hevelyn Lopez", 121.00, 31, Genero.MUJER);
        EmpleadoFilter emp5 = new EmpleadoFilter(5, "Esmeralda Lopez", 944.00, 71, Genero.MUJER);
        EmpleadoFilter emp6 = new EmpleadoFilter(6, "Alvaro Mejia", 039.00, 14, Genero.HOMBRE);
        EmpleadoFilter emp7 = new EmpleadoFilter(7, "Jessica Sanchez", 840.00, 26, Genero.MUJER);
        EmpleadoFilter emp8 = new EmpleadoFilter(8, "Pablo Perez", 500.00, 33, Genero.HOMBRE);
        EmpleadoFilter emp9 = new EmpleadoFilter(9, "Ignacio Loyola", 538.00, 28, Genero.HOMBRE);
        EmpleadoFilter emp10 = new EmpleadoFilter(10, "Alvaro Garcia", 538.00, 27, Genero.HOMBRE);
        EmpleadoFilter emp11 = new EmpleadoFilter(11, "Marina Aranjuez", 230.00, 12, Genero.MUJER);
        EmpleadoFilter emp12 = new EmpleadoFilter(12, "Rafa Benitez", 740.00, 32, Genero.HOMBRE);
        EmpleadoFilter emp13 = new EmpleadoFilter(13, "Dua Lipa", 138.00, 14, Genero.MUJER);
        EmpleadoFilter emp14 = new EmpleadoFilter(14, "Rosa Camara", 175.00, 18, Genero.MUJER);

        return Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12, emp13, emp14);
        }

}
