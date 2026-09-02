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
    
    public static void addComisario(Comisario newComisario){
        if (comisarios.contains(newComisario)) {
            return;
        }
        comisarios.add(newComisario);
    }
    
    public static void removeComisario(String uuid){
        comisarios.removeIf(comisario -> comisario.getUUID().equals(uuid));      
    }
    
    public static boolean existComisario(String uuid){
        return comisarios.stream().anyMatch(comisario -> comisario.getUUID().equals(uuid));
    }
    
    
    
    public static List<Comisario> getComisarios(){
        return comisarios;
    }
    
    
    public static void addEvento(Evento evento){

       if (!eventos.contains(evento)) {
           return;
       }

       eventos.add(evento);
    }
    
    public static List<Evento> getEvento(){
        return eventos;
    }
    public static List<Area> getArea(){
        return areas;
    }
    
    public static boolean existComplejo(Complejo newComplejo){
        if (!complejos.contains(newComplejo)) {
           return true;
        }
        return false;
    }
    
    public static void addComplejo(Complejo newComplejo){      
       complejos.add(newComplejo);
    }
    
    public static List<Complejo> getComplejos(){
        return complejos;
    }
    
    public static boolean existArea(Area area){
        return areas.contains(area);
    }
    
    public static void addArea(Area area){
        areas.add(area);
    }
}
