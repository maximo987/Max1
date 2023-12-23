package com.miapp.biblioteca.service;

import com.miapp.biblioteca.Usuarios;

import java.util.ArrayList;

public class UsuariosService {

    // Atributos
    private ArrayList<Usuarios> usuarios;

    // Constructores
    public UsuariosService() {
        this.usuarios = new ArrayList<>();
    }

    // Métodos
    public void agregarUsuario(String nombre, String id) {
        Usuarios nuevoUsuario = new Usuarios(nombre, id);
        usuarios.add(nuevoUsuario);
    }

    public Usuarios buscarUsuarioPorId(String id) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public void eliminarUsuarioPorId(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }
}