package com.libreria.parte1.library_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.parte1.library_service.model.Prestamo_Libro;

import java.util.List;


@Repository
public interface LibraryRepository extends JpaRepository<Prestamo_Libro, Long> { // verifica que exista el alumno
    List<Prestamo_Libro> findByAlumnoAlumnoId(Long alumnoId);
    List<Prestamo_Libro> findByAlumnoNombre(String alumnoNombre);
}
