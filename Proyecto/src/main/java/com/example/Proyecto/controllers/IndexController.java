package com.example.Proyecto.controllers;

import com.example.Proyecto.model.product;
import com.example.Proyecto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    ProductRepository productRepository;


    @RequestMapping("/")
    public String main(Model model){

        Iterable<product> productos = productRepository.findAll();
        model.addAttribute("productos",productos);

        return "index";
    }

}
