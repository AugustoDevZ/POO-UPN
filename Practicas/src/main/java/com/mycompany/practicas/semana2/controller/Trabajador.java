package com.mycompany.practicas.semana2.controller;

public class Trabajador {
    private String nombre;
    private double precioHora;
    private double horasTrabajadas;

    public Trabajador(String nombre, double precioHora, double horasTrabajadas) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioBruto() {
        return precioHora * horasTrabajadas;
    }

    public double calcularImpuesto() {
        return calcularSalarioBruto() * 0.10;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularImpuesto();
    }
}
