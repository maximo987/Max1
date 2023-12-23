package com.miapp.biblioteca.service;

import com.miapp.biblioteca.Libros;

import java.util.ArrayList;

public class LibrosService {

    //ATRIBUTOS

    private ArrayList<Libros> biblioteca; //Listado de Libros de la biblioteca en un ArrayList


    //CONSTRUCTOR

    public LibrosService(ArrayList<Libros> biblioteca) {
        this.biblioteca = biblioteca;
    }

    //METODOS
    /*
     *CRUD
     */

    //CREAR LIBROS (CREATE)

    public void create(String titulo, String autor, String ISBN, String genero){
        Libros nuevoLibro = new Libros(titulo, autor, ISBN, genero);
        biblioteca.add(nuevoLibro);

    }

    //Leer todos los libros (Read)

    public ArrayList<Libros> readAll() {

        return biblioteca;
    }

    // Leer libros por ISBN (Read por ISBN)

    public Libros readByISBN(String ISBN){

        for(Libros libro : biblioteca){
            if(libro.getISBN().equals(ISBN)){
                return libro;
            }
        }

        return null;

    }

    //ACTUALIZAR (UPDATE)

    public void update(String ISBN, String nuevoAutor, String nuevoTitulo, String nuevoGenero){

        for(Libros libro : biblioteca){

            if (libro.getISBN().equals(ISBN)){

                libro.setAutor(nuevoAutor);
                libro.setTitulo(nuevoTitulo);
                libro.setGenero(nuevoGenero);
            }
        }


    }
    //Eliminar

    public void delete(String ISBN){

        biblioteca.removeIf(libros -> libros.getISBN().equals(ISBN));

    }




}