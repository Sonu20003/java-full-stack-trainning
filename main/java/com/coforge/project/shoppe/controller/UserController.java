package com.coforge.project.shoppe.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.coforge.project.shoppe.model.User;
import com.coforge.project.shoppe.repository.UserRepository;

import java.util.List;
// http://localhost:8088/product_db/api/users/register
@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // ✅ GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ POST register a new user
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body("Email already exists!");
        }
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
