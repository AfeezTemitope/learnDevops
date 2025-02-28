package org.example.baddevops.controller;

import org.example.baddevops.data.AppUser;
import org.example.baddevops.data.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BadBby {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/")
    public String GoodBoy(){
        return "BadBoy";
    }
    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody AppUser user) {
        try {
            userRepo.save(user);
            return new ResponseEntity<>("User created successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error creating user: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


