package com.miapp.biblioteca.ui;

import com.miapp.biblioteca.service.LibrosService;
import com.miapp.biblioteca.service.PrestamosService;
import com.miapp.biblioteca.service.UsuariosService;

public class Main {

    public static void main(String[] args) {
        // Crear los servicios
        UsuariosService usuariosService = new UsuariosService();
        LibrosService librosService = new LibrosService();
        PrestamosService prestamosService = new PrestamosService();

        // Crear la interfaz de usuario
        InterfazUsuario interfazUsuario = new InterfazUsuario(usuariosService, librosService, prestamosService);

        // Iniciar la interfaz de usuario
        interfazUsuario.iniciar();
    }
}