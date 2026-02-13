package com.libreria.parte1.libro_service.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.libreria.parte1.libro_service.model.Libro;

@Service
public interface LibroServicio extends JpaRepository<Libro, Long> {

    
}