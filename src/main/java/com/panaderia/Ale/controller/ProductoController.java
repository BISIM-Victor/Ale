package com.panaderia.Ale.controller;

import com.panaderia.Ale.entity.Producto;
import com.panaderia.Ale.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @PostMapping("/save")
    public Producto guardarProducto(@RequestBody Producto request) {
        return productoService.guardarProducto(request);
    }

}
