package com.mycompany.practicas.semana1.controller;

import com.mycompany.practicas.semana1.model.Libro;

import java.util.ArrayList;

public class LibroController {
    private ArrayList<Libro> libros;

    public LibroController() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {
        libros.add(l);
        System.out.println("Libro agregado: " + l.getTitulo());
    }

    public void listarLibros() {
        System.out.println("\n--- Lista de Libros ---");
        for (Libro libro : libros) {
            String estado = libro.isDisponible() ? "Disponible" : "Prestado";
            System.out.println("ISBN: " + libro.getIsbn() + " | Título: " + libro.getTitulo() + " | Estado: " + estado);
        }
        System.out.println("-----------------------\n");
    }

    public void prestarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Has pedido prestado el libro: " + libro.getTitulo());
                } else {
                    System.out.println("El libro '" + libro.getTitulo() + "' ya está prestado.");
                }
                return;
            }
        }
        System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
    }

    public void devolverLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("Has devuelto el libro: " + libro.getTitulo());
                } else {
                    System.out.println("El libro '" + libro.getTitulo() + "' ya estaba disponible.");
                }
                return;
            }
        }
        System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
    }
}
