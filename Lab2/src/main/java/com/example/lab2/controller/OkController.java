package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ctrl")
public class OkController {
// http://localhost:8080/ctrl/ok
    @PostMapping(value = "/ok", params = "!x")
    public String m1(Model model) {
        model.addAttribute("method", "m1");
        return "ok";
    }

    @GetMapping("/ok")
    public String m2(Model model) {
        model.addAttribute("method", "m2");
        return "ok";
    }
    @PostMapping(value = "/ok", params = "x")
    public String m3(Model model) {
        model.addAttribute("method", "m3");
        return "ok";
    }
}
