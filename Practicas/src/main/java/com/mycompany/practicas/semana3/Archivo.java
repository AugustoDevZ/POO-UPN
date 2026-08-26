package com.mycompany.practicas.semana3;

import java.io.IOException;

public class Archivo {

    public void leerArchivo(String nombreArchivo) throws IOException {
        if (nombreArchivo == null || nombreArchivo.isEmpty()) {
            throw new IOException("El archivo especificado no se encontró o el nombre está vacío.");
        }
        System.out.println("Leyendo el archivo: " + nombreArchivo + " con éxito.");
    }

    public static void main(String[] args) {
        Archivo miArchivo = new Archivo();
        try {
            miArchivo.leerArchivo("");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
