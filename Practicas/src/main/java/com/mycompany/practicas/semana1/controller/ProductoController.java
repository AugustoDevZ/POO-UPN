/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana1.controller;
import com.mycompany.practicas.semana1.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */


public class ProductoController {
      
    private static ArrayList<Producto> Productos = new ArrayList<Producto>();
    
    public static void AddProducto(int id, String nombre, Double precio, int stock){
        
        if (precio > 1000 || precio <= 0) throw new IllegalArgumentException("El número ingresado sale del rango 0 a 1000.");
        if (stock < 0) throw new IllegalArgumentException("El número ingresado no puede ser negativo");

        var prEncontrado = BuscarID(id);
        if (prEncontrado != null) throw new IllegalArgumentException("El ID ingresado ya existe");
        if(BuscarNombre(nombre)) throw new IllegalArgumentException("El Nombre ingresado ya existe");

        Producto newProducto = new Producto(id,nombre,precio,stock);
        Productos.add(newProducto);
    }
    public static ArrayList<Producto> ListarProductos(){
        return Productos;
    }
    public static Producto BuscarProducto(int id){
        return BuscarID(id);
    }

    private static Producto BuscarID(int id){
        for (Producto p : Productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    private static boolean BuscarNombre(String nombre){
        for (Producto p : Productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }



    
}

