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
@Table(name = "categoria")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
    private Integer categoria_id;

    @Column(nullable = false, length = 125)
    private String nombre;

    @Column(length = 45)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "inventario_id")
    private Inventario inventario;

}
