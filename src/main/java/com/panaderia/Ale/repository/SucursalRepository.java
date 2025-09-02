package com.panaderia.Ale.repository;

import com.panaderia.Ale.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
}
