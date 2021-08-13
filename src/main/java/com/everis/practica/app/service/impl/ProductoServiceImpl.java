package com.everis.practica.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.practica.app.domain.Producto;
import com.everis.practica.app.repository.IRepositoryProducto;
import com.everis.practica.app.service.IProductoService;
@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired //devolver una instancia cada vez que se requiera
	public IRepositoryProducto repo;
	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return repo.save(producto);
		
	}

	@Override
	public List<Producto> listarProducto() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return repo.save(producto);
	}

	@Override
	public void eliminarProducto(Long idProducto) {
		// TODO Auto-generated method stub
		repo.deleteById(idProducto);
	}

	@Override
	public Producto buscarProducto(Long idProducto) {
		// TODO Auto-generated method stub
		return repo.findById(idProducto).get();
	}

}
