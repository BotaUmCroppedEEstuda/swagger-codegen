package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/{name}")
    public ResponseEntity<String> getName(@PathVariable("name") String name) {
        return ResponseEntity.ok(name);
    }

    @GetMapping("/teste/{name}")
    public ResponseEntity<String> getNameTeste(@PathVariable("name") String name) {
        return ResponseEntity.ok(name);
    }
}
