/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.presentation.controller;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases.EventoUseCase;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.Comisario;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.port.IdGenerator;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases.IdGeneradorUseCase;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.*;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class EventoController {
    
    
    public static void createComisario(String nombreComisario, String uuid){
        
        if (EventoUseCase.existComisario(uuid)) {
            return;
        }
        
        Comisario newComisario = new Comisario(uuid, nombreComisario);
        EventoUseCase.addComisario(newComisario);
    }
    
    public static List<Comisario> getComisarios(){
        return EventoUseCase.getComisarios();
    }
    
    public static void eliminarCOmisario(String uuid){
        EventoUseCase.removeComisario(uuid);
    }
    
    
    public static void createEvento(Evento newEvento){
        
        EventoUseCase.addEvento(newEvento);
    }
    
    public static List<Evento> getEvento(){
        return EventoUseCase.getEvento();
    }
    
    public static List<Area> getArea(){
        return EventoUseCase.getArea();
    }
    
    public static void createComplejo(Complejo newComplejo){     
        
         if (EventoUseCase.existComplejo(newComplejo)) {
             return;
         }
         
        EventoUseCase.addComplejo(newComplejo);
    }
    
    public static List<Complejo> getComplejos(){
        return  EventoUseCase.getComplejos();
    }
    
     public static void createArea(Area newArea){     
        
         if (EventoUseCase.existArea(newArea)) {
             return;
         }
         
        EventoUseCase.addArea(newArea);
    }
}
