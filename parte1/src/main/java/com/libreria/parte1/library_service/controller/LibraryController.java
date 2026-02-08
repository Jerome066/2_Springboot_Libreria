package com.libreria.parte1.library_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LibraryController {
    //Login
    @GetMapping
    public String welcome(Model model) {
        return "login";
    }
    //check login
    @GetMapping("/checkLogin")
    public String checkLogin(@RequestParam String username, @RequestParam String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return "redirect:/welcome";
        } else {
            return "redirect:/?error=true";
        }
    }


    @GetMapping("/welcome")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
}
