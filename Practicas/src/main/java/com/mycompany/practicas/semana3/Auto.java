package com.mycompany.practicas.semana3;

public class Auto {
    class Motor {
        public String obtenerTipo() {
            return "V8";
        }
    }

    public void mostrarMotor() {
        Motor miMotor = new Motor();
        System.out.println("El tipo de motor del auto es: " + miMotor.obtenerTipo());
    }

    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.mostrarMotor();
    }
}
