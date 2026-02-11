package com.libreria.parte1.library_service.model;

import java.security.PrivateKey;

import jakarta.persistence.Entity;
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
    
    private Long Prestamo_ID;
    private String Libro_ID;
    private String Alumno_ID;
    private String Fecha_Prestamo;
    private String Fecha_Devolucion;
    private String Estado;
}
