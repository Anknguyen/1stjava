package com.example.project1.controller;


import com.example.project1.model.Product;
import com.example.project1.model.User;
import com.example.project1.repository.ProductRepo;
import com.example.project1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public User createUsers(@RequestBody User user){
        return userRepo.saveAndFlush(user);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    @GetMapping("/pathid/{id}")
    public Optional<User> getById(@PathVariable Integer id){
        return userRepo.findById(id);
    }
}
