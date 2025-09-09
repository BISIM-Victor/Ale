package com.panaderia.Ale.service;

import com.panaderia.Ale.entity.Perfil;

import java.util.List;

public interface PerfilService {
    public Perfil guardarPerfil(Perfil request);
    public List<Perfil> listarPerfiles();
    public Perfil obtenerPerfilPorId(Long id);
    public Perfil elimanarPerfil(Long id);
}
