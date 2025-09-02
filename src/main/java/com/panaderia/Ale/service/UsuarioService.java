package com.panaderia.Ale.service;

import com.panaderia.Ale.entity.Usuario;
import com.panaderia.Ale.repository.UsuarioRepository;
import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario guardarUsuario(Usuario request){
        return usuarioRepository.save(request);
    }


}
