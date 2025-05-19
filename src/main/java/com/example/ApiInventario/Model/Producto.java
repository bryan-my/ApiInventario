package com.example.ApiInventario.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
    private Integer id;

    @Column(nullable = false, length = 45)
    private String nombre;
    
    @Column(nullable = false, length = 45)
    private int cantidad;
   
    @Column(nullable = false, length = 45)
    private String marca;
    
    @Column(nullable = false, length = 45)
    private String descripcion;
    
    @Column(nullable = false, length = 45)
    private String precio;



}
