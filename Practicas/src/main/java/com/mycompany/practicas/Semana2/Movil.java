package com.mycompany.practicas.Semana2;

public class Movil {
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion;

    public Movil(double velocidadInicial, double tiempo, double aceleracion) {
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo;
        this.aceleracion = aceleracion;
    }

    public double calcularEspacioRecorrido() {
        return (velocidadInicial * tiempo) + (0.5 * aceleracion * Math.pow(tiempo, 2));
    }
}
