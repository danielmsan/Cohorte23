package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;
@Service

public class ProductoService {
    
	//Creo el objeto de la clase Producto repository
    private final ProductoRepository productoRepository;
    
    //Cablear con el autowired
    @Autowired
    
    
    public ProductoService(ProductoRepository productoRepository) {
    	this.productoRepository = productoRepository;
    }
    
    
    //Create (Metodo para agregar un objeto del tipo Producto y guardar en la base de datos)
    public void crearProducto() {
        
    }
    
    //Read(leer una lista de productos
    public List<Producto> leerProductos() {
        return productoRepository.findAll();
    }
    //Read (leer un producto con un id especifico)
    public Producto getProducto(Long prodId) {
        return productoRepository.findById(prodId).
                orElseThrow(()-> new IllegalStateException("El Producto "
                        + "con el id " + prodId + " no existe.") );
    }//getProducto
    
    
    //Update
    public void actualizarProducto() {
        
    }
    
    //Delete
    public void borrarProducto() {

        
    }
    
    
}