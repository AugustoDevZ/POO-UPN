package com.mycompany.practicas.semana3;

public class Division {
    public void realizarDivision(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: No es posible dividir un número entre cero.");
        }
    }

    public static void main(String[] args) {
        Division div = new Division();
        div.realizarDivision(10, 2);
        div.realizarDivision(10, 0);
    }
}
