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
    
    public static void eliminarComisario(String uuid){
        EventoUseCase.removeComisario(uuid);
    }
    
    
    public static List<Comisario> getComisarios(){
        return EventoUseCase.getComisarios();
    }
    public static List<Evento> getEventos(){
        return EventoUseCase.getEventos();
    }    
    public static List<Area> getAreas(){
        return EventoUseCase.getAreas();
    }
    public static List<Complejo> getComplejos(){
        return  EventoUseCase.getComplejos();
    }
    
    
    
    public static void crearComisario(Comisario nuevoComisario){
        EventoUseCase.addComisario(nuevoComisario);
    }
    public static void crearEvento(Evento nuevoEvento){
        EventoUseCase.addEvento(nuevoEvento);
    }
    public static void crearComplejo(Complejo nuevoComplejo){     
        EventoUseCase.addComplejo(nuevoComplejo);
    }
    public static void crearArea(Area nuevoArea){     
        EventoUseCase.addArea(nuevoArea);
    }
    public static void crearSede(Sede nuevaSede){
        EventoUseCase.addSede(nuevaSede);
    }
}
