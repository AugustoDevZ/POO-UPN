/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.Comisario;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.Participacion;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.Evento;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.enums.ComisarioRol;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class EventoUseCase {
    private static List<Comisario> comisarios = new ArrayList();
    private static List<Evento> eventos = new ArrayList();
    
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
    
    
    
    public static Participacion createParticipacion(Comisario comisario, ComisarioRol rol){
        
        if (!comisarios.contains(comisario)) {
            return null;
        }
        
        Participacion newParticipacion = new Participacion(comisario, rol);
        
        return newParticipacion;
    }
    
     public static void addEvento(Evento evento){
        
        if (!eventos.contains(evento)) {
            return;
        }
        
        eventos.add(evento);
     }
    
}
