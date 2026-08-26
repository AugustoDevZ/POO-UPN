package com.mycompany.practicas.semana3;

public class Contador {

    public static int totalObjetos = 0;

    public Contador() {
        totalObjetos++;
    }

    public static void mostrarTotal() {
        System.out.println("Total de objetos creados: " + totalObjetos);
    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador.mostrarTotal();
    }
}
