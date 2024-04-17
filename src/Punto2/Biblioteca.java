package Punto2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (!libro.estaPrestado()) {
                System.out.println(libro.titulo);
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(titulo)) {
                libro.prestar();
                break;
            }
        }
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(titulo)) {
                libro.devolver();
                break;
            }
        }
    }
}
