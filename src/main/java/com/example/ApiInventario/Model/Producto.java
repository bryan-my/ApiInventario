package com.example.ApiInventario.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @Column(nullable = false, length = 150)
    private String nombre;
    
    @Column(nullable = false, length = 45)
    private String descripcion;
   
    @Column(nullable = false, length = 45)
    private int precio;
    
    @ManyToOne
    @JoinColumn(name = "categoria")
    private String categoria;
    
    @Column(name = "stock_actual", nullable = false)
    private Integer stock_actual = 0;
    
    @Column(nullable = false)
    private Boolean disponibilidad;

    @ManyToOne
    @JoinColumn(name = "inventario_id")
    private Inventario inventario;

}
