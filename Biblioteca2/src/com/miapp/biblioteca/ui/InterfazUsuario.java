package com.miapp.biblioteca.ui;

import com.miapp.biblioteca.service.PrestamosService;
import com.miapp.biblioteca.service.UsuariosService;

import java.util.Scanner;

public class InterfazUsuario {

    private UsuariosService usuariosService;
    private LibrosService librosService;
    private PrestamosService prestamosService;
    private Scanner scanner;

    public InterfazUsuario(UsuariosService usuariosService, LibrosService librosService, PrestamosService prestamosService) {
        this.usuariosService = usuariosService;
        this.librosService = librosService;
        this.prestamosService = prestamosService;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            System.out.println("Bienvenido a la biblioteca virtual. Por favor, selecciona una opción:");
            System.out.println("1. Ver todos los libros");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    // Mostrar todos los libros
                    break;
                case "2":
                    // Prestar un libro
                    break;
                case "3":
                    // Devolver un libro
                    break;
                case "4":
                    System.out.println("¡Gracias por usar la biblioteca virtual! ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }
}