package com.libreria.parte1.libro_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.libreria.parte1.libro_service.model.Libro;


public interface LibroRepository extends JpaRepository<Libro, Long> {
    
}
