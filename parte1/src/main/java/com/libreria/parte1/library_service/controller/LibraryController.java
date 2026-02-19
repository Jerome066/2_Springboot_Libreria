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
import org.springframework.web.bind.annotation.RequestParam;




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

    //welcome el alumno puede ver sus prestamos y los detalles de los libros prestados
    @GetMapping("/welcome/{id}")
    public String getMethodName(@PathVariable Long id, Model model) {
        String nombre = alumnoService.getNombreById(id); 
        List<Prestamo_Libro> ListaPrestamos = libraryService.FindById(id);

        model.addAttribute("id",id);
        model.addAttribute("nombre", nombre);
        model.addAttribute("ListaPrestamos", ListaPrestamos);

        return "welcome";
    }

    // CRUD de prestamos, el alumno puede solicitar un nuevo prestamo, devolver un libro o renovar un prestamo

    //Devolver un libro
    @PostMapping("/devolucion/{id}/{idUser}")
    public String postMethodName(@PathVariable Long id, @PathVariable Long idUser) {
        libraryService.DevolverLibro(id);
        return "redirect:/welcome/" + idUser;
    }
    // Solicitar un nuevo prestamo
    @GetMapping("/prestamo/{id}")
    public String showPrestamo(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        return "prestamo";
    }
    

}
