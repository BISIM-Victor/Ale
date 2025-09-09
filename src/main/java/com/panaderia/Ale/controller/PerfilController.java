package com.panaderia.Ale.controller;

import com.panaderia.Ale.entity.Perfil;
import com.panaderia.Ale.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @PostMapping("/save")
    public Perfil guardarPerfil(@RequestBody Perfil request) {
        return perfilService.guardarPerfil(request);
    }

    @GetMapping("/all")
    public List<Perfil> listarPerfiles() {
        return perfilService.listarPerfiles();
    }

    @GetMapping("/{id}")
    public Perfil obtenerPerfilPorId(@PathVariable Long id) {
        return perfilService.obtenerPerfilPorId(id);
    }

    @DeleteMapping("/delete/{id}")
    public  Perfil eliminaPerfil(@PathVariable Long id){
        return perfilService.elimanarPerfil(id);
    }




}
