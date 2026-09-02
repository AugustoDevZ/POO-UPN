/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.presentation.controller;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases.EventoUseCase;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.Comisario;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.port.IdGenerator;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases.IdGeneradorUseCase;
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
}
