package com.mycompany.practicas.semana2.model;

public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double calcularArea() {
        return (cateto1 * cateto2) / 2.0;
    }

    public double calcularHipotenusa() {
        return Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    }

    public double calcularPerimetro() {
        return cateto1 + cateto2 + calcularHipotenusa();
    }
}
