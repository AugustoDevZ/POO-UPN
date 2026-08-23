/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.model;

/**
 * @author AUGUSTO RODRIGUEZ
 */
public class Producto {
    int id;
    String nombre;
    Double precio;
    int stock;
    
    public Producto (int id, String nombre, Double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Double getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }

    public void setId(int newId){
        this.id = newId;
    }
    public void setNombre(int newNombre){
        this.id = newNombre;
    }
    public void setPrecio(int newPrecio){
        this.id = newPrecio;
    }
    public void setstock(int newStock){
        this.id = newStock;
    }
}
