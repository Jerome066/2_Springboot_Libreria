package com.libreria.parte1.alumno_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.parte1.alumno_service.model.Alumno;
import java.util.List;


@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> { // verifica que exista el alumno
    
    List<Alumno> findByEmail(String Email);
}
