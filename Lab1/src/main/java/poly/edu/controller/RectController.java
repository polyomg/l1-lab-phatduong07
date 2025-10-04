package poly.edu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RectController {
    @Autowired
    HttpServletRequest request;

    @GetMapping("/rect/form")
    public String form() {
        return "rectangle.html";
    }

    @PostMapping("/rect/calc")
    public String calc(Model model) {
        double width = Double.parseDouble(request.getParameter("width"));
        double length = Double.parseDouble(request.getParameter("length"));
        double area = width * length;
        double perimeter = 2 * (width + length);
        model.addAttribute("result",
            "Diện tích: " + area + " - Chu vi: " + perimeter);
        return "rectangle.html";
    }
}
