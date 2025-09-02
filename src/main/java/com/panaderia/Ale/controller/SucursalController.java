package com.panaderia.Ale.controller;

import com.panaderia.Ale.entity.Sucursal;
import com.panaderia.Ale.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;


    @PostMapping("/save")
    public Sucursal guardarSucursal(@RequestBody Sucursal request) {
        return sucursalService.guardarSucursal(request);
    }
    @GetMapping("/all")
    public List<Sucursal> obtenerTodasLasSucursales() {
        return sucursalService.obtenerTodasLasSucursales();
    }

    @GetMapping("/{id}")
    public Sucursal obtenerSucursal(@PathVariable Long id) {
        return sucursalService.obtenerSucursal(id);
    }

    @PutMapping("/update")
    public Sucursal actualizarSucursal(@RequestBody Sucursal request) {
        return sucursalService.actualizarSucursal(request);
    }
    @DeleteMapping("/delete/{id}")
    public Sucursal eliminarSucursal(@PathVariable Long id) {
        return sucursalService.eliminarSucursal(id);
    }

}

