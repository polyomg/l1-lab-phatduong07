package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResultController {

    @RequestMapping("/a")
    public String m1() {
        return "a"; // view a.html
    } // http://localhost:8080/a

    @RequestMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "Tôi chịu đấy b");
        return "forward:/a";   // giữ model
    } // http://localhost:8080/b

    @RequestMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "Tôi đến chơi với c");
        return "redirect:/a";  // chuyển param
    } // http://localhost:8080/c

    @ResponseBody
    @RequestMapping("/d")
    public String m4() {
        return "I from india d";
    } // http://localhost:8080/d
}
