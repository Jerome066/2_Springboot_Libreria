package com.libreria.parte1.library_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreria.parte1.alumno_service.model.alumno;

@Repository
public interface LibraryRepository extends JpaRepository<alumno, Long> { //
    
}
