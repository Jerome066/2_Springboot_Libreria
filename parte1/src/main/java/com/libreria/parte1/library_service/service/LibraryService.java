package com.libreria.parte1.library_service.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.libreria.parte1.library_service.model.Prestamo_Libro;
import com.libreria.parte1.library_service.repository.LibraryRepository;

@Service
public class LibraryService {
    private LibraryRepository libraryR;

    public LibraryService(LibraryRepository libraryRepository){
        this.libraryR = libraryRepository;
    }

    public List<Prestamo_Libro> FindAllPrestamos(String nombre){
        return libraryR.findByAlumnoNombre(nombre);
    }

    public List<Prestamo_Libro> FindByNombre(String nombre){
        return libraryR.findByAlumnoNombre(nombre);
    }

    public List<Prestamo_Libro> FindById(Long id){
        return libraryR.findByAlumnoAlumnoId(id);
    }
}
