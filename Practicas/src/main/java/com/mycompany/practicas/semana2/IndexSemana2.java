/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana2;

import com.mycompany.practicas.semana2.model.*;

/**
 *
 * @author luisl
 */
public class IndexSemana2 {
    public static void Ejercicio4(){
        System.out.println("=== EJERCICIO 4: Triángulo Rectángulo ===");
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3.0, 4.0);
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println();
    }
    public static void Ejercicio5() {
        System.out.println("=== EJERCICIO 5: Conversión de Temperatura ===");
        ConversionTemperatura temp = new ConversionTemperatura(25.0);
        System.out.println("25 grados Centígrados en Fahrenheit son: " + temp.convertirAFahrenheit());
        System.out.println();
    }
    public static void Ejercicio6() {
        System.out.println("=== EJERCICIO 6: Conversión de Longitud ===");
        ConversionLongitud longitud = new ConversionLongitud(2.0);
        System.out.println("2 metros en pies: " + longitud.convertirAPies());
        System.out.println("2 metros en pulgadas: " + longitud.convertirAPulgadas());
        System.out.println();
    }
    public static void Ejercicio7() {
        System.out.println("=== EJERCICIO 7: Producto ===");
        Producto producto = new Producto("Teclado", 50.0, 85.0);
        System.out.println("Ganancia del producto: " + producto.calcularGanancia());
        System.out.println();
    }
    public static void Ejercicio8() {
        System.out.println("=== EJERCICIO 8: Trabajador ===");
        Trabajador trabajador = new Trabajador("Juan", 15.0, 40.0);
        System.out.println("Salario Bruto: " + trabajador.calcularSalarioBruto());
        System.out.println("Impuesto (10%): " + trabajador.calcularImpuesto());
        System.out.println("Salario Neto: " + trabajador.calcularSalarioNeto());
        System.out.println();
    }
    public static void Ejercicio9() {
        System.out.println("=== EJERCICIO 9: Gas Ideal ===");
        GasIdeal gas = new GasIdeal(300.0, 2.0, 10.0);
        System.out.println("Presión del gas (atm): " + gas.calcularPresion());
        System.out.println();
    }
    public static void Ejercicio10() {
        System.out.println("=== EJERCICIO 10: Móvil ===");
        Movil movil = new Movil(0.0, 5.0, 2.0);
        System.out.println("Espacio recorrido (metros): " + movil.calcularEspacioRecorrido());
    }
}
