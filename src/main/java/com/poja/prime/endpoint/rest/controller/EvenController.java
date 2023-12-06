package com.poja.prime.endpoint.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
@CrossOrigin
public class EvenController {
    @GetMapping("/new-prime")
    public String generateNewPrime() {
        BigInteger prime = generatePrime();
        return prime.toString();
    }

    private BigInteger generatePrime() {
        int bitLength = 1000;
        return BigInteger.probablePrime(bitLength, new SecureRandom());
    }
}
