package com.mycompany.practicas.semana3;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma 2 enteros: " + calc.sumar(5, 10));
        System.out.println("Suma 3 enteros: " + calc.sumar(5, 10, 15));
        System.out.println("Suma 2 double: " + calc.sumar(5.5, 2.3));
    }
}
