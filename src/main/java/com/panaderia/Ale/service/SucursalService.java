package com.panaderia.Ale.service;

import com.panaderia.Ale.entity.Sucursal;
import com.panaderia.Ale.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    public Sucursal guardarSucursal(Sucursal request){
        return sucursalRepository.save(request);
    }

    public Sucursal obtenerSucursal(Long id){
        return sucursalRepository.findById(id).get();
    }

}
