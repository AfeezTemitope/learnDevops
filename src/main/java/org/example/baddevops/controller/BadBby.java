package org.example.baddevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BadBby {
    @GetMapping("/")
    public String GoodBoy(){
        return "BadBoy";
    }
}

