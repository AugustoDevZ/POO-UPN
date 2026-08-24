package com.mycompany.practicas.semana2.controller;

public class GasIdeal {
    private double temperatura;
    private double numeroDeMoles;
    private double volumen;

    public GasIdeal(double temperatura, double numeroDeMoles, double volumen) {
        this.temperatura = temperatura;
        this.numeroDeMoles = numeroDeMoles;
        this.volumen = volumen;
    }

    public double calcularPresion() {
        double R = 0.0821;
        return (numeroDeMoles * R * temperatura) / volumen;
    }
}
