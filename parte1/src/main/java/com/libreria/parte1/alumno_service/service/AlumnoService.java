package com.libreria.parte1.alumno_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.libreria.parte1.alumno_service.model.Alumno;
import com.libreria.parte1.alumno_service.repository.AlumnoRepository;

@Service
public class AlumnoService {
    
    private AlumnoRepository alumnoR;

    public AlumnoService( AlumnoRepository alumnoRepository){
        this.alumnoR = alumnoRepository;
    }

    public List<Alumno> Checkuser(String email){
        return alumnoR.findByEmail(email);
    }
    
    public String getNombreById(Long id) {
        return alumnoR.findById(id).get().getNombre();
    }
}
