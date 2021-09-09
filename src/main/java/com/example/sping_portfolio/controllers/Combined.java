package com.example.sping_portfolio.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;



@Controller
@RequestMapping
public class Combined {


    @GetMapping("/greet")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "greet"; // returns HTML VIEW (greeting)'
    }

    @GetMapping("/birds")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String birds() {
        return "birds"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/class9")
    public String class9() { return "class9"; }

    @GetMapping("/class10")
    public String class10() { return "class10"; }

    @GetMapping("/class11")
    public String class11() { return "class11"; }

    @GetMapping("/class12")
    public String class12() { return "class12"; }

    @GetMapping("/about")
    public String about() { return "about"; }

    @GetMapping("/topratings")
    public String topratings() { return "birds"; }

    @GetMapping("/homepage")
    public String homepage() { return "homepage"; }

    @GetMapping("/kian")
    public String kian() { return "kian"; }

    @GetMapping("/kian/minilab2")
    public String klab2request(Model model) {
            Stats stats = new Stats();
            model.addAttribute("stats", stats);
            return "klab2";
   }

    @PostMapping("/kian/minilab2")
    public String klabsubmit(@ModelAttribute("stats") Stats stats) {
        System.out.println("Hi");
        return "klab2submit";
    }

    @GetMapping("/kian/minilab1")
    public String klab1() { return "klab1"; }

    @GetMapping("/abhijay")
    public String abhijay() { return "abhijay"; }

    @GetMapping("/raquib")
    public String raquib() { return "raquib"; }

    @GetMapping("/billy")
    public String billy() { return "billy"; }


}

