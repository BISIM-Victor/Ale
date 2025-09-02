package com.panaderia.Ale.service;

import com.panaderia.Ale.entity.Perfil;

import java.util.List;

public interface PerfilService {
    public Perfil guardarPerfil(Perfil request);
    public List<Perfil> listarPerfiles();
}
