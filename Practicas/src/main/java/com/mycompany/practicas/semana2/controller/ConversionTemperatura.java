package com.mycompany.practicas.semana2.controller;

public class ConversionTemperatura {
    private double gradosCentigrados;

    public ConversionTemperatura(double gradosCentigrados) {
        this.gradosCentigrados = gradosCentigrados;
    }

    public double convertirAFahrenheit() {
        return (gradosCentigrados * 9.0 / 5.0) + 32.0;
    }
}
