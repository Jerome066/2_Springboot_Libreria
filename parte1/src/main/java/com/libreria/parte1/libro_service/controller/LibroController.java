package com.libreria.parte1.libro_service.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.libreria.parte1.libro_service.model.Libro;
import com.libreria.parte1.libro_service.service.LibroService;

@Controller
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // CRUD de prestamos, el alumno puede solicitar un nuevo prestamo, devolver un libro o renovar un prestamo

    // Solicitar un nuevo prestamo
    @GetMapping("/prestamo/{id}")
    public String showPrestamo(@PathVariable Long id, Model model) {
        
        model.addAttribute("id", id);

        List<Libro> librosDisponibles = libroService.findAllLibros();
        model.addAttribute("Libros", librosDisponibles);
        return "prestamo";   
    }
    
    
    
}
