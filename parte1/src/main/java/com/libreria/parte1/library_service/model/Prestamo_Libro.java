package com.libreria.parte1.library_service.model;


import com.libreria.parte1.alumno_service.model.Alumno;
import com.libreria.parte1.libro_service.model.Libro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "prestamo_libro")
public class Prestamo_Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Prestamo_ID;

    @ManyToOne
    @JoinColumn(name = "Libro_ID")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "Alumno_ID")
    private Alumno alumno;

    private String Fecha_Prestamo;
    private String Fecha_Devolucion;
    private String Estado;
}
