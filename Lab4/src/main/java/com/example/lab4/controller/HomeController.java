package com.example.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	// http://localhost:8080/home/index
    @GetMapping("/home/index")
    public String index() {
        return "home/index";  
    }

    @GetMapping("/home/about")
    public String about() {
        return "home/about"; 
    }
}
