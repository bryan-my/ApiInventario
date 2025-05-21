package com.example.ApiInventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiInventario.Service.InventarioService;

@RestController
@RequestMapping("api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    public ResponseEntity<?> eliminarProductoDeInventario(@PathVariable Integer id){
        inventarioService.eliminarProducto(id);
        return ResponseEntity.ok().build();
    }

}
