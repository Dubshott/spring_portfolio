package com.example.sping_portfolio.controllers.ralgolab;

import com.example.sping_portfolio.controllers.ralgolab.SubModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SubController {
    public List<_Subtraction> subtractionInit(int nth) {
        List<_Subtraction> subtractionList = new ArrayList<>();
        subtractionList.add(new SubFor(nth));
        subtractionList.add(new SubStream(nth));
        subtractionList.add(new SubWhile(nth));
        subtractionList.add(new SubRecurse(nth));

        return subtractionList;
    }

    @GetMapping("/subtraction")
    public String subtraction(@RequestParam(name="subtractionseq", required=false,  defaultValue="2") String subtractionseq, Model model) {
        int nth = Integer.parseInt(subtractionseq);
        model.addAttribute("subtractionList", subtractionInit(nth));
        return "subtraction";

    }

}