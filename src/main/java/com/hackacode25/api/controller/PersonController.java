package com.hackacode25.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @GetMapping("/persons")
    public String showAll() {
        return "show person(s) collection";
    }

    @GetMapping("/persons/{id}")
    public String personById(@PathVariable int id) {
        String result = "Person id: " + id;
        return result;
    }

}