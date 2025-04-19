package com.example.demo.controller;

import com.example.demo.service.PrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primes")
public class HomeController {

    private final PrimeService primeService;

    public HomeController(PrimeService primeService) {
        this.primeService = primeService;
    }

    @GetMapping("/{number}")
    public boolean isPrime(@PathVariable int number) {
        return primeService.isPrime(number);
    }
}
