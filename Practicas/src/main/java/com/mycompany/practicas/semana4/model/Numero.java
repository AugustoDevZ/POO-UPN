package com.mycompany.practicas.semana2.model;

public class Numero {
    private double numeroReal;

    public Numero(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    public double calcularCuadrado() {
        return numeroReal * numeroReal;
    }

    public double calcularCubo() {
        return numeroReal * numeroReal * numeroReal;
    }
}
