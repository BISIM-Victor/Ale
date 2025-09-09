package com.panaderia.Ale.ServiceImpl;

import com.panaderia.Ale.entity.Perfil;
import com.panaderia.Ale.repository.PerfilRepository;
import com.panaderia.Ale.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public Perfil guardarPerfil(Perfil request) {
        return perfilRepository.save(request);
    }

    @Override
    public List<Perfil> listarPerfiles() {
        return perfilRepository.findAll();
    }

    @Override
    public Perfil obtenerPerfilPorId(Long id) {
        return perfilRepository.findById(id).get();
    }

    @Override
    public Perfil elimanarPerfil(Long id) {
        Perfil perfil = perfilRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("no se encontro el id "));

        perfilRepository.delete(perfil);
        return perfil;
    }


}
