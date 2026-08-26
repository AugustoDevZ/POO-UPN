package com.mycompany.practicas.semana3;

public class Libro {
    class Pagina {
        public void mostrarContenido() {
            System.out.println("Érase una vez en un lugar muy lejano...");
        }
    }

    public void leer() {
        Pagina paginaActual = new Pagina();
        paginaActual.mostrarContenido();
    }

    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.leer();
    }
}
