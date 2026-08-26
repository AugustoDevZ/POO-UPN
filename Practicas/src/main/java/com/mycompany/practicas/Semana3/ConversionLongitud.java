package com.mycompany.practicas.Semana3;

public class ConversionLongitud {
    private double metros;

    public ConversionLongitud(double metros) {
        this.metros = metros;
    }

    public double convertirAPies() {
        return metros * 3.28084;
    }

    public double convertirAPulgadas() {
        return metros * 39.3701;
    }
}
