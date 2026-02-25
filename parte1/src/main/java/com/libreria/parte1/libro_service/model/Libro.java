package com.libreria.parte1.libro_service.model;

import java.time.LocalDate;
import java.util.List;

import com.libreria.parte1.library_service.model.Prestamo_Libro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Libro")
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Libro_ID")
    private Long LibroId;
    private String Titulo;
    private String Editorial;
    private String Genero;
    private LocalDate Publicacion;
    private int Paginas;
    private String Edicion;
    private int Ejemplares;
    
    @OneToMany(mappedBy = "libro")
    List<Prestamo_Libro> prestamos;
}
