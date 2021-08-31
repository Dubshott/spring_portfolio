package com.example.sping_portfolio.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
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
}
