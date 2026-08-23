/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.controller.ControllerSemana1;
import com.mycompany.practicas.model.ModelsSemana1.Usuario;
import org.apache.commons.validator.routines.EmailValidator;
import java.util.ArrayList;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class UsuarioController {
      
    private static ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
    
    public static void AddUser(int id, String nombre, String email){

        var prEncontrado = BuscarID(id);
        if (prEncontrado != null) throw new IllegalArgumentException("El ID ingresado ya existe");
        if(BuscarNombre(nombre)) throw new IllegalArgumentException("El Nombre ingresado ya existe");
        EmailValidator validator = EmailValidator.getInstance();
        if (!validator.isValid(email)) throw new IllegalArgumentException("El email ingresado n oes válido");

        Usuario newProducto = new Usuario(id,nombre,email);
        Usuarios.add(newProducto);
    }
    public static ArrayList<Usuario> ListarUsuarios(){
        return Usuarios;
    }
    public static Usuario BuscarUsuario(int id){
        return BuscarID(id);
    }

    private static Usuario BuscarID(int id){
        for (Usuario u : Usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    private static boolean BuscarNombre(String nombre){
        for (Usuario u : Usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }



    
} 
