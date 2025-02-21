package com.fiap.ecr.aula_java.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculo")
public class CalculoController {
    @GetMapping("/soma/{num1}/{num2}")
    public int soma(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }
}