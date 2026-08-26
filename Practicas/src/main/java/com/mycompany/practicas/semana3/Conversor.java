package com.mycompany.practicas.semana3;

public class Conversor {
    public double convertir(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double convertir(float kilometros) {
        return kilometros * 0.621371;
    }

    public String convertir(int segundosTotales) {
        int minutos = segundosTotales / 60;
        int segundos = segundosTotales % 60;
        return minutos + " minutos y " + segundos + " segundos";
    }

    public static void main(String[] args) {
        Conversor conv = new Conversor();
        System.out.println("30°C a Fahrenheit: " + conv.convertir(30.0));
        System.out.println("5 km a millas: " + conv.convertir(5.0f));
        System.out.println("125 segundos son: " + conv.convertir(125));
    }
}
