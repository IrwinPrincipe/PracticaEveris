package com.everis.practica.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;	

import com.everis.practica.app.domain.Producto;
import com.everis.practica.app.repository.IRepositoryProducto;
import com.everis.practica.app.service.IProductoService;



@RestController
@RequestMapping("/producto")


public class ProductoController {
	@Autowired
	public IProductoService productoService;
	
	
	@Autowired
	public IRepositoryProducto repo;

	@PostMapping("/guardar")
	public ResponseEntity<Object> metodoGuardarProducto(@RequestBody Producto producto) {
		
		Producto p= productoService.guardarProducto(producto);
		
		return new ResponseEntity<>(p, HttpStatus.CREATED);
	}

	@GetMapping("/listar")
	public List<Producto> metodoListarProducto() {
		return productoService.listarProducto();
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Object> metodoUpdateAlumno(@RequestBody Producto p, @PathVariable Long id) {
		
		
		Optional<Producto> producto = repo.findById(id);
		
		if(!producto.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		
		
		productoService.updateProducto(p);
		
		return ResponseEntity.accepted().build();
	}

	@DeleteMapping("/eliminar/{id}")
	public void metodoEliminarProducto(@RequestBody Producto p, @PathVariable Long id) {
		
		
		
		productoService.eliminarProducto(id);
		System.out.print("Soy el producto: "+id+" y fui eliminado");
		
	
	}

	@GetMapping("/buscar")
	public Producto metodoBuscarProducto(@RequestParam Long id) {

		System.out.println("Se obtuvo el" + id+"del producto");
	
		
		return productoService.buscarProducto(id);

	}
}
