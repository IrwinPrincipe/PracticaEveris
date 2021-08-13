package com.everis.practica.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.practica.app.domain.Producto;

public interface IRepositoryProducto extends JpaRepository<Producto, Long>{

}	
