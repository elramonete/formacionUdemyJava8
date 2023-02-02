package com.ejercicioConsumer;

public class Estudiante {

    private String nom;
    private double cal;

    public Estudiante(String nom, double cal) {
        this.nom = nom;
        this.cal = cal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }
}
