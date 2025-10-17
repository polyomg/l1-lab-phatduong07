package com.example.lab2.controller;

import com.example.lab2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    private List<Product> productsFromForm = new ArrayList<>(); 
    private List<Product> defaultProducts = new ArrayList<>();

    public ProductController() {
        defaultProducts.add(new Product("Iphone 15", 1000.0));
    }

    @GetMapping("/product/form")
    public String form(Model model) {
        model.addAttribute("p", new Product()); 
        model.addAttribute("productsFromForm", productsFromForm);
        model.addAttribute("availableProducts", defaultProducts);
        return "product/form";
    }
    @PostMapping("/product/save")
    public String save(@ModelAttribute("p") Product p, Model model) {
        productsFromForm.clear();
        productsFromForm.add(p);
        model.addAttribute("p", new Product());
        model.addAttribute("productsFromForm", productsFromForm);
        model.addAttribute("availableProducts", productsFromForm);
        return "product/form";
    }

    @GetMapping("/product/reset")
    public String reset(Model model) {
        productsFromForm.clear();

        model.addAttribute("p", new Product());
        model.addAttribute("productsFromForm", productsFromForm);
        model.addAttribute("availableProducts", defaultProducts); // trở lại mặc định
        return "product/form";
    }
}
