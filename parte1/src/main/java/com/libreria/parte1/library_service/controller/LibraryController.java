package com.libreria.parte1.library_service.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.libreria.parte1.alumno_service.dto.AlumnoDTO;
import com.libreria.parte1.alumno_service.model.Alumno;
import com.libreria.parte1.alumno_service.service.AlumnoService;
import com.libreria.parte1.library_service.model.Prestamo_Libro;
import com.libreria.parte1.library_service.service.LibraryService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LibraryController {

    private final LibraryService libraryService;
    private final AlumnoService alumnoService;

    public LibraryController (AlumnoService alumnoService, LibraryService libraryService){
        this.alumnoService = alumnoService;
        this.libraryService = libraryService;
    }

    //Login
    @GetMapping
    public String welcome(Model model) {
        return "login";
    }
    //check login
    @PostMapping("/checkLogin/{email}")
    public String checkLogin(@PathVariable String email, @Valid @ModelAttribute AlumnoDTO alumnoDTO, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("alumnoDTO",alumnoDTO);
            return "login";
        }
        List<Alumno> listaAlumnos = alumnoService.Checkuser(alumnoDTO.getEmail());
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getEmail().equals(alumnoDTO.getEmail())) {
                return "redirect:/welcome/" + alumno.getAlumnoId();
            }
        }
        return "login";
    }

    //welcome
    @GetMapping("/welcome/{id}")
    public String getMethodName(@PathVariable Long id, Model model) {
        String nombre = alumnoService.getNombreById(id); 
        List<Prestamo_Libro> ListaPrestamos = libraryService.FindById(id);


        model.addAttribute("nombre", nombre);
        model.addAttribute("ListaPrestamos", ListaPrestamos);

        return "welcome";
    }


}
