package com.jpmc.funfacts.controller;

import com.jpmc.funfacts.Facts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FactsController {
    @GetMapping("/")
    public String getFacts(Model model) {
    	Facts myFact = new Facts();
    	model.addAttribute("id", myFact.getId()+1);
        model.addAttribute("fact", myFact.getFact());
        return "index";
    }
}
