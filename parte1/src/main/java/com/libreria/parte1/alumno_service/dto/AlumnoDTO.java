package com.libreria.parte1.alumno_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class AlumnoDTO {

    private Long Alumno_ID;
    private String nombre;
    private String Matricula;
    private String Carrera;
    private String Activo;
    private String Fecha_Registro;
    private String Email;



}