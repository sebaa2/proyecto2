package com.example.Proyecto.controllers;

import com.example.Proyecto.model.product;
import com.example.Proyecto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/entry")// no estoy seguro de a que parte del proyecto se refiere con "entry" cambiar a la direccion correcta
public class EntryController {

    @Autowired
    ProductRepository productRepository;



    @GetMapping("/vistaPagina")
    public String vistaProducto (@RequestParam(value = "id") Long id, Model model) {

        Optional<product> product = productRepository.findById(id);
        model.addAttribute("product", product.orElseThrow());
        return "vistaPagina";
    }


    @GetMapping("/listaProductos")
    public String listaProductos (@RequestParam(value = "id") Long id, Model model) {

        Optional<product> product = productRepository.findById(id);
        model.addAttribute("product", product.orElseThrow());
        return "listaProductos";

    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }



}
