package com.everis.practica.app.service;

import java.util.List;

import com.everis.practica.app.domain.Producto;

public interface IProductoService {
	
	public Producto guardarProducto(Producto producto);
	public List<Producto> listarProducto();
	public Producto updateProducto(Producto producto);
	public void eliminarProducto(Long idProducto);
	public Producto buscarProducto(Long idProducto);
	


}
