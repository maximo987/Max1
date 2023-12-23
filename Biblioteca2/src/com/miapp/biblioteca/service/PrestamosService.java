package com.miapp.biblioteca.service;

import com.miapp.biblioteca.Libros;
import com.miapp.biblioteca.Usuarios;

import java.util.ArrayList;

public class PrestamosService {

    // Atributos
    private ArrayList<Libros> librosPrestados;

    // Constructores
    public PrestamosService() {
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos
    public void prestarLibro(Usuarios usuario, Libros libro) {
        if (libro.isDispponible()) {
            usuario.getLibrosPrestados().add(libro);
            libro.setDispponible(false);
            librosPrestados.add(libro);
        }
    }

    public void devolverLibro(Usuarios usuario, Libros libro) {
        if (usuario.getLibrosPrestados().contains(libro)) {
            usuario.getLibrosPrestados().remove(libro);
            libro.setDispponible(true);
            librosPrestados.remove(libro);
        }
    }

    public ArrayList<Libros> getLibrosPrestados() {
        return librosPrestados;
    }
}