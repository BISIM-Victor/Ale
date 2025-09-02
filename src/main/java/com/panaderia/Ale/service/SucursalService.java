package com.panaderia.Ale.service;

import com.panaderia.Ale.entity.Sucursal;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface SucursalService {

    public Sucursal guardarSucursal(Sucursal request);

    public Sucursal obtenerSucursal(@PathVariable Long id);

    public Sucursal actualizarSucursal(Sucursal request);

    public List<Sucursal> obtenerTodasLasSucursales();

    public Sucursal eliminarSucursal(@PathVariable Long id);


}
