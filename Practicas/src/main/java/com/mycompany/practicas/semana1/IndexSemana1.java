/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana1;

import com.mycompany.practicas.semana1.controller.LibroController;
import com.mycompany.practicas.semana1.controller.ProductoController;
import com.mycompany.practicas.semana1.controller.UsuarioController;
import com.mycompany.practicas.semana1.model.Libro;
import com.mycompany.practicas.semana1.model.Producto;
import com.mycompany.practicas.semana1.model.Usuario;

import java.util.ArrayList;

/**
 *
 * @author luisl
 */
public class IndexSemana1 {
    //Ejercicio 1: Clase y Controlador de Producto
    public static void EjercicioUno(){
        System.out.println("==== Agregando productos...");
        ProductoController.AddProducto(1, "Mesas", 600.0,12);
        ProductoController.AddProducto(2, "Silla", 80.0,144);

        System.out.println("==== Mostrando productos...");
        ArrayList<Producto> _productos = ProductoController.ListarProductos();
        for (Producto p : _productos){
            System.out.println(
                    "ID: " +
                    p.getId() +
                    " Nombre: " +
                    p.getNombre() +
                    " Precio: " +
                    p.getPrecio() +
                    " Stock: " +
                    p.getStock()
            );
        }

    }
    
    // Ejercicio 2: Clase Usuario y Controlador
    public static void EjercicioDos(){
        System.out.println("==== Agregando usuarios...");
        UsuarioController.AddUser(1, "Pablo", "hello@gmail.com");

        System.out.println("==== Mostrando productos...");
        ArrayList<Usuario> _Usuarios = UsuarioController.ListarUsuarios();
        for (Usuario p : _Usuarios){
            System.out.println(
                    "ID: " +
                            p.getId() +
                            " Nombre: " +
                            p.getNombre() +
                            " Email: " +
                            p.getEmail()
            );
        }

    }

    // Ejercicio 3:
    public static void EjercicioTres(){
        LibroController controlador = new LibroController();

        Libro libro1 = new Libro("111", "El Principito", "Antoine de Saint-Exupéry", true);
        Libro libro2 = new Libro("222", "Don Quijote", "Miguel de Cervantes", true);

        controlador.agregarLibro(libro1);
        controlador.agregarLibro(libro2);

        controlador.listarLibros();

        controlador.prestarLibro("111");

        controlador.listarLibros();

        controlador.prestarLibro("111");

        controlador.devolverLibro("111");

        controlador.listarLibros();
    }
}
