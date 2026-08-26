package com.mycompany.practicas.Semana3;

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
