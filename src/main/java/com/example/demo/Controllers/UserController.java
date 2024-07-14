package com.example.demo.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@AllArgsConstructor
public class UserController {
    @GetMapping
    String greet() {
        return "Hello world";
    }
}




