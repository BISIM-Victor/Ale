package com.panaderia.Ale.controller;

import com.panaderia.Ale.entity.Usuario;
import com.panaderia.Ale.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping ("/save")
    public Usuario guardarUsuario(@RequestBody Usuario request) {
        return usuarioService.guardarUsuario(request);
    }

    @GetMapping("/all")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }


    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @PutMapping("/update")
    public Usuario actualizarUsuario(@RequestBody Usuario request) {
        return usuarioService.actualizarUsuario(request);
    }




}
