package com.mycompany.practicas.Semana2;

public class ConversionTemperatura {
    private double gradosCentigrados;

    public ConversionTemperatura(double gradosCentigrados) {
        this.gradosCentigrados = gradosCentigrados;
    }

    public double convertirAFahrenheit() {
        return (gradosCentigrados * 9.0 / 5.0) + 32.0;
    }
}
