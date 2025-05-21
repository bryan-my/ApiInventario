package com.example.ApiInventario.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiInventario.Model.Producto;
import com.example.ApiInventario.Repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class InventarioService {

    @Autowired
    private ProductoRepository productoRepository;
    

    @Transactional
    public void eliminarProducto(Integer productoId) {
        Producto producto = productoRepository.findById(productoId)
            .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        
        productoRepository.delete(producto);
    }

}
