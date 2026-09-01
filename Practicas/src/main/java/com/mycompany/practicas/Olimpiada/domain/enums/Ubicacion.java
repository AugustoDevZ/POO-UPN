/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana4.domain.enums;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public enum Ubicacion {
    AREA_1("Zona este"),
    AREA_2("Zona sur");
    
    private String ubicacion;
    
    Ubicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public String getubicacion() {
        return ubicacion;
    }
}
