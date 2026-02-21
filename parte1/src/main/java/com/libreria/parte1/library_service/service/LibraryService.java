package com.libreria.parte1.library_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.libreria.parte1.alumno_service.repository.AlumnoRepository;
import com.libreria.parte1.library_service.model.Prestamo_Libro;
import com.libreria.parte1.library_service.repository.LibraryRepository;
import com.libreria.parte1.libro_service.model.Libro;
import com.libreria.parte1.libro_service.repository.LibroRepository;

@Service
public class LibraryService {
    private LibraryRepository libraryR;
    private LibroRepository libroR;
    private AlumnoRepository alumnoR;

    public LibraryService(LibraryRepository libraryRepository, LibroRepository libroRepository, AlumnoRepository alumnoRepository){
        this.libraryR = libraryRepository;
        this.libroR = libroRepository;
        this.alumnoR = alumnoRepository;
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

    public void DevolverLibro(Long id){
        Prestamo_Libro prestamo = libraryR.findById(id).orElse(null);
        if (prestamo != null) {
            prestamo.setEstado("Devuelto");
            libraryR.save(prestamo);
        }
    }

    public void solicitarPrestamo(Long idLibro, Long idUser) {
        
        List<Libro> libro = libroR.findById(idLibro);
    }
}
