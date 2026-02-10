package com.libreria.parte1.library_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.libreria.parte1.library_service.dto.userDTO;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class LibraryController {
    //Login
    @GetMapping
    public String welcome(Model model) {
        return "login";
    }
    //check login
    @PostMapping("/checkLogin")
    public String checkLogin(@Valid @ModelAttribute userDTO userDTO, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        } else {
            return "welcome";
        }
    }


    @GetMapping("/welcome")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
}
