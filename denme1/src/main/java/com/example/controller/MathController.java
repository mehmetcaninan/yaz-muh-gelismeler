package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.service.MathService;

@RestController
@RequestMapping("/api")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2) {
        return mathService.add(num1, num2);
    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody int[] numbers) {
        return mathService.multiply(numbers);
    }
}
