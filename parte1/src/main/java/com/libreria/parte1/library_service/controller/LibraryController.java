package com.libreria.parte1.library_service.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.libreria.parte1.alumno_service.dto.AlumnoDTO;
import com.libreria.parte1.alumno_service.model.alumno;
import com.libreria.parte1.library_service.dto.userDTO;
import com.libreria.parte1.library_service.repository.LibraryRepository;
import com.libreria.parte1.library_service.service.LibraryService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController (LibraryRepository libraryRepository, LibraryService libraryService){
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
        List<alumno> listaAlumnos = libraryService.Checkuser(alumnoDTO.getEmail());
        for (alumno alumno : listaAlumnos) {
            if (alumno.getEmail().equals(alumnoDTO.getEmail())) {
                model.addAttribute("alumno", alumno);
                return "redirect:/welcome";
            }
        }
        return "login";
    }

    //welcome
    @GetMapping("/welcome")
    public String getMethodName() {
        
        return "welcome";
    }


}
