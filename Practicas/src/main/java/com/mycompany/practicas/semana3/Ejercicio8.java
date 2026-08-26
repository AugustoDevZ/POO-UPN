package com.mycompany.practicas.semana3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un valor numérico entero válido.");
        } finally {
            scanner.close();
        }
    }
}
