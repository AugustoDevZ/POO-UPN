package com.mycompany.practicas.semana2.model;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
