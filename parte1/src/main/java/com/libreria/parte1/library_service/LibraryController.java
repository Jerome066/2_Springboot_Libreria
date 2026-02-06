package com.libreria.parte1.library_service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LibraryController {
    
    @GetMapping
    public String welcome(Model model) {
        return "welcome";
    }
    
}
