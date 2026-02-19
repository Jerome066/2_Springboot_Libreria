package com.libreria.parte1.libro_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.libreria.parte1.libro_service.model.Libro;
import com.libreria.parte1.libro_service.repository.LibroRepository;

@Service
public class LibroService {
    private LibroRepository libroR;

    public LibroService(LibroRepository libroRepository){
        this.libroR = libroRepository;
    }

    public List<Libro> findByTitulo(String titulo){
        return libroR.findByTitulo(titulo);
    }

    public List<Libro> findAllLibros(){
        return libroR.findAll();
    }
}