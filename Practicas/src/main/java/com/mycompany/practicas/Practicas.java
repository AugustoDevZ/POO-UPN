package com.mycompany.practicas;

import com.mycompany.practicas.controller.ProductoController;
import com.mycompany.practicas.controller.UsuarioController;
import com.mycompany.practicas.model.Producto;
import com.mycompany.practicas.model.Usuario;

import java.util.ArrayList;

/**
 * @author AUGUSTO RODRIGUEZ
 */

public class Practicas {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("|           POO AND BASES DE DATOS-UPN          |");
        System.out.println("------------------------------------------------");
        EjercicioUno();
        EjercicioDos();
    }

    //Ejercicio 1: Clase y Controlador de Producto
    private static void EjercicioUno(){
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
    private static void EjercicioDos(){
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
}
