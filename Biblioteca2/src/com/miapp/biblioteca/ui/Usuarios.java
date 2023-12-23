package com.miapp.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuarios {

    //Atributos
    private String nombre;
    private String id;
    private ArrayList<Libros> LibrosPrestados;

    //Constructores

    public Usuarios() {
    }

    public Usuarios(String nombre, String id)                                                                                                                            {
        this.nombre = nombre;
        this.id = id;
        this.LibrosPrestados = new ArrayList<>();

    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Libros> getLibrosPrestados() {
        return LibrosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libros> librosPrestados) {
        LibrosPrestados = librosPrestados;
    }


    //Funcion de informacion


    @Override
    public String toString() {
        return "Usuarios{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", LibrosPrestados=" + LibrosPrestados +
                '}';
    }
}