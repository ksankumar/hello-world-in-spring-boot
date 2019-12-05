package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {
    //GET, POST, PUT, DELETE, PATCH

    @GetMapping("/hello")
    public List<String> getHelloWorld() {
        return List.of("Hello", "World");
    }

    @GetMapping("/users")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        final String template = "Hello, %s!";
        return String.format(template, name);
    }
}
