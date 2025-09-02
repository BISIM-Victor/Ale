package com.panaderia.Ale.ServiceImpl;

import com.panaderia.Ale.entity.Sucursal;
import com.panaderia.Ale.repository.SucursalRepository;
import com.panaderia.Ale.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl implements SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Override
    public Sucursal guardarSucursal(Sucursal request) {
        return sucursalRepository.save(request);
    }

    @Override
    public Sucursal obtenerSucursal(Long id) {
        return sucursalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sucursal no encontrada"));
    }

    @Override
    public Sucursal actualizarSucursal(Sucursal request) {
        Sucursal sucursal = sucursalRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Sucursal no encontrada con el id: " + request.getId()));

        sucursal.setNombre(request.getNombre());
        sucursal.setDireccion(request.getDireccion());
        return sucursalRepository.save(sucursal);
    }

    @Override
    public List<Sucursal> obtenerTodasLasSucursales() {
        return sucursalRepository.findAll();
    }

    @Override
    public Sucursal eliminarSucursal(Long id) {
       Sucursal sucursal = sucursalRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Sucursal no encontrada con el id: " + id));
       sucursalRepository.delete(sucursal);
       return sucursal;
    }


}
