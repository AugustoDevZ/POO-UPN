/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.*;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class EventoUseCase {
    private static List<Comisario> comisarios = new ArrayList();
    private static List<Evento> eventos = new ArrayList();
    private static List<Area> areas = new ArrayList();
    private static List<Complejo> complejos = new ArrayList();
    private static List<Sede> sedes = new ArrayList();
     
    
    
    public static void removeComisario(String uuid){
        comisarios.removeIf(comisario -> comisario.getUUID().equals(uuid));      
    }
    
    public static List<Comisario> getComisarios(){
        return comisarios;
    }
    public static List<Evento> getEventos(){
        return eventos;
    }
    public static List<Area> getAreas(){
        return areas;
    }
    public static List<Complejo> getComplejos(){
        return complejos;
    }
    
    
    public static void addComisario(Comisario nuevoComisario){
        if (comisarios.contains(nuevoComisario)) {
            return;
        }
        comisarios.add(nuevoComisario);
    }
    public static void addEvento(Evento nuevoEvento){
        if (eventos.contains(nuevoEvento)) {
            return;
        }
        eventos.add(nuevoEvento);
    }
    public static void addComplejo(Complejo nuevoComplejo){      
        if (complejos.contains(nuevoComplejo)) {
            return;
        }
       complejos.add(nuevoComplejo);
    }    
    public static void addArea(Area nuevaArea){
        if (areas.contains(nuevaArea)) {
            return;
        }
        areas.add(nuevaArea);
    }
    public static void addSede(Sede nuevaSede){
        if (sedes.contains(nuevaSede)) {
            return;
        }
        sedes.add(nuevaSede);
    }
    
    
    
}
