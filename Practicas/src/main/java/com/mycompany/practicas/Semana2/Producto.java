package com.mycompany.practicas.Semana2;

public class Producto {
    private String nombre;
    private double precioDeCosto;
    private double precioDeVenta;

    public Producto(String nombre, double precioDeCosto, double precioDeVenta) {
        this.nombre = nombre;
        this.precioDeCosto = precioDeCosto;
        this.precioDeVenta = precioDeVenta;
    }

    public double calcularGanancia() {
        return precioDeVenta - precioDeCosto;
    }
}
