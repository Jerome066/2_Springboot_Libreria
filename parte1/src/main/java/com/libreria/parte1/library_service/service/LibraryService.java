package com.libreria.parte1.library_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.libreria.parte1.alumno_service.model.alumno;
import com.libreria.parte1.library_service.repository.LibraryRepository;

@Service
public class LibraryService {
    
    private LibraryRepository libraryR;

    public LibraryService( LibraryRepository libraryRepository){
        this.libraryR = libraryRepository;
    }

    public List<alumno> Checkuser(String email){
        return libraryR.findByEmail(email);
    }
}
