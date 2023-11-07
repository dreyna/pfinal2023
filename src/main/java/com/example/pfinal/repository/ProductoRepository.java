package com.example.pfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pfinal.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
