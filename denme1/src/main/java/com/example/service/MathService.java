package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int[] numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}
