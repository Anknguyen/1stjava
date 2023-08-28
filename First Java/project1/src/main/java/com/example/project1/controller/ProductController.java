package com.example.project1.controller;
import com.example.project1.model.Product;
import com.example.project1.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @GetMapping("/paraid")
    // http://localhost:8080/api/product/paraid?id=1
    public Optional<Product> getById(@RequestParam Integer id){
         return productRepo.findById(id);
    }

    @GetMapping("/pathid/{id}")
    public Optional<Product> getById2(@PathVariable Integer id){
        return productRepo.findById(id);
    }

    /*
        1. @GetMapping("path")
        2. Spring @RequestParam vs @PathVariable Annotations
     */

    @PostMapping
    public Product createProducts(@RequestBody Product prod){
        return productRepo.saveAndFlush(prod);
    }



}
