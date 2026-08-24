/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana1.model;

/**
 * @author AUGUSTO RODRIGUEZ
 */
public class Usuario {
    int id;
    String nombre;
    String email;


    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;

    }

    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getEmail(){
        return this.email;
    }

    public void setId(int newId){
        this.id = newId;
    }
    public void setNombre(int newNombre){
        this.id = newNombre;
    }
    public void setEmail(int newEmail){
        this.id = newEmail;
    }
}