package com.example.sping_portfolio.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    @GetMapping("/klab2")
    public String klab2request(Model model) {
            Stats stats = new Stats();
            model.addAttribute("stats", stats);
            return "klab2";
   }

    @PostMapping("/klab2")
    public String klabsubmit(@ModelAttribute("stats") Stats stats) {
        System.out.println("Hi");
        return "klab2submit";
    }

    @GetMapping("/blab2")
    public String blab2request(Model model) {
        Stat stat = new Stat();
        model.addAttribute("stat", stat);
        return "blab2";
    }

    @PostMapping("/blab2")
    public String blabsubmit(@ModelAttribute("stat") Stat stat) {
        System.out.println("Hi");
        return "blab2submit";
    }

    @GetMapping("/klab1")
    public String klab1() { return "klab1"; }

    @GetMapping("/abhijay")
    public String abhijay() { return "abhijay"; }

    @GetMapping("/alab2")
    public String alab2request(Model model) {
        Stats stats = new Stats();
        model.addAttribute("stats", stats);
        return "alab2";
    }

    @PostMapping("/alab2")
    public String alabsubmit(@ModelAttribute("stats") Stats stats) {
        System.out.println("Hi");
        return "alab2submit";
    }

    @GetMapping("/alab1")
    public String alab1() { return "alab1"; }

    @GetMapping("/raquib")
    public String raquib() { return "raquib"; }

    @GetMapping("/billy")
    public String billy() { return "billy"; }

    @GetMapping("/test")
    public String navbartest() {return "navbartest"; }

    @GetMapping("/rgb")
    public String rgb(Model model)  {
        String web_server = "https://localhost:8080";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/rock.png";
        lii.add(new ImageInfo(file0, web_server+file0, 3));
        lii.get(0).read_image();

        String file1 = "/images/dream.png";
        lii.add(new ImageInfo(file1, web_server+file1, 3));
        lii.get(1).read_image();

        String file2 = "/images/flower.png";
        lii.add(new ImageInfo(file2, web_server+file2, 3));
        lii.get(2).read_image();

        model.addAttribute("lii", lii);
        return "rgb";
    }

    @GetMapping("/grayscaleimage")
    public String grayscaleimage(Model model) {
        String web_server = "http://localhost:8080/";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/rock.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        String str = lii.get(0).grayscale();
//        String str = lii.get(0).grayscale();
        model.addAttribute("str", str);
        return "grayscaleimage";
    }

}

