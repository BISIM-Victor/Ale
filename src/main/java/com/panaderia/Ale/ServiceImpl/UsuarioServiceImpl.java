package com.panaderia.Ale.ServiceImpl;

import com.panaderia.Ale.entity.Usuario;
import com.panaderia.Ale.repository.UsuarioRepository;
import com.panaderia.Ale.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario guardarUsuario(Usuario request){
        return usuarioRepository.save(request);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();

    }

    @Override
    public Usuario actualizarUsuario(Usuario request) {
        Usuario usuario = usuarioRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con el id: " + request.getId()));

        usuario.setNombre(request.getNombre());
        usuario.setEmail(request.getEmail());
        usuario.setPassword(request.getPassword());

        return usuarioRepository.save(usuario);

    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }


}
