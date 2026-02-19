package com.libreria.parte1.libro_service.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.libreria.parte1.libro_service.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByTitulo(String titulo);
    List<Libro> findByEditorial(String editorial);
    List<Libro> findByGenero(String genero);
    List<Libro> findByPublicacion(LocalDate publicacion);
}
