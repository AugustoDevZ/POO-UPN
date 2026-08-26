package com.mycompany.practicas.semana3;

public class ValidarEdad {
    public void verificarEdad(int edad) {
        if (edad < 18) {

            throw new IllegalArgumentException("Acceso denegado: La edad debe ser 18 o mayor.");
        }
        System.out.println("Acceso concedido. Edad verificada.");
    }

    public static void main(String[] args) {
        ValidarEdad validador = new ValidarEdad();

        try {
            validador.verificarEdad(15); // Esto lanzará la excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
