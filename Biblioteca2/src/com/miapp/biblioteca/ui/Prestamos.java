
package com.miapp.biblioteca;

        import com.miapp.biblioteca.service.LibrosService;
        import com.miapp.biblioteca.service.UsuariosService;

public class Prestamos {

    // Atributos
    private UsuariosService usuariosService;
    private LibrosService librosService;

    // Constructores
    public Prestamos(UsuariosService usuariosService, LibrosService librosService) {
        this.usuariosService = usuariosService;
        this.librosService = librosService;
    }

    // Métodos
    public void prestarLibro(String idUsuario, String ISBNLibro) {
        Usuarios usuario = usuariosService.buscarUsuarioPorId(idUsuario);
        Libros libro = librosService.buscarLibroPorISBN(ISBNLibro);

        if (usuario != null && libro != null && libro.isDispponible()) {
            usuario.getLibrosPrestados().add(libro);
            libro.setDispponible(false);
        }
    }

    public void devolverLibro(String idUsuario, String ISBNLibro) {
        Usuarios usuario = usuariosService.buscarUsuarioPorId(idUsuario);
        Libros libro = librosService.buscarLibroPorISBN(ISBNLibro);

        if (usuario != null && libro != null) {
            usuario.getLibrosPrestados().remove(libro);
            libro.setDispponible(true);
        }
    }
}