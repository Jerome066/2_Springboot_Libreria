package com.libreria.parte1.alumno_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Alumno_ID;
    private String nombre;
    private String Matricula;
    private String Carrera;
    private String Activo;
    private String Fecha_Registro;
    private String Email;
}
