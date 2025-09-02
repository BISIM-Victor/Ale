package com.panaderia.Ale.service;

import com.panaderia.Ale.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario request);
    public List<Usuario> obtenerTodosLosUsuarios();
    public Usuario actualizarUsuario(Usuario request);

}
