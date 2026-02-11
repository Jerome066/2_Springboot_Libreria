package com.libreria.parte1.library_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Prestamo_ID;
    private String Libro_ID;
    private String Alumno_ID;
    private String Fecha_Prestamo;
    private String Fecha_Devolucion;
    private String Estado;
}
