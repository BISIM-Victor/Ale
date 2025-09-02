package com.panaderia.Ale.controller;

import com.panaderia.Ale.entity.Sucursal;
import com.panaderia.Ale.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/save")
    public Sucursal guardarSucursal(@RequestBody Sucursal request){
        return sucursalService.guardarSucursal(request);
    }

    @GetMapping("/{id}")
    public Sucursal obtenerSucursal(@PathVariable Long id){
        return sucursalService.obtenerSucursal(id);
    }
}
