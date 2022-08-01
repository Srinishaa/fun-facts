package com.jpmc.funfacts.controller;

import com.jpmc.funfacts.Facts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactsRestController {
    @GetMapping("/facts")
    public Facts getFacts(){
        return new Facts();
    }
}
