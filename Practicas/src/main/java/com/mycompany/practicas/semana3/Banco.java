package com.mycompany.practicas.semana3;

public class Banco {
    public static double tasaInteres = 2.5; // Valor inicial

    public static void actualizarTasa(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }

    public static void mostrarTasa() {
        System.out.println("La tasa de interés actual es: " + tasaInteres + "%");
    }

    public static void main(String[] args) {
        Banco.mostrarTasa();
        Banco.actualizarTasa(3.8);
        Banco.mostrarTasa();
    }
}
