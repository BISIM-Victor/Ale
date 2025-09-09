package com.panaderia.Ale.ServiceImpl;

import com.panaderia.Ale.entity.Producto;
import com.panaderia.Ale.repository.ProductoRepository;
import com.panaderia.Ale.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public Producto guardarProducto(Producto request) {
        return productoRepository.save(request);
    }
}
